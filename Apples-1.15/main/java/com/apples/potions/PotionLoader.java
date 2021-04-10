package com.apples.potions;

import com.apples.Main;
import com.apples.Registry;

import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraftforge.registries.ObjectHolder;

public class PotionLoader {
	
	public static Effect PotionAnvil = new PotionEffect(EffectType.HARMFUL, 0);
	public static Effect PotionBeacon = new PotionEffect(EffectType.BENEFICIAL, 0);
	public static Effect PotionCake = new PotionEffect(EffectType.NEUTRAL, 0);
	public static Effect PotionCobweb = new PotionEffect(EffectType.NEUTRAL, 0);
	public static Effect PotionDragonEgg = new PotionEffect(EffectType.BENEFICIAL, 0);
	public static Effect PotionExp = new PotionEffect(EffectType.BENEFICIAL, 0);
	public static Effect PotionFireball = new PotionEffect(EffectType.HARMFUL, 0);
	public static Effect PotionFirework = new PotionEffect(EffectType.NEUTRAL, 0);
	public static Effect PotionFortune = new PotionEffect(EffectType.NEUTRAL, 0);
	public static Effect PotionFrostWalker = new PotionEffect(EffectType.NEUTRAL, 0);
	public static Effect PotionPumpkin = new PotionEffect(EffectType.NEUTRAL, 0);
	public static Effect PotionPumpkinLit = new PotionEffect(EffectType.NEUTRAL, 0);
	public static Effect PotionRuby = new PotionEffect(EffectType.BENEFICIAL, 0);
	public static Effect PotionSinking = new PotionEffect(EffectType.HARMFUL, 0);
	public static Effect PotionSlimeball = new PotionEffect(EffectType.NEUTRAL, 0);
	public static Effect PotionSnowball = new PotionEffect(EffectType.NEUTRAL, 0);
	public static Effect PotionWitch = new PotionEffect(EffectType.NEUTRAL, 0);
	public static Effect PotionZombie = new PotionEffect(EffectType.HARMFUL, 0);
	
	public static void load() {
		
		Registry.registerPotion(PotionAnvil, "potionanvil");
		Registry.registerPotion(PotionBeacon, "potionbeacon");
		Registry.registerPotion(PotionCake, "potioncake");
		Registry.registerPotion(PotionCobweb, "potioncobweb");
		Registry.registerPotion(PotionDragonEgg, "potiondragonegg");
		Registry.registerPotion(PotionExp, "potionexp");
		Registry.registerPotion(PotionFireball, "potionfireball");
		Registry.registerPotion(PotionFirework, "potionfirework");
		Registry.registerPotion(PotionFortune, "potionfortune");
		Registry.registerPotion(PotionFrostWalker, "potionfrostwalker");
		Registry.registerPotion(PotionPumpkin, "potionpumpkin");
		Registry.registerPotion(PotionPumpkinLit, "potionpumpkinlit");
		Registry.registerPotion(PotionRuby, "potionruby");
		Registry.registerPotion(PotionSinking, "potionsinking");
		Registry.registerPotion(PotionSlimeball, "potionslimeball");
		Registry.registerPotion(PotionSnowball, "potionsnowball");
		Registry.registerPotion(PotionWitch, "potionwitch");
		Registry.registerPotion(PotionZombie, "potionzombie");
		
	}
	
	@ObjectHolder(Main.MODID)
	public static class Effects {
		
		public static final Effect PotionAnvil = null;
		public static final Effect PotionBeacon = null;
		public static final Effect PotionCake = null;
		public static final Effect PotionCobweb = null;
		public static final Effect PotionDragonEgg = null;
		public static final Effect PotionExp = null;
		public static final Effect PotionFireball = null;
		public static final Effect PotionFirework = null;
		public static final Effect PotionFortune = null;
		public static final Effect PotionFrostWalker = null;
		public static final Effect PotionPumpkin = null;
		public static final Effect PotionPumpkinLit = null;
		public static final Effect PotionRuby = null;
		public static final Effect PotionSinking = null;
		public static final Effect PotionSlimeball = null;
		public static final Effect PotionSnowball = null;
		public static final Effect PotionWitch = null;
		public static final Effect PotionZombie = null;
		
	}

}
