package com.apples.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class ItemAppleFireball extends ItemFood {
	
	public ItemAppleFireball(String name, int amount, float saturation, boolean isWolfFood) {
		
		super(amount, saturation, isWolfFood);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setAlwaysEdible();
		
	}
	
	@Override
	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		
		if(!world.isRemote) {  
            
            int i;
            for(i = 0; i < 7; i++) {
            	
            	double rand = Math.random() * 6 - 3;
            	double random = Math.random() * 360 - 180;
            	double random2 = Math.random() * 360 - 180;
            	
            	double vel1 = Math.random() * 2 - 0.5;
            	double vel2 = Math.random() * 2 - 0.5;
            	double vel3 = Math.random() * 2 - 0.5;
            	
            	float entitypitch = (float) (random * entityplayer.rotationPitch);
            	float entityyaw = (float) (random2 * entityplayer.rotationYaw);
            	
            	EntityLargeFireball fireball = new EntityLargeFireball(world);
            	fireball.setLocationAndAngles(entityplayer.posX + rand, entityplayer.posY + rand, entityplayer.posZ + rand, entityyaw, entitypitch);
            	fireball.addVelocity(vel1, vel2, vel3);
            	world.spawnEntity(fireball);
            	
            }
            
		}
		
	}

}