package com.apples.events;

import com.apples.potions.PotionLoader;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class PlayerEvents {
	
	@SubscribeEvent
	public static void playerEventClone(PlayerEvent.Clone clone) {
		
		Player player = clone.getOriginal();
		Level level = player.level;
		
		if(player.hasEffect(PotionLoader.POTION_BINDING.get())) {

			if(clone.isWasDeath()) {
				
				if(level.getGameRules().getBoolean(GameRules.RULE_KEEPINVENTORY)) {
					
					GameRules.BooleanValue gameruleboolean = level.getGameRules().getRule(GameRules.RULE_KEEPINVENTORY);
					
					gameruleboolean.set(false, level.getServer());
					
				}

			}

		}
		
	}

}
