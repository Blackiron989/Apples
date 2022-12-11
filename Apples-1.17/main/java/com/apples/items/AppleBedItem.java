package com.apples.items;

import com.apples.ApplesPlusUtils;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.ExplosionDamageCalculator;
import net.minecraft.world.level.Level;

public class AppleBedItem extends Item {

	public AppleBedItem(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {
		
		if(!level.isClientSide()) {
			
			ServerLevel server = (ServerLevel)level;

			if(level.dimensionType().bedWorks()) {
			
				if(level.getDayTime() > 12000) {
				
					server.setDayTime(0);
				
				} else {
					
					server.setDayTime(12000);
					
				}
			
			} else {

				level.explode((Entity)null, DamageSource.badRespawnPointExplosion(), (ExplosionDamageCalculator)null, (double)livingentity.getX() + 0.5D, (double)livingentity.getY() + 0.5D, (double)livingentity.getZ() + 0.5D, 5.0F, true, Explosion.BlockInteraction.DESTROY);
				
			}
			
			if(itemstack.isDamageableItem()) {
				
				return ApplesPlusUtils.damageableEat(level, itemstack, livingentity);
				
			}
			
		}
		
		return livingentity.eat(level, itemstack);
		
	}

}
