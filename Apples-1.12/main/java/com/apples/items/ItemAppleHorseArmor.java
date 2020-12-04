package com.apples.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;


public class ItemAppleHorseArmor extends ItemFood {
	
	public ItemAppleHorseArmor(String name, int amount, float saturation, boolean isWolfFood) {
		
		super(amount, saturation, isWolfFood);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setAlwaysEdible();
		
	}
	
	@Override
	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		
		if(!world.isRemote) {
			
			if(entityplayer.isRiding()) {
				
				EntityLivingBase living = (EntityLivingBase) entityplayer.getRidingEntity();
				
				if(living instanceof EntityHorse || living instanceof EntityPig) {
					
					living.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 300 * 20, 5, true, true));
					
				}
			
			}
		
		}
		
	}

}
