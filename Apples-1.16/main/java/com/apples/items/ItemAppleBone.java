package com.apples.items;

import net.minecraft.block.BlockState;
import net.minecraft.block.IGrowable;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class ItemAppleBone extends Item {

	public ItemAppleBone(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity livingentity) {
		
		if(livingentity.isOnGround()) {
			
			BlockPos blockpos = livingentity.getPosition();
			BlockPos.Mutable mutableblockpos = new BlockPos.Mutable();
			
			for(BlockPos blockpos1 : BlockPos.getAllInBoxMutable(blockpos.add(-2.0D, -1.0D, -2.0D), blockpos.add(2.0D, 1.0D, 2.0D))) {
				
				mutableblockpos.setPos(blockpos1.getX(), blockpos1.getY(), blockpos1.getZ());
				BlockState blockstate = world.getBlockState(mutableblockpos);
	
				if(blockstate.getBlock() instanceof IGrowable) {
					
					IGrowable igrowable = (IGrowable)blockstate.getBlock();
					
					if(igrowable.canGrow(world, mutableblockpos, blockstate, world.isRemote)) {
						
						if(!world.isRemote) {
							
							if(igrowable.canUseBonemeal(world, world.rand, mutableblockpos, blockstate)) {
								
								igrowable.grow((ServerWorld) world, world.rand, mutableblockpos, blockstate);
								
								
							}
							
						}
						
					}
					
				}
				
			}
		
		}

		return this.isFood() ? livingentity.onFoodEaten(world, itemstack) : itemstack;
		
	}

}
