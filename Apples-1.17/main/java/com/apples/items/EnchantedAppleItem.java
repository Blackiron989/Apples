package com.apples.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class EnchantedAppleItem extends Item {

	public EnchantedAppleItem(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public boolean isFoil(ItemStack itemstack) {
		
		return true;
		
	}

}
