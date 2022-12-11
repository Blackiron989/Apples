package com.apples.items;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.IPlantable;

public class AppleFlowerPotItem extends Item {

	public AppleFlowerPotItem(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {
		
		if(!level.isClientSide()) {
			
			if(livingentity.isOnGround()) {
				
				BlockPos blockpos = livingentity.blockPosition();
				BlockPos.MutableBlockPos mutableblockpos = new BlockPos.MutableBlockPos();
				
				for(BlockPos blockpos1 : BlockPos.betweenClosed(blockpos.offset(-2.0D, -1.0D, -2.0D), blockpos.offset(2.0D, 1.0D, 2.0D))) {
					
					mutableblockpos.set(blockpos1.getX(), blockpos1.getY(), blockpos1.getZ());
					BlockState blockstate = level.getBlockState(mutableblockpos);

					BlockState state = Blocks.WHITE_TULIP.defaultBlockState();
					switch((int)Math.round(Math.random() * 24)) {
					
						case 0: state = Blocks.DANDELION.defaultBlockState(); break;
						case 1: state = Blocks.POPPY.defaultBlockState(); break;
						case 2: state = Blocks.BLUE_ORCHID.defaultBlockState(); break;
						case 3: state = Blocks.ALLIUM.defaultBlockState(); break;
						case 4: state = Blocks.AZURE_BLUET.defaultBlockState(); break;
						case 5: state = Blocks.RED_TULIP.defaultBlockState(); break;
						case 6: state = Blocks.ORANGE_TULIP.defaultBlockState(); break;
						case 7: state = Blocks.WHITE_TULIP.defaultBlockState(); break;
						case 8: state = Blocks.PINK_TULIP.defaultBlockState(); break;
						case 9: state = Blocks.OXEYE_DAISY.defaultBlockState(); break;
						case 10: state = Blocks.CORNFLOWER.defaultBlockState(); break;
						case 11: state = Blocks.LILY_OF_THE_VALLEY.defaultBlockState(); break;
						case 12: state = Blocks.OAK_SAPLING.defaultBlockState(); break;
						case 13: state = Blocks.SPRUCE_SAPLING.defaultBlockState(); break;
						case 14: state = Blocks.BIRCH_SAPLING.defaultBlockState(); break;
						case 15: state = Blocks.JUNGLE_SAPLING.defaultBlockState(); break;
						case 16: state = Blocks.ACACIA_SAPLING.defaultBlockState(); break;
						case 17: state = Blocks.DARK_OAK_SAPLING.defaultBlockState(); break;
						case 18: state = Blocks.RED_MUSHROOM.defaultBlockState(); break;
						case 19: state = Blocks.BROWN_MUSHROOM.defaultBlockState(); break;
						case 20: state = Blocks.FERN.defaultBlockState(); break;
						case 21: state = Blocks.DEAD_BUSH.defaultBlockState(); break;
						case 22: state = Blocks.AZALEA.defaultBlockState(); break;
						case 23: state = Blocks.FLOWERING_AZALEA.defaultBlockState(); break;
				
					}
					
					
					Direction direction = Direction.DOWN;
					
					if(blockstate.canSustainPlant(level, mutableblockpos, direction, (IPlantable)state.getBlock()) && blockstate.getBlock() != Blocks.FARMLAND) {
						
						if(level.isEmptyBlock(mutableblockpos.above())) {
							
							level.setBlockAndUpdate(mutableblockpos.above(), state);
							
						}
						
					}
					
				}
				
			}
			
		}
		
		return livingentity.eat(level, itemstack);
		
	}

}
