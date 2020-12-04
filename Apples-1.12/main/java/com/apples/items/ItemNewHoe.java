package com.apples.items;

import net.minecraft.item.ItemHoe;


public class ItemNewHoe extends ItemHoe {
	
	public ItemNewHoe(String name, ToolMaterial material){
		
		super(material);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		
	}

}
