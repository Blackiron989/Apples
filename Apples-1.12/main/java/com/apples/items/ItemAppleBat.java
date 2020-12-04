package com.apples.items;

import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;


public class ItemAppleBat extends ItemFood {
	
	
	public ItemAppleBat(String name, int amount, float saturation, boolean isWolfFood) {
		
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setAlwaysEdible();

	}
	
	@Override
	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		
		if(!world.isRemote) {
			
			for (int i = 0; i < 7; ++i)
            {
				
				double x = (double)entityplayer.posX + 0.5D;
				double y = (double)entityplayer.posY + 0.5D;
				double z = (double)entityplayer.posZ + 0.5D;
            	
            	double randomX = x + (Math.random() * 20) - 10;
            	double randomZ = z + (Math.random() * 20) - 10;
                	
                EntityBat entitybat = new EntityBat(world);
                entitybat.setLocationAndAngles(randomX, y, randomZ, MathHelper.wrapDegrees(world.rand.nextFloat() * 360.0F), 0.0F);
                world.spawnEntity(entitybat);

            }
			
		}
		
	}

}
