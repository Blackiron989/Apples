package com.apples.potions;

import javax.annotation.Nullable;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;

public class ApplesPlusEffect extends MobEffect {

	protected ApplesPlusEffect(MobEffectCategory category, int liquidcolor) {
		super(category, liquidcolor);
	}
	
	@Override
	public void applyEffectTick(LivingEntity livingentity, int amplifier) { //If isReady returned true, fires every tick...
	}
	
	@Override
	public void applyInstantenousEffect(@Nullable Entity source, @Nullable Entity indirectsource, LivingEntity livingentity, int amplifier, double health) { //Instance Effects
	}
	
	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) { //Fired every tick
		
		return true;
		
	}

}
