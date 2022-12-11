package com.apples.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemAppleNetherrack extends Item {

	public ItemAppleNetherrack(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity livingentity) {
		
		if(!world.isRemote) {
			
			if(world.getDimensionKey() == World.THE_NETHER) {
				
				livingentity.setHealth(0);
				
			}
			
		}

		return this.isFood() ? livingentity.onFoodEaten(world, itemstack) : itemstack;
		
	}

}
