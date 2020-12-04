package com.apples.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class ItemAppleBed extends Item {

	public ItemAppleBed(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity livingentity) {
		
		if(!world.isRemote) {
			
			if(world.getDimension().isSurfaceWorld()) {
			
				if(world.getDayTime() > 12000) {
				
					world.setDayTime(0);
				
				} else {
					
					world.setDayTime(12000);
					
				}
			
			} else {
				
				world.createExplosion((PlayerEntity)null, DamageSource.causeExplosionDamage(livingentity), livingentity.posX, livingentity.posY, livingentity.posZ, 3.0F, true, null);
				
			}
			
		}
		
		return this.isFood() ? livingentity.onFoodEaten(world, itemstack) : itemstack;
		
	}

}
