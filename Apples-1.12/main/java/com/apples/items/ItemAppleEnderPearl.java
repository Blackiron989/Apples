package com.apples.items;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemAppleEnderPearl extends ItemFood {
	
	public ItemAppleEnderPearl(String name, int amount, float saturation, boolean isWolfFood) {
		
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setAlwaysEdible();
	}
	
	@Override
	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		
		if(!world.isRemote) {
			
			teleporter(world, entityplayer);

		}
		
	}
	
	private void teleporter(World world, EntityPlayer entityplayer) {
		
		Random rand = new Random();
		
		double xVal = entityplayer.posX + ((rand.nextDouble() - 0.5D) * 128.0D); 
		double yVal = entityplayer.posY + (double)(rand.nextInt(64) - 32);
		double zVal = entityplayer.posZ + ((rand.nextDouble() - 0.5D) * 128.0D);
		
		do {
		
			xVal = entityplayer.posX + ((rand.nextDouble() - 0.5D) * 128.0D); 
			yVal = entityplayer.posY + (double)(rand.nextInt(64) - 32);
			zVal = entityplayer.posZ + ((rand.nextDouble() - 0.5D) * 128.0D);
		
		} while(!toTeleport(xVal, yVal, zVal, world));
		
		if(entityplayer instanceof EntityPlayerMP) {
			
			entityplayer.dismountRidingEntity();
			((EntityPlayerMP)entityplayer).connection.setPlayerLocation(xVal, yVal, zVal, entityplayer.rotationYaw, entityplayer.rotationPitch);
		
		}

	}
	
	private boolean toTeleport(double x, double y, double z, World world) {
		
		BlockPos blockpos = new BlockPos(x, y, z);
		
		IBlockState blockstate = world.getBlockState(blockpos);
		IBlockState blockstate1 = world.getBlockState(blockpos.add(0, 1.0D, 0));

		if(blockstate == Blocks.AIR.getDefaultState() && blockstate == Blocks.AIR.getDefaultState()) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		
	}
	
}
