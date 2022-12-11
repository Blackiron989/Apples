package com.apples.items;

import java.util.Random;

import com.apples.blocks.BlockLoader;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.level.Level;

public class BottleOfMagicItem extends Item {

	public BottleOfMagicItem(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public InteractionResult useOn(UseOnContext context) {
		
		Level level = context.getLevel();
		if(level.isClientSide()) {
			return InteractionResult.PASS;
		}
		BlockPos blockpos = context.getClickedPos();
		BlockState blockstate = level.getBlockState(blockpos);
		ItemStack itemstack = context.getItemInHand();
		
		if(blockstate == Blocks.DIAMOND_BLOCK.defaultBlockState()) {

			level.setBlockAndUpdate(blockpos, BlockLoader.RUBY_BLOCK.get().defaultBlockState());
			level.playSound(null, blockpos, SoundEvents.AMETHYST_BLOCK_HIT, SoundSource.BLOCKS, 1.0F, 1.0F);
			itemstack.shrink(1);
			
			return InteractionResult.SUCCESS;
			
		} else if(blockstate == BlockLoader.RUBY_BLOCK.get().defaultBlockState()) {
			
			level.setBlockAndUpdate(blockpos, Blocks.DIAMOND_BLOCK.defaultBlockState());
			level.playSound(null, blockpos, SoundEvents.AMETHYST_BLOCK_HIT, SoundSource.BLOCKS, 1.0F, 1.0F);
			itemstack.shrink(1);
			
			return InteractionResult.SUCCESS;
		
		} else if(blockstate == Blocks.BEDROCK.defaultBlockState()) {
			
			Player player = context.getPlayer();
			if(player != null) {

				int rand = Mth.nextInt(new Random(), 1, 4);
				ItemStack stack = new ItemStack(ItemLoader.BEDROCKFRAGMENT.get(), rand);
				player.spawnAtLocation(stack, 0);
				level.playSound(null, blockpos, SoundEvents.ANCIENT_DEBRIS_HIT, SoundSource.BLOCKS, 1.0F, 1.0F);
				itemstack.shrink(1);
				
			}
			
			return InteractionResult.SUCCESS;
			
		}

		return InteractionResult.FAIL;
		
	}
	
	@Override
	public boolean isFoil(ItemStack itemstack) {
		
		return true;
		
	}

}
