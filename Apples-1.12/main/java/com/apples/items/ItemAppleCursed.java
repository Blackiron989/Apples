package com.apples.items;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;


public class ItemAppleCursed extends ItemFood {
	
	private double rand;
	
	public ItemAppleCursed(String name, int amount, float saturation, boolean isWolfFood) {
		
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setAlwaysEdible();
		
	}
	
	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		
		double rand = Math.random() * 4 + 1;
		
		switch((int) rand) {
			
			case 1: 
				
				if(!world.isRemote) {
					
					entityplayer.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, 10 * 20, 0, false, false));
					
					for (int i = 0; i < 7; ++i)
		            {
						
						double x = (double)entityplayer.posX + 0.5D;
						double y = (double)entityplayer.posY + 0.5D;
						double z = (double)entityplayer.posZ + 0.5D;
		            	
		            	double randomX = x + (Math.random() * 20) - 10;
		            	double randomZ = z + (Math.random() * 20) - 10;
	
		                EntityCreeper entitycreeper = new EntityCreeper(world);
		                entitycreeper.setLocationAndAngles(randomX, y, randomZ, MathHelper.wrapDegrees(world.rand.nextFloat() * 360.0F), 0.0F);
		                world.spawnEntity(entitycreeper);
		            
		            }
			
				}
				
			break;
			
			case 2:
			
				if(!world.isRemote) {
				
					blockReplacer(world, entityplayer);
				
				}
				
			break;
			
			case 3:
				
				if(!world.isRemote) {
					
					entityplayer.sendMessage(new TextComponentString("Come on! Run while there's still time! The Guard still holds the road, but it's only a matter of time before they're overwhelmed!"));
				
				}

			break;
			
			case 4:
				
				if(world.isRemote) {
					
					double posX = entityplayer.posX;
					double posZ = entityplayer.posZ;
					
					entityplayer.dismountRidingEntity();
					entityplayer.setPositionAndUpdate(posX, -2.0D, posZ);
				
				}
				
			break;
			
			default:
				
				//Nothing at all actually...
				
			break;
			
		}
			
		
	}
	
	private void blockReplacer(World world, EntityPlayer entityplayer) {
		
		double posX = entityplayer.posX;
		double posY = entityplayer.posY;
		double posZ = entityplayer.posZ;
		
		for(int i = (int)posY; i > 0; i--) {
			
			BlockPos blockpos = new BlockPos(posX, i, posZ);
			IBlockState blockstate = world.getBlockState(blockpos);
			
			if(blockstate != Blocks.AIR.getDefaultState()) {
				
				world.destroyBlock(blockpos, false);
				
			}
			
		}
		
	}

}
