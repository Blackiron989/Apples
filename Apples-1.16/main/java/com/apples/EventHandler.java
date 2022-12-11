package com.apples;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Map.Entry;

import com.apples.entity.EntityCart;
import com.apples.items.ItemLoader;
import com.apples.potions.PotionLoader;
import com.apples.world.OreGeneration;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.projectile.FireworkRocketEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.potion.EffectInstance;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Direction;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.IndirectEntityDamageSource;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraft.world.Difficulty;
import net.minecraft.world.GameRules;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.TableLootEntry;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.common.BasicTrade;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import net.minecraftforge.event.entity.EntityMountEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.event.entity.living.LivingSetAttackTargetEvent;
import net.minecraftforge.event.entity.living.PotionEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class EventHandler {
	
	/*
	@SubscribeEvent
	public static void renderPlayerEvent(RenderPlayerEvent.Pre renderplayerevent) {
		
		PlayerEntity playerentity = renderplayerevent.getPlayer();
		
		if(playerentity.getRidingEntity() instanceof FireworkRocketEntity) {
			
			FireworkRocketEntity firework = (FireworkRocketEntity) playerentity.getRidingEntity();
			
			MatrixStack matrixstack = renderplayerevent.getMatrixStack();
			
			matrixstack.push();

			matrixstack.rotate(Vector3f.XN.rotation(-firework.rotationPitch));
			matrixstack.rotate(Vector3f.YN.rotation(-firework.rotationYaw));
			matrixstack.rotate(Vector3f.ZN.rotation(-firework.rotationYaw));
			
			renderplayerevent.getRenderer().render((AbstractClientPlayerEntity) playerentity, playerentity.rotationYaw, renderplayerevent.getPartialRenderTick(), matrixstack, renderplayerevent.getBuffers(), renderplayerevent.getLight());
			
			matrixstack.pop();
			
		}
		
	}*/
	
	@SubscribeEvent
	public static void playerEventClone(PlayerEvent.Clone clone) {
		
		PlayerEntity playerentity = clone.getOriginal();
		World world = playerentity.world;
		
		if(playerentity.isPotionActive(PotionLoader.POTION_BINDING.get())) {

			if(clone.isWasDeath()) {
				
				if(world.getGameRules().getBoolean(GameRules.KEEP_INVENTORY)) {
					
					GameRules.BooleanValue gameruleboolean = world.getGameRules().get(GameRules.KEEP_INVENTORY);
					
					gameruleboolean.set(false, world.getServer());
					
				}

			}

		}
		
	}
	
	@SubscribeEvent
	public static void livingDeathEvent(LivingDeathEvent livingdeathevent) {
		
		LivingEntity livingentity = livingdeathevent.getEntityLiving();
		World world = livingentity.world;
		
		if(livingentity instanceof PlayerEntity) {
			
			if(livingentity.isPotionActive(PotionLoader.POTION_UNDYING.get())) {
				
				livingdeathevent.setCanceled(true);

				float maxhealth = livingentity.getMaxHealth();
				
				livingentity.setHealth(maxhealth);
				
				if(world.isRemote) {
				
					world.playSound(null, livingentity.getPosX(), livingentity.getPosY(), livingentity.getPosZ(), SoundEvents.ITEM_TOTEM_USE, SoundCategory.PLAYERS, 1f, 1f);
				
				}
				
				livingentity.removePotionEffect(PotionLoader.POTION_UNDYING.get());

			}
			
			if(livingentity.isPotionActive(PotionLoader.POTION_BINDING.get())) {
				
				if(!world.getGameRules().getBoolean(GameRules.KEEP_INVENTORY)) {
					
					GameRules.BooleanValue gameruleboolean = world.getGameRules().get(GameRules.KEEP_INVENTORY);
					
					gameruleboolean.set(true, world.getServer());
					
				} else {
					
					livingentity.removePotionEffect(PotionLoader.POTION_BINDING.get());
					
				}
				
			}
			
		}
		
	}
	
	@SubscribeEvent
	public static void livingDropsEvent(LivingDropsEvent livingdropsevent) {
		
		LivingEntity livingentity = livingdropsevent.getEntityLiving();
		
		if(livingentity instanceof PlayerEntity) {
			
			if(livingentity.isPotionActive(PotionLoader.POTION_VANISHING.get())) {
				
				livingdropsevent.setCanceled(true);
				
			}
			
		}
		
	}
	
	@SubscribeEvent
	public static void entityMountEvent(EntityMountEvent entitymountevent) {
		
		if(entitymountevent.isDismounting()) {
			
			if(entitymountevent.getEntityBeingMounted() instanceof EntityCart) {
				
				EntityCart entitycart = (EntityCart) entitymountevent.getEntityBeingMounted();
				
				entitycart.remove();
				
			}
		
		}
		
	}
	
	@SubscribeEvent
	public static void biomeLoadEvent(BiomeLoadingEvent biomeloadingevent) {
		
		BiomeGenerationSettingsBuilder builder = biomeloadingevent.getGeneration();
		
		Map<String, ConfiguredFeature<?, ?>> features = OreGeneration.load();
		
		for(Entry<String, ConfiguredFeature<?, ?>> entry : features.entrySet()) {
			
			builder.withFeature(Decoration.UNDERGROUND_ORES, entry.getValue());
			
		}
		
	}
	
	@SubscribeEvent
	public static void lootTableLoad(LootTableLoadEvent loottableloadevent) {
		
		if(loottableloadevent.getName().equals(new ResourceLocation("minecraft", "chests/abandoned_mineshaft"))) {
			
			loottableloadevent.getTable().addPool(LootPool.builder().addEntry(TableLootEntry.builder(new ResourceLocation(Main.MODID, "inject/abandoned_mineshaft"))).build());
			
		}
		
		if(loottableloadevent.getName().equals(new ResourceLocation("minecraft", "chests/buried_treasure"))) {
			
			loottableloadevent.getTable().addPool(LootPool.builder().addEntry(TableLootEntry.builder(new ResourceLocation(Main.MODID, "inject/buried_treasure"))).build());
			
		}
		
		if(loottableloadevent.getName().equals(new ResourceLocation("minecraft", "chests/nether_bridge"))) {
			
			loottableloadevent.getTable().addPool(LootPool.builder().addEntry(TableLootEntry.builder(new ResourceLocation(Main.MODID, "inject/nether_bridge"))).build());
			
		}
		
		if(loottableloadevent.getName().equals(new ResourceLocation("minecraft", "chests/simple_dungeon"))) {
			
			loottableloadevent.getTable().addPool(LootPool.builder().addEntry(TableLootEntry.builder(new ResourceLocation(Main.MODID, "inject/simple_dungeon"))).build());
			
		}
		
		if(loottableloadevent.getName().equals(new ResourceLocation("minecraft", "chests/woodland_mansion"))) {
			
			loottableloadevent.getTable().addPool(LootPool.builder().addEntry(TableLootEntry.builder(new ResourceLocation(Main.MODID, "inject/woodland_mansion"))).build());
			
		}

	}
	
	@SubscribeEvent
	public static void wanderingTraderEvent(WandererTradesEvent wanderertradesevent) {

		wanderertradesevent.getRareTrades().add(new BasicTrade(4, new ItemStack(ItemLoader.APPLEGREEN.get()), 8, 1));
		wanderertradesevent.getRareTrades().add(new BasicTrade(8, new ItemStack(ItemLoader.APPLEVANISHING.get()), 4, 1));
		wanderertradesevent.getRareTrades().add(new BasicTrade(8, new ItemStack(ItemLoader.APPLEBINDING.get()), 4, 1));
		
	}
	
	@SubscribeEvent
	public static void playerEvent(PlayerTickEvent playertickevent) {
		
		if(playertickevent.player.isPotionActive(PotionLoader.POTION_SINKING.get())) {
			
			if(playertickevent.player.isInWater()) {
				
				Vector3d vec3d = playertickevent.player.getMotion();

				playertickevent.player.setMotion(vec3d.getX(), -0.1D, vec3d.getZ());

			}
			
		}
		
	}
	
	@SubscribeEvent
	public static void attackEvent(LivingAttackEvent livingattackevent) {
		
		if(livingattackevent.getEntityLiving().isPotionActive(PotionLoader.POTION_RUBY.get())) {
			
			if(livingattackevent.getSource() instanceof IndirectEntityDamageSource) {

				livingattackevent.setCanceled(true);
				
			}

		}
		
		if(livingattackevent.getEntityLiving().isPotionActive(PotionLoader.POTION_DRAGONEGG.get())) { 
			
			if(livingattackevent.getSource() == DamageSource.FALL) {
				
				livingattackevent.setCanceled(true);
				
			}
			
		}
		
		if(livingattackevent.getEntityLiving().isPotionActive(PotionLoader.POTION_ZOMBIE.get())) {
			
			LivingEntity livingentity = livingattackevent.getEntityLiving();
			World world = livingentity.world;
			
			if(!world.isRemote) {
			
				AxisAlignedBB axisalignedbb = (new AxisAlignedBB(livingentity.getPosition())).grow(10);
		        List<MonsterEntity> list = livingentity.world.getEntitiesWithinAABB(MonsterEntity.class, axisalignedbb);
		        
		        Random rand = new Random();

		        if(list.size() <= 10 && livingattackevent.getSource() instanceof EntityDamageSource) {
		        	
		        	if(livingattackevent.getSource().getTrueSource() != null && world.getDifficulty() != Difficulty.PEACEFUL) {
		        		
		        		int i = MathHelper.floor(livingentity.getPosX());
		                int j = MathHelper.floor(livingentity.getPosY());
		                int k = MathHelper.floor(livingentity.getPosZ());
		                
		                ZombieEntity zombieentity = new ZombieEntity(EntityType.ZOMBIE, world);
		                
		                for(int l = 0; l < 50; ++l) {
	
		                    int i1 = i + MathHelper.nextInt(rand, 3, 15) * MathHelper.nextInt(rand, -1, 1);
		                    int j1 = j + MathHelper.nextInt(rand, 3, 15) * MathHelper.nextInt(rand, -1, 1);
		                    int k1 = k + MathHelper.nextInt(rand, 3, 15) * MathHelper.nextInt(rand, -1, 1);
		                    
		                    BlockPos blockpos = new BlockPos(i1, j1 - 1, k1);
	
		                    if (world.getBlockState(blockpos).isTopSolid(world, blockpos, zombieentity, Direction.DOWN)) {
		                    	
		                        zombieentity.setPosition((double)i1, (double)j1, (double)k1);
		                        
		                        if (!world.isPlayerWithin((double)i1, (double)j1, (double)k1, 7.0D) && world.checkNoEntityCollision(zombieentity) && world.hasNoCollisions(zombieentity) && !world.containsAnyLiquid(zombieentity.getBoundingBox())) {
		                        	
		                        	LivingEntity target = null;
		                        	
		                        	if(livingattackevent.getSource().getTrueSource() instanceof LivingEntity) {
		                        		
		                        		target = (LivingEntity) livingattackevent.getSource().getTrueSource();
		                        		
		                        	}

		                        	zombieentity.setAttackTarget(target);
		                        	zombieentity.setRevengeTarget(target);
		                        	zombieentity.onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(new BlockPos(zombieentity.getPositionVec())), SpawnReason.REINFORCEMENT, (ILivingEntityData)null, (CompoundNBT)null);
		                        	
		                        	world.addEntity(zombieentity);
		                           
		                        	break;
		                           
		                        }
		                        
		                     }
		                    
		                }
		        		
		        	}
		        	
		        }
	        
			}
			
		}
		
	}
	
	@SubscribeEvent
	public static void targetEvent(LivingSetAttackTargetEvent livingsetattacktargetevent) {
		
		if(livingsetattacktargetevent.getTarget() != null) {
			
			if(livingsetattacktargetevent.getTarget().isPotionActive(PotionLoader.POTION_PUMPKIN.get())) {
			
				Entity entity = livingsetattacktargetevent.getEntity();
				
				if(entity instanceof EndermanEntity) {
					
					if(((EndermanEntity) entity).getAttackTarget() instanceof PlayerEntity) {
						
						((EndermanEntity) entity).setAttackTarget(null);
						
					}
					
				}
			
			}
		
		}
		
	}
	
	@SubscribeEvent
	public static void fallEvent(LivingFallEvent livingfallevent) {
		
		if(livingfallevent.getEntityLiving().isPotionActive(PotionLoader.POTION_SLIMEBALL.get())) {
			
			livingfallevent.setDamageMultiplier(0);
			
			if(!livingfallevent.getEntityLiving().world.isRemote) {
				
				float distance = livingfallevent.getDistance();
				
				if(distance > 3) {
					
					Vector3d vec3d = livingfallevent.getEntityLiving().getMotion();
					
					if(vec3d.y < 0.0D) {
						
						distance += 10;

						livingfallevent.getEntityLiving().setMotion(vec3d.x, -vec3d.y * ((double)distance / 2), vec3d.z);
						livingfallevent.getEntityLiving().velocityChanged = true;
						
					}
									
				}
				
			}
			
		}
		
	}
	
	@SubscribeEvent
	public static void potionExpireEvent(PotionEvent.PotionExpiryEvent potionexpiryevent) {
		
		if(potionexpiryevent.getEntityLiving().isPotionActive(PotionLoader.POTION_DRAGONEGG.get())) {
			
			if(potionexpiryevent.getEntityLiving() instanceof PlayerEntity) {
				
				((PlayerEntity) potionexpiryevent.getEntityLiving()).abilities.allowFlying = false;
				((PlayerEntity) potionexpiryevent.getEntityLiving()).sendPlayerAbilities();
				
			}
			
		}
		
	}
	
	@SubscribeEvent
	public static void blockHarvestEvent(BlockEvent.BreakEvent breakevent) {

		if(breakevent.getPlayer() != null) {
			
			EffectInstance effectinstance = breakevent.getPlayer().getActivePotionEffect(PotionLoader.POTION_FORTUNE.get());
			
			if(effectinstance != null) {
				
				int amplifier = effectinstance.getAmplifier();
				
				BlockState blockstate = breakevent.getState();
				
				Set<ResourceLocation> tags = blockstate.getBlock().getTags();
				
				switch(amplifier) {
				
					case 0: //Wood
						
						if(tags.contains(BlockTags.LOGS.getName())) {
							
							spawnDrops(blockstate, breakevent.getWorld(), breakevent.getPos(), breakevent.getPlayer());
							
						}
						
					break;
					
					case 1: //Stone

						if(tags.contains(Tags.Blocks.STONE.getName())) {
							
							spawnDrops(blockstate, breakevent.getWorld(), breakevent.getPos(), breakevent.getPlayer());
							
						}
						
					break;
					
					case 2: //Ores

						if(tags.contains(Tags.Blocks.ORES.getName())) {
							
							spawnDrops(blockstate, breakevent.getWorld(), breakevent.getPos(), breakevent.getPlayer());
							
						}
						
					break;
					
					case 3: //Full
						
						if(tags.contains(BlockTags.LOGS.getName()) || tags.contains(Tags.Blocks.ORES.getName()) || tags.contains(Tags.Blocks.STONE.getName()) || tags.contains(Tags.Blocks.NETHERRACK.getName()) || tags.contains(Tags.Blocks.END_STONES.getName()) || tags.contains(Tags.Blocks.OBSIDIAN.getName())) {
							
							spawnDrops(blockstate, breakevent.getWorld(), breakevent.getPos(), breakevent.getPlayer());
							
						}
						
					break;
					
					default: /*Somebody has made a mistake.. was it me?*/ break;
				
				}
				
			}
			
		}
		
	}
	
	private static void spawnDrops(BlockState blockstate, IWorld iworld, BlockPos blockpos, PlayerEntity playerentity) {
		
		if(blockstate.canHarvestBlock(iworld, blockpos, playerentity)) {
			
			List<ItemStack> items = Block.getDrops(blockstate, (ServerWorld) iworld, blockpos, null);
	
			for(int i = 0; i < items.size(); i++) {
				
				ItemStack itemstack = items.get(i);
				
				Block.spawnAsEntity((World) iworld, blockpos, itemstack);
			
			}
		
		}
		
	}

}
