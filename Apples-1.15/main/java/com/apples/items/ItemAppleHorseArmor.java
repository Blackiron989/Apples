package com.apples.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class ItemAppleHorseArmor extends Item {

	public ItemAppleHorseArmor(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity livingentity) {
		
		if(!world.isRemote) {
			
			if(livingentity.isPassenger()) {
				
				LivingEntity entity = (LivingEntity)livingentity.getRidingEntity();
				
				entity.addPotionEffect(new EffectInstance(Effects.RESISTANCE, 3600, 49));
				
			}
			
		}

		return this.isFood() ? livingentity.onFoodEaten(world, itemstack) : itemstack;
		
	}
	
}
