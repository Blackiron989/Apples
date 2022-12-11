package com.apples.items;

import java.util.Random;

import com.apples.ApplesPlusUtils;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.Level;

public class AppleRecordItem extends Item {

	public AppleRecordItem(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {
		
		SoundEvent soundevent = SoundEvents.MUSIC_DISC_11;
		
		if(!level.isClientSide()) {
			
			int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
			randomize(arr, arr.length);
			
			switch(arr[0]) {
			
				default: case 1: soundevent = SoundEvents.MUSIC_DISC_11; break;
				case 2: soundevent = SoundEvents.MUSIC_DISC_13; break;
				case 3: soundevent = SoundEvents.MUSIC_DISC_BLOCKS; break;
				case 4: soundevent = SoundEvents.MUSIC_DISC_CAT; break;
				case 5: soundevent = SoundEvents.MUSIC_DISC_CHIRP; break;
				case 6: soundevent = SoundEvents.MUSIC_DISC_FAR; break;
				case 7: soundevent = SoundEvents.MUSIC_DISC_MALL; break;
				case 8: soundevent = SoundEvents.MUSIC_DISC_MELLOHI; break;
				case 9: soundevent = SoundEvents.MUSIC_DISC_STAL; break;
				case 10: soundevent = SoundEvents.MUSIC_DISC_STRAD; break;
				case 11: soundevent = SoundEvents.MUSIC_DISC_WAIT; break;
				case 12: soundevent = SoundEvents.MUSIC_DISC_WARD; break;
			
			}
			
			//Check for already playing records.
			level.playSound(null, (Entity)livingentity, soundevent, SoundSource.RECORDS, 1.0F, 1.0F);
			
			if(itemstack.isDamageableItem()) {
				
				return ApplesPlusUtils.damageableEat(level, itemstack, livingentity);
				
			}
			
		}

		return itemstack;
		
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
