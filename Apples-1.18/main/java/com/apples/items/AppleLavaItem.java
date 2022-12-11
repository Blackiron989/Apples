package com.apples.items;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

public class AppleLavaItem extends Item {

	public AppleLavaItem(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {
		
		if(!level.isClientSide()) {
			
			livingentity.setSecondsOnFire(60);
			
			double rand = Math.random() * 10;
			
			if(rand < 1) {
				
				if(level.isEmptyBlock(livingentity.blockPosition())) {
					
					level.setBlockAndUpdate(livingentity.blockPosition(), Blocks.LAVA.defaultBlockState());
					
				}
				
			}
			
		}

		itemstack.setCount(0);
		return new ItemStack(ItemLoader.APPLEBUCKET.get());
		
	}
	
	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {

		return UseAnim.DRINK;
		
	}
	
	@Override
	public SoundEvent getDrinkingSound() {
		
		return SoundEvents.GENERIC_DRINK;
	
	}

	@Override
	public SoundEvent getEatingSound() {
		
		return SoundEvents.GENERIC_DRINK;
	
	}

}
