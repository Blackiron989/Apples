package com.apples.blocks;

import java.util.Random;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;

public class BlockFakeCake extends Block {
	
	public static final IntegerProperty AGE = BlockStateProperties.AGE_2;

	public BlockFakeCake(Properties properties) {
		
		super(properties);
		this.registerDefaultState(this.stateDefinition.any().setValue(AGE, Integer.valueOf(0)));

	}
	
	@Override
	public VoxelShape getShape(BlockState state, BlockGetter blockgetter, BlockPos pos, CollisionContext context) {
		
	      return Block.box(1.0D, 0.0D, 1.0D, 15.0D, 8.0D, 15.0D);
	      
	}
	
	@Override
	public void tick(BlockState blockstate, ServerLevel server, BlockPos blockpos, Random random) {
		
		if(!blockstate.canSurvive(server, blockpos)) {
			
			server.destroyBlock(blockpos, false);
			
		}
		
	}
	
	@Override
	public void randomTick(BlockState blockstate, ServerLevel server, BlockPos blockpos, Random random) {
		
		int i = blockstate.getValue(AGE);
		
		if(i < 2) {
			
			BlockState newstate = blockstate.setValue(AGE, Integer.valueOf(i + 1));
			server.setBlock(blockpos, newstate, 4);
			
		} else {

			server.destroyBlock(blockpos, false);
			
		}
		
	}
	
	@Override
	public InteractionResult use(BlockState blockstate, Level level, BlockPos blockpos, Player player, InteractionHand hand, BlockHitResult blockraytrace) {
		
		if(!level.isClientSide()) {
			
			Random random = new Random();
			
			if(random.nextBoolean()) {
				
				//player.drop(new ItemStack(Items.CAKE), false);
				Block.popResource(level, blockpos, new ItemStack(Items.CAKE));
				level.destroyBlock(blockpos, false);
				
			} else {
				
				level.destroyBlock(blockpos, false);
				
			}
			
		}
		
		return InteractionResult.PASS;
		
	}
	
	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		
		builder.add(AGE);
		
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader levelreader, BlockPos blockpos) {
	
		return levelreader.getBlockState(blockpos.below()).getMaterial().isSolid();
   	
	}
	
	@Override
	public boolean isPathfindable(BlockState blockstate, BlockGetter blockgetter, BlockPos blockpos, PathComputationType pathtype) {
		
		return false;
	
	}

}
