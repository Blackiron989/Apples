package com.apples.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.UseAction;
import net.minecraft.world.World;

public class ItemAppleJuice extends Item {

	public ItemAppleJuice(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity entityliving) {
		
		PlayerEntity playerentity = entityliving instanceof PlayerEntity ? (PlayerEntity) entityliving : null;
		
		if (playerentity != null) {
			
	         if (!playerentity.abilities.isCreativeMode) {
	        	 
	            itemstack.shrink(1);
	            
	         }
	         
	    }

	    if (playerentity == null || !playerentity.abilities.isCreativeMode) {
	    	
	         if (itemstack.isEmpty()) {
	        	 
	            return new ItemStack(Items.GLASS_BOTTLE);
	            
	         }

	         if (playerentity != null) {
	        	 
	            playerentity.inventory.addItemStackToInventory(new ItemStack(Items.GLASS_BOTTLE));
	            
	         }
	    
	    }
		
		return itemstack;
		
	}
	
	@Override
	public UseAction getUseAction(ItemStack itemstack) {

		return UseAction.DRINK;
		
	}

}
