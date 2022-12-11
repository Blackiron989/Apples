package com.apples.items;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.BatEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemAppleBat extends Item {

	public ItemAppleBat(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity livingentity) {
		
		if(!world.isRemote) {
		
			BatEntity bat = new BatEntity(EntityType.BAT, world);
			
			bat.setPositionAndRotation(livingentity.getPosX(), livingentity.getPosY(), livingentity.getPosZ(), livingentity.rotationYaw, livingentity.rotationPitch);
			
			world.addEntity(bat);
			
			if(livingentity.isPassenger()) {
				
				livingentity.stopRiding();
			
			}
			
			livingentity.startRiding(bat);
		
		}
		
		return this.isFood() ? livingentity.onFoodEaten(world, itemstack) : itemstack;
		
	}

}
