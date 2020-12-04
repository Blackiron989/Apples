package com.apples.items;

import com.apples.blocks.BlockLoader;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemBottleMagic extends Item {

	public ItemBottleMagic(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ActionResultType onItemUse(ItemUseContext itemusecontext) {
		
		World world = itemusecontext.getWorld();
		
		BlockPos blockpos = itemusecontext.getPos();
		
		BlockState blockstate = world.getBlockState(blockpos);
		
		if(blockstate == Blocks.DIAMOND_ORE.getDefaultState()) {
			
			world.setBlockState(blockpos, BlockLoader.RUBY_ORE.get().getDefaultState());
			
		} else if(blockstate == Blocks.DIAMOND_BLOCK.getDefaultState()) {
			
			world.setBlockState(blockpos, BlockLoader.RUBY_BLOCK.get().getDefaultState());
			
		}
		
		return ActionResultType.SUCCESS;
		
	}

}
