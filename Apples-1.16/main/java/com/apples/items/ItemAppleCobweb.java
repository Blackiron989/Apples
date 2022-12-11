package com.apples.items;

import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemAppleCobweb extends Item {

	public ItemAppleCobweb(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity livingentity) {
		
		if(!world.isRemote) {
			
			if(world.isAirBlock(livingentity.getPosition())) {
				
				world.setBlockState(livingentity.getPosition(), Blocks.COBWEB.getDefaultState());
				
			}
			
		}
	
		return this.isFood() ? livingentity.onFoodEaten(world, itemstack) : itemstack;
		
	}

}
