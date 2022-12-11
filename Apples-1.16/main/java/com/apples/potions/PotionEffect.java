package com.apples.potions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import com.apples.blocks.BlockLoader;
import com.apples.network.PacketRightMouseDown;
import com.apples.network.PacketHandler;
import com.google.common.collect.Lists;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.FallingBlockEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.entity.projectile.FireworkRocketEntity;
import net.minecraft.entity.projectile.PotionEntity;
import net.minecraft.item.DyeColor;
import net.minecraft.item.FireworkRocketItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.EffectType;
import net.minecraft.potion.Effects;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionUtils;
import net.minecraft.potion.Potions;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class PotionEffect extends Effect {

	private int anvilCount = 0;
	private int potionUseTimer = 0;
	
	public static boolean rightMouseDown = false;

	private int fireballTimer = 0;

	private int fireworkTimer = 0;

	//OLD COBWEB EFFECT CODE - TO BE REMOVED
	//private int webTimer = 0;

	private int snowTimer = 0;
	
	protected PotionEffect(EffectType effecttype, int liquidcolor) {
		
		super(effecttype, liquidcolor);

	}
	
	@Override
	public void performEffect(LivingEntity livingentity, int amplifier) { //If isReady returned true, fires every tick...
		
		if(this == PotionLoader.POTION_BEACON.get()) {
			
			if (!livingentity.world.isRemote) {
				
		        AxisAlignedBB axisalignedbb = (new AxisAlignedBB(livingentity.getPosition())).grow(30).expand(0.0D, (double)livingentity.world.getHeight(), 0.0D);
		        List<PlayerEntity> list = livingentity.world.getEntitiesWithinAABB(PlayerEntity.class, axisalignedbb);

		        for(PlayerEntity playerentity : list) {
		        	
		        	playerentity.addPotionEffect(new EffectInstance(Effects.SPEED, 100, 0, true, true));
		            playerentity.addPotionEffect(new EffectInstance(Effects.HASTE, 100, 0, true, true));
		            playerentity.addPotionEffect(new EffectInstance(Effects.RESISTANCE, 100, 0, true, true));
		            playerentity.addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, 100, 0, true, true));
		            playerentity.addPotionEffect(new EffectInstance(Effects.STRENGTH, 100, 0, true, true));
		            playerentity.addPotionEffect(new EffectInstance(Effects.REGENERATION, 100, 0, true, true));
		            
		        }

			}
			
		}
		
		if(this == PotionLoader.POTION_ANVIL.get()) {
			
			World world = livingentity.world;
			
			if(!world.isRemote) {
				
				double random = Math.random() * 10 + 1;
				double random1 = Math.random() * 10;
				
				
				if((random * random1) < 1) {
					
					if(world.isAirBlock(livingentity.getPosition().up(5))) {
					
						world.setBlockState(livingentity.getPosition().up(5), Blocks.ANVIL.getDefaultState());
						anvilCount++;
						
					}
				
				}
				
				if(anvilCount > 7) {
					
					anvilCount = 0;
					livingentity.removePotionEffect(this);
					
				}
				
			}
			
		}
		
		if(this == PotionLoader.POTION_CAKE.get()) {
			
			World world = livingentity.world;
			
			if(!world.isRemote) {

				Random random = new Random();
				
				int chance = MathHelper.nextInt(random, 1, 40);
				
				if(chance == 1) {
					
					BlockPos blockpos = livingentity.getPosition().offset(livingentity.getHorizontalFacing());
					
					BlockState blockstate = world.getBlockState(blockpos);
					
					if(blockstate.getBlock() == Blocks.AIR) {
						
						if(world.getBlockState(blockpos.down()).isSolid()) {
							
							world.setBlockState(blockpos, BlockLoader.FAKE_CAKE.get().getDefaultState());
						
						}
						
					} else {

						for(int angle = 0; angle < 360; angle += 90) {
							
							BlockPos blockpos1 = livingentity.getPosition().offset(Direction.byHorizontalIndex(angle));
							
							BlockState blockstate1 = world.getBlockState(blockpos1);
							
							if(blockstate1.getBlock() == Blocks.AIR) {
								
								if(world.getBlockState(blockpos1.down()).isSolid()) {
									
									world.setBlockState(blockpos1, BlockLoader.FAKE_CAKE.get().getDefaultState());
									break;
								
								}
							
							}
							
						}
						
					}
					
				}
				
			}
			
		}
		
		if(this == PotionLoader.POTION_COBWEB.get()) {
			
			World world = livingentity.world;
			
			if (!world.isRemote) {
				
		        AxisAlignedBB axisalignedbb = (new AxisAlignedBB(livingentity.getPosition())).grow(30).expand(0.0D, (double)world.getHeight(), 0.0D);
		        List<LivingEntity> list = world.getEntitiesWithinAABB(LivingEntity.class, axisalignedbb);

		        for(LivingEntity living : list) {
		        	
		        	if(livingentity != living) {
		        		
		        		if(living.canBeHitWithPotion()) {
		        		
		        			living.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 100, 1, true, true));
		        		
		        		}
		        	
		        	}
		            
		        }

			}
			
		}
		
		//OLD COBWEB POTION EFFECT CODE - TO BE REMOVED
		/* if(this == PotionLoader.POTION_COBWEB.get()) {
			
			World world = livingentity.world;
			
			if(world.isRemote) {
				
				if(webTimer > 20) {
					
					if(rightMouseDown()) {
						
						PacketHandler.sendToServer(new PacketRightMouseDown());
						webTimer = 0;
						
					}
				
				} else {
					
					webTimer++;
					
				}
			
			}

			if(rightMouseDown) {
				
				float f = -MathHelper.sin(livingentity.rotationYaw * ((float)Math.PI / 180F)) * MathHelper.cos(livingentity.rotationPitch * ((float)Math.PI / 180F));
			    float f1 = -MathHelper.sin(livingentity.rotationPitch * ((float)Math.PI / 180F));
			    float f2 = MathHelper.cos(livingentity.rotationYaw * ((float)Math.PI / 180F)) * MathHelper.cos(livingentity.rotationPitch * ((float)Math.PI / 180F));
				
			    Random random = new Random();
			    
			    int rand = MathHelper.nextInt(random, 1, 100);
			    
			    if(rand > 25) {
			    	
			    	FallingBlockEntity fallingblockentity = new FallingBlockEntity(world, livingentity.getPosX(), livingentity.getPosY(), livingentity.getPosZ(), Blocks.COBWEB.getDefaultState());
			    	
			    	fallingblockentity.setPosition(livingentity.getPosX(), livingentity.getPosY() + 1, livingentity.getPosZ());
			    	fallingblockentity.setMotion((double)f, (double)f1, (double)f2);
					fallingblockentity.fallTime = 50;
					
					world.addEntity(fallingblockentity);
			    	
			    } else if(rand > 10) {
			    	
			    	SpiderEntity spiderentity = new SpiderEntity(EntityType.SPIDER, world);
			    	
			    	spiderentity.setPosition(livingentity.getPosX(), livingentity.getPosY() + 1, livingentity.getPosZ());
			    	spiderentity.setMotion((double)f, (double)f1, (double)f2);
			    	
			    	world.addEntity(spiderentity);
			    	
			    } else {
			    	
			    	CaveSpiderEntity cavespiderentity = new CaveSpiderEntity(EntityType.CAVE_SPIDER, world);
			    	
			    	cavespiderentity.setPosition(livingentity.getPosX(), livingentity.getPosY() + 1, livingentity.getPosZ());
			    	cavespiderentity.setMotion((double)f, (double)f1, (double)f2);
			    	
			    	world.addEntity(cavespiderentity);
			    	
			    }
			    
			    rightMouseDown = false;
				
			}

		} */
		
		if(this == PotionLoader.POTION_DRAGONEGG.get()) {
			
			if(livingentity.world.isRemote) {
				
				if(Minecraft.getInstance().player.abilities.allowFlying == false) {
			
					Minecraft.getInstance().player.abilities.allowFlying = true;
					Minecraft.getInstance().player.sendPlayerAbilities();
				
				}
			
			}
			
		}
		
		if(this == PotionLoader.POTION_EXP.get()) {
			
			World world = livingentity.world;
			PlayerEntity playerentity = (PlayerEntity)livingentity;
			
			if(!world.isRemote) {
				
				if(playerentity.experienceLevel < 30) {
					
					int exp = 30 - playerentity.experienceLevel;
					playerentity.addExperienceLevel(exp);
					
				}
				
			} else {
				
				playerentity.experienceLevel = 30;
				
			}
			
		}
		
		if(this == PotionLoader.POTION_FIREBALL.get()) {
			
			World world = livingentity.world;
			
			if(world.isRemote) {
				
				if(fireballTimer > 30) {
				
					if(rightMouseDown()) {
						
						PacketHandler.sendToServer(new PacketRightMouseDown());
						fireballTimer = 0;
						
					}
				
				} else {
					
					fireballTimer++;
					
				}
				
			} 
			
			if(rightMouseDown) {

				Vector3d vec3d = livingentity.getLook(1.0F);
	            double d2 = livingentity.getPosX() - (livingentity.getPosX() + vec3d.x * 4.0D);
	            double d3 = livingentity.getPosYHeight(0.5D) - (0.5D + livingentity.getPosYHeight(0.5D));
	            double d4 = livingentity.getPosZ() - (livingentity.getPosZ() + vec3d.z * 4.0D);
				
				FireballEntity fireballentity = new FireballEntity(world, livingentity, -d2, d3, -d4);

				fireballentity.setPosition(livingentity.getPosX() + vec3d.x * 4.0D, livingentity.getPosYHeight(0.5D) + 0.5D, fireballentity.getPosZ() + vec3d.z * 4.0D);

				fireballentity.explosionPower = 2;
				
				world.addEntity(fireballentity);
				
				rightMouseDown = false;
				
			}
			
		}
		
		if(this == PotionLoader.POTION_FIREWORK.get()) {
			
			World world = livingentity.world;
			
			if(world.isRemote) {
				
				if(fireworkTimer > 40) {
				
					if(rightMouseDown()) {
						
						PacketHandler.sendToServer(new PacketRightMouseDown());
						fireworkTimer = 0;
						
					}
				
				} else {
					
					fireworkTimer++;
					
				}
				
			}
			
			if(rightMouseDown) {
				
				float f = -MathHelper.sin(livingentity.rotationYaw * ((float)Math.PI / 180F)) * MathHelper.cos(livingentity.rotationPitch * ((float)Math.PI / 180F));
			    float f1 = -MathHelper.sin(livingentity.rotationPitch * ((float)Math.PI / 180F));
			    float f2 = MathHelper.cos(livingentity.rotationYaw * ((float)Math.PI / 180F)) * MathHelper.cos(livingentity.rotationPitch * ((float)Math.PI / 180F));
				
			    ItemStack itemstack = createFirework();
			    
				FireworkRocketEntity fireworkrocketentity = new FireworkRocketEntity(world, livingentity.getPosX(), livingentity.getPosY(), livingentity.getPosZ(), itemstack);

				fireworkrocketentity.shoot((double)f, (double)f1, (double)f2, 0.1F, 1.0F);
				
				world.addEntity(fireworkrocketentity);
				
				if(livingentity.isPassenger()) {
					
					livingentity.stopRiding();
					
				}
				
				livingentity.startRiding(fireworkrocketentity);
				
				rightMouseDown = false;
			
			}
			
		}
		
		if(this == PotionLoader.POTION_FROSTWALKER.get()) {
			
			if(!livingentity.world.isRemote) {
				
				World world = livingentity.world;
				BlockPos blockpos = new BlockPos(livingentity.getPositionVec());
				
		        if (livingentity.isOnGround()) {
		        	
		            float f = (float)Math.min(16, 2);
		            BlockPos.Mutable mutableblockpos = new BlockPos.Mutable(0, 0, 0);

		            for (BlockPos blockpos1 : BlockPos.getAllInBoxMutable(blockpos.add((double)(-f), -1.0D, (double)(-f)), blockpos.add((double)f, -1.0D, (double)f))) {
		            	
		                if (blockpos1.withinDistance(livingentity.getPositionVec(), (double)f)) {
		                	
		                	mutableblockpos.setPos(blockpos1.getX(), blockpos1.getY() + 1, blockpos1.getZ());
		                    BlockState iblockstate = world.getBlockState(mutableblockpos);

		                    if (iblockstate.getMaterial() == Material.AIR) {
		                    	
		                        BlockState blockstate1 = world.getBlockState(blockpos1);

		                        if (blockstate1.getMaterial() == Material.WATER && (blockstate1.getBlock() == Blocks.WATER && blockstate1.get(FlowingFluidBlock.LEVEL) == 0) && Blocks.FROSTED_ICE.getDefaultState().isValidPosition(world, blockpos1)) {
		                        	
		                            world.setBlockState(blockpos1, Blocks.FROSTED_ICE.getDefaultState());
		                            world.getPendingBlockTicks().scheduleTick(blockpos1, Blocks.FROSTED_ICE, MathHelper.nextInt(livingentity.getRNG(), 60, 120));
		                        
		                        }
		                        
		                    }
		                    
		                }
		                
		            }
		            
		        }
				
			}
			
		}
		
		if(this == PotionLoader.POTION_SNOWBALL.get()) {
			
			World world = livingentity.world;
			
			if(world.isRemote) {
				
				if(snowTimer > 20) {
				
					if(rightMouseDown()) {
						
						PacketHandler.sendToServer(new PacketRightMouseDown());
						snowTimer = 0;
						
					}
				
				} else {
					
					snowTimer++;
					
				}
				
			}
			
			if(rightMouseDown) {
				
				float f = -MathHelper.sin(livingentity.rotationYaw * ((float)Math.PI / 180F)) * MathHelper.cos(livingentity.rotationPitch * ((float)Math.PI / 180F));
			    float f1 = -MathHelper.sin(livingentity.rotationPitch * ((float)Math.PI / 180F));
			    float f2 = MathHelper.cos(livingentity.rotationYaw * ((float)Math.PI / 180F)) * MathHelper.cos(livingentity.rotationPitch * ((float)Math.PI / 180F));
				
				FallingBlockEntity fallingblockentity = new FallingBlockEntity(world, livingentity.getPosX(), livingentity.getPosY(), livingentity.getPosZ(), Blocks.SNOW_BLOCK.getDefaultState());
		    	
		    	fallingblockentity.setPosition(livingentity.getPosX(), livingentity.getPosY() + 1, livingentity.getPosZ());
				fallingblockentity.setMotion((double)f, (double)f1, (double)f2);
				fallingblockentity.fallTime = 50;
				
				world.addEntity(fallingblockentity);
				
				rightMouseDown = false;
				
			}
			
		}
		
		if(this == PotionLoader.POTION_WITCH.get()) {
			
			if(potionUseTimer <= 0) {
				
				if(!livingentity.world.isRemote) {
					
					double d0 = livingentity.getPosX();
			        double d1 = livingentity.getPosY() + livingentity.getEyeHeight();
			        double d2 = livingentity.getPosZ();
			        float f = MathHelper.sqrt(d0 * d0 + d2 * d2);
			        int timer = 50;
			        float velocity = 0.75f;
			        
			        Potion potion = null;
					
					AxisAlignedBB axisalignedbb = (new AxisAlignedBB(livingentity.getPosition())).grow(5);
			        List<MonsterEntity> list = livingentity.world.getEntitiesWithinAABB(MonsterEntity.class, axisalignedbb);

			        for(MonsterEntity monsterentity : list) {
			        	
			        	Vector3d vec3d = monsterentity.getMotion();
				        d0 = monsterentity.getPosX() + vec3d.x - livingentity.getPosX();
				        d1 = monsterentity.getPosY() + (double)monsterentity.getEyeHeight() - (double)1.1F - livingentity.getPosY();
				        d2 = monsterentity.getPosZ() + vec3d.z - livingentity.getPosZ();
				        
			        	if(!monsterentity.isEntityUndead()) {
			        		
			        		double r = Math.random();
			        		
			        		if(r > 0.6D) {
			        			
			        			potion = Potions.POISON;
			        			
			        		} else {
			        			
			        			potion = Potions.HARMING;
			        			
			        		}
			        		
			        	} else {
			        		
			        		potion = Potions.STRONG_HEALING;
			        		
			        	}	      

		                velocity = 0.75f;
		                
		                break;
			            
			        }
			        
			        if(livingentity.getHealth() <= 10.0F) {
		        		
		        		d0 = livingentity.getPosX();
		        		d1 = livingentity.getPosY() + livingentity.getEyeHeight();
		        		d2 = livingentity.getPosZ();
		        		
		        		potion = Potions.HEALING;

		                velocity = 0f;
		        		
		        	}
		        	
		        	if(livingentity.isBurning() && !livingentity.isPotionActive(Effects.FIRE_RESISTANCE)) {
		        		
		        		d0 = livingentity.getPosX();
		        		d1 = livingentity.getPosY() + livingentity.getEyeHeight();
		        		d2 = livingentity.getPosZ();
		        		
		        		potion = Potions.FIRE_RESISTANCE;

		                velocity = 0f;
		        		
		        	}
		        	
		        	if(potion != null) {
		        		
		        		f = MathHelper.sqrt(d0 * d0 + d2 * d2);
			        	PotionEntity potionentity = new PotionEntity(livingentity.world, livingentity);
		                potionentity.setItem(PotionUtils.addPotionToItemStack(new ItemStack(Items.SPLASH_POTION), potion));
		                potionentity.rotationPitch -= -20.0F;
		                potionentity.shoot(d0, d1 + (double)(f * 0.2F), d2, velocity, 8.0F);
		                livingentity.world.playSound((PlayerEntity)null, livingentity.getPosX(), livingentity.getPosY(), livingentity.getPosZ(), SoundEvents.ENTITY_WITCH_THROW, SoundCategory.HOSTILE, 1.0F, 1.0F);
		                livingentity.world.addEntity(potionentity);
		                
		                timer = 50;
	                
		        	}
	                
	                potionUseTimer = timer;
					
				}
				
			} else {
				
				potionUseTimer--;
				
			}
			
		}
		
	}
	
	@Override
	public void affectEntity(@Nullable Entity source, @Nullable Entity indirectsource, LivingEntity livingentity, int amplifier, double health) { //Instance Effects
	}
	
	@Override
	public boolean isReady(int duration, int amplifier) { //Fired every tick
		
		return true;
		
	}
	
	private ItemStack createFirework() {
		
		Random random = new Random();
		
		ItemStack itemstack = new ItemStack(Items.FIREWORK_ROCKET);
		
		FireworkRocketItem.Shape shape = FireworkRocketItem.Shape.SMALL_BALL;
		
		ArrayList<FireworkRocketItem.Shape> shapes = new ArrayList<>();
		
		shapes.add(FireworkRocketItem.Shape.SMALL_BALL);
		shapes.add(FireworkRocketItem.Shape.LARGE_BALL);
		shapes.add(FireworkRocketItem.Shape.STAR);
		shapes.add(FireworkRocketItem.Shape.BURST);
		shapes.add(FireworkRocketItem.Shape.CREEPER);

		int length = shapes.size();
		for(int y = 0; y < length; y++) {

			shape = shapes.get(y);
			
			int rand = MathHelper.nextInt(random, 0, 1);
			
			if(rand > 0) {
				
				break;
				
			}
			
		}
		
		itemstack.getOrCreateChildTag("Fireworks");
		
		CompoundNBT compoundnbt = itemstack.getChildTag("Fireworks");
		
		ItemStack itemstack1 = new ItemStack(Items.FIREWORK_STAR);
		
		itemstack1.getOrCreateChildTag("Explosion");
		
		CompoundNBT compoundnbt1 = itemstack1.getChildTag("Explosion");
		
		ListNBT listnbt = new ListNBT();
		
		List<Integer> list = Lists.newArrayList();
		
		DyeColor[] arr = DyeColor.values();
		for(int u = arr.length - 1; u > 0; u--) {
			
			int j = random.nextInt(u);
			
			DyeColor temp = arr[u]; 
            arr[u] = arr[j]; 
            arr[j] = temp;
			
		}
		
		int colors = DyeColor.values().length;
		
		for(int i = 0; i < colors; i++) {
			
			list.add(DyeColor.byId(arr[i].getId()).getFireworkColor());
			
			int rand = MathHelper.nextInt(random, 0, 1);
			
			if(rand > 0) {
				
				break;
				
			}
			
		}
		
		compoundnbt1.putBoolean("Flicker", true);
		compoundnbt1.putBoolean("Trail", true);
		compoundnbt1.putIntArray("Colors", list);
		compoundnbt1.putByte("Type", (byte)shape.getIndex());
		
		listnbt.add(compoundnbt1);
		
		compoundnbt.putByte("Flight", (byte)1);
		compoundnbt.put("Explosions", listnbt);
		
		return itemstack;
		
	}
	
	@OnlyIn(Dist.CLIENT)
	private Boolean rightMouseDown() {
		
		if(Minecraft.getInstance().mouseHelper.isRightDown()) {
		
			return true;
		
		} else {
			
			return false;
			
		}
		
	}

}
