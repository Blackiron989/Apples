package com.apples.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

public class BlockFakeCake extends Block {
	
	public static final IntegerProperty AGE = BlockStateProperties.AGE_0_2;

	public BlockFakeCake(Properties properties) {
		
		super(properties);
		this.setDefaultState(this.stateContainer.getBaseState().with(AGE, Integer.valueOf(0)));

	}
	
	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		
	      return Block.makeCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 8.0D, 15.0D);
	      
	}
	
	@Override
	public void tick(BlockState blockstate, World world, BlockPos blockpos, Random random) {
		
		if(!blockstate.isValidPosition(world, blockpos)) {
			
			world.destroyBlock(blockpos, false);
			
		} else {
			
			int i = blockstate.get(AGE);
			
			if(i < 2) {
				
				BlockState blockstate1 = blockstate.with(AGE, Integer.valueOf(i + 1));
				world.setBlockState(blockpos, blockstate1);
				
			} else {

				world.destroyBlock(blockpos, false);
				
			}
			
		}
		
	}
	
	@Override
	public boolean onBlockActivated(BlockState blockstate, World world, BlockPos blockpos, PlayerEntity playerentity, Hand hand, BlockRayTraceResult blockraytrace) {
		
		if(!world.isRemote) {
			
			Random random = new Random();
			
			int r = MathHelper.nextInt(random, 0, 1);
			
			if(r == 1) {
				
				playerentity.entityDropItem(new ItemStack(Items.CAKE), 0);
				world.destroyBlock(blockpos, false);
				
			} else {
				
				world.destroyBlock(blockpos, false);
				
			}
			
		}
		
		return true;
		
	}
	
	@Override
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
		
		builder.add(AGE);
		
	}

	@Override
	public boolean isValidPosition(BlockState blockstate, IWorldReader iworldreader, BlockPos blockpos) {
	
		return iworldreader.getBlockState(blockpos.down()).getMaterial().isSolid();
   	
	}
	
	@Override
	public boolean allowsMovement(BlockState blockstate, IBlockReader iblockreader, BlockPos blockpos, PathType pathtype) {
		
		return false;
	
	}

}
