package com.apples.items;

import java.util.List;
import java.util.Random;

import com.google.common.collect.Lists;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityFireworkRocket;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemAppleFirework extends ItemFood {
	
	public ItemAppleFirework(String name, int amount, float saturation, boolean isWolfFood) {
		
		super(amount, saturation, isWolfFood);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setAlwaysEdible();
		
	}
	
	@Override
	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		
		if(!world.isRemote) {  
				
    		EntityFireworkRocket entityfireworkrocket = new EntityFireworkRocket(world, entityplayer.posX, entityplayer.posY, entityplayer.posZ, firework());
    		
    		if(entityplayer.isRiding()) {
    			
    			entityplayer.dismountRidingEntity();
    			
    		}
    		
    		entityplayer.startRiding(entityfireworkrocket);
        	world.spawnEntity(entityfireworkrocket);
            
		}
		
	}
	
	private ItemStack firework() {
		
		Random rand = new Random();
    	
		int[] colors = new int[rand.nextInt(16)];
    	
    	for(int i = 0; i < colors.length; i++) {
    		
    		colors[i] = rand.nextInt(20000000);
    	
    	} 
		
		NBTTagCompound compound = new NBTTagCompound();
		NBTTagCompound com = new NBTTagCompound();
		
		NBTTagCompound firework = new NBTTagCompound();
		NBTTagList explosion = new NBTTagList();

		com.setBoolean("Flicker", true);
		com.setIntArray("Colors", colors);
		
		explosion.appendTag(com);
		
		compound.setTag("Explosions", explosion);
		compound.setInteger("Flight", 2);
		
		firework.setTag("Fireworks", compound);
		
		ItemStack itemstack = new ItemStack(Items.FIREWORKS);
		itemstack.setTagCompound(firework);
		
		return itemstack;
		
	}

}