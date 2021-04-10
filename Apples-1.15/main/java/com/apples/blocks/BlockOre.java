package com.apples.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

public class BlockOre extends Block {

	public BlockOre(Properties properties) {
		
		super(properties);

	}
	
	protected int exp(Random random) {

		return MathHelper.nextInt(random, 3, 7);

    }
	
	@Override
    public int getExpDrop(BlockState state, net.minecraft.world.IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
		
		return silktouch == 0 ? this.exp(RANDOM) : 0;
      
	}

}
