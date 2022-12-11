package com.apples.items;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class ItemAppleWater extends Item {

	public ItemAppleWater(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity livingentity) {

		if(!world.isRemote) {
			
			if(livingentity.isBurning()) {
				
				livingentity.extinguish();
				
				BlockState blockstate = world.getBlockState(livingentity.getPosition());
				
				if(blockstate.getBlock() == Blocks.LAVA) {
					
					world.setBlockState(livingentity.getPosition(), Blocks.OBSIDIAN.getDefaultState());
					
				} else if(blockstate.getBlock() == Blocks.FIRE) {
					
					world.setBlockState(livingentity.getPosition(), Blocks.AIR.getDefaultState());
					
				} /* else if(blockstate.getBlock() == Blocks.CAMPFIRE) {
					
					TileEntity tileentity = world.getTileEntity(livingentity.getPosition());
					
					if(tileentity instanceof CampfireTileEntity) {
						
						((CampfireTileEntity)tileentity).func_213986_d();
						
					}

					world.setBlockState(livingentity.getPosition(), Blocks.CAMPFIRE.getDefaultState().with(BlockStateProperties.WATERLOGGED, Boolean.valueOf(true)).with(BlockStateProperties.LIT, Boolean.valueOf(false)), 3);
					
				} */
					
				
			} else if(livingentity.isInWater()) {
				
				livingentity.attackEntityFrom(DamageSource.DROWN, 100.0F);
				
			}
			
		}
		
		//return this.isFood() ? livingentity.onFoodEaten(world, itemstack) : itemstack;
		itemstack.setCount(0);
		return new ItemStack(ItemLoader.APPLEBUCKET.get());
		
	}

}
