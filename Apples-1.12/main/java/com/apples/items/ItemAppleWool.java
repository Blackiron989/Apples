package com.apples.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;


public class ItemAppleWool extends ItemFood {
	
	
	public ItemAppleWool(String name, int amount, float saturation, boolean isWolfFood) {
		
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setAlwaysEdible();
		
	}
	
	@Override
	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		
		if(!world.isRemote) {
			
			double i = Math.random() * 8 + 1;
			
			switch((int)i) {
				
				case 1:
					entityplayer.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 15 * 20, 0, false, false));
					break;
					
				case 2:
					entityplayer.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 45 * 20, 0, false, false));
					break;
					
				case 3:
					entityplayer.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 10 * 20, 1, false, false));
					break;
					
				case 4:
					entityplayer.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20 * 20, 1, false, false));
					break;
					
				case 5:
					entityplayer.addPotionEffect(new PotionEffect(MobEffects.POISON, 10 * 20, 0, false, false));
					break;
					
				case 6:
					entityplayer.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 15 * 20, 0, false, false));
					break;
					
				case 7:
					entityplayer.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, 30 * 20, 1, false, false));
					break;
					
				case 8:
					entityplayer.addPotionEffect(new PotionEffect(MobEffects.HUNGER, 15 * 20, 3, false, false));
					break;
					
				default:
					break;
						
			}
			
		}
		
	}

}
