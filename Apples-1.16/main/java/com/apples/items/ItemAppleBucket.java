package com.apples.items;

import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class ItemAppleBucket extends Item {

	public ItemAppleBucket(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity livingentity) {

		return this.isFood() ? livingentity.onFoodEaten(world, itemstack) : itemstack;
		
	}
	
	@Override
	public ActionResultType itemInteractionForEntity(ItemStack itemstack, PlayerEntity playerentity, LivingEntity livingentity, Hand hand) {
		
		if(livingentity instanceof CowEntity) {
			
			playerentity.setHeldItem(hand, new ItemStack(ItemLoader.APPLEMILK.get()));
			
		}
		
		return ActionResultType.PASS;
		
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity playerentity, Hand hand) {
		
		ItemStack itemstack = playerentity.getHeldItem(hand);
	    RayTraceResult raytraceresult = rayTrace(world, playerentity, RayTraceContext.FluidMode.SOURCE_ONLY);
	    
	    if(raytraceresult.getType() == RayTraceResult.Type.BLOCK) {
	    	
	    	BlockRayTraceResult blockraytraceresult = (BlockRayTraceResult)raytraceresult;
	    	
	    	if(world.getBlockState(blockraytraceresult.getPos()) == Blocks.WATER.getDefaultState()) {
	    		
	    		return ActionResult.resultPass(new ItemStack(ItemLoader.APPLEWATER.get()));
	    		
	    	} else if(world.getBlockState(blockraytraceresult.getPos()) == Blocks.LAVA.getDefaultState()) {
	    		
	    		return ActionResult.resultPass(new ItemStack(ItemLoader.APPLELAVA.get()));
	    		
	    	}
	    	
	    }
	    
	    return ActionResult.resultPass(itemstack);
		
	}

}
