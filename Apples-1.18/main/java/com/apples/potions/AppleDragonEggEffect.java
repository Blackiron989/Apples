package com.apples.potions;

import net.minecraft.client.Minecraft;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class AppleDragonEggEffect extends ApplesPlusEffect {

	protected AppleDragonEggEffect(MobEffectCategory category, int liquidcolor) {
		
		super(category, liquidcolor);

	}
	
	@Override
	public void applyEffectTick(LivingEntity livingentity, int amplifier) { //If isReady returned true, fires every tick...
		
		if(this == PotionLoader.POTION_DRAGONEGG.get()) {
			
			if(livingentity.level.isClientSide()) {
				
				if(Minecraft.getInstance().player.getAbilities().mayfly == false) {
			
					Minecraft.getInstance().player.getAbilities().mayfly = true;
					Minecraft.getInstance().player.onUpdateAbilities();
				
				}
			
			}
			
		}
		
	}

}
