package com.apples.events;

import com.apples.potions.PotionLoader;

import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class PlayerTickEvents {
	
	@SubscribeEvent
	public static void playerTickEvent(PlayerTickEvent playertickevent) {
		
		if(playertickevent.player.hasEffect(PotionLoader.POTION_SINKING.get())) {
			
			if(playertickevent.player.isInWater()) {
				
				Vec3 vec3 = playertickevent.player.getDeltaMovement();

				playertickevent.player.lerpMotion(vec3.x(), -0.1D, vec3.z());

			}
			
		}
		
	}

}
