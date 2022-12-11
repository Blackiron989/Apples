package com.apples.items;

import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemAppleLava extends Item {

	public ItemAppleLava(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity livingentity) {
		
		if(!world.isRemote) {
			
			livingentity.setFire(60);
			
			double rand = Math.random() * 10;
			
			if(rand < 1) {
				
				if(world.isAirBlock(livingentity.getPosition())) {
					
					world.setBlockState(livingentity.getPosition(), Blocks.LAVA.getDefaultState());
					
				}
				
			}
			
		}

		//return this.isFood() ? livingentity.onFoodEaten(world, itemstack) : itemstack;
		itemstack.setCount(0);
		return new ItemStack(ItemLoader.APPLEBUCKET.get());
		
	}

}
