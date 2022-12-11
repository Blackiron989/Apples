package com.apples.items;

import java.util.Random;

import com.apples.entity.EntityCart;
import com.apples.entity.EntityLoader;

import net.minecraft.block.AbstractRailBlock;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.state.properties.RailShape;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemAppleMinecart extends Item {

	public ItemAppleMinecart(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity livingentity) {
		
		BlockState blockstate = livingentity.getBlockState();
		BlockPos blockpos = livingentity.getPosition();

		if(!world.isRemote) {
			
			if(blockstate.isIn(BlockTags.RAILS)) {
					
					RailShape railshape = blockstate.getBlock() instanceof AbstractRailBlock ? ((AbstractRailBlock)blockstate.getBlock()).getRailDirection(blockstate, world, blockpos, null) : RailShape.NORTH_SOUTH;
					
		            double d0 = 0.0D;
		            
		            if (railshape.isAscending()) {
		            	
		               d0 = 0.5D;
		               
		            }
		            
		            EntityCart entitycart = new EntityCart(EntityLoader.INVISIBLE_CART.get(), world);
		            entitycart.setPosition((double)blockpos.getX() + 0.5D, (double)blockpos.getY() + 0.0625D + d0, (double)blockpos.getZ() + 0.5D);
		            
		            world.addEntity(entitycart);
		            
		            livingentity.startRiding(entitycart);

			}
			
			if(itemstack.attemptDamageItem(1, new Random(), null)) {
	        	
				return this.isFood() ? livingentity.onFoodEaten(world, itemstack) : itemstack;
	        	
	        }
				
		}
		
		return itemstack;
		
	}

}
