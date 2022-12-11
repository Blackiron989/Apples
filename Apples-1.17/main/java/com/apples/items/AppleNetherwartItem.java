package com.apples.items;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.Level;

public class AppleNetherwartItem extends Item {

	private boolean foil;
	
	public AppleNetherwartItem(Properties properties, Boolean isFoil) {
		
		super(properties);
		this.foil = isFoil;

	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {
		
		if(!level.isClientSide()) {
			
			Player player = (Player)livingentity;
			
			int size = Inventory.INVENTORY_SIZE;

			for(int i = 0; i < size; i++) {

				ItemStack stack = player.getInventory().getItem(i);
				
				if(this.asItem() == ItemLoader.APPLENETHERWART.get()) {
					
					if(PotionUtils.getPotion(stack) == Potions.WATER) {
						
						player.getInventory().setItem(i, PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.AWKWARD));
						
					}
					
				} else if(this.asItem() == ItemLoader.ENCHANTEDAPPLEGLOWSTONE.get()) {
					
					if(PotionUtils.getPotion(stack) == Potions.WATER) {
						
						player.getInventory().setItem(i, PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.THICK));
						
					} else if(PotionUtils.getPotion(stack) == Potions.HEALING) {
						
						player.getInventory().setItem(i, PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.STRONG_HEALING));
						
					} else if(PotionUtils.getPotion(stack) == Potions.HARMING) {
						
						player.getInventory().setItem(i, PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.STRONG_HARMING));
						
					} else if(PotionUtils.getPotion(stack) == Potions.LEAPING) {
						
						player.getInventory().setItem(i, PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.STRONG_LEAPING));
						
					} else if(PotionUtils.getPotion(stack) == Potions.POISON) {
						
						player.getInventory().setItem(i, PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.STRONG_POISON));
						
					} else if(PotionUtils.getPotion(stack) == Potions.REGENERATION) {
						
						player.getInventory().setItem(i, PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.STRONG_REGENERATION));
						
					} else if(PotionUtils.getPotion(stack) == Potions.SLOWNESS) {
						
						player.getInventory().setItem(i, PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.STRONG_SLOWNESS));
						
					} else if(PotionUtils.getPotion(stack) == Potions.STRENGTH) {
						
						player.getInventory().setItem(i, PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.STRONG_STRENGTH));
						
					} else if(PotionUtils.getPotion(stack) == Potions.SWIFTNESS) {
						
						player.getInventory().setItem(i, PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.STRONG_SWIFTNESS));
						
					} else if(PotionUtils.getPotion(stack) == Potions.TURTLE_MASTER) {
						
						player.getInventory().setItem(i, PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.STRONG_TURTLE_MASTER));
						
					}
					
				} else if(this.asItem() == ItemLoader.ENCHANTEDAPPLEREDSTONE.get()) {
					
					if(PotionUtils.getPotion(stack) == Potions.WATER) {
						
						player.getInventory().setItem(i, PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.MUNDANE));
						
					} else if(PotionUtils.getPotion(stack) == Potions.FIRE_RESISTANCE) {
						
						player.getInventory().setItem(i, PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.LONG_FIRE_RESISTANCE));
						
					} else if(PotionUtils.getPotion(stack) == Potions.INVISIBILITY) {
						
						player.getInventory().setItem(i, PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.LONG_INVISIBILITY));
						
					} else if(PotionUtils.getPotion(stack) == Potions.LEAPING) {
						
						player.getInventory().setItem(i, PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.LONG_LEAPING));
						
					} else if(PotionUtils.getPotion(stack) == Potions.NIGHT_VISION) {
						
						player.getInventory().setItem(i, PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.LONG_NIGHT_VISION));
						
					} else if(PotionUtils.getPotion(stack) == Potions.POISON) {
						
						player.getInventory().setItem(i, PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.LONG_POISON));
						
					} else if(PotionUtils.getPotion(stack) == Potions.REGENERATION) {
						
						player.getInventory().setItem(i, PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.LONG_REGENERATION));
						
					} else if(PotionUtils.getPotion(stack) == Potions.SLOW_FALLING) {
						
						player.getInventory().setItem(i, PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.LONG_SLOW_FALLING));
						
					} else if(PotionUtils.getPotion(stack) == Potions.SLOWNESS) {
						
						player.getInventory().setItem(i, PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.LONG_SLOWNESS));
						
					} else if(PotionUtils.getPotion(stack) == Potions.STRENGTH) {
						
						player.getInventory().setItem(i, PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.LONG_STRENGTH));
						
					} else if(PotionUtils.getPotion(stack) == Potions.SWIFTNESS) {
						
						player.getInventory().setItem(i, PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.LONG_SWIFTNESS));
						
					} else if(PotionUtils.getPotion(stack) == Potions.TURTLE_MASTER) {
						
						player.getInventory().setItem(i, PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.LONG_TURTLE_MASTER));
						
					} else if(PotionUtils.getPotion(stack) == Potions.WATER_BREATHING) {
						
						player.getInventory().setItem(i, PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.LONG_WATER_BREATHING));
						
					} else if(PotionUtils.getPotion(stack) == Potions.WEAKNESS) {
						
						player.getInventory().setItem(i, PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.LONG_WEAKNESS));
						
					}
					
				}
				
			}
		
			level.playSound(null, livingentity.blockPosition(), SoundEvents.BREWING_STAND_BREW, SoundSource.BLOCKS, 1.0F, 1.0F);
			
		}
		
		return livingentity.eat(level, itemstack);
		
	}
	
	@Override
	public boolean isFoil(ItemStack itemstack) {
		
		return foil;
		
	}

}
