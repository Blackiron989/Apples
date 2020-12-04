package com.apples.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemAppleGunpowder extends ItemFood {
	
	float expStr = 4.0F;
	
	public ItemAppleGunpowder(String name, int amount, float saturation, boolean isWolfFood, float explosionStrength) {
		
		super(amount, saturation, isWolfFood);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setAlwaysEdible();
		expStr = explosionStrength;
	}
	
	@Override
	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		
		if(!world.isRemote) {

			world.createExplosion(null, entityplayer.posX, entityplayer.posY, entityplayer.posZ, expStr, true);

		}
		
	}

}
