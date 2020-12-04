package com.apples.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemAppleDragonEgg extends ItemFood{
	
	
	public ItemAppleDragonEgg(String name, int amount, float saturation, boolean isWolfFood) {
		
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setAlwaysEdible();
		
	}
	
	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		
		entityplayer.capabilities.allowFlying = true;
		entityplayer.sendPlayerAbilities();
		
	}

}
