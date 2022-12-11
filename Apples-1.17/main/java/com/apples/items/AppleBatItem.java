package com.apples.items;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ambient.Bat;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class AppleBatItem extends Item {

	public AppleBatItem(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {
		
		if(!level.isClientSide()) {
		
			Bat bat = new Bat(EntityType.BAT, level);
			
			//bat.setPositionAndRotation(livingentity.getX(), livingentity.getY(), livingentity.getZ(), livingentity.rotationYaw, livingentity.rotationPitch);
			bat.setPos(livingentity.getX(), livingentity.getY(), livingentity.getZ());
			
			level.addFreshEntity(bat);
			
			if(livingentity.isPassenger()) {
				
				livingentity.stopRiding();
			
			}
			
			livingentity.startRiding(bat);
		
		}
		
		return livingentity.eat(level, itemstack);
		
	}

}
