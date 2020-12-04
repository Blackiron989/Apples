package com.apples.items;

import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class ItemAppleRecord extends Item {

	public ItemAppleRecord(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity livingentity) {
		
		if(!world.isRemote) {
			
			int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
			randomize(arr, arr.length);
			
			switch(arr[0]) {
			
				case 1: world.playMovingSound(null, (Entity)livingentity, SoundEvents.MUSIC_DISC_11, SoundCategory.RECORDS, 1.0F, 1.0F); break;
				case 2: world.playMovingSound(null, (Entity)livingentity, SoundEvents.MUSIC_DISC_13, SoundCategory.RECORDS, 1.0F, 1.0F); break;
				case 3: world.playMovingSound(null, (Entity)livingentity, SoundEvents.MUSIC_DISC_BLOCKS, SoundCategory.RECORDS, 1.0F, 1.0F); break;
				case 4: world.playMovingSound(null, (Entity)livingentity, SoundEvents.MUSIC_DISC_CAT, SoundCategory.RECORDS, 1.0F, 1.0F); break;
				case 5: world.playMovingSound(null, (Entity)livingentity, SoundEvents.MUSIC_DISC_CHIRP, SoundCategory.RECORDS, 1.0F, 1.0F); break;
				case 6: world.playMovingSound(null, (Entity)livingentity, SoundEvents.MUSIC_DISC_FAR, SoundCategory.RECORDS, 1.0F, 1.0F); break;
				case 7: world.playMovingSound(null, (Entity)livingentity, SoundEvents.MUSIC_DISC_MALL, SoundCategory.RECORDS, 1.0F, 1.0F); break;
				case 8: world.playMovingSound(null, (Entity)livingentity, SoundEvents.MUSIC_DISC_MELLOHI, SoundCategory.RECORDS, 1.0F, 1.0F); break;
				case 9: world.playMovingSound(null, (Entity)livingentity, SoundEvents.MUSIC_DISC_STAL, SoundCategory.RECORDS, 1.0F, 1.0F); break;
				case 10: world.playMovingSound(null, (Entity)livingentity, SoundEvents.MUSIC_DISC_STRAD, SoundCategory.RECORDS, 1.0F, 1.0F); break;
				case 11: world.playMovingSound(null, (Entity)livingentity, SoundEvents.MUSIC_DISC_WAIT, SoundCategory.RECORDS, 1.0F, 1.0F); break;
				case 12: world.playMovingSound(null, (Entity)livingentity, SoundEvents.MUSIC_DISC_WARD, SoundCategory.RECORDS, 1.0F, 1.0F); break;
				default: break;
			
			}
			
			for(int p = 0; p < 8; p++) {
				
				randomize(arr, arr.length);
				
				switch(arr[0]) {
				
					case 1: livingentity.entityDropItem(Items.MUSIC_DISC_11); break;
					case 2: livingentity.entityDropItem(Items.MUSIC_DISC_13); break;
					case 3: livingentity.entityDropItem(Items.MUSIC_DISC_BLOCKS); break;
					case 4: livingentity.entityDropItem(Items.MUSIC_DISC_CAT); break;
					case 5: livingentity.entityDropItem(Items.MUSIC_DISC_CHIRP); break;
					case 6: livingentity.entityDropItem(Items.MUSIC_DISC_FAR); break;
					case 7: livingentity.entityDropItem(Items.MUSIC_DISC_MALL); break;
					case 8: livingentity.entityDropItem(Items.MUSIC_DISC_MELLOHI); break;
					case 9: livingentity.entityDropItem(Items.MUSIC_DISC_STAL); break;
					case 10: livingentity.entityDropItem(Items.MUSIC_DISC_STRAD); break;
					case 11: livingentity.entityDropItem(Items.MUSIC_DISC_WAIT); break;
					case 12: livingentity.entityDropItem(Items.MUSIC_DISC_WARD); break;
					default: break;
				
				}
				
			}
			
		}

		return this.isFood() ? livingentity.onFoodEaten(world, itemstack) : itemstack;
		
	}
	
	private static void randomize(int arr[], int n) {
		
		Random random = new Random();
		
		for(int i = n - 1; i > 0; i--) {
			
			int j = random.nextInt(i);
			
			int temp = arr[i]; 
            arr[i] = arr[j]; 
            arr[j] = temp;
			
		}
		
	}

}
