package com.apples.potions;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.ClipBlockStateContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;

public class AppleAnvilEffect extends ApplesPlusEffect {

	//Need to add event damage to this to make sure that the effect instant kills the player to remove if they are struck by an anvil.
	
	protected AppleAnvilEffect(MobEffectCategory category, int liquidcolor) {
		
		super(category, liquidcolor);

	}
	
	@Override
	public void applyEffectTick(LivingEntity livingentity, int amplifier) { //If isReady returned true, fires every tick...
		
		if(this == PotionLoader.POTION_ANVIL.get()) {
			
			Level level = livingentity.level;
			
			if(!level.isClientSide()) {
				
				BlockPos blockpos = livingentity.blockPosition();
				
				//System.out.println(livingentity.getDeltaMovement());
				//System.out.println(livingentity.); get x and z and then just compare them to the previous position... maybes
				
				if(Math.random() < 0.1 && livingentity.isOnGround()) {
					
					if(level.isBlockInLine(new ClipBlockStateContext(Vec3.atCenterOf(blockpos), Vec3.atCenterOf(blockpos).add(0, 5.0D, 0), (BlockState) -> {
						return BlockState.canOcclude();
					})).getType() == HitResult.Type.MISS ) {
					
						//potentially change to falling anvil entity with preapplied randomized falling velocity
						level.setBlockAndUpdate(livingentity.blockPosition().above(5), Blocks.ANVIL.defaultBlockState());
						
					}
				
				}
				
			}
			
		}
		
	}

}
