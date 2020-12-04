package com.apples.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class ItemAppleWater extends ItemFood {
	
	public ItemAppleWater(String name, int amount, float saturation, boolean isWolfFood) {
		
		super(amount, saturation, isWolfFood);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setAlwaysEdible();
		
	}
	
	@Override
	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		
		EntityLivingBase entitylivingbase = entityplayer;
		
		if(!world.isRemote) {
			
			if(entitylivingbase.isBurning()) {
			
				entitylivingbase.extinguish();
			
			}
			
		}
		
	}

}
