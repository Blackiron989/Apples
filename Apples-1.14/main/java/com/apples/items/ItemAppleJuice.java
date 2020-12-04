package com.apples.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.UseAction;

public class ItemAppleJuice extends Item {

	public ItemAppleJuice(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public UseAction getUseAction(ItemStack itemstack) {

		return UseAction.DRINK;
		
	}

}
