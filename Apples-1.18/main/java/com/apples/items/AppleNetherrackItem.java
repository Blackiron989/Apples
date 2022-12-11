package com.apples.items;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class AppleNetherrackItem extends Item {

	public AppleNetherrackItem(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {
		
		if(!level.isClientSide()) {
			
			if(level.dimension() == Level.NETHER) {
				
				livingentity.setHealth(0);
				
			}
			
		}

		return livingentity.eat(level, itemstack);
		
	}

}
