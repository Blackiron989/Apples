package com.apples.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


public class ItemAppleFlowerpot extends ItemFood {

	public ItemAppleFlowerpot(String name, int amount, float saturation, boolean isWolfFood) {
		
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setAlwaysEdible();
		
	}
	
	@Override
	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		
		if(!world.isRemote) {
			
               plant(world, entityplayer);
			
		}
		
	}
	
	private static void plant(World world, EntityPlayer entityplayer) {
		
		double playerX = entityplayer.posX;
		double playerY = entityplayer.posY;
		double playerZ = entityplayer.posZ;
		
		BlockPos blockpos = new BlockPos(playerX, playerY, playerZ);
		
		for(BlockPos blockpos1 : BlockPos.getAllInBoxMutable(blockpos.add(-1.0D, 0, -1.0D), blockpos.add(1.0D, 0, 1.0D))) {
			
			double rand = Math.random() * 7 + 1;
			if(world.mayPlace(Blocks.RED_FLOWER, blockpos1, false, EnumFacing.DOWN, (EntityPlayer)null)) {
				
				world.setBlockState(blockpos1, Blocks.RED_FLOWER.getStateFromMeta((int)rand));
				
			}
			
		}
		
	}
	
}
