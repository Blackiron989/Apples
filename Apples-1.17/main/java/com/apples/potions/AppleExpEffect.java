package com.apples.potions;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class AppleExpEffect extends ApplesPlusEffect {

	protected AppleExpEffect(MobEffectCategory category, int liquidcolor) {
		
		super(category, liquidcolor);

	}
	
	@Override
	public void applyEffectTick(LivingEntity livingentity, int amplifier) { //If isReady returned true, fires every tick...
		
		if(this == PotionLoader.POTION_EXP.get()) {
			
			Level level = livingentity.level;
			Player player = (Player)livingentity;
			
			if(!level.isClientSide()) {
				
				if(player.experienceLevel < 30) {
					
					int exp = 30 - player.experienceLevel;
					player.giveExperienceLevels(exp);
					
				}
				
			} else {
				
				player.experienceLevel = 30;
				
			}
			
		}
		
	}

}
