package com.apples.worldgen;

import java.util.Random;

import com.apples.BlockHelper;
import com.google.common.base.Predicate;

import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class OreGenerator implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		
		if(world.provider.getDimension() == 0) {
			
			generator(BlockHelper.rubyOre.getDefaultState(), 6, BlockMatcher.forBlock(Blocks.STONE), world, random, chunkX, 6, 20, chunkZ);
			generator(BlockHelper.bedrockOre.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE), world, random, chunkX, 2, 10, chunkZ);
			
		}
		
	}
	
	private void generator(IBlockState blockstate, int blockcount, Predicate<IBlockState> state, World world, Random random, int chunk_x, int heightMin, int heightMax, int chunk_z) {
		
		WorldGenMinable gen = new WorldGenMinable(blockstate, blockcount, state);
		int difference = heightMax - heightMin;
		
		for(int i = 0; i < 10; i++ ) {
			
			int x = chunk_x * 16 + random.nextInt(16);
			int y = heightMin + random.nextInt(difference);
			int z = chunk_z * 16 + random.nextInt(16);
			
			gen.generate(world, random, new BlockPos(x, y, z));
			
		}
		
	}

}
