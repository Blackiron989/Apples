package com.apples.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class ItemAppleGunpowder extends Item {
	
	private float explosionStrength;
	private boolean fire;

	public ItemAppleGunpowder(Properties properties, float explosionPower, boolean startFire) {
		
		super(properties);
		
		explosionStrength = explosionPower;
		fire = startFire;

	}

	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity livingentity) {
		
		if(!world.isRemote) {
			
			world.createExplosion((PlayerEntity)null, DamageSource.causeExplosionDamage(livingentity), livingentity.posX, livingentity.posY, livingentity.posZ, explosionStrength, fire, null);
			
		}
		
		return this.isFood() ? livingentity.onFoodEaten(world, itemstack) : itemstack;
		
	}
	
}
