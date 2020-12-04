package com.apples.items;

import java.util.Random;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class ItemAppleSteve extends Item {
	
	public ItemAppleSteve(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity livingentity) {

		if(!world.isRemote) {
			
			Random random = new Random();
			
			int i = MathHelper.nextInt(random, 0, 1);
			
			if(i == 1) {
				
				livingentity.onFoodEaten(world, itemstack);
				
				world.playMovingSound(null, livingentity, SoundEvents.ENTITY_GHAST_HURT, SoundCategory.PLAYERS, 1.0F, random.nextFloat());
				
			} else {
				
				itemstack.shrink(1);
				
				livingentity.entityDropItem(new ItemStack(this), 0);
				
				world.playMovingSound(null, livingentity, SoundEvents.ENTITY_PLAYER_HURT, SoundCategory.PLAYERS, 1.0F, 1.0F);
				
			}
	
			return itemstack;
		
		}
		
		return itemstack;
		
	}
	
}
