package com.apples.items;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;

public class ItemAppleFlowerPot extends Item {

	public ItemAppleFlowerPot(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity livingentity) {
		
		if(!world.isRemote) {
			
			if(livingentity.isOnGround()) {
				
				BlockPos blockpos = livingentity.getPosition();
				BlockPos.Mutable mutableblockpos = new BlockPos.Mutable();
				
				for(BlockPos blockpos1 : BlockPos.getAllInBoxMutable(blockpos.add(-2.0D, -1.0D, -2.0D), blockpos.add(2.0D, 1.0D, 2.0D))) {
					
					mutableblockpos.setPos(blockpos1.getX(), blockpos1.getY(), blockpos1.getZ());
					BlockState blockstate = world.getBlockState(mutableblockpos);
					
					IPlantable iplantable = (IPlantable)Blocks.DANDELION;
					Direction direction = Direction.DOWN;
					
					if(blockstate.canSustainPlant(world, mutableblockpos, direction, iplantable)) {
						
						if(world.isAirBlock(mutableblockpos.up())) {
						
							double rand = Math.round(Math.random() * 10); 
	
							switch((int)rand) {
							
								case 0: world.setBlockState(mutableblockpos.up(), Blocks.DANDELION.getDefaultState()); break;
								case 1: world.setBlockState(mutableblockpos.up(), Blocks.POPPY.getDefaultState()); break;
								case 2: world.setBlockState(mutableblockpos.up(), Blocks.BLUE_ORCHID.getDefaultState()); break;
								case 3: world.setBlockState(mutableblockpos.up(), Blocks.ALLIUM.getDefaultState()); break;
								case 4: world.setBlockState(mutableblockpos.up(), Blocks.AZURE_BLUET.getDefaultState()); break;
								case 5: world.setBlockState(mutableblockpos.up(), Blocks.ORANGE_TULIP.getDefaultState()); break;
								case 6: world.setBlockState(mutableblockpos.up(), Blocks.PINK_TULIP.getDefaultState()); break;
								case 7: world.setBlockState(mutableblockpos.up(), Blocks.RED_TULIP.getDefaultState()); break;
								case 8: world.setBlockState(mutableblockpos.up(), Blocks.OXEYE_DAISY.getDefaultState()); break;
								case 9: world.setBlockState(mutableblockpos.up(), Blocks.CORNFLOWER.getDefaultState()); break;
								default: world.setBlockState(mutableblockpos.up(), Blocks.WHITE_TULIP.getDefaultState()); break;
							
							}
							
						}
						
					}
					
				}
				
			}
			
		}
		
		return this.isFood() ? livingentity.onFoodEaten(world, itemstack) : itemstack;
		
	}

}
