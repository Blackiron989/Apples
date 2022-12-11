package com.apples.potions;

import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

public class AppleFrostwalkerEffect extends ApplesPlusEffect {

	protected AppleFrostwalkerEffect(MobEffectCategory category, int liquidcolor) {
		
		super(category, liquidcolor);

	}
	
	@Override
	public void applyEffectTick(LivingEntity livingentity, int amplifier) { //If isReady returned true, fires every tick...
		
		if(this == PotionLoader.POTION_FROSTWALKER.get()) {
			
			if(!livingentity.level.isClientSide()) {
				
				Level level = livingentity.level;
				BlockPos blockpos = livingentity.blockPosition();
				
		        if(livingentity.isOnGround()) {
		        	
		            float f = (float)Math.min(16, 2);
		            BlockPos.MutableBlockPos mutableblockpos = new BlockPos.MutableBlockPos(0, 0, 0);

		            for (BlockPos blockpos1 : BlockPos.betweenClosed(blockpos.offset((double)(-f), -1.0D, (double)(-f)), blockpos.offset((double)f, -1.0D, (double)f))) {
		            	
		                if(blockpos1.closerThan(livingentity.position(), (double)f)) {
		                	
		                	mutableblockpos.set(blockpos1.getX(), blockpos1.getY() + 1, blockpos1.getZ());
		                    BlockState iblockstate = level.getBlockState(mutableblockpos);

		                    if(iblockstate.getMaterial() == Material.AIR) {
		                    	
		                        BlockState blockstate1 = level.getBlockState(blockpos1);

		                        if(blockstate1.getMaterial() == Material.WATER && blockstate1.getBlock() == Blocks.WATER && blockstate1.getFluidState().isSource() && Blocks.FROSTED_ICE.defaultBlockState().canSurvive(level, blockpos1)) {
		                        	
		                            level.setBlockAndUpdate(blockpos1, Blocks.FROSTED_ICE.defaultBlockState());
		                            level.getBlockTicks().scheduleTick(blockpos1, Blocks.FROSTED_ICE, Mth.nextInt(livingentity.getRandom(), 60, 120));
		                        
		                        }
		                        
		                    }
		                    
		                }
		                
		            }
		            
		        }
				
			}
			
		}
		
	}

}
