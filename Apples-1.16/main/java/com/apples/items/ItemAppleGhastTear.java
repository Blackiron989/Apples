package com.apples.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class ItemAppleGhastTear extends Item {

	public ItemAppleGhastTear(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity livingentity) {

		if(!world.isRemote) {

			if(world.getDimensionKey() == World.OVERWORLD) {
				
				if(!world.isRaining()) {

					//world.getWorldInfo().setRainTime(0);
					world.getWorldInfo().setRaining(true);
					
				}
				
			} else {
				
				world.playSound((PlayerEntity)null, livingentity.getPosition(), SoundEvents.ENTITY_GHAST_SCREAM, SoundCategory.HOSTILE, 1.0F, 1.0F);
				
			}
			
		}
		
		return this.isFood() ? livingentity.onFoodEaten(world, itemstack) : itemstack;
		
	}

}
