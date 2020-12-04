package com.apples.potions;

import java.util.HashSet;
import java.util.Set;

import com.apples.PotionRegister;

import net.minecraft.potion.Potion;


public class PotionBase extends Potion{
	
	public static final Set<Potion> SET_POTIONS = new HashSet<>();
	
	public PotionBase(String name, boolean isBadEffect, int liquidColor, int duration, int amplifier) {
		
		super(isBadEffect, liquidColor);
		
		setPotionName(name);
		setRegistryName(name);
		
		isReady(duration, amplifier);
		
	}

	@Override
	public boolean isReady(int duration, int amplifier) {
		
		final Potion[] arrayPotion = {
				
				PotionRegister.potionNoFall,
				//PotionRegister.potionFlight,
				PotionRegister.potionSlime,
				PotionRegister.potionGlow,
				PotionRegister.potionFreeze,
				PotionRegister.potionCake,
				PotionRegister.potionBeacon,
				PotionRegister.potionPumpkin
					
		};
		
		for(final Potion potion : arrayPotion) {

			if (this == potion) {
		        
				int i = 50 >> amplifier;

	            if (i > 0) {

	                return duration % i == 0;
	            
	            } else {

	                return true;

	            }
	        
			}
			
			SET_POTIONS.add(potion);
			
		}
		
		return false;
    
	}

}
