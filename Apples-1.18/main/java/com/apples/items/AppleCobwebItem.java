package com.apples.items;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class AppleCobwebItem extends Item {

	public AppleCobwebItem(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {
		
		if(!level.isClientSide()) {
			
			if(level.isEmptyBlock(livingentity.blockPosition())) {
				
				level.setBlockAndUpdate(livingentity.blockPosition(), Blocks.COBWEB.defaultBlockState());
				
			}
			
		}
	
		return livingentity.eat(level, itemstack);
		
	}

}
