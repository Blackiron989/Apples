package com.apples.items;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;

public class AppleSpongeItem extends Item {

	public AppleSpongeItem(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {
		
		if(!level.isClientSide()) {
			
			BlockPos blockpos = livingentity.blockPosition();
			
			for(BlockPos blockpos1 : BlockPos.betweenClosed(blockpos.offset(-5, -5, -5), blockpos.offset(5, 5, 5))) {
				
				BlockState blockstate = level.getBlockState(blockpos1);
				
				if(blockstate.getBlock() == Blocks.WATER) {
					
					level.setBlockAndUpdate(blockpos1, Blocks.AIR.defaultBlockState());
					
				}
				
			}
			
		}

		return livingentity.eat(level, itemstack);
		
	}

}
