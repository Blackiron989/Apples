package com.apples.items;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class ItemAppleEgg extends Item {

	public ItemAppleEgg(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity livingentity) {
		
		if(!world.isRemote) {
			
			float f = -MathHelper.sin(livingentity.rotationYaw * ((float)Math.PI / 180F)) * MathHelper.cos(livingentity.rotationPitch * ((float)Math.PI / 180F));
		    float f1 = -MathHelper.sin(livingentity.rotationPitch * ((float)Math.PI / 180F));
		    float f2 = MathHelper.cos(livingentity.rotationYaw * ((float)Math.PI / 180F)) * MathHelper.cos(livingentity.rotationPitch * ((float)Math.PI / 180F));
			
			ChickenEntity chickenentity = new ChickenEntity(EntityType.CHICKEN, world);
			
			chickenentity.setPosition(livingentity.getPosX(), livingentity.getPosY() + 1, livingentity.getPosZ());
			
			chickenentity.setMotion((double)f, (double)f1, (double)f2);
			
			world.addEntity(chickenentity);
			
			/*
			 * Add chance to spawn unique chicken with possible unique drops.
			 * 
			 * */
			
		}
	
		return this.isFood() ? livingentity.onFoodEaten(world, itemstack) : itemstack;
		
	}

}
