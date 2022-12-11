package com.apples.items;

import java.util.Random;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.level.Level;

public class AppleSteveItem extends Item {
	
	public AppleSteveItem(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {

		if(!level.isClientSide()) {
			
			if(livingentity instanceof Player) {
			
				Random random = new Random();
				
				int i = Mth.nextInt(random, 0, 1);
				
				if(i == 1) {
					
					livingentity.eat(level, itemstack);
					
					level.playSound(null, livingentity.blockPosition(), SoundEvents.GHAST_HURT, SoundSource.PLAYERS, 1.0F, random.nextFloat());
					
				} else {
					
					itemstack.shrink(1);
					
					((Player)livingentity).drop(new ItemStack(ItemLoader.APPLESTEVE.get()), true);
					
					level.playSound(null, livingentity.blockPosition(), SoundEvents.PLAYER_HURT, SoundSource.PLAYERS, 1.0F, 1.0F);
					
				}
		
				return itemstack;
			
			}
		
		}
		
		return itemstack;
		
	}
	
}
