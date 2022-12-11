package com.apples.items;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

public class AppleJuiceItem extends Item {

	public AppleJuiceItem(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity entityliving) {
		
		Player player = entityliving instanceof Player ? (Player) entityliving : null;
		
		if(player != null) {
			
			ItemStack copy = itemstack.copy();
			
			player.eat(level, copy);
			
			if(!player.getAbilities().instabuild) {
				
				itemstack.shrink(1);
				
				if(!itemstack.isEmpty()) {
					
					ItemStack stack = new ItemStack(Items.GLASS_BOTTLE);
					
					if(!player.getInventory().add(stack)) {
						
						player.drop(stack, false);
						
					}
					
				} else {
					
					return new ItemStack(Items.GLASS_BOTTLE);
					
				}
		         
		    }
		
		}
		
		return itemstack;
		
	}
	
	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {

		return UseAnim.DRINK;
		
	}
	
	@Override
	public SoundEvent getDrinkingSound() {
		
		return SoundEvents.GENERIC_DRINK;
	
	}

	@Override
	public SoundEvent getEatingSound() {
		
		return SoundEvents.GENERIC_DRINK;
	
	}

}
