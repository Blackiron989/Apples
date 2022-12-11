package com.apples.items;

import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.Explosion;
import net.minecraft.world.ExplosionContext;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class ItemAppleBed extends Item {

	public ItemAppleBed(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity livingentity) {
		
		if(!world.isRemote) {
			
			ServerWorld serverworld = (ServerWorld) world;

			if(world.getDimensionType().doesBedWork()) {
			
				if(world.getDayTime() > 12000) {
				
					serverworld.setDayTime(0);
				
				} else {
					
					serverworld.setDayTime(12000);
					
				}
			
			} else {
				
				world.createExplosion((Entity)null, DamageSource.causeExplosionDamage(livingentity), (ExplosionContext)null, livingentity.getPosX(), livingentity.getPosY(), livingentity.getPosZ(), 3.0F, true, Explosion.Mode.DESTROY);
				
			}
			
			if(itemstack.attemptDamageItem(1, new Random(), null)) {
				
				return this.isFood() ? livingentity.onFoodEaten(world, itemstack) : itemstack;
				
			}
			
		}
		
		return itemstack;
		
	}

}
