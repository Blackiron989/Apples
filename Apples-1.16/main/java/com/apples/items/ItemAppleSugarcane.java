package com.apples.items;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;

public class ItemAppleSugarcane extends Item {

	public ItemAppleSugarcane(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity livingentity) {

		BlockState blockstate = world.getBlockState(livingentity.getPosition().down());
		
		if(blockstate.canSustainPlant(world, livingentity.getPosition().down(), Direction.UP, (IPlantable)Blocks.SUGAR_CANE)) {
			
			if(!world.isRemote) {
				
				double random = (Math.random() * 10) * 3 + 1;
				
				for(int i = 0; i < (int)random; i++) {
				
					if(world.getBlockState(livingentity.getPosition().up(i)) == Blocks.AIR.getDefaultState()) {
					
						world.setBlockState(livingentity.getPosition().up(i), Blocks.SUGAR_CANE.getDefaultState());
					
					} else {
						
						break;
						
					}
				
				}
			
			}
			
		}
		
		return this.isFood() ? livingentity.onFoodEaten(world, itemstack) : itemstack;
		
	}

}
