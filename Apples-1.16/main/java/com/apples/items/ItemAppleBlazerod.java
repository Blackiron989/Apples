package com.apples.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemAppleBlazerod extends Item {

	public ItemAppleBlazerod(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity livingentity) {
		
		if(!world.isRemote) {
			
			livingentity.setFire(30);
			
		}
		
		return this.isFood() ? livingentity.onFoodEaten(world, itemstack) : itemstack;
		
	}

}
