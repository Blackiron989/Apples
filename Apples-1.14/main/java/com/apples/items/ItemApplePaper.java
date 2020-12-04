package com.apples.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class ItemApplePaper extends Item {
	
	public ItemApplePaper(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity livingentity) {

		return this.isFood() ? livingentity.onFoodEaten(world, itemstack) : itemstack;
		
	}
	
	@Override
	public boolean itemInteractionForEntity(ItemStack itemstack, PlayerEntity playerentity, LivingEntity livingentity, Hand hand) {
		
		if(this.onItemUseFinish(itemstack, livingentity.world, livingentity) == null) {
			
			return false;
			
		}
		
	    if(itemstack.hasDisplayName() && !(livingentity instanceof PlayerEntity)) {
	    	  
		    if(livingentity.isAlive()) {
		    		  
			    livingentity.setCustomName(itemstack.getDisplayName());
			    		  
			    if(livingentity instanceof MobEntity) {
			    			  
			    	((MobEntity) livingentity).enablePersistence();
			    			  
			    }
		    		  
		    }
	
		    return true;
	    	  
		} else {
	    	 
			return false;
	    	 
	    }
	      
	}

}
