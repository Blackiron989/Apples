package com.apples.items;

import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class AppleCactusItem extends Item {

	public AppleCactusItem(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {
		
		if(level.isClientSide()) {
			
			Minecraft.getInstance().player.chat("Drink cactus juice! It'll quench ya! Nothings quenchier! It's the quenchiest!");
			
		}
	
		return livingentity.eat(level, itemstack);
		
	}

}
