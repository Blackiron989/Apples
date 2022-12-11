package com.apples.events;

import com.apples.entity.InvisibleCartEntity;

import net.minecraftforge.event.entity.EntityMountEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class EntityMountEvents {
	
	@SubscribeEvent
	public static void entityMountEvent(EntityMountEvent entitymountevent) {
		
		if(entitymountevent.isDismounting()) {
			
			if(entitymountevent.getEntityBeingMounted() instanceof InvisibleCartEntity) {
				
				if(!entitymountevent.getEntityBeingMounted().isRemoved()) {
					
					entitymountevent.getEntityBeingMounted().discard();
					
				}
				
			}
		
		}
		
	}

}
