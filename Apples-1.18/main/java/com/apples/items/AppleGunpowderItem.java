package com.apples.items;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.ExplosionDamageCalculator;
import net.minecraft.world.level.Level;

public class AppleGunpowderItem extends Item {
	
	private float explosionStrength;
	private boolean fire;

	public AppleGunpowderItem(Properties properties, float explosionPower, boolean startFire) {
		
		super(properties);
		
		explosionStrength = explosionPower;
		fire = startFire;

	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {
		
		if(!level.isClientSide()) {
			
			level.explode((Entity)null, DamageSource.explosion(livingentity), (ExplosionDamageCalculator)null, livingentity.getX(), livingentity.getY(), livingentity.getZ(), explosionStrength, fire, Explosion.BlockInteraction.DESTROY);
			
		}
		
		return livingentity.eat(level, itemstack);
		
	}
	
}
