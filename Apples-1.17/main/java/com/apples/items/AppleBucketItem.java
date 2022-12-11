package com.apples.items;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Cow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ClipContext.Fluid;
import net.minecraft.world.level.Level;

public class AppleBucketItem extends Item {

	public AppleBucketItem(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {

		return livingentity.eat(level, itemstack);
		
	}
	
	@Override
	public InteractionResult interactLivingEntity(ItemStack itemstack, Player player, LivingEntity livingentity, InteractionHand hand) {
		
		if(livingentity instanceof Cow) {
			
			player.setItemInHand(hand, new ItemStack(ItemLoader.APPLEMILK.get()));
			
		}
		
		return InteractionResult.PASS;
		
	}
	
	@Override
	public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
		
		ItemStack itemstack = player.getItemInHand(hand);
	    BlockHitResult hitresult = getPlayerPOVHitResult(level, player, Fluid.SOURCE_ONLY);
	    
	    if(hitresult.getType() == BlockHitResult.Type.BLOCK) {
	    	
	    	if(level.getBlockState(hitresult.getBlockPos()) == Blocks.WATER.defaultBlockState()) {
	    		
	    		return InteractionResultHolder.pass(new ItemStack(ItemLoader.APPLEWATER.get()));
	    		
	    	} else if(level.getBlockState(hitresult.getBlockPos()) == Blocks.LAVA.defaultBlockState()) {
	    		
	    		return InteractionResultHolder.pass(new ItemStack(ItemLoader.APPLELAVA.get()));
	    		
	    	}
	    	
	    }
	    
	    return InteractionResultHolder.pass(itemstack);
		
	}

}
