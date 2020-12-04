package com.apples.items;

import net.minecraft.item.ItemSword;

public class ItemNewSword extends ItemSword {
	
	public ItemNewSword(String name, ToolMaterial material){
		
		super(material);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		
	}

}
