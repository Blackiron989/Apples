package com.apples.items;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemAppleLeaves extends Item {

	public ItemAppleLeaves(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity livingentity) {
		
		if(!world.isRemote) {

			BlockPos blockpos = livingentity.getPosition();
			
			for(BlockPos blockpos1 : BlockPos.getAllInBoxMutable(blockpos.add(-10, -1, -10), blockpos.add(10, 15, 10))) {

				BlockState blockstate = world.getBlockState(blockpos1);
				
				if(blockstate.getBlock() == Blocks.ACACIA_LEAVES || blockstate.getBlock() == Blocks.BIRCH_LEAVES || blockstate.getBlock() == Blocks.DARK_OAK_LEAVES || blockstate.getBlock() == Blocks.JUNGLE_LEAVES || blockstate.getBlock() == Blocks.OAK_LEAVES || blockstate.getBlock() == Blocks.SPRUCE_LEAVES) {
					
					world.destroyBlock(blockpos1, true);
					
				}
				
			}
			
		}

		return this.isFood() ? livingentity.onFoodEaten(world, itemstack) : itemstack;
		
	}

}
