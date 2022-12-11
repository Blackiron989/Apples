package com.apples.items;

import com.apples.entity.LightEmitterEntity;
import com.apples.entity.EntityLoader;
import com.apples.potions.PotionLoader;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class AppleLightEmitterItem extends Item {
	
	public AppleLightEmitterItem(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {
		
		if(!level.isClientSide()) {
			
			if(!livingentity.hasEffect(PotionLoader.POTION_EMITLIGHT.get())) {
				
				LightEmitterEntity lightemitter = new LightEmitterEntity(EntityLoader.LIGHT_EMITTER.get(), level);
				
				if(livingentity instanceof Player) {
					
					lightemitter.startRiding(livingentity, true);
				
				}
				
				level.addFreshEntity(lightemitter);
				
			}

		}
			
		return livingentity.eat(level, itemstack);
		
	}

}
