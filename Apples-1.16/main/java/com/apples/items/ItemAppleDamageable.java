package com.apples.items;

import java.util.Random;

import com.mojang.datafixers.util.Pair;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.world.World;

public class ItemAppleDamageable extends Item {
	
	public ItemAppleDamageable(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity livingentity) {
		
		if(!world.isRemote) {
			
			if(itemstack.attemptDamageItem(1, new Random(), null)) {
				
				return this.isFood() ? livingentity.onFoodEaten(world, itemstack) : itemstack;
				
			} else {
				
				if(this.isFood()) {
					
					for(Pair<EffectInstance, Float> pair : this.getFood().getEffects()) {

						EffectInstance effectinstance = pair.getFirst();
							
						if(effectinstance != null) {

							livingentity.addPotionEffect(effectinstance);
								
						}
							
					}
					
				}
				
			}
			
		}
	
		return itemstack;
		
	}

}
