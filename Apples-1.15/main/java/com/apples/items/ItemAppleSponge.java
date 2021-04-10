package com.apples.items;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemAppleSponge extends Item {

	public ItemAppleSponge(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity livingentity) {
		
		if(!world.isRemote) {
			
			BlockPos blockpos = livingentity.getPosition();
			
			for(BlockPos blockpos1 : BlockPos.getAllInBoxMutable(blockpos.add(-5, -5, -5), blockpos.add(5, 5, 5))) {
				
				BlockState blockstate = world.getBlockState(blockpos1);
				
				if(blockstate.getBlock() == Blocks.WATER) {
					
					world.setBlockState(blockpos1, Blocks.AIR.getDefaultState());
					
				}
				
			}
			
		}

		return this.isFood() ? livingentity.onFoodEaten(world, itemstack) : itemstack;
		
	}

}
