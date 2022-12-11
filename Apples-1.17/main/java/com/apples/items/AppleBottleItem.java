package com.apples.items;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class AppleBottleItem extends Item {

	public AppleBottleItem(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
		
		if(player.getY() <= 0) {
			
			return InteractionResultHolder.pass(new ItemStack(ItemLoader.APPLEVOID.get()));
			
		}
		
		if(this.isEdible()) {
			
			ItemStack itemstack = player.getItemInHand(hand);
		     
			if (player.canEat(this.getFoodProperties().canAlwaysEat())) {
		    	 
				player.startUsingItem(hand);
		        return InteractionResultHolder.consume(itemstack);
		        
		     } else {
		    	 
		        return InteractionResultHolder.fail(itemstack);
		        
		     }
			
		 } else {
			  
			 return InteractionResultHolder.pass(player.getItemInHand(hand));
		     
		 }
		
	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {
	
		livingentity.hurt(DamageSource.MAGIC, 1.0F);
		
		return livingentity.eat(level, itemstack);
		
	}

}
