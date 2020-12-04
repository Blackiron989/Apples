package com.apples.blocks;

import com.apples.tileentity.TileEntityGlow;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

public class BlockGlow extends Block {

	public BlockGlow(Properties properties) {
		
		super(properties);

	}

	@Override
	public boolean hasTileEntity(BlockState blockstate) {
		
		return true;
		
	}
	
	@Override
	public TileEntity createTileEntity(BlockState blockstate, IBlockReader iblockreader) {
		
		return new TileEntityGlow();
		
	}
	
	@Override
	public BlockRenderType getRenderType(BlockState state) {
		
	      return BlockRenderType.INVISIBLE;
	      
	}
	
	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		
	      return VoxelShapes.empty();
	      
	}
	
}
