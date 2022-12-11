package com.apples.items;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.level.Level;

public class AppleWaterItem extends Item {

	public AppleWaterItem(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {

		if(!level.isClientSide()) {
			
			if(livingentity.isOnFire()) {
				
				livingentity.clearFire();
				
				BlockState blockstate = level.getBlockState(livingentity.blockPosition());
				
				if(blockstate.getBlock() == Blocks.LAVA) {
					
					level.setBlockAndUpdate(livingentity.blockPosition(), Blocks.OBSIDIAN.defaultBlockState());
					
				} else if(blockstate.getBlock() == Blocks.FIRE) {
					
					level.setBlockAndUpdate(livingentity.blockPosition(), Blocks.AIR.defaultBlockState());
					
				}

			} else if(livingentity.isInWater()) {
				
				livingentity.hurt(DamageSource.DROWN, 100.0F);
				
			}
			
		}

		//itemstack.setCount(0);
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
