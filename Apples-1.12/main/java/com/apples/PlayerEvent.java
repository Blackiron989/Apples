package com.apples;

import java.util.List;

import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;


@EventBusSubscriber
public class PlayerEvent {

	@SubscribeEvent
	public static void activeEffects(PlayerTickEvent event) {
		
		if(event.player.isPotionActive(PotionRegister.potionSlime)) {
			
			EntityPlayer entity = event.player;

		    double ran = Math.random() * 5 + 1;
		    float fall = Math.max(0, entity.fallDistance);

		    if(entity.onGround) {
		    	
		    	if(fall > 0) {
		    		
		    		double bounce = ran * ((double)fall / 2);
		    		entity.motionY *= -bounce;
		    		
		    	}
		    	
		    }
			
		}
		
		if(event.player.isPotionActive(PotionRegister.potionNoFall)) {
			
			EntityPlayer entity = event.player;
			
			entity.fallDistance = 0;
			entity.motionY = 0;
			
		}

		if(event.player.isPotionActive(PotionRegister.potionFreeze)) {
			
			EntityPlayer entity = event.player;
			freezeNearby(entity);
			
		}
				
		if(event.player.isPotionActive(PotionRegister.potionCake)) {
			
			EntityPlayer entity = event.player;
			placeCake(entity);
			
		}
		
		if(event.player.isPotionActive(PotionRegister.potionGlow)) {
			
			EntityPlayer entity = event.player;
			glow(entity);
			
		}
		
		if(event.player.isPotionActive(PotionRegister.potionBeacon)) {
			
			EntityPlayer entity = event.player;

			beacon(entity);
			
		}
		
		if(event.player.isPotionActive(PotionRegister.potionPumpkin)) {
			
			EntityPlayer entityplayer = event.player;

			pumpkin(entityplayer);
			
		}
		
	}
	
	@SubscribeEvent
	public static void fallEvent(LivingFallEvent event) {
		
		if(event.getEntity() instanceof EntityPlayer) {

			EntityPlayer entity = (EntityPlayer) event.getEntity();
			
			if(entity.isPotionActive(PotionRegister.potionSlime)) {
				
				if(entity.onGround) {
				
					event.setDamageMultiplier(0.35F);
				
				}
			
			}
		
		}
		
	}
	
	private static void freezeNearby(EntityLivingBase living) {
		
		World world = living.world;
		BlockPos blockpos = new BlockPos(living);
		
        if (living.onGround) {
        	
            float f = (float)Math.min(16, 2);
            BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos(0, 0, 0);

            for (BlockPos.MutableBlockPos blockpos$mutableblockpos1 : BlockPos.getAllInBoxMutable(blockpos.add((double)(-f), -1.0D, (double)(-f)), blockpos.add((double)f, -1.0D, (double)f))) {
            	
                if (blockpos$mutableblockpos1.distanceSqToCenter(living.posX, living.posY, living.posZ) <= (double)(f * f)) {
                	
                    blockpos$mutableblockpos.setPos(blockpos$mutableblockpos1.getX(), blockpos$mutableblockpos1.getY() + 1, blockpos$mutableblockpos1.getZ());
                    IBlockState iblockstate = world.getBlockState(blockpos$mutableblockpos);

                    if (iblockstate.getMaterial() == Material.AIR) {
                    	
                        IBlockState iblockstate1 = world.getBlockState(blockpos$mutableblockpos1);

                        if (iblockstate1.getMaterial() == Material.WATER && (iblockstate1.getBlock() == net.minecraft.init.Blocks.WATER || iblockstate1.getBlock() == net.minecraft.init.Blocks.FLOWING_WATER) && ((Integer)iblockstate1.getValue(BlockLiquid.LEVEL)).intValue() == 0 && world.mayPlace(Blocks.FROSTED_ICE, blockpos$mutableblockpos1, false, EnumFacing.DOWN, (Entity)null)) {
                        	
                            world.setBlockState(blockpos$mutableblockpos1, Blocks.FROSTED_ICE.getDefaultState());
                            world.scheduleUpdate(blockpos$mutableblockpos1.toImmutable(), Blocks.FROSTED_ICE, MathHelper.getInt(living.getRNG(), 60, 120));
                        
                        }
                        
                    }
                    
                }
                
            }
            
        }
        
    }
	
