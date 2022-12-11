package com.apples.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class ItemAppleArrow extends Item {

	public ItemAppleArrow(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity livingentity) {
		
		if(!world.isRemote) {
			
			for(int i = 0; i < 8; i++) {
				
				ArrowEntity arrow = new ArrowEntity(world, livingentity);
				
				float f = -MathHelper.sin(livingentity.rotationYaw * ((float)Math.PI / 180F)) * MathHelper.cos(livingentity.rotationPitch * ((float)Math.PI / 180F));
			    float f1 = -MathHelper.sin((livingentity.rotationPitch + 0.0F) * ((float)Math.PI / 180F));
			    float f2 = MathHelper.cos(livingentity.rotationYaw * ((float)Math.PI / 180F)) * MathHelper.cos(livingentity.rotationPitch * ((float)Math.PI / 180F));
			    
			    arrow.shoot((double)f, (double)f1, (double)f2, 3.0F, 10.0F);
				
				//arrow.shoot(livingentity, livingentity.rotationPitch, livingentity.rotationYaw, 0.0F, 3.0F, 10.0F);
				//arrow.func_234612_a_(livingentity, livingentity.rotationPitch, livingentity.rotationYaw, 0.0F, 3.0F, 10.0F);
				
				world.addEntity(arrow);
			
			}
			
		}

		return this.isFood() ? livingentity.onFoodEaten(world, itemstack) : itemstack;
		
	}

}
