package com.apples.items;

import com.apples.sound.SoundHelper;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemAppleRecord extends ItemFood {
	
	public ItemAppleRecord(String name, int amount, float saturation, boolean isWolfFood) {
		
		super(amount, saturation, isWolfFood);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setAlwaysEdible();
		
	}
	
	@Override
	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		
		if(world.isRemote) {
			
			double rand = Math.random() * 12 + 1;
			
			switch((int) rand) {
			
				case 1: SoundHelper.player(SoundEvents.RECORD_11); break;
				case 2: SoundHelper.player(SoundEvents.RECORD_13); break;
				case 3: SoundHelper.player(SoundEvents.RECORD_BLOCKS); break;
				case 4: SoundHelper.player(SoundEvents.RECORD_CAT); break;
				case 5: SoundHelper.player(SoundEvents.RECORD_CHIRP); break;
				case 6: SoundHelper.player(SoundEvents.RECORD_FAR); break;
				case 7: SoundHelper.player(SoundEvents.RECORD_MALL); break;
				case 8: SoundHelper.player(SoundEvents.RECORD_MELLOHI); break;
				case 9: SoundHelper.player(SoundEvents.RECORD_STAL); break;
				case 10: SoundHelper.player(SoundEvents.RECORD_STRAD); break;
				case 11: SoundHelper.player(SoundEvents.RECORD_WAIT); break;
				case 12: SoundHelper.player(SoundEvents.RECORD_WARD); break;
				default: SoundHelper.player(SoundEvents.RECORD_11); break;

			}
		
		}
		
	}

}
