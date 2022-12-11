package com.apples.items;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.Level;

public class AppleGhastTearItem extends Item {

	public AppleGhastTearItem(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {

		if(!level.isClientSide()) {

			if(level.dimension() == Level.OVERWORLD) {
				
				if(!level.isRaining()) {

					level.getLevelData().setRaining(true);
					
				}
				
			} else {
				
				level.playSound((Player)null, livingentity.blockPosition(), SoundEvents.GHAST_SCREAM, SoundSource.HOSTILE, 1.0F, 1.0F);
				
			}
			
		}
		
		return livingentity.eat(level, itemstack);
		
	}

}
