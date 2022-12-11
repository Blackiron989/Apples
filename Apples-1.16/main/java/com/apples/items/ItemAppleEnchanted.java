package com.apples.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemAppleEnchanted extends Item {

	public ItemAppleEnchanted(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public boolean hasEffect(ItemStack itemstack) {
		
		return true;
		
	}

}
