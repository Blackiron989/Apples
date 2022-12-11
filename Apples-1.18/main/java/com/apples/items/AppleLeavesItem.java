package com.apples.items;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;

public class AppleLeavesItem extends Item {

	public AppleLeavesItem(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {
		
		if(!level.isClientSide()) {

			BlockPos blockpos = livingentity.blockPosition();
			
			for(BlockPos blockpos1 : BlockPos.betweenClosed(blockpos.offset(-10, -1, -10), blockpos.offset(10, 15, 10))) {

				BlockState blockstate = level.getBlockState(blockpos1);
				
				Block block = blockstate.getBlock();
				if(block == Blocks.ACACIA_LEAVES || block == Blocks.BIRCH_LEAVES || block == Blocks.DARK_OAK_LEAVES || block == Blocks.JUNGLE_LEAVES || block == Blocks.OAK_LEAVES || block == Blocks.SPRUCE_LEAVES || block == Blocks.AZALEA_LEAVES || block == Blocks.FLOWERING_AZALEA_LEAVES) {
					
					level.destroyBlock(blockpos1, true);
					
				}
				
			}
			
		}

		return livingentity.eat(level, itemstack);
		
	}

}
