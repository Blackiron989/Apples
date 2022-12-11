package com.apples.items;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ApplePaperItem extends Item {
	
	public ApplePaperItem(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {

		return livingentity.eat(level, itemstack);
		
	}
	
	@Override
	public InteractionResult interactLivingEntity(ItemStack itemstack, Player player, LivingEntity livingentity, InteractionHand hand) {
		
		if(this.finishUsingItem(itemstack, livingentity.level, livingentity) == null) {
			
			return InteractionResult.FAIL;
			
		}
		
	    if(itemstack.hasCustomHoverName() && !(livingentity instanceof Player)) {
	    	  
		    if(livingentity.isAlive()) {
		    		  
			    livingentity.setCustomName(itemstack.getHoverName());
			    		  
			    if(livingentity instanceof Mob) {
			    			  
			    	((Mob)livingentity).setPersistenceRequired();
			    			  
			    }
		    		  
		    }
	
		    return InteractionResult.SUCCESS;
	    	  
		} else {
	    	 
			return InteractionResult.FAIL;
	    	 
	    }
	      
	}

}
