package com.apples.items;

import net.minecraft.item.ItemSpade;

public class ItemNewShovel extends ItemSpade {
	
	public ItemNewShovel(String name, ToolMaterial material){
		
		super(material);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		
	}

}
