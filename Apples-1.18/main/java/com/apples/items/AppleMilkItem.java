package com.apples.items;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class AppleMilkItem extends Item {

	public AppleMilkItem(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {
		
		if(!level.isClientSide()) {
			
			livingentity.removeAllEffects();
			
		}

		itemstack.setCount(0);
		return new ItemStack(ItemLoader.APPLEBUCKET.get());
		
	}

}
