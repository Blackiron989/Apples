package com.apples.events;

import com.apples.potions.PotionLoader;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class LivingDeathEvents {
	
	@SubscribeEvent
	public static void livingDeathEvent(LivingDeathEvent livingdeathevent) {
		
		LivingEntity livingentity = livingdeathevent.getEntityLiving();
		Level level = livingentity.level;
		
		if(livingentity instanceof Player) {
			
			if(livingentity.hasEffect(PotionLoader.POTION_UNDYING.get())) {
				
				livingdeathevent.setCanceled(true);

				float maxhealth = livingentity.getMaxHealth();
				
				livingentity.setHealth(maxhealth);
				
				if(level.isClientSide()) {
				
					level.playSound(null, livingentity.getX(), livingentity.getY(), livingentity.getZ(), SoundEvents.TOTEM_USE, SoundSource.PLAYERS, 1f, 1f);
				
				}
				
				livingentity.removeEffect(PotionLoader.POTION_UNDYING.get());

			}
			
			if(livingentity.hasEffect(PotionLoader.POTION_BINDING.get())) {
				
				if(!level.getGameRules().getBoolean(GameRules.RULE_KEEPINVENTORY)) {
					
					GameRules.BooleanValue gameruleboolean = level.getGameRules().getRule(GameRules.RULE_KEEPINVENTORY);
					
					gameruleboolean.set(true, level.getServer());
					
				} else {
					
					livingentity.removeEffect(PotionLoader.POTION_BINDING.get());
					
				}
				
			}
			
		}
		
	}

}
