package com.apples.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class ItemAppleBed extends ItemFood {
	
	
	public ItemAppleBed(String name, int amount, float saturation, boolean isWolfFood) {
		
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setAlwaysEdible();
		
	}
	
	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		
		if(!world.isRemote) {
			
			if(world.getWorldTime() < 13000) {
				
				world.setWorldTime(13000);
				
			} else {
			
				world.setWorldTime(1000);
			
			}
			
		}
		
	}

}
