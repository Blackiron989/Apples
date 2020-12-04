package com.apples.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class ItemAppleSnowball extends ItemFood {
	
	public ItemAppleSnowball(String name, int amount, float saturation, boolean isWolfFood) {
		
		super(amount, saturation, isWolfFood);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setAlwaysEdible();
		
	}
	
	@Override
	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		
		if(!world.isRemote) {
			
			EntitySnowball entitysnowball = new EntitySnowball(world, entityplayer);
			entitysnowball.shoot(entityplayer, entityplayer.rotationPitch, entityplayer.rotationYaw, 0.0F, 2.5F, 0.5F);
			world.spawnEntity(entitysnowball);
            
		}
		
	}

}
