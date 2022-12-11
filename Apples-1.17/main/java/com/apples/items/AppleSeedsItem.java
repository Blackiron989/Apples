package com.apples.items;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;

public class AppleSeedsItem extends Item {
	
	private String string;

	public AppleSeedsItem(Properties properties, String string) {
		
		super(properties);
		
		this.string = string;

	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {
		
		if(!level.isClientSide()) {
			
			BlockPos blockpos = livingentity.blockPosition();
			
			for(BlockPos blockpos1 : BlockPos.betweenClosed(blockpos.offset(-4.0D, -2.0D, -4.0D), blockpos.offset(4.0D, 0.0D, 4.0D))) {

				BlockState blockstate = level.getBlockState(blockpos1);
				BlockState blockstate1 = level.getBlockState(blockpos1.above());
					
				if(blockstate1.getBlock() == Blocks.AIR) {

					if(getBlockState() != null) {
						
						if(getBlockState() == Blocks.NETHER_WART.defaultBlockState()) {
							
							if(blockstate == Blocks.SOUL_SAND.defaultBlockState()) {
								
								level.setBlockAndUpdate(blockpos1.above(), getBlockState());
								
							}
							
						} else {
							
							if(blockstate.getBlock() == Blocks.DIRT || blockstate.getBlock() == Blocks.GRASS_BLOCK || blockstate.getBlock() == Blocks.PODZOL) {
								
								level.setBlockAndUpdate(blockpos1, Blocks.FARMLAND.defaultBlockState());
								level.setBlockAndUpdate(blockpos1.above(), getBlockState());
								
							} else if(blockstate.getBlock() == Blocks.FARMLAND) {

								level.setBlockAndUpdate(blockpos1.above(), getBlockState());
								
							}
							
						}
					
					}
					
				}

			}
			
		}

		return livingentity.eat(level, itemstack);
		
	}
	
	private BlockState getBlockState() {
		
		if(string == "wheat") {
			
			return Blocks.WHEAT.defaultBlockState();
			
		} else if(string == "potato") {
			
			return Blocks.POTATOES.defaultBlockState();
			
		} else if(string == "carrot") {
			
			return Blocks.CARROTS.defaultBlockState();
			
		} else if(string == "beetroot") {
			
			return  Blocks.BEETROOTS.defaultBlockState();
			
		} else if(string == "netherwart") {
			
			return Blocks.NETHER_WART.defaultBlockState();
			
		}
		
		return null;
		
	}

}
