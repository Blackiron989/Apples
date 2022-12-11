package com.apples.events;

import com.apples.potions.PotionLoader;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.PotionEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class PotionEvents {
	
	@SubscribeEvent
	public static void potionAddedEvent(PotionEvent.PotionAddedEvent event) {
		
		if(!event.getEntityLiving().level.isClientSide()) {
			
			if(event.getPotionEffect().getEffect() == PotionLoader.POTION_WITHERSKULL.get()) {
				
				if(event.getEntityLiving().hasEffect(MobEffects.WITHER)) {
					
					event.getEntityLiving().removeEffect(MobEffects.WITHER);
					
				}
				
			}
			
		}
		
	}
	
	@SubscribeEvent
	public static void potionExpireEvent(PotionEvent.PotionExpiryEvent potionexpiryevent) {
		
		if(potionexpiryevent.getEntityLiving().hasEffect(PotionLoader.POTION_DRAGONEGG.get())) {
			
			if(potionexpiryevent.getEntityLiving() instanceof Player) {

				((Player)potionexpiryevent.getEntityLiving()).getAbilities().flying = false;
				((Player)potionexpiryevent.getEntityLiving()).getAbilities().mayfly = false;
				((Player)potionexpiryevent.getEntityLiving()).onUpdateAbilities();
				
			}
			
		}
		
	}
	
	@SubscribeEvent
	public static void potionRemoveEvent(PotionEvent.PotionRemoveEvent event) {
		
		if(event.getEntityLiving().hasEffect(PotionLoader.POTION_DRAGONEGG.get())) {
			
			if(event.getEntityLiving() instanceof Player) {
				
				((Player)event.getEntityLiving()).getAbilities().flying = false;
				((Player)event.getEntityLiving()).getAbilities().mayfly = false;
				((Player)event.getEntityLiving()).onUpdateAbilities();
				
			} 
			
		}
		
	}

}
