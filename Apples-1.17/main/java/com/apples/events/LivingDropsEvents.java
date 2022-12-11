package com.apples.events;

import com.apples.potions.PotionLoader;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class LivingDropsEvents {
	
	@SubscribeEvent
	public static void livingDropsEvent(LivingDropsEvent livingdropsevent) {
		
		LivingEntity livingentity = livingdropsevent.getEntityLiving();
		
		if(livingentity instanceof Player) {
			
			if(livingentity.hasEffect(PotionLoader.POTION_VANISHING.get())) {
				
				livingdropsevent.setCanceled(true);
				
			}
			
		}
		
	}

}
