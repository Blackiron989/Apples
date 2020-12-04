package com.apples.items;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemAppleSeeds extends Item {
	
	private String string;

	public ItemAppleSeeds(Properties properties, String string) {
		
		super(properties);
		
		this.string = string;

	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity livingentity) {
		
		if(!world.isRemote) {
			
			BlockPos blockpos = livingentity.getPosition();
			
			for(BlockPos blockpos1 : BlockPos.getAllInBoxMutable(blockpos.add(-4.0D, -2.0D, -4.0D), blockpos.add(4.0D, 0.0D, 4.0D))) {

				BlockState blockstate = world.getBlockState(blockpos1);
				BlockState blockstate1 = world.getBlockState(blockpos1.up());
					
				if(blockstate1.getBlock() == Blocks.AIR) {

					if(getBlockState() != null) {
						
						if(getBlockState() == Blocks.NETHER_WART.getDefaultState()) {
							
							if(blockstate == Blocks.SOUL_SAND.getDefaultState()) {
								
								world.setBlockState(blockpos1.up(), getBlockState());
								
							}
							
						} else {
							
							if(blockstate.getBlock() == Blocks.DIRT || blockstate.getBlock() == Blocks.GRASS_BLOCK || blockstate.getBlock() == Blocks.PODZOL) {
								
								world.setBlockState(blockpos1, Blocks.FARMLAND.getDefaultState());
								world.setBlockState(blockpos1.up(), getBlockState());
								
							} else if(blockstate.getBlock() == Blocks.FARMLAND) {

								world.setBlockState(blockpos1.up(), getBlockState());
								
							}
							
						}
					
					}
					
				}

			}
			
		}

		return this.isFood() ? livingentity.onFoodEaten(world, itemstack) : itemstack;
		
	}
	
	private BlockState getBlockState() {
		
		if(string == "wheat") {
			
			return Blocks.WHEAT.getDefaultState();
			
		} else if(string == "potato") {
			
			return Blocks.POTATOES.getDefaultState();
			
		} else if(string == "carrot") {
			
			return Blocks.CARROTS.getDefaultState();
			
		} else if(string == "beetroot") {
			
			return  Blocks.BEETROOTS.getDefaultState();
			
		} else if(string == "netherwart") {
			
			return Blocks.NETHER_WART.getDefaultState();
			
		}
		
		return null;
		
	}

}
