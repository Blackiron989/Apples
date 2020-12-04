package com.apples.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;


public class ItemAppleFeather extends ItemFood {
	
	public ItemAppleFeather(String name, int amount, float saturation, boolean isWolfFood) {
		
		super(amount, saturation, isWolfFood);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setAlwaysEdible();
		
	}
	
	@Override
	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		
		if(!world.isRemote) {
			
			entityplayer.motionY += 50D;
			entityplayer.velocityChanged = true;
			
			entityplayer.addPotionEffect(new PotionEffect(MobEffects.LEVITATION, 600, 0, false, false));
			
		}
		
	}

}
