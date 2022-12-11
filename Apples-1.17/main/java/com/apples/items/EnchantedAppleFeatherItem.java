package com.apples.items;

import com.apples.ApplesPlusUtils;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class EnchantedAppleFeatherItem extends Item {

	public EnchantedAppleFeatherItem(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {
	
		if(!level.isClientSide()) {
			
			if(!livingentity.hasEffect(MobEffects.SLOW_FALLING)) {
				
				livingentity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 600, 0));
				livingentity.setDeltaMovement(0, 150.0D, 0);
				livingentity.hurtMarked = true;
			
			}
		
		}
		
		if(itemstack.isDamageableItem()) {

			return ApplesPlusUtils.damageableEat(level, itemstack, livingentity);
			
		}
		
		return livingentity.eat(level, itemstack);
		
	}
	
	@Override
	public boolean isFoil(ItemStack itemstack) {
		
		return true;
		
	}

}
