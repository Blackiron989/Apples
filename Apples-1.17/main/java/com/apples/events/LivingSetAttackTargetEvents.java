package com.apples.events;

import com.apples.potions.PotionLoader;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingSetAttackTargetEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class LivingSetAttackTargetEvents {
	
	@SubscribeEvent
	public static void targetEvent(LivingSetAttackTargetEvent livingsetattacktargetevent) {
		
		if(livingsetattacktargetevent.getTarget() != null) {
			
			if(livingsetattacktargetevent.getTarget().hasEffect(PotionLoader.POTION_PUMPKIN.get())) {
			
				Entity entity = livingsetattacktargetevent.getEntity();
				
				if(entity instanceof EnderMan) {
					
					if(((EnderMan) entity).getTarget() instanceof Player) {
						
						((EnderMan) entity).setTarget(null);
						
					}
					
				}
			
			}
		
		}
		
	}

}
