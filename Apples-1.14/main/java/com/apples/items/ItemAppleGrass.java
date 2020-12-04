package com.apples.items;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemAppleGrass extends Item {

	public ItemAppleGrass(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity livingentity) {
		
		if(!world.isRemote) {
			
			if(livingentity.onGround) {
				
				BlockPos blockpos = livingentity.getPosition();
				BlockPos.MutableBlockPos mutableblockpos = new BlockPos.MutableBlockPos();
				
				for(BlockPos blockpos1 : BlockPos.getAllInBoxMutable(blockpos.add(-3.0D, -1.0D, -3.0D), blockpos.add(3.0D, 1.0D, 3.0D))) {
					
					mutableblockpos.setPos(blockpos1.getX(), blockpos1.getY(), blockpos1.getZ());
					BlockState blockstate = world.getBlockState(mutableblockpos);
					
					if(blockstate == Blocks.DIRT.getDefaultState()) {
						
						if(world.isAirBlock(mutableblockpos.up())) {
							
							world.setBlockState(mutableblockpos, Blocks.GRASS_BLOCK.getDefaultState());
							
						}
						
					}
					
				}
				
			}
			
		}
		
		return this.isFood() ? livingentity.onFoodEaten(world, itemstack) : itemstack;
		
	}

}
