package com.apples.items;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.util.Mth;
import net.minecraft.world.level.Level;

public class AppleEggItem extends Item {

	public AppleEggItem(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {
		
		if(!level.isClientSide()) {
			
			float f = -Mth.sin(livingentity.getYRot() * ((float)Math.PI / 180F)) * Mth.cos(livingentity.getXRot() * ((float)Math.PI / 180F));
		    float f1 = -Mth.sin(livingentity.getXRot() * ((float)Math.PI / 180F));
		    float f2 = Mth.cos(livingentity.getYRot() * ((float)Math.PI / 180F)) * Mth.cos(livingentity.getXRot() * ((float)Math.PI / 180F));
			
			Chicken chicken = new Chicken(EntityType.CHICKEN, level);
			
			chicken.setPos(livingentity.getX(), livingentity.getY() + 1, livingentity.getZ());
			
			chicken.lerpMotion((double)f, (double)f1, (double)f2);
			
			level.addFreshEntity(chicken);
			
			/*
			 * Add chance to spawn unique chicken.
			 * 
			 * */
			
		}
	
		return livingentity.eat(level, itemstack);
		
	}

}
