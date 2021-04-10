package com.apples;

import com.apples.items.ItemLoader;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class Group extends ItemGroup {
	
	public static final ItemGroup APPLE_GROUP = (new Group(ItemGroup.GROUPS.length, "apples"));

	public Group(int index, String label) {
		
		super(index, label);

	}
	
	@Override
	public ItemStack createIcon() {
		
		return new ItemStack(ItemLoader.APPLEAPPLE.get());
		
	}

}