	private static void placeCake(EntityLivingBase living) {
		
		World world = living.world;
		
		if(living.onGround) {
			
			double charX = living.posX;
			double charY = living.posY;
			double charZ = living.posZ;
			
			BlockPos blockpos = new BlockPos(charX, charY, charZ);	
			
			EnumFacing directionFacing = living.getHorizontalFacing();
			blockpos = blockpos.offset(directionFacing.getOpposite(), 1);
			
			IBlockState iblockstate = world.getBlockState(blockpos);
			
			if(iblockstate.getMaterial() == Material.AIR) {
				
				if(world.mayPlace(BlockHelper.fakeCake, blockpos, false, EnumFacing.DOWN, (Entity)null)) {

					world.setBlockState(blockpos, BlockHelper.fakeCake.getDefaultState());
					world.scheduleUpdate(blockpos.toImmutable(), BlockHelper.fakeCake, MathHelper.getInt(living.getRNG(), 60, 120));
					
				}
				
				
			}

		}
		
	}
	
	private static void glow(EntityLivingBase living) {
		
		World world = living.world;
		
		double posX = living.posX;
		double posY = living.posY;
		double posZ = living.posZ;
		
		BlockPos blockpos = new BlockPos(posX, posY, posZ);
		
		for(BlockPos.MutableBlockPos mutableblockpos : blockpos.getAllInBoxMutable(blockpos.toImmutable(), blockpos.add(0.0D, 1.0D, 0.0D).toImmutable())) {
			
			IBlockState blockstate = world.getBlockState(mutableblockpos);
			
			if(blockstate.getBlock() == Blocks.AIR && blockstate.getBlock() != BlockHelper.glowBlock) {
				
				if(world.mayPlace(BlockHelper.glowBlock, mutableblockpos, false, EnumFacing.DOWN, (Entity)null)) {
					
					world.setBlockState(mutableblockpos, BlockHelper.glowBlock.getDefaultState());
					
				}
				
			}
			
		}
		
	}
	
	private static void beacon(EntityLivingBase living) {
		
		World world = living.world;
		
		if(!world.isRemote) {
            
            double expand = 50.0D;
            double posX = living.posX;
            double posY = living.posY;
            double posZ = living.posZ;
            
            int duration = 50;
            
            AxisAlignedBB axisalignedbb = (new AxisAlignedBB(posX, posY, posZ, posX + 1, posY + 1, posZ + 1)).grow(expand).expand(0.0D, (double)world.getHeight(), 0.0D);
            List<EntityPlayer> list = world.<EntityPlayer>getEntitiesWithinAABB(EntityPlayer.class, axisalignedbb);

            for (EntityPlayer entityplayer : list)
            {
                entityplayer.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, duration, 1, true, true));
            }

            for (EntityPlayer entityplayer1 : list)
            {
                entityplayer1.addPotionEffect(new PotionEffect(MobEffects.HASTE, duration, 0, true, true));
                entityplayer1.addPotionEffect(new PotionEffect(MobEffects.SPEED, duration, 0, true, true));
                entityplayer1.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, duration, 0, true, true));
                entityplayer1.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, duration, 0, true, true));
                entityplayer1.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, duration, 0, true, true));
            }
		
		}
		
	}
	
	private static void pumpkin(EntityPlayer entityplayer) {
		
		ItemStack itemstack = entityplayer.inventory.armorInventory.get(3);
		
		if(itemstack.getItem() != Item.getItemFromBlock(Blocks.PUMPKIN)) {
			
			if(!itemstack.isEmpty()) {
				
				World world = entityplayer.world;

				int posX = (int)entityplayer.posX;
				int posY = (int)entityplayer.posY + 1;
				int posZ = (int)entityplayer.posZ;
				
				if(!world.isRemote) {
				
					ItemStack stack = entityplayer.inventory.armorInventory.get(3).copy();
					entityplayer.entityDropItem(stack, 1);
				
				}

				entityplayer.inventory.armorInventory.get(3).setCount(0);
				
			}
			
			ItemStack itemstack1 = new ItemStack(Item.getItemFromBlock(Blocks.PUMPKIN));
			entityplayer.inventory.armorInventory.set(3, itemstack1);
			
		}
		
	}

}
