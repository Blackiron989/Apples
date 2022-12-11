package com.apples.items;

import com.apples.blocks.BlockLoader;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;

public class BottleOfMagicItem extends Item {

	public BottleOfMagicItem(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public InteractionResult useOn(UseOnContext context) {
		
		Level level = context.getLevel();
		
		BlockPos blockpos = context.getClickedPos();
		
		BlockState blockstate = level.getBlockState(blockpos);
		
		ItemStack itemstack = context.getItemInHand();
		
		if(blockstate == Blocks.DIAMOND_BLOCK.defaultBlockState()) {
			
			level.setBlockAndUpdate(blockpos, BlockLoader.RUBY_BLOCK.get().defaultBlockState());
			itemstack.shrink(1);
			return InteractionResult.SUCCESS;
			
		} else if(blockstate == BlockLoader.RUBY_BLOCK.get().defaultBlockState()) {
			
			level.setBlockAndUpdate(blockpos, Blocks.DIAMOND_BLOCK.defaultBlockState());
			itemstack.shrink(1);
			return InteractionResult.SUCCESS;
		
		} else if(blockstate == Blocks.BEDROCK.defaultBlockState()) {
			
			Player player = context.getPlayer();
			if(player != null) {
				
				ItemStack stack = new ItemStack(ItemLoader.BEDROCKFRAGMENT.get(), (int)Math.random() * 4);
				player.spawnAtLocation(stack, 0);
				
			}
			itemstack.shrink(1);
			return InteractionResult.SUCCESS;
			
		}

		return InteractionResult.FAIL;
		
	}
	
	@Override
	public boolean isFoil(ItemStack itemstack) {
		
		return true;
		
	}

}
