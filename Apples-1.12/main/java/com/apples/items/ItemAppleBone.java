package com.apples.items;

import net.minecraft.block.IGrowable;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


public class ItemAppleBone extends ItemFood {
	
	public ItemAppleBone(String name, int amount, float saturation, boolean isWolfFood) {
		
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setAlwaysEdible();
		
	}
	
	@Override
	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		
		if(!world.isRemote) {
			
               fertilize(world, entityplayer);
			
		}
		
	}
	
	private static void fertilize(World world, EntityPlayer entityplayer) {
		
		double xVal = entityplayer.posX;
		double yVal = entityplayer.posY;
		double zVal = entityplayer.posZ;

		BlockPos blockpos = new BlockPos(xVal, yVal, zVal);
		
		for(BlockPos blockpos1 : BlockPos.getAllInBoxMutable(blockpos.add(-2.0D, -1.0D, -2.0D), blockpos.add(2.0D, 1.0D, 2.0D))) {
			
			IBlockState iblockstate = world.getBlockState(blockpos1);
			if(iblockstate.getBlock() instanceof IGrowable) {
				
				IGrowable igrowable = (IGrowable)iblockstate.getBlock();
				
				if (igrowable.canGrow(world, blockpos1, iblockstate, world.isRemote)) {
					
	                if (!world.isRemote) {
	                	
	                    if (igrowable.canUseBonemeal(world, world.rand, blockpos1, iblockstate)) {
	                    	
	                        igrowable.grow(world, world.rand, blockpos1, iblockstate);
	                        
	                    }

	                }

	            }
			
			}
			
		}
		
	}
	
}
