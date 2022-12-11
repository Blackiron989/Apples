package com.apples.items;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class AppleArrowItem extends Item {

	public AppleArrowItem(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {
		
		if(!level.isClientSide()) {
			
			for(int i = 0; i < 8; i++) {
				
				Arrow arrow = new Arrow(level, livingentity);
				
				/*float f = -Mth.sin(livingentity.getYRot() * ((float)Math.PI / 180F)) * Mth.cos(livingentity.getXRot() * ((float)Math.PI / 180F));
			    float f1 = -Mth.sin(livingentity.getXRot() * ((float)Math.PI / 180F));
			    float f2 = Mth.cos(livingentity.getYRot() * ((float)Math.PI / 180F)) * Mth.cos(livingentity.getXRot() * ((float)Math.PI / 180F));
			    
			    arrow.shoot((double)f, (double)f1, (double)f2, 3.0F, 10.0F);*/
			    arrow.shootFromRotation(livingentity, livingentity.getXRot(), livingentity.getYRot(), 0.0F, 3.0F, 10.0F);
				
				level.addFreshEntity(arrow);
			
			}
			
		}

		return livingentity.eat(level, itemstack);
		
	}

}
