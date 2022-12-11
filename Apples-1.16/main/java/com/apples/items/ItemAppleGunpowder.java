package com.apples.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.Explosion;
import net.minecraft.world.ExplosionContext;
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
			
			world.createExplosion((Entity)null, DamageSource.causeExplosionDamage(livingentity), (ExplosionContext)null, livingentity.getPosX(), livingentity.getPosY(), livingentity.getPosZ(), explosionStrength, fire, Explosion.Mode.DESTROY);
			//world.createExplosion((PlayerEntity)null, DamageSource.causeExplosionDamage(livingentity), livingentity.getPosX(), livingentity.getPosY(), livingentity.getPosZ(), explosionStrength, fire, null);
			
		}
		
		return this.isFood() ? livingentity.onFoodEaten(world, itemstack) : itemstack;
		
	}
	
}
