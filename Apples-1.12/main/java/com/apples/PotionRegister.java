package com.apples;

import java.util.HashSet;
import java.util.Set;

import com.apples.potions.PotionBase;

import net.minecraft.potion.Potion;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Main.MODID)
public class PotionRegister {

	public static Potion potionNoFall;
	//public static Potion potionFlight;
	public static Potion potionSlime;
	public static Potion potionGlow;
	public static Potion potionFreeze;
	public static Potion potionCake;
	public static Potion potionBeacon;
	public static Potion potionPumpkin;
	//public static Potion potionFortune;
	
	public static final Set<Potion> SET_POTIONS = new HashSet<>();
	
	public static void init() {
		
		potionNoFall = new PotionBase("potionAntiGravity", false, 0, 0, 0).setPotionName("No Fall");
		//potionFlight = new PotionBase("potionFlight", false, 0, 0, 0).setPotionName("Flight");
		potionSlime = new PotionBase("potionSlime", false, 0, 0, 0).setPotionName("Slime");
		potionGlow = new PotionBase("potionGlow", false, 0, 0, 0).setPotionName("Glowing");
		potionFreeze = new PotionBase("potionFreeze", false, 0, 0, 0).setPotionName("Freezing");
		potionCake = new PotionBase("potionCake", false, 0, 0, 0).setPotionName("The Cake...");
		potionBeacon = new PotionBase("potionBeacon", false, 0, 0, 0).setPotionName("Player Beacon");
		potionPumpkin = new PotionBase("potionPumpkin", false, 0, 0, 0).setPotionName("Pumpkin");
		
	}
	
	@SubscribeEvent
	public static void registerPotions(RegistryEvent.Register<Potion> event) {
		
		final Potion[] arrayPotion = {
				
			potionNoFall,
			//potionFlight,
			potionSlime,
			potionGlow,
			potionFreeze,
			potionCake,
			potionBeacon,
			potionPumpkin
				
		};
		
		for(final Potion potion : arrayPotion) {

			event.getRegistry().register(potion);
			SET_POTIONS.add(potion);
			
		}
		
	}
	
}
