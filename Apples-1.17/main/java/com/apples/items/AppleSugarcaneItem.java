package com.apples.items;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.IPlantable;

public class AppleSugarcaneItem extends Item {

	public AppleSugarcaneItem(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {

		BlockState blockstate = level.getBlockState(livingentity.blockPosition().below());
		
		if(blockstate.canSustainPlant(level, livingentity.blockPosition().below(), Direction.UP, (IPlantable)Blocks.SUGAR_CANE)) {
			
			if(!level.isClientSide()) {
				
				double random = (Math.random() * 10) * 3 + 1;
				
				for(int i = 0; i < (int)random; i++) {
				
					if(level.getBlockState(livingentity.blockPosition().above(i)) == Blocks.AIR.defaultBlockState()) {
					
						level.setBlockAndUpdate(livingentity.blockPosition().above(i), Blocks.SUGAR_CANE.defaultBlockState());
					
					} else {
						
						break;
						
					}
				
				}
			
			}
			
		}
		
		return livingentity.eat(level, itemstack);
		
	}

}
