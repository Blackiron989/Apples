package com.apples.items;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


public class ItemAppleSugarCane extends ItemFood {
	
	public ItemAppleSugarCane(String name, int amount, float saturation, boolean isWolfFood) {
		
		super(amount, saturation, isWolfFood);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setAlwaysEdible();
		
	}
	
	@Override
	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		
		if(entityplayer.onGround) {
			
			BlockPos blockpos = new BlockPos(entityplayer.posX, entityplayer.posY - 1.0D, entityplayer.posZ);
			IBlockState blockstate = world.getBlockState(blockpos);
			
			if((blockstate == Blocks.GRASS.getDefaultState() || blockstate == Blocks.SAND.getDefaultState() || blockstate == Blocks.DIRT.getDefaultState()) && blockAdjacentWater(world, blockpos)) {
				
				BlockPos blockpos1 = blockpos;
				for(int i = blockpos.getY() + 1; i < world.getHeight() - 1; i++) {
                	
					blockpos1 = blockpos1.up();
					
                	IBlockState iblockstate1 = world.getBlockState(blockpos1);

                	if(world.mayPlace(Blocks.REEDS, blockpos1, false, EnumFacing.DOWN, (EntityPlayer)null) && iblockstate1 == Blocks.AIR.getDefaultState()) {
                		
                		world.setBlockState(blockpos1, Blocks.REEDS.getDefaultState());
                		
                	}
                	
                }
				
			}

		}
		
	}
	
	private boolean blockAdjacentWater(World world, BlockPos blockpos) {
		
		for (EnumFacing enumfacing : EnumFacing.Plane.HORIZONTAL) {
			
            IBlockState iblockstate = world.getBlockState(blockpos.offset(enumfacing));

            if (iblockstate.getMaterial() == Material.WATER || iblockstate.getBlock() == Blocks.FROSTED_ICE) {
            	
                return true;
                
            }
            
        }
		
		return false;
		
	}

}
