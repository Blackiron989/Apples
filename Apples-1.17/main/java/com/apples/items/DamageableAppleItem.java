package com.apples.items;

import com.apples.ApplesPlusUtils;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class DamageableAppleItem extends Item {
	
	public DamageableAppleItem(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {
		
		if(!level.isClientSide()) {
			
			if(itemstack.isDamageableItem()) {

				return ApplesPlusUtils.damageableEat(level, itemstack, livingentity);
				
			}
			
		}
	
		return itemstack;
		
	}

}
