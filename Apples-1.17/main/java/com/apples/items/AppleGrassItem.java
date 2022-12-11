package com.apples.items;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;

public class AppleGrassItem extends Item {

	public AppleGrassItem(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {
		
		if(!level.isClientSide()) {
			
			if(livingentity.isOnGround()) {
				
				BlockPos blockpos = livingentity.blockPosition();
				BlockPos.MutableBlockPos mutableblockpos = new BlockPos.MutableBlockPos();
				
				for(BlockPos blockpos1 : BlockPos.betweenClosed(blockpos.offset(-3.0D, -1.0D, -3.0D), blockpos.offset(3.0D, 1.0D, 3.0D))) {
					
					mutableblockpos.set(blockpos1.getX(), blockpos1.getY(), blockpos1.getZ());
					BlockState blockstate = level.getBlockState(mutableblockpos);
					
					if(blockstate == Blocks.DIRT.defaultBlockState()) {
						
						if(level.isEmptyBlock(mutableblockpos.above())) {
							
							level.setBlockAndUpdate(mutableblockpos, Blocks.GRASS_BLOCK.defaultBlockState());
							
						}
						
					}
					
				}
				
			}
			
		}
		
		return livingentity.eat(level, itemstack);
		
	}

}
