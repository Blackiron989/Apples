package com.apples.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemAppleEgg extends ItemFood {
	
	public ItemAppleEgg(String name, int amount, float saturation, boolean isWolfFood) {
		
		super(amount, saturation, isWolfFood);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setAlwaysEdible();
		
	}
	
	@Override
	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		
		if(!world.isRemote) {
            
			for(int i = 0; i < 5; i++) {
				
				EntityEgg entityegg = new EntityEgg(world, entityplayer);
				entityegg.shoot(entityplayer, entityplayer.rotationPitch, entityplayer.rotationYaw, 0.0F, 2.5F, 0.5F);
				world.spawnEntity(entityegg);
		
			}
		
		}
		
	}

}
