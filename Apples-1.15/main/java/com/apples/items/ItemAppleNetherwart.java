package com.apples.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.PotionUtils;
import net.minecraft.potion.Potions;
import net.minecraft.world.World;

public class ItemAppleNetherwart extends Item {

	public ItemAppleNetherwart(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity livingentity) {
		
		if(!world.isRemote) {
			
			PlayerEntity playerentity = (PlayerEntity)livingentity;
			
			int size = playerentity.inventory.getSizeInventory();

			for(int i = 0; i < size; i++) {
				
				if(this.getItem() == ItemLoader.APPLENETHERWART.get()) {
					
					if(PotionUtils.getPotionFromItem(playerentity.inventory.getStackInSlot(i)) == Potions.WATER) {
						
						playerentity.replaceItemInInventory(i, PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.AWKWARD));
						
					}
					
				} else if(this.getItem() == ItemLoader.APPLEGLOWSTONEDUST.get()) {
					
					if(PotionUtils.getPotionFromItem(playerentity.inventory.getStackInSlot(i)) == Potions.WATER) {
						
						playerentity.replaceItemInInventory(i, PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.THICK));
						
					} else if(PotionUtils.getPotionFromItem(playerentity.inventory.getStackInSlot(i)) == Potions.HEALING) {
						
						playerentity.replaceItemInInventory(i, PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.STRONG_HEALING));
						
					} else if(PotionUtils.getPotionFromItem(playerentity.inventory.getStackInSlot(i)) == Potions.HARMING) {
						
						playerentity.replaceItemInInventory(i, PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.STRONG_HARMING));
						
					} else if(PotionUtils.getPotionFromItem(playerentity.inventory.getStackInSlot(i)) == Potions.LEAPING) {
						
						playerentity.replaceItemInInventory(i, PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.STRONG_LEAPING));
						
					} else if(PotionUtils.getPotionFromItem(playerentity.inventory.getStackInSlot(i)) == Potions.POISON) {
						
						playerentity.replaceItemInInventory(i, PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.STRONG_POISON));
						
					} else if(PotionUtils.getPotionFromItem(playerentity.inventory.getStackInSlot(i)) == Potions.REGENERATION) {
						
						playerentity.replaceItemInInventory(i, PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.STRONG_REGENERATION));
						
					} else if(PotionUtils.getPotionFromItem(playerentity.inventory.getStackInSlot(i)) == Potions.SLOWNESS) {
						
						playerentity.replaceItemInInventory(i, PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.STRONG_SLOWNESS));
						
					} else if(PotionUtils.getPotionFromItem(playerentity.inventory.getStackInSlot(i)) == Potions.STRENGTH) {
						
						playerentity.replaceItemInInventory(i, PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.STRONG_STRENGTH));
						
					} else if(PotionUtils.getPotionFromItem(playerentity.inventory.getStackInSlot(i)) == Potions.SWIFTNESS) {
						
						playerentity.replaceItemInInventory(i, PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.STRONG_SWIFTNESS));
						
					} else if(PotionUtils.getPotionFromItem(playerentity.inventory.getStackInSlot(i)) == Potions.TURTLE_MASTER) {
						
						playerentity.replaceItemInInventory(i, PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.STRONG_TURTLE_MASTER));
						
					}
					
				} else if(this.getItem() == ItemLoader.APPLEREDSTONE.get()) {
					
					if(PotionUtils.getPotionFromItem(playerentity.inventory.getStackInSlot(i)) == Potions.WATER) {
						
						playerentity.replaceItemInInventory(i, PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.MUNDANE));
						
					} else if(PotionUtils.getPotionFromItem(playerentity.inventory.getStackInSlot(i)) == Potions.FIRE_RESISTANCE) {
						
						playerentity.replaceItemInInventory(i, PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.LONG_FIRE_RESISTANCE));
						
					} else if(PotionUtils.getPotionFromItem(playerentity.inventory.getStackInSlot(i)) == Potions.INVISIBILITY) {
						
						playerentity.replaceItemInInventory(i, PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.LONG_INVISIBILITY));
						
					} else if(PotionUtils.getPotionFromItem(playerentity.inventory.getStackInSlot(i)) == Potions.LEAPING) {
						
						playerentity.replaceItemInInventory(i, PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.LONG_LEAPING));
						
					} else if(PotionUtils.getPotionFromItem(playerentity.inventory.getStackInSlot(i)) == Potions.NIGHT_VISION) {
						
						playerentity.replaceItemInInventory(i, PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.LONG_NIGHT_VISION));
						
					} else if(PotionUtils.getPotionFromItem(playerentity.inventory.getStackInSlot(i)) == Potions.POISON) {
						
						playerentity.replaceItemInInventory(i, PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.LONG_POISON));
						
					} else if(PotionUtils.getPotionFromItem(playerentity.inventory.getStackInSlot(i)) == Potions.REGENERATION) {
						
						playerentity.replaceItemInInventory(i, PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.LONG_REGENERATION));
						
					} else if(PotionUtils.getPotionFromItem(playerentity.inventory.getStackInSlot(i)) == Potions.SLOW_FALLING) {
						
						playerentity.replaceItemInInventory(i, PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.LONG_SLOW_FALLING));
						
					} else if(PotionUtils.getPotionFromItem(playerentity.inventory.getStackInSlot(i)) == Potions.SLOWNESS) {
						
						playerentity.replaceItemInInventory(i, PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.LONG_SLOWNESS));
						
					} else if(PotionUtils.getPotionFromItem(playerentity.inventory.getStackInSlot(i)) == Potions.STRENGTH) {
						
						playerentity.replaceItemInInventory(i, PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.LONG_STRENGTH));
						
					} else if(PotionUtils.getPotionFromItem(playerentity.inventory.getStackInSlot(i)) == Potions.SWIFTNESS) {
						
						playerentity.replaceItemInInventory(i, PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.LONG_SWIFTNESS));
						
					} else if(PotionUtils.getPotionFromItem(playerentity.inventory.getStackInSlot(i)) == Potions.TURTLE_MASTER) {
						
						playerentity.replaceItemInInventory(i, PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.LONG_TURTLE_MASTER));
						
					} else if(PotionUtils.getPotionFromItem(playerentity.inventory.getStackInSlot(i)) == Potions.WATER_BREATHING) {
						
						playerentity.replaceItemInInventory(i, PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.LONG_WATER_BREATHING));
						
					} else if(PotionUtils.getPotionFromItem(playerentity.inventory.getStackInSlot(i)) == Potions.WEAKNESS) {
						
						playerentity.replaceItemInInventory(i, PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.LONG_WEAKNESS));
						
					}
					
				}
				
			}
		
		}
		
		return this.isFood() ? livingentity.onFoodEaten(world, itemstack) : itemstack;
		
	}

}
