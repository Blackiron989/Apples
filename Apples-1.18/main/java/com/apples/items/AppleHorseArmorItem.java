package com.apples.items;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

import com.apples.ApplesPlusUtils;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;

public class AppleHorseArmorItem extends Item {

	public AppleHorseArmorItem(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {
		
		if(!level.isClientSide()) {
			
			if(livingentity.isPassenger()) {
				
				LivingEntity entity = (LivingEntity)livingentity.getVehicle();
				
				entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3600, 49));
				
			}
			
			if(itemstack.isDamageableItem()) {
				
				return ApplesPlusUtils.damageableEat(level, itemstack, livingentity);
				
			}
			
		}

		return livingentity.eat(level, itemstack);
		
	}
	
}
