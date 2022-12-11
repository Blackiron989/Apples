package com.apples.items;

import java.util.function.Supplier;

import com.apples.potions.PotionLoader;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;

public class FoodLoader {
	
	//NOTE: APPLE = 4 , 0.3F
	
	public static final FoodProperties APPLEAPPLE = food(5, 0.5F);
	public static final FoodProperties APPLEANVIL = foodEffect(4, 0.4F, () -> new MobEffectInstance(PotionLoader.POTION_ANVIL.get(), 600, 0), 1.0F);
	public static final FoodProperties APPLEARROW = foodEffect(2, 0.4F, () -> new MobEffectInstance(MobEffects.HARM, 1, 0), 1.0F);
	public static final FoodProperties APPLEBAT = food(5, 0.5F);
	public static final FoodProperties APPLEBEACON = foodEffect(10, 2.0F, () -> new MobEffectInstance(PotionLoader.POTION_BEACON.get(), 24000, 0), 1.0F);
	public static final FoodProperties APPLEBED = food(2, 0.4F);
	public static final FoodProperties APPLEBEDROCK = foodBuilder(2, 0.2F).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1200, 0), 0.1F).effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 1200, 2), 1.0F).build();
	public static final FoodProperties APPLEBEE = food(4, 0.3F);
	public static final FoodProperties APPLEBEENEST = foodEffect(5, 1.0F, () -> new MobEffectInstance(PotionLoader.POTION_BEENEST.get(), 1200, 0), 1.0F);
    public static final FoodProperties APPLEBEEF = foodMeat(10, 2.0F);
    public static final FoodProperties APPLEBEEFRAW = foodMeat(4, 0.3F);
    public static final FoodProperties APPLEBEET = food(4, 0.3F);
	public static final FoodProperties APPLEBINDING = foodEffect(4, 0.3F, () -> new MobEffectInstance(PotionLoader.POTION_BINDING.get(), 6000, 0), 1.0F);
	public static final FoodProperties APPLEBLAZEROD = foodEffect(4, 0.5F, () -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600, 0), 1.0F);
	public static final FoodProperties APPLEBONE = food(4, 0.4F);
	public static final FoodProperties APPLEBOOK = foodEffect(4, 0.4F, () -> new MobEffectInstance(MobEffects.LUCK, 2400, 0), 1.0F);
	public static final FoodProperties APPLEBOTTLE = food(4, 0.3F);
	public static final FoodProperties APPLEBREAD = food(10, 2.0F);
	public static final FoodProperties APPLEBRICK = foodEffect(3, 0.2F, () -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 1), 1.0F);
	public static final FoodProperties APPLEBUCKET = food(4, 0.3F);
	public static final FoodProperties APPLECACTUS = foodEffect(6, 0.0F, () -> new MobEffectInstance(MobEffects.CONFUSION, 300, 1), 0.9F);
	public static final FoodProperties APPLECAKE = foodEffect(10, 2.0F, () -> new MobEffectInstance(PotionLoader.POTION_CAKE.get(), 1200, 0), 1.0F);
	public static final FoodProperties APPLECANDY = foodEffect(4, 0.4F, () -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 1), 1.0F);
	public static final FoodProperties APPLECANDYCANE = foodEffect(4, 0.6F, () -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 1.0F);
	public static final FoodProperties APPLECARAMEL = foodEffect(5, 0.4F, () -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 1), 1.0F);
	public static final FoodProperties APPLECARROT = foodEffect(5, 0.4F, () -> new MobEffectInstance(MobEffects.NIGHT_VISION, 900, 0), 1.0F);
	public static final FoodProperties APPLECHAIN = foodEffect(4, 0.3F, () -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1200, 1), 1.0F);
	public static final FoodProperties APPLECHICKEN = foodBuilder(5, 0.4F).effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 300, 0), 0.3F).effect(() -> new MobEffectInstance(MobEffects.POISON, 600, 0), 0.6F).meat().build();
	public static final FoodProperties APPLECHICKENCOOKED = foodMeat(10, 2.0F);
	public static final FoodProperties APPLECLAY = foodEffect(2, 0.1F, () -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1, 100), 1.0F);
	public static final FoodProperties APPLECOAL = foodEffect(3, 0.1F, () -> new MobEffectInstance(MobEffects.BLINDNESS, 200, 0), 1.0F);
	public static final FoodProperties APPLECOBWEB = foodEffect(4, 0.3F, () -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 600, 2), 1.0F);
	public static final FoodProperties ENCHANTEDAPPLECOBWEB = foodEffect(4, 0.3F, () -> new MobEffectInstance(PotionLoader.POTION_COBWEB.get(), 2400, 0), 1.0F);
	public static final FoodProperties APPLECOOKIE = foodEffect(10, 1.0F, () -> new MobEffectInstance(MobEffects.SATURATION, 600, 0), 1.0F);
	public static final FoodProperties APPLECREEPER = food(4, 0.3F);
	public static final FoodProperties APPLECURSED = food(1, 0.1F);
	public static final FoodProperties APPLEDIAMOND = foodEffect(6, 1.0F, () -> new MobEffectInstance(PotionLoader.POTION_FORTUNE.get(), 1200, 2), 1.0F);
	public static final FoodProperties APPLEDIRT = foodEffect(4, 0.3F, () -> new MobEffectInstance(MobEffects.WITHER, 60, 0), 1.0F);
	public static final FoodProperties APPLEDOLPHIN = foodEffect(5, 1.0F, () -> new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 6000, 0), 1.0F);
	public static final FoodProperties APPLEEATEN = food(2, 0.1F);
	public static final FoodProperties APPLEEGG = food(4, 0.6F);
	public static final FoodProperties APPLEEGGNOG = food(10, 2.0F);
	public static final FoodProperties APPLEEMERALD = foodEffect(4, 0.3F, () -> new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 1200, 0), 1.0F);
	public static final FoodProperties APPLEENDEREGG = foodEffect(10, 2.0F, () -> new MobEffectInstance(PotionLoader.POTION_DRAGONEGG.get(), 24000, 0), 1.0F);
	public static final FoodProperties APPLEENDEREYE = food(4, 0.3F);
	public static final FoodProperties APPLEENDERPEARL = food(4, 0.3F);
	public static final FoodProperties APPLEEXP = foodEffect(4, 0.3F,() -> new MobEffectInstance(PotionLoader.POTION_EXP.get(), 1200, 0), 1.0F);
	public static final FoodProperties APPLEFEATHER = foodEffect(4, 0.3F, () -> new MobEffectInstance(MobEffects.SLOW_FALLING, 160, 0), 1.0F);
	public static final FoodProperties ENCHANTEDAPPLEFEATHER = food(4, 0.4F);
	public static final FoodProperties APPLEFERMENTED = foodEffect(2, 1.0F, () -> new MobEffectInstance(MobEffects.WEAKNESS, 600, 0), 1.0F);
	public static final FoodProperties APPLEFIREBALL = foodEffect(4, 0.3F, () -> new MobEffectInstance(PotionLoader.POTION_FIREBALL.get(), 1200, 0), 1.0F);
	public static final FoodProperties APPLEFIREWORK = foodEffect(4, 0.3F,() -> new MobEffectInstance(PotionLoader.POTION_FIREWORK.get(), 1200, 0), 1.0F);
	public static final FoodProperties APPLEFISH = foodMeat(5, 0.4F);
	public static final FoodProperties APPLEFISHCOOKED = foodMeat(10, 2.0F);
	public static final FoodProperties APPLEFLINT = foodBuilder(4, 0.3F).effect(() -> new MobEffectInstance(MobEffects.WEAKNESS, 600, 0), 1.0F).effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 0), 1.0F).build();
	public static final FoodProperties APPLEFLOWERPOT = food(4, 0.3F);
	public static final FoodProperties APPLEGHASTTEAR = foodEffect(5, 0.5F,() -> new MobEffectInstance(MobEffects.REGENERATION, 400, 0), 1.0F);
	public static final FoodProperties APPLEGLOWSTONE = foodEffect(4, 0.3F,() -> new MobEffectInstance(MobEffects.GLOWING, 3600, 0), 1.0F);
	public static final FoodProperties APPLEGLOWSTONEDUST = food(4, 0.3F);
	public static final FoodProperties ENCHANTEDAPPLEGLOWSTONE = food(4, 0.3F);
	public static final FoodProperties APPLEGOLDNUGGET = foodBuilder(4, 0.3F).effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100, 0), 1.0F).effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 1200, 0), 1.0F).build();
	public static final FoodProperties APPLEGRASS = food(4, 0.3F);
	public static final FoodProperties APPLEGRAVEL = foodEffect(4, 0.3F,() -> new MobEffectInstance(PotionLoader.POTION_SINKING.get(), 200, 0), 1.0F);
	public static final FoodProperties APPLEGREEN = food(4, 0.3F);
	public static final FoodProperties APPLEGUNPOWDER = food(4, 0.3F);
	public static final FoodProperties APPLEHEART = foodEffect(5, 0.4F,() -> new MobEffectInstance(MobEffects.ABSORPTION, 3600, 1), 1.0F);
	public static final FoodProperties APPLEHORSEARMOR = food(4, 0.3F);
	public static final FoodProperties APPLEICE = foodEffect(4, 0.3F,() -> new MobEffectInstance(PotionLoader.POTION_FROSTWALKER.get(), 1800, 0), 1.0F);
	public static final FoodProperties APPLEINVISIBLE = foodEffect(4, 0.3F,() -> new MobEffectInstance(MobEffects.INVISIBILITY, 1200, 0), 1.0F);
	public static final FoodProperties APPLEIRON = foodEffect(4, 0.3F,() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1200, 0), 1.0F);
	public static final FoodProperties APPLELAPISLAZULI = foodEffect(5, 0.4F,() -> new MobEffectInstance(MobEffects.BAD_OMEN, 1200, 0), 1.0F);
	public static final FoodProperties APPLELAVA = food(4, 0.3F);
	public static final FoodProperties APPLELEATHER = foodEffect(6, 0.6F,() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 800, 0), 1.0F);
	public static final FoodProperties APPLELEAVES = food(3, 0.9F);
	public static final FoodProperties APPLELOOT = food(4, 0.3F);
	public static final FoodProperties APPLEMELONSLICE = food(3, 0.8F);
	public static final FoodProperties APPLEMELONBLOCK = food(10, 2.0F);
	public static final FoodProperties APPLEMILK = food(4, 0.3F);
	public static final FoodProperties APPLEMINECART = food(4, 0.3F);
	public static final FoodProperties APPLENETHERBRICK = food(4, 0.3F);
	public static final FoodProperties APPLENETHERRACK = food(1, 0.9F);
	public static final FoodProperties APPLENETHERSTAR = foodEffect(10, 2.0F,() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 24000, 49), 1.0F);
	public static final FoodProperties APPLENETHERWART = food(4, 0.3F);
	public static final FoodProperties APPLEOBSIDIAN = foodBuilder(4, 0.3F).effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2400, 0), 1.0F).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 2400, 0), 1.0F).build();
	public static final FoodProperties APPLEPAPER = food(4, 0.3F);
	public static final FoodProperties APPLEPORKCHOPCOOKED = foodMeat(10, 2.0F);
	public static final FoodProperties APPLEPORKCHOPRAW = foodBuilder(5, 0.4F).effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 1200, 0), 0.5F).meat().build();
	public static final FoodProperties APPLEPOTATOBAKED = food(10, 2.0F);
	public static final FoodProperties APPLEPOTATOPOISONOUS = foodEffect(4, 0.3F,() -> new MobEffectInstance(MobEffects.POISON, 1200, 1), 1.0F);
	public static final FoodProperties APPLEPOTATORAW = food(5, 0.4F);
	public static final FoodProperties APPLEPUMPKIN = foodEffect(5, 0.4F,() -> new MobEffectInstance(PotionLoader.POTION_PUMPKIN.get(), 2400, 0), 1.0F);
	public static final FoodProperties APPLEPUMPKINLIT = foodEffect(5, 0.4F,() -> new MobEffectInstance(PotionLoader.POTION_EMITLIGHT.get(), 3600, 0), 1.0F);
	public static final FoodProperties APPLEPUMPKINPIE = food(10, 2.0F);
	public static final FoodProperties APPLEPRESENT = food(4, 0.3F);
	public static final FoodProperties APPLEQUARTZ = foodEffect(4, 0.3F,() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 1800, 0), 1.0F);
	public static final FoodProperties APPLERECORD = food(5, 0.4F);
	public static final FoodProperties APPLEREDSTONE = food(4, 0.3F);
	public static final FoodProperties ENCHANTEDAPPLEREDSTONE = food(4, 0.3F);
	public static final FoodProperties APPLEROTTENFLESH = foodEffect(6, 0.1F,() -> new MobEffectInstance(MobEffects.HUNGER, 600, 2), 1.0F);
	public static final FoodProperties APPLERUBY = foodEffect(6, 1.0F,() -> new MobEffectInstance(PotionLoader.POTION_RUBY.get(), 3600, 0), 1.0F);
	public static final FoodProperties APPLESADDLE = food(5, 0.4F);
	public static final FoodProperties APPLESLIMEBALL = foodEffect(4, 0.3F,() -> new MobEffectInstance(PotionLoader.POTION_SLIMEBALL.get(), 2400, 0), 1.0F);
	public static final FoodProperties APPLESNOWBALL = foodEffect(4, 0.3F,() -> new MobEffectInstance(PotionLoader.POTION_SNOWBALL.get(), 600, 0), 1.0F);
	public static final FoodProperties APPLESOULSAND = foodBuilder(4, 0.3F).effect(() -> new MobEffectInstance(PotionLoader.POTION_SINKING.get(), 1200, 0), 1.0F).effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 1200, 0), 1.0F).build();
	public static final FoodProperties APPLESPECKLEDMELON = foodEffect(10, 1.5F,() -> new MobEffectInstance(MobEffects.REGENERATION, 100, 0), 1.0F);
	public static final FoodProperties APPLESPIDEREYE = foodEffect(7, 0.7F,() -> new MobEffectInstance(MobEffects.POISON, 200, 4), 1.0F);
	public static final FoodProperties APPLESPONGE = food(4, 0.3F);
	public static final FoodProperties APPLESTEVE = food(10, 2.0F);
	public static final FoodProperties APPLESTICK = foodEffect(4, 0.3F,() -> new MobEffectInstance(MobEffects.JUMP, 600, -256), 1.0F);
	public static final FoodProperties APPLESTONE = foodEffect(4, 0.3F,() -> new MobEffectInstance(MobEffects.WEAKNESS, 600, 0), 1.0F);
	public static final FoodProperties APPLESTRING = foodEffect(4, 0.3F,() -> new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 1200, 0), 1.0F);
	public static final FoodProperties APPLESUGAR = foodEffect(4, 0.4F,() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 0), 1.0F);
	public static final FoodProperties APPLESUGARCANE = food(5, 0.4F);
	public static final FoodProperties APPLETNT = food(4, 0.3F);
	public static final FoodProperties APPLEUNDYING = foodEffect(4, 0.3F,() -> new MobEffectInstance(PotionLoader.POTION_UNDYING.get(), 6000, 0), 1.0F);
	public static final FoodProperties APPLEVANISHING = foodEffect(4, 0.3F,() -> new MobEffectInstance(PotionLoader.POTION_VANISHING.get(), 6000, 0), 1.0F);
	public static final FoodProperties APPLEVOID = food(0, 0.0F);
	public static final FoodProperties APPLEWATER = food(4, 0.3F);
	public static final FoodProperties APPLEWHEAT = food(5, 0.4F);
	public static final FoodProperties APPLEWITCH = foodEffect(4, 0.3F,() -> new MobEffectInstance(PotionLoader.POTION_WITCH.get(), 3600, 0), 1.0F);
	public static final FoodProperties APPLEWITHERSKULL = foodEffect(4, 1.0F, () -> new MobEffectInstance(PotionLoader.POTION_WITHERSKULL.get(), 4800, 0), 1.0F);
	public static final FoodProperties ENCHANTEDAPPLEWITHERSKULL = foodEffect(4, 1.0F, () -> new MobEffectInstance(PotionLoader.POTION_WITHERSKULL.get(), 9600, 0), 1.0F);
	public static final FoodProperties APPLEWOOD = foodEffect(4, 0.3F,() -> new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 600, 0), 1.0F);
	public static final FoodProperties APPLEWOOL = food(4, 0.3F);
	public static final FoodProperties APPLEZOMBIE = foodEffect(5, 0.4F,() -> new MobEffectInstance(PotionLoader.POTION_ZOMBIE.get(), 2400, 0), 1.0F);
	public static final FoodProperties APPLE4BIT = food(1, 0.1F);
	public static final FoodProperties APPLE8BIT = food(3, 0.7F);
	public static final FoodProperties APPLE32BIT = food(6, 1.2F);
	public static final FoodProperties APPLE64BIT = food(10, 2.0F);
	public static final FoodProperties APPLEINACTIVEULTIMATE = food(10, 2.0F);
	public static final FoodProperties APPLEULTIMATE = food(10, 2.0F);

	//public static final FoodProperties APPLEWITHERROSE = food(10, 2.0F);
	//public static final FoodProperties APPLEFLOWER = food(10, 2.0F);
	//public static final FoodProperties APPLEGILDEDBLACKSTONE = food(10, 2.0F);
	//public static final FoodProperties ENCHANTEDAPPLESPIDEREYE = food(10, 2.0F);
	//public static final FoodProperties ENCHANTEDAPPLETNT = food(10, 2.0F);
	//public static final FoodProperties ENCHANTEDAPPLEGLASS = food(10, 2.0F);
	//public static final FoodProperties ENCHANTEDAPPLEROTTENFLESH = food(10, 2.0F);
	
	/* NON-APPLE FOODS */
	public static final FoodProperties APPLEJUICE = food(6, 0.6F);
	public static final FoodProperties APPLECIDER = food(7, 0.8F);
	public static final FoodProperties APPLESAUCE = food(8, 1.0F);
	
	private static FoodProperties.Builder foodBuilder(int foodAmount, float saturation) {
		
		return new FoodProperties.Builder().nutrition(foodAmount).saturationMod(saturation).alwaysEat();
		
	}
	
	private static FoodProperties food(int foodAmount, float saturation) {
		
		return foodBuilder(foodAmount, saturation).build();
		
	}
	
	private static FoodProperties foodMeat(int foodAmount, float saturation) {
		
		return foodBuilder(foodAmount, saturation).meat().build();
		
	}
	
	private static FoodProperties foodEffect(int foodAmount, float saturation, Supplier<MobEffectInstance> effect, float probability) {
		
		return foodBuilder(foodAmount, saturation).effect(effect, probability).build(); //time * 20
		
	}

}
