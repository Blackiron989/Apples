package com.apples.potions;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;

public class AppleWitherSkullEffect extends ApplesPlusEffect {
	
	protected AppleWitherSkullEffect(MobEffectCategory category, int liquidcolor) {
		
		super(category, liquidcolor);

	}
	
	@Override
	public void applyEffectTick(LivingEntity livingentity, int amplifier) { //If isReady returned true, fires every tick...
		
		if(this == PotionLoader.POTION_WITHERSKULL.get()) {
			
			livingentity.removeEffect(MobEffects.WITHER);
			
		}
		
	}

}
