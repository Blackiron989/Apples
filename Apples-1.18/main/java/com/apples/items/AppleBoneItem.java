package com.apples.items;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;

public class AppleBoneItem extends Item {

	public AppleBoneItem(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {
		
		if(livingentity.isOnGround()) {
			
			BlockPos blockpos = livingentity.blockPosition();
			BlockPos.MutableBlockPos mutableblockpos = new BlockPos.MutableBlockPos();
			
			for(BlockPos blockpos1 : BlockPos.betweenClosed(blockpos.offset(-2.0D, -1.0D, -2.0D), blockpos.offset(2.0D, 1.0D, 2.0D))) {
				
				mutableblockpos.set(blockpos1.getX(), blockpos1.getY(), blockpos1.getZ());
				BlockState blockstate = level.getBlockState(mutableblockpos);
	
				if(blockstate.getBlock() instanceof BonemealableBlock) {
					
					BonemealableBlock bonemealable = (BonemealableBlock)blockstate.getBlock();
					
					if(bonemealable.isValidBonemealTarget(level, mutableblockpos, blockstate, level.isClientSide())) {
						
						if(!level.isClientSide()) {
							
							if(bonemealable.isBonemealSuccess(level, level.random, mutableblockpos, blockstate)) {
								
								bonemealable.performBonemeal((ServerLevel) level, level.random, mutableblockpos, blockstate);
								
								
							}
							
						}
						
					}
					
				}
				
			}
		
		}

		return livingentity.eat(level, itemstack);
		
	}

}
