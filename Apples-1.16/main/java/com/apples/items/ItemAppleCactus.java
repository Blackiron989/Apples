package com.apples.items;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemAppleCactus extends Item {

	public ItemAppleCactus(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity livingentity) {
		
		if(world.isRemote) {
			
			Minecraft.getInstance().player.sendChatMessage("Drink cactus juice! It'll quench ya! Nothings quenchier! It's the quenchiest!");
			
		}
	
		return this.isFood() ? livingentity.onFoodEaten(world, itemstack) : itemstack;
		
	}

}
