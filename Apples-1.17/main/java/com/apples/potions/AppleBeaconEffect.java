package com.apples.potions;

import java.util.List;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.AABB;

public class AppleBeaconEffect extends ApplesPlusEffect {

	protected AppleBeaconEffect(MobEffectCategory category, int liquidcolor) {
		
		super(category, liquidcolor);

	}
	
	@Override
	public void applyEffectTick(LivingEntity livingentity, int amplifier) { //If isReady returned true, fires every tick...
		
		if(this == PotionLoader.POTION_BEACON.get()) {
			
			if (!livingentity.level.isClientSide()) {
				
		        AABB axisalignedbb = (new AABB(livingentity.blockPosition())).inflate(30).expandTowards(0.0D, (double)livingentity.level.getHeight(), 0.0D);
		        List<Player> list = livingentity.level.getEntitiesOfClass(Player.class, axisalignedbb);

		        for(Player player : list) {
		        	
		        	player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 0, true, true));
		            player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 100, 0, true, true));
		            player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 100, 0, true, true));
		            player.addEffect(new MobEffectInstance(MobEffects.JUMP, 100, 0, true, true));
		            player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 100, 0, true, true));
		            player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, 0, true, true));
		            
		        }

			}
			
		}
		
	}

}
