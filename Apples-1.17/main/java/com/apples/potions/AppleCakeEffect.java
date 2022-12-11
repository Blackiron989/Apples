package com.apples.potions;

import java.util.Random;

import com.apples.blocks.BlockLoader;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Vec3i;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class AppleCakeEffect extends ApplesPlusEffect {

	protected AppleCakeEffect(MobEffectCategory category, int liquidcolor) {
		
		super(category, liquidcolor);

	}
	
	@Override
	public void applyEffectTick(LivingEntity livingentity, int amplifier) { //If isReady returned true, fires every tick...
		
		if(this == PotionLoader.POTION_CAKE.get()) {
			
			Level level = livingentity.level;
			
			if(!level.isClientSide()) {

				Random random = new Random();
				
				int chance = Mth.nextInt(random, 0, 10);
				
				if(chance == 0) {
					
					BlockPos blockpos = livingentity.blockPosition().offset(new Vec3i(livingentity.getLookAngle().x(), livingentity.getLookAngle().y(), livingentity.getLookAngle().z()));
					
					BlockState blockstate = level.getBlockState(blockpos);
					
					if(blockstate.getBlock() == Blocks.AIR) {
						
						if(level.getBlockState(blockpos.below()).isFaceSturdy(level, blockpos, Direction.UP)) {
							
							level.setBlockAndUpdate(blockpos, BlockLoader.FAKE_CAKE.get().defaultBlockState());
						
						}
						
					} else {

						for(int angle = 0; angle < 360; angle += 90) {

							BlockPos blockpos1 = livingentity.blockPosition().relative(livingentity.getDirection().getOpposite(), 1);
							
							BlockState blockstate1 = level.getBlockState(blockpos1);
							
							if(blockstate1.getBlock() == Blocks.AIR) {
								
								if(blockstate1.isFaceSturdy(level, blockpos1.below(), Direction.UP)) {
									
									level.setBlockAndUpdate(blockpos1, BlockLoader.FAKE_CAKE.get().defaultBlockState());
									break;
								
								}
							
							}
							
						}
						
					}
					
				}
				
			}
			
		}
		
	}

}
