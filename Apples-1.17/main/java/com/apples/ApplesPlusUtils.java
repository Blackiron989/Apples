package com.apples;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ApplesPlusUtils {
	
	public static ItemStack damageableEat(Level level, ItemStack itemstack, LivingEntity living) {
		
		living.eat(level, itemstack.copy());

		if(living instanceof Player && !((Player)living).getAbilities().instabuild) {
			
			itemstack.setDamageValue(itemstack.getDamageValue() + 1);
			
			if(itemstack.getDamageValue() >= itemstack.getMaxDamage()) {
				
				itemstack.shrink(1);
				
			}
		
		}
		
	    return itemstack;
		
	}

}
