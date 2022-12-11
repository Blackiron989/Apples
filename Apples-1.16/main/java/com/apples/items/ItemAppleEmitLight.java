package com.apples.items;

import com.apples.entity.EntityLightEmitter;
import com.apples.entity.EntityLoader;
import com.apples.potions.PotionLoader;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemAppleEmitLight extends Item {
	
	public ItemAppleEmitLight(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity livingentity) {
		
		if(!world.isRemote) {
			
			if(!livingentity.isPotionActive(PotionLoader.POTION_EMITLIGHT.get())) {
				
				EntityLightEmitter entitylightemitter = new EntityLightEmitter(EntityLoader.LIGHT_EMITTER.get(), world);
				
				if(livingentity instanceof PlayerEntity) {
					
					entitylightemitter.startRiding(livingentity, true);
				
				}
				
				world.addEntity(entitylightemitter);
				
			}

		}
			
		return this.isFood() ? livingentity.onFoodEaten(world, itemstack) : itemstack;
		
	}

}
