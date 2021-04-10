package com.apples.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class ItemAppleEnderPearl extends Item {

	public ItemAppleEnderPearl(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity livingentity) {
		
		if(!world.isRemote) {

	        for(int i = 0; i < 16; ++i) {
	        	
	        	double d = livingentity.getPosX() + (livingentity.getRNG().nextDouble() - 0.5D) * 64.0D;
	            double d1 = MathHelper.clamp(livingentity.getPosY() + (double)(livingentity.getRNG().nextInt(16) - 8), 0.0D, (double)(world.getActualHeight() - 1));
	            double d2 = livingentity.getPosZ() + (livingentity.getRNG().nextDouble() - 0.5D) * 64.0D;
	           
	            if (livingentity.isPassenger()) {
	        	   
	            	livingentity.stopRiding();
	               
	            } 
	
	            if (livingentity.attemptTeleport(d, d1, d2, true)) {
	            	
	                world.playSound((PlayerEntity)null, livingentity.getPosX(), livingentity.getPosY(), livingentity.getPosZ(), SoundEvents.ENTITY_ENDERMAN_TELEPORT, SoundCategory.PLAYERS, 1.0F, 1.0F);
	                livingentity.playSound(SoundEvents.ENTITY_ENDERMAN_TELEPORT, 1.0F, 1.0F);
	                break;
	                
	            }
	            
	        }
			
		}
	
		return this.isFood() ? livingentity.onFoodEaten(world, itemstack) : itemstack;
		
	}

}
