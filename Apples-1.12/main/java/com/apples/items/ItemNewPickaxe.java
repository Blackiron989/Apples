package com.apples.items;

import net.minecraft.item.ItemPickaxe;


public class ItemNewPickaxe extends ItemPickaxe {
	
	public ItemNewPickaxe(String name, ToolMaterial material){
		
		super(material);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		
	}

}
