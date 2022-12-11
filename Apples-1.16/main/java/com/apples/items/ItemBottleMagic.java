package com.apples.items;

import com.apples.blocks.BlockLoader;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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
		
		ItemStack itemstack = itemusecontext.getItem();
		
		if(blockstate == Blocks.DIAMOND_ORE.getDefaultState()) {
			
			world.setBlockState(blockpos, BlockLoader.RUBY_ORE.get().getDefaultState());
			itemstack.shrink(1);
			
		} else if(blockstate == Blocks.DIAMOND_BLOCK.getDefaultState()) {
			
			world.setBlockState(blockpos, BlockLoader.RUBY_BLOCK.get().getDefaultState());
			itemstack.shrink(1);
			
		} else if(blockstate == BlockLoader.RUBY_ORE.get().getDefaultState()) {
			
			world.setBlockState(blockpos, Blocks.DIAMOND_ORE.getDefaultState());
			itemstack.shrink(1);
			
		} else if(blockstate == BlockLoader.RUBY_BLOCK.get().getDefaultState()) {
			
			world.setBlockState(blockpos, Blocks.DIAMOND_BLOCK.getDefaultState());
			itemstack.shrink(1);
			
		} else if(blockstate == Blocks.BEDROCK.getDefaultState()) {
			
			world.setBlockState(blockpos, BlockLoader.BEDROCK_ORE.get().getDefaultState());
			itemstack.shrink(1);
			
		}
		
		return ActionResultType.SUCCESS;
		
	}
	
	@Override
	public boolean hasEffect(ItemStack itemstack) {
		
		return true;
		
	}

}
