package com.apples.items;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemAppleUltimate extends Item {

	public ItemAppleUltimate(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity livingentity) {
		
		if(world.isRemote) {
			
			Minecraft.getInstance().player.sendChatMessage("A strange feeling washes over you; Almost as if this apple wasn't complete yet.");
			
		}
	
		return this.isFood() ? livingentity.onFoodEaten(world, itemstack) : itemstack;
		
	}

}
