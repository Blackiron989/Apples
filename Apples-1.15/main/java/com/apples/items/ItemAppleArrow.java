package com.apples.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemAppleArrow extends Item {

	public ItemAppleArrow(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity livingentity) {
		
		if(!world.isRemote) {
			
			for(int i = 0; i < 8; i++) {
				
				ArrowEntity arrow = new ArrowEntity(world, livingentity);
				
				arrow.shoot(livingentity, livingentity.rotationPitch, livingentity.rotationYaw, 0.0F, 3.0F, 10.0F);
				
				world.addEntity(arrow);
			
			}
			
		}

		return this.isFood() ? livingentity.onFoodEaten(world, itemstack) : itemstack;
		
	}

}
