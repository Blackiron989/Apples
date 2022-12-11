package com.apples.items;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class AppleVoidItem extends Item {

	public AppleVoidItem(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {
	
		if(!level.isClientSide()) {
		
			livingentity.teleportTo(livingentity.getX(), -2.0D, livingentity.getZ());
		
		}
		
		return livingentity.eat(level, itemstack);
		
	}

}
