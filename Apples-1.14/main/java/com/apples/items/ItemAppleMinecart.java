package com.apples.items;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.minecart.ChestMinecartEntity;
import net.minecraft.entity.item.minecart.FurnaceMinecartEntity;
import net.minecraft.entity.item.minecart.HopperMinecartEntity;
import net.minecraft.entity.item.minecart.MinecartEntity;
import net.minecraft.entity.item.minecart.TNTMinecartEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemAppleMinecart extends Item {

	public ItemAppleMinecart(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity livingentity) {
		
		if(!world.isRemote) {
			
			double rand = Math.random() * 10;
			
			if(rand > 8) {
				
				ChestMinecartEntity chestminecartentity = new ChestMinecartEntity(EntityType.CHEST_MINECART, world);
				
				chestminecartentity.setPosition(livingentity.posX, livingentity.posY, livingentity.posZ);
				
				world.addEntity(chestminecartentity);
				
			} else if(rand > 6) {
				
				HopperMinecartEntity hopperminecartentity = new HopperMinecartEntity(EntityType.HOPPER_MINECART, world);
				
				hopperminecartentity.setPosition(livingentity.posX, livingentity.posY, livingentity.posZ);
				
				world.addEntity(hopperminecartentity);
				
			} else if(rand > 4) {
				
				FurnaceMinecartEntity furnaceminecartentity = new FurnaceMinecartEntity(EntityType.FURNACE_MINECART, world);
				
				furnaceminecartentity.setPosition(livingentity.posX, livingentity.posY, livingentity.posZ);
				
				world.addEntity(furnaceminecartentity);
				
			} else if(rand > 2) {
				
				TNTMinecartEntity tntminecartentity = new TNTMinecartEntity(EntityType.TNT_MINECART, world);
				
				tntminecartentity.setPosition(livingentity.posX, livingentity.posY, livingentity.posZ);
				
				world.addEntity(tntminecartentity);
				
			} else {
				
				MinecartEntity minecartentity = new MinecartEntity(EntityType.MINECART, world);
				
				minecartentity.setPosition(livingentity.posX, livingentity.posY, livingentity.posZ);
				
				world.addEntity(minecartentity);
				
			}
			
		}

		return this.isFood() ? livingentity.onFoodEaten(world, itemstack) : itemstack;
		
	}

}
