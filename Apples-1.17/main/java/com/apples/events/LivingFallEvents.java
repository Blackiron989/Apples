package com.apples.events;

import com.apples.potions.PotionLoader;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class LivingFallEvents {
	
	@SubscribeEvent
	public static void fallEvent(LivingFallEvent livingfallevent) {

		if(livingfallevent.getEntityLiving().hasEffect(PotionLoader.POTION_SLIMEBALL.get())) {
			
			LivingEntity living = livingfallevent.getEntityLiving();

			if(!living.level.isClientSide()) {
				
				float distance = livingfallevent.getDistance();
				
				if(distance > 3) {
					
					Vec3 vec3 = living.getDeltaMovement();
					
					if(vec3.y < 0.0D) {
						
						double bounce = (double)distance * 0.9D;
						
						livingfallevent.getEntity().setDeltaMovement(vec3.x, -vec3.y * bounce, vec3.z);
						livingfallevent.getEntity().hurtMarked = true;
						
					}
									
				}
				
			}
			
			livingfallevent.setDamageMultiplier(0);
		
		}

	}

}
