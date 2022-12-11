package com.apples.items;

import com.apples.potions.PotionLoader;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class FoodLoader {
	
	//NOTE: APPLE = 4 , 0.3F
	
	public static final Food APPLEAPPLE = (new Food.Builder()).hunger(5).saturation(0.5F).setAlwaysEdible().build();
	public static final Food APPLEANVIL = (new Food.Builder()).hunger(4).saturation(0.4F).setAlwaysEdible().effect(() -> new EffectInstance(PotionLoader.POTION_ANVIL.get(), 600, 0), 1.0F).build();
	public static final Food APPLEARROW = (new Food.Builder()).hunger(2).saturation(0.4F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.INSTANT_DAMAGE, 1, 0), 1.0F).build();
	public static final Food APPLEBAT = (new Food.Builder()).hunger(5).saturation(0.5F).setAlwaysEdible().build();
	public static final Food APPLEBEACON = (new Food.Builder()).hunger(10).saturation(2.0F).setAlwaysEdible().effect(() -> new EffectInstance(PotionLoader.POTION_BEACON.get(), 24000, 0), 1.0F).build();
	public static final Food APPLEBED = (new Food.Builder()).hunger(2).saturation(0.4F).setAlwaysEdible().build();
	public static final Food APPLEBEDROCK = (new Food.Builder()).hunger(2).saturation(0.2F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.SLOWNESS, 1200, 0), 0.1F).effect(() -> new EffectInstance(Effects.HASTE, 1200, 2), 1.0F).build();
	public static final Food APPLEBEE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
    public static final Food APPLEBEEF = (new Food.Builder()).hunger(10).saturation(2.0F).setAlwaysEdible().build();
    public static final Food APPLEBEEFRAW = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
    public static final Food APPLEBEET = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEBINDING = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().effect(() -> new EffectInstance(PotionLoader.POTION_BINDING.get(), 6000, 0), 1.0F).build();
	public static final Food APPLEBLAZEROD = (new Food.Builder()).hunger(4).saturation(0.5F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.FIRE_RESISTANCE, 600, 0), 1.0F).build();
	public static final Food APPLEBONE = (new Food.Builder()).hunger(4).saturation(0.4F).setAlwaysEdible().build();
	public static final Food APPLEBOOK = (new Food.Builder()).hunger(4).saturation(0.4F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.LUCK, 2400, 0), 1.0F).build();
	public static final Food APPLEBREAD = (new Food.Builder()).hunger(10).saturation(2.0F).setAlwaysEdible().build();
	public static final Food APPLEBRICK = (new Food.Builder()).hunger(3).saturation(0.2F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.SLOWNESS, 200, 1), 1.0F).build();
	public static final Food APPLEBUCKET = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLECACTUS = (new Food.Builder()).hunger(6).saturation(0.0F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.NAUSEA, 300, 1), 0.9F).build();
	public static final Food APPLECAKE = (new Food.Builder()).hunger(10).saturation(2.0F).setAlwaysEdible().effect(() -> new EffectInstance(PotionLoader.POTION_CAKE.get(), 300, 0), 1.0F).build();
	public static final Food APPLECANDY = (new Food.Builder()).hunger(4).saturation(0.4F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.SPEED, 300, 1), 1.0F).build();
	public static final Food APPLECANDYCANE = (new Food.Builder()).hunger(4).saturation(0.6F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.SPEED, 600, 0), 1.0F).build();
	public static final Food APPLECARAMEL = (new Food.Builder()).hunger(5).saturation(0.4F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.SPEED, 300, 1), 1.0F).build();
	public static final Food APPLECARROT = (new Food.Builder()).hunger(5).saturation(0.4F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.NIGHT_VISION, 900, 0), 1.0F).build();
	public static final Food APPLECHAIN = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.RESISTANCE, 1200, 1), 1.0F).build();
	public static final Food APPLECHICKEN = (new Food.Builder()).hunger(5).saturation(0.4F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.NAUSEA, 300, 0), 0.3F).effect(() -> new EffectInstance(Effects.POISON, 600, 0), 0.6F).build();
	public static final Food APPLECHICKENCOOKED = (new Food.Builder()).hunger(10).saturation(2.0F).setAlwaysEdible().build();
	public static final Food APPLECLAY = (new Food.Builder()).hunger(2).saturation(0.1F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.SLOWNESS, 1, 100), 1.0F).build();
	public static final Food APPLECOAL = (new Food.Builder()).hunger(3).saturation(0.1F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.BLINDNESS, 200, 0), 1.0F).build();
	public static final Food APPLECOBWEB = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.SLOWNESS, 600, 2), 1.0F).build();
	public static final Food ENCHANTEDAPPLECOBWEB = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().effect(() -> new EffectInstance(PotionLoader.POTION_COBWEB.get(), 2400, 0), 1.0F).build();
	public static final Food APPLECOOKIE = (new Food.Builder()).hunger(10).saturation(1.0F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.SATURATION, 600, 0), 1.0F).build();
	public static final Food APPLECREEPER = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLECURSED = (new Food.Builder()).hunger(1).saturation(0.1F).setAlwaysEdible().build();
	public static final Food APPLEDIAMOND = (new Food.Builder()).hunger(6).saturation(1.0F).setAlwaysEdible().effect(() -> new EffectInstance(PotionLoader.POTION_FORTUNE.get(), 1200, 2), 1.0F).build();
	public static final Food APPLEDIRT = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.WITHER, 60, 0), 1.0F).build();
	public static final Food APPLEEATEN = (new Food.Builder()).hunger(2).saturation(0.1F).setAlwaysEdible().build();
	public static final Food APPLEEGG = (new Food.Builder()).hunger(4).saturation(0.6F).setAlwaysEdible().build();
	public static final Food APPLEEGGNOG = (new Food.Builder()).hunger(10).saturation(2.0F).setAlwaysEdible().build();
	public static final Food APPLEEMERALD = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.HERO_OF_THE_VILLAGE, 1200, 0), 1.0F).build();
	public static final Food APPLEENDEREGG = (new Food.Builder()).hunger(10).saturation(2.0F).setAlwaysEdible().effect(() -> new EffectInstance(PotionLoader.POTION_DRAGONEGG.get(), 24000, 0), 1.0F).build();
	public static final Food APPLEENDERPEARL = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEEXP = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().effect(() -> new EffectInstance(PotionLoader.POTION_EXP.get(), 1200, 0), 1.0F).build();
	public static final Food APPLEFEATHER = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.SLOW_FALLING, 1200, 0), 1.0F).build();
	public static final Food APPLEFERMENTED = (new Food.Builder()).hunger(2).saturation(1.0F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.WEAKNESS, 600, 0), 1.0F).build();
	public static final Food APPLEFIREBALL = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().effect(() -> new EffectInstance(PotionLoader.POTION_FIREBALL.get(), 1200, 0), 1.0F).build();
	public static final Food APPLEFIREWORK = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().effect(() -> new EffectInstance(PotionLoader.POTION_FIREWORK.get(), 1200, 0), 1.0F).build();
	public static final Food APPLEFISH = (new Food.Builder()).hunger(5).saturation(0.4F).setAlwaysEdible().build();
	public static final Food APPLEFISHCOOKED = (new Food.Builder()).hunger(10).saturation(2.0F).setAlwaysEdible().build();
	public static final Food APPLEFLINT = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.WEAKNESS, 600, 0), 1.0F).effect(() -> new EffectInstance(Effects.STRENGTH, 600, 0), 1.0F).build();
	public static final Food APPLEFLOWERPOT = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEGHASTTEAR = (new Food.Builder()).hunger(5).saturation(0.5F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.REGENERATION, 400, 0), 1.0F).build();
	public static final Food APPLEGLOWSTONE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().effect(() -> new EffectInstance(PotionLoader.POTION_EMITLIGHT.get(), 3600, 0), 1.0F).build();
	public static final Food APPLEGLOWSTONEDUST = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.GLOWING, 3600, 0), 1.0F).build();
	public static final Food APPLEGOLDNUGGET = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.REGENERATION, 100, 0), 1.0F).effect(() -> new EffectInstance(Effects.ABSORPTION, 1200, 0), 1.0F).build();
	public static final Food APPLEGRASS = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEGRAVEL = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().effect(() -> new EffectInstance(PotionLoader.POTION_SINKING.get(), 200, 0), 1.0F).build();
	public static final Food APPLEGREEN = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEGUNPOWDER = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEHEART = (new Food.Builder()).hunger(5).saturation(0.4F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.ABSORPTION, 3600, 1), 1.0F).build();
	public static final Food APPLEHORSEARMOR = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEICE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().effect(() -> new EffectInstance(PotionLoader.POTION_FROSTWALKER.get(), 1800, 0), 1.0F).build();
	public static final Food APPLEINVISIBLE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.INVISIBILITY, 1200, 0), 1.0F).build();
	public static final Food APPLEIRON = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.RESISTANCE, 1200, 0), 1.0F).build();
	public static final Food APPLELAPISLAZULI = (new Food.Builder()).hunger(5).saturation(0.4F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.BAD_OMEN, 1200, 0), 1.0F).build();
	public static final Food APPLELAVA = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLELEATHER = (new Food.Builder()).hunger(6).saturation(0.6F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.RESISTANCE, 800, 0), 1.0F).build();
	public static final Food APPLELEAVES = (new Food.Builder()).hunger(3).saturation(0.9F).setAlwaysEdible().build();
	public static final Food APPLELOOT = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEMELONSLICE = (new Food.Builder()).hunger(3).saturation(0.8F).setAlwaysEdible().build();
	public static final Food APPLEMELONBLOCK = (new Food.Builder()).hunger(10).saturation(2.0F).setAlwaysEdible().build();
	public static final Food APPLEMILK = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEMINECART = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLENETHERBRICK = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLENETHERRACK = (new Food.Builder()).hunger(1).saturation(0.9F).setAlwaysEdible().build();
	public static final Food APPLENETHERSTAR = (new Food.Builder()).hunger(10).saturation(2.0F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.RESISTANCE, 24000, 49), 1.0F).build();
	public static final Food APPLENETHERWART = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEPAPER = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEPORKCHOPCOOKED = (new Food.Builder()).hunger(10).saturation(2.0F).setAlwaysEdible().build();
	public static final Food APPLEPORKCHOPRAW = (new Food.Builder()).hunger(5).saturation(0.4F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.NAUSEA, 1200, 0), 0.5F).build();
	public static final Food APPLEPOTATOBAKED = (new Food.Builder()).hunger(10).saturation(2.0F).setAlwaysEdible().build();
	public static final Food APPLEPOTATOPOISONOUS = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.POISON, 1200, 1), 1.0F).build();
	public static final Food APPLEPOTATORAW = (new Food.Builder()).hunger(5).saturation(0.4F).setAlwaysEdible().build();
	public static final Food APPLEPUMPKIN = (new Food.Builder()).hunger(5).saturation(0.4F).setAlwaysEdible().effect(() -> new EffectInstance(PotionLoader.POTION_PUMPKIN.get(), 2400, 0), 1.0F).build();
	public static final Food APPLEPUMPKINLIT = (new Food.Builder()).hunger(5).saturation(0.4F).setAlwaysEdible().effect(() -> new EffectInstance(PotionLoader.POTION_EMITLIGHT.get(), 2400, 0), 1.0F).build();
	public static final Food APPLEPUMPKINPIE = (new Food.Builder()).hunger(10).saturation(2.0F).setAlwaysEdible().build();
	public static final Food APPLEPRESENT = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEQUARTZ = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.WATER_BREATHING, 1800, 0), 1.0F).build();
	public static final Food APPLERECORD = (new Food.Builder()).hunger(5).saturation(0.4F).setAlwaysEdible().build();
	public static final Food APPLEREDSTONE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEROTTENFLESH = (new Food.Builder()).hunger(6).saturation(0.1F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.HUNGER, 600, 2), 1.0F).build();
	public static final Food APPLERUBY = (new Food.Builder()).hunger(6).saturation(1.0F).setAlwaysEdible().effect(() -> new EffectInstance(PotionLoader.POTION_RUBY.get(), 3600, 0),  1.0F).build();
	public static final Food APPLESADDLE = (new Food.Builder()).hunger(5).saturation(0.4F).setAlwaysEdible().build();
	//public static final Food APPLESEEDS = (new Food.Builder()).hunger(1).saturation(0.1F).setAlwaysEdible().build();
	public static final Food APPLESLIMEBALL = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().effect(() -> new EffectInstance(PotionLoader.POTION_SLIMEBALL.get(), 2400, 0), 1.0F).build();
	public static final Food APPLESNOWBALL = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().effect(() -> new EffectInstance(PotionLoader.POTION_SNOWBALL.get(), 600, 0), 1.0F).build();
	public static final Food APPLESOULSAND = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().effect(() -> new EffectInstance(PotionLoader.POTION_SINKING.get(), 1200, 0), 1.0F).effect(() -> new EffectInstance(Effects.WATER_BREATHING, 1200, 0), 1.0F).build();
	public static final Food APPLESPECKLEDMELON = (new Food.Builder()).hunger(10).saturation(1.5F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.REGENERATION, 100, 0), 1.0F).build();
	public static final Food APPLESPIDEREYE = (new Food.Builder()).hunger(7).saturation(0.7F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.POISON, 200, 4), 1.0F).build();
	public static final Food APPLESPONGE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLESTEVE = (new Food.Builder()).hunger(10).saturation(2.0F).setAlwaysEdible().build();
	public static final Food APPLESTICK = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.JUMP_BOOST, 600, -256), 1.0F).build();
	public static final Food APPLESTONE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.WEAKNESS, 600, 0), 1.0F).build();
	public static final Food APPLESTRING = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.DOLPHINS_GRACE, 1200, 0), 1.0F).build();
	public static final Food APPLESUGAR = (new Food.Builder()).hunger(4).saturation(0.4F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.SPEED, 300, 0), 1.0F).build();
	public static final Food APPLESUGARCANE = (new Food.Builder()).hunger(5).saturation(0.4F).setAlwaysEdible().build();
	public static final Food APPLETNT = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	
	public static final Food APPLEUNDYING = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().effect(() -> new EffectInstance(PotionLoader.POTION_UNDYING.get(), 6000, 0), 1.0F).build();
	
	public static final Food APPLEVANISHING = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().effect(() -> new EffectInstance(PotionLoader.POTION_VANISHING.get(), 6000, 0), 1.0F).build();
	public static final Food APPLEWATER = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEWHEAT = (new Food.Builder()).hunger(5).saturation(0.4F).setAlwaysEdible().build();
	public static final Food APPLEWITCH = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().effect(() -> new EffectInstance(PotionLoader.POTION_WITCH.get(), 3600, 0), 1.0F).build();
	public static final Food APPLEWOOD = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().effect(() -> new EffectInstance(Effects.MINING_FATIGUE, 600, 0), 1.0F).build();
	public static final Food APPLEWOOL = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEZOMBIE = (new Food.Builder()).hunger(5).saturation(0.4F).setAlwaysEdible().effect(() -> new EffectInstance(PotionLoader.POTION_ZOMBIE.get(), 2400, 0), 1.0F).build();
	public static final Food APPLE4BIT = (new Food.Builder()).hunger(1).saturation(0.1F).setAlwaysEdible().build();
	public static final Food APPLE8BIT = (new Food.Builder()).hunger(3).saturation(0.7F).setAlwaysEdible().build();
	public static final Food APPLE32BIT = (new Food.Builder()).hunger(6).saturation(1.2F).setAlwaysEdible().build();
	public static final Food APPLE64BIT = (new Food.Builder()).hunger(10).saturation(2.0F).setAlwaysEdible().build();
	public static final Food APPLEULTIMATE = (new Food.Builder()).hunger(10).saturation(2.0F).setAlwaysEdible().build();
	
