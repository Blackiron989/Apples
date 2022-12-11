package com.apples.items;

import com.apples.entity.InvisibleCartEntity;
import com.apples.ApplesPlusUtils;
import com.apples.entity.EntityLoader;

import net.minecraft.world.level.block.BaseRailBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.properties.RailShape;
import net.minecraft.tags.BlockTags;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;

public class AppleMinecartItem extends Item {

	public AppleMinecartItem(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {
		
		BlockPos blockpos = livingentity.blockPosition();
		BlockState blockstate = level.getBlockState(blockpos);

		if(!level.isClientSide()) {
			
			if(blockstate.is(BlockTags.RAILS)) {
					
					RailShape railshape = blockstate.getBlock() instanceof BaseRailBlock ? ((BaseRailBlock)blockstate.getBlock()).getRailDirection(blockstate, level, blockpos, null) : RailShape.NORTH_SOUTH;
					
		            double d0 = 0.0D;
		            
		            if (railshape.isAscending()) {
		            	
		               d0 = 0.5D;
		               
		            }
		            
		            InvisibleCartEntity entitycart = new InvisibleCartEntity(EntityLoader.INVISIBLE_CART.get(), level);
		            entitycart.setPos((double)blockpos.getX() + 0.5D, (double)blockpos.getY() + 0.0625D + d0, (double)blockpos.getZ() + 0.5D);
		            
		            level.addFreshEntity(entitycart);
		            
		            livingentity.startRiding(entitycart);

			}
			
			if(itemstack.isDamageableItem()) {
	        	
				return ApplesPlusUtils.damageableEat(level, itemstack, livingentity);
	        	
	        }
				
		}
		
		return itemstack;
		
	}

}
