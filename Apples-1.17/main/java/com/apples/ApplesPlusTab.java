package com.apples;

import com.apples.items.ItemLoader;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ApplesPlusTab extends CreativeModeTab {
	
	public static final CreativeModeTab APPLE_TAB = (new ApplesPlusTab(CreativeModeTab.TABS.length, "apples"));

	public ApplesPlusTab(int index, String label) {
		
		super(index, label);

	}

	@Override
	public ItemStack makeIcon() {
		
		return new ItemStack(ItemLoader.APPLEAPPLE.get());
		
	}

}