/* BEGIN NEW STUFF */
	
	/** NEW APPLES, WILL NEED TO BE SORTED ONCE IMPLEMENTED **/
	/*
	public static final Food APPLEOBSIDIAN = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLECRYINGOBSIDIAN = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEGILDEDBLACKSTONE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEBLACKSTONE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	
	public static final Food APPLEWHITECONCRETE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEORANGECONCRETE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEMAGENTACONCRETE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLELIGHTBLUECONCRETE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEYELLOWCONCRETE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLELIMECONCRETE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEPINKCONCRETE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEGRAYCONCRETE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLELIGHTGRAYCONCRETE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLECYANCONCRETE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEPURPLECONCRETE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEBLUECONCRETE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEBROWNCONCRETE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEGREENCONCRETE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEREDCONCRETE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEBLACKCONCRETE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	
	public static final Food APPLEWHITEPOWDEREDCONCRETE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEORANGEPOWDEREDCONCRETE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEMAGENTAPOWDEREDCONCRETE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLELIGHTBLUEPOWDEREDCONCRETE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEYELLOWPOWDEREDCONCRETE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLELIMEPOWDEREDCONCRETE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEPINKPOWDEREDCONCRETE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEGRAYPOWDEREDCONCRETE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLELIGHTGRAYPOWDEREDCONCRETE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLECYANPOWDEREDCONCRETE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEPURPLEPOWDEREDCONCRETE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEBLUEPOWDEREDCONCRETE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEBROWNPOWDEREDCONCRETE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEGREENPOWDEREDCONCRETE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEREDPOWDEREDCONCRETE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEBLACKPOWDEREDCONCRETE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	
	public static final Food APPLEWHITESHULKER = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEORANGESHULKER = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEMAGENTASHULKER = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLELIGHTBLUESHULKER = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEYELLOWSHULKER = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLELIMESHULKER = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEPINKSHULKER = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEGRAYSHULKER = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLELIGHTGRAYSHULKER = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLECYANSHULKER = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEPURPLESHULKER = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEBLUESHULKER = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEBROWNSHULKER = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEGREENSHULKER = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEREDSHULKER = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEBLACKSHULKER = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	
	public static final Food APPLEWHITEGLASS = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEORANGEGLASS = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEMAGENTAGLASS = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLELIGHTBLUEGLASS = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEYELLOWGLASS = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLELIMEGLASS = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEPINKGLASS = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEGRAYGLASS = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLELIGHTGRAYGLASS = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLECYANGLASS = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEPURPLEGLASS = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEBLUEGLASS = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEBROWNGLASS = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEGREENGLASS = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEREDGLASS = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	public static final Food APPLEBLACKGLASS = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();

    public static final Food APPLECORAL = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
    public static final Food APPLEWITHER = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
    
    public static final Food APPLEENDCRYSTAL = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
    public static final Food APPLETARGET = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
    public static final Food APPLECONDUIT = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
    public static final Food APPLENETHERRITE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
    public static final Food APPLEPRISMARINE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
    public static final Food APPLECHORUS = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
    public static final Food APPLEPIGSTEP = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
    public static final Food APPLEHONEY = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
    
    
    public static final Food APPLELAMBRAW = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
    public static final Food APPLELAMB = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
    public static final Food APPLERABBITRAW = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
    public static final Food APPLERABBIT = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();

    
    public static final Food APPLECOMPASS = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
    
    public static final Food APPLEDRAGONSBREATH = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
    public static final Food APPLEMEMBRANE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
    public static final Food APPLEHOPPER = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
    
    
    public static final Food APPLELOADSTONE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
    public static final Food APPLEWITHERROSE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
    public static final Food APPLEFLOWERS = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
    public static final Food APPLELANTERN = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
    public static final Food APPLEMAGMA = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();

    public static final Food APPLEBLASTFURNACE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
    
    public static final Food APPLECAMPFIRE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
    public static final Food APPLEENDEREYE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
    public static final Food APPLECRAFTING = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
    public static final Food APPLEENDERCHEST = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
    public static final Food APPLEFURNACE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
    */
    
    /** ENCHANTED APPLES, WILL NEED TO BE SORTED ONCE IMPLEMENTED **/
	/*
    public static final Food ENCHANTEDAPPLESOULSAND = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
    public static final Food ENCHANTEDAPPLEBLASTFURNACE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
    public static final Food ENCHANTEDAPPLECAMPFIRE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
    public static final Food ENCHANTEDAPPLEGLASS = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
    public static final Food ENCHANTEDAPPLESPIDEREYE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
    public static final Food ENCHANTEDAPPLETNT = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
    public static final Food ENCHANTEDAPPLECRAFTING = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
    public static final Food ENCHANTEDAPPLEENDERCHEST = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
    public static final Food ENCHANTEDAPPLEFURNACE = (new Food.Builder()).hunger(4).saturation(0.3F).setAlwaysEdible().build();
	*/
	
	/* NON-APPLE FOODS */
	public static final Food APPLEJUICE = (new Food.Builder()).hunger(6).saturation(0.6F).setAlwaysEdible().build();
	public static final Food APPLECIDER = (new Food.Builder()).hunger(7).saturation(0.8F).setAlwaysEdible().build();
	public static final Food APPLESAUCE = (new Food.Builder()).hunger(8).saturation(1.0F).setAlwaysEdible().build();
	public static final Food APPLEPIE = (new Food.Builder()).hunger(10).saturation(2.0F).setAlwaysEdible().build();

}
