package com.apples;


import java.util.HashSet;
import java.util.Set;

import com.apples.items.ItemAppleArrow;
import com.apples.items.ItemAppleBat;
import com.apples.items.ItemAppleBed;
import com.apples.items.ItemAppleLava;
import com.apples.items.ItemAppleBone;
import com.apples.items.ItemAppleCactus;
import com.apples.items.ItemAppleCursed;
import com.apples.items.ItemAppleDragonEgg;
import com.apples.items.ItemAppleEgg;
import com.apples.items.ItemAppleEmerald;
import com.apples.items.ItemAppleEnderPearl;
import com.apples.items.ItemAppleExp;
import com.apples.items.ItemAppleFeather;
import com.apples.items.ItemAppleFireball;
import com.apples.items.ItemAppleFirework;
import com.apples.items.ItemAppleFlowerpot;
import com.apples.items.ItemAppleGhastTear;
import com.apples.items.ItemAppleGunpowder;
import com.apples.items.ItemAppleHorseArmor;
import com.apples.items.ItemAppleMilk;
import com.apples.items.ItemAppleRecord;
import com.apples.items.ItemAppleSeed;
import com.apples.items.ItemAppleSnowball;
import com.apples.items.ItemAppleSteve;
import com.apples.items.ItemAppleSugarCane;
import com.apples.items.ItemAppleUltimate;
import com.apples.items.ItemAppleWater;
import com.apples.items.ItemAppleWool;
import com.apples.items.ItemBaseApple;
import com.apples.items.ItemCrafting;
import com.apples.items.ItemNewAxe;
import com.apples.items.ItemNewHoe;
import com.apples.items.ItemNewPickaxe;
import com.apples.items.ItemNewShovel;
import com.apples.items.ItemNewSword;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


@Mod.EventBusSubscriber(modid = Main.MODID)
public class ItemHelper {
	
	
	public static final ToolMaterial rubyMaterial = EnumHelper.addToolMaterial("rubyMaterial", 3, 1155, 10.0F, 4.0F, 15);
	public static final ToolMaterial bedrockMaterial = EnumHelper.addToolMaterial("bedrockMaterial", 4, 4823, 6.0F, 6.0F, 25);
	public static final ToolMaterial knifeMaterial = EnumHelper.addToolMaterial("knifeMaterial", 0, 150, 2.0F, 5.0F, 18);
	
	
	/* APPLES */
	static Item itemAppleApple;
	//static Item itemAppleAnvil;
	static Item itemAppleArrow;
	static Item itemAppleBat;
	static Item itemAppleBeacon;
	static Item itemAppleBed;
	static Item itemAppleBedrock;
	static Item itemAppleBlazeRod;
	static Item itemAppleBone;
	static Item itemAppleBook;
	static Item itemAppleBread;
	static Item itemAppleBrick;
	static Item itemAppleCactus;
	static Item itemAppleCake;
	static Item itemAppleCandy;
	static Item itemAppleCandycane;
	static Item itemAppleCaramel;
	public static Item itemAppleCarrot;
	static Item itemAppleChain;
	static Item itemAppleChicken;
	static Item itemAppleClay;
	static Item itemAppleCoal;
	static Item itemAppleCobweb;
	static Item itemAppleCookie;
	//static Item itemAppleCreeper;
	static Item itemAppleCursed;
	static Item itemAppleDiamond;
	static Item itemAppleDirt;
	static Item itemAppleEaten;
	static Item itemAppleEgg;
	static Item itemAppleEggnog;
	static Item itemAppleEmerald;
	static Item itemAppleEnderEgg;
	static Item itemAppleEnderPearl;
	//static Item itemAppleEvil;
	static Item itemAppleExp;
	static Item itemAppleFeather;
	static Item itemAppleFermented;
	static Item itemAppleFireball;
	static Item itemAppleFirework;
	static Item itemAppleFish;
	static Item itemAppleFishCooked;
	static Item itemAppleFlint;
	static Item itemAppleFlowerPot;
	//static Item itemAppleFruitcake;
	static Item itemAppleGhastTear;
	//static Item itemAppleGingerbread;
	static Item itemAppleGlowstone;
	static Item itemAppleGlowstoneDust;
	static Item itemAppleGoldNugget;
	static Item itemAppleGrass;
	static Item itemAppleGravel;
	static Item itemAppleGunpowder;
	static Item itemAppleHeart;
	static Item itemAppleHorseArmor;
	static Item itemAppleIce;
	static Item itemAppleInvisible;
	static Item itemAppleIron;
	static Item itemAppleLapisLazuli;
	static Item itemAppleLava;
	static Item itemAppleLeather;
	static Item itemAppleLeaves;
	static Item itemAppleMelonSlice;
	static Item itemAppleMelonBlock;
	static Item itemAppleMilk;
	static Item itemAppleMinecart;
	static Item itemAppleNetherBrick;
	static Item itemAppleNetherrack;
	static Item itemAppleNetherStar;
	public static Item itemAppleNetherWart;
	static Item itemApplePaper;
	static Item itemApplePorkchopCooked;
	static Item itemApplePorkchopRaw;
	static Item itemApplePotatoBaked;
	static Item itemApplePotatoPoisonous;
	public static Item itemApplePotatoRaw;
	static Item itemApplePumpkin;
	static Item itemApplePumpkinLit;
	static Item itemApplePumpkinPie;
	//static Item itemApplePresent;
	static Item itemAppleQuartz;
	static Item itemAppleRecord;
	static Item itemAppleRedstone;
	static Item itemAppleRottenFlesh;
	static Item itemAppleRuby;
	static Item itemAppleSaddle;
	public static Item itemAppleSeeds;
	static Item itemAppleSlimeball;
	static Item itemAppleSnowball;
	static Item itemAppleSoulSand;
	static Item itemAppleSpeckledMelon;
	static Item itemAppleSpiderEye;
	static Item itemAppleSponge;
	static Item itemAppleSteve;
	static Item itemAppleStick;
	static Item itemAppleStone;
	static Item itemAppleString;
	static Item itemAppleSugar;
	static Item itemAppleSugarCane;
	static Item itemAppleTNT;
	static Item itemAppleWater;
	public static Item itemAppleWheat;
	//static Item itemAppleWitch;
	static Item itemAppleWood;
	static Item itemAppleWool;
	//static Item itemAppleZombie;
	static Item itemApple4Bit;
	static Item itemApple8Bit;
	static Item itemApple32Bit;
	static Item itemApple64Bit;
	static Item itemAppleUltimate;
	
	/* NON-APPLE FOODS */
	static Item itemAppleJuice;
	static Item itemAppleCider;
	static Item itemAppleSauce;
	static Item itemApplePie;
	//static Item itemAppleNog;
	
	/* TOOLS */
	static Item itemBedrockAxe;
	static Item itemBedrockHoe;
	static Item itemBedrockPickaxe;
	static Item itemBedrockShovel;
	static Item itemBedrockSword;
	static Item itemKnife;
	static Item itemRubyAxe;
	static Item itemRubyHoe;
	static Item itemRubyPickaxe;
	static Item itemRubyShovel;
	static Item itemRubySword;
	
	/* MISC */
	//static Item itemAppleFlower;
	static Item itemMug;
	static Item itemMugMagic;
	public static Item itemRuby;
	public static Item itemBedrockFragment;
	
	/**
	 * 	  IDEAS:
	 * 
	 * 	  NEW ITEMS:
	 * 	  Cooked Chicken Apple (Food)
	 *    Raw Beef Apple (Food)
	 * 	  Cooked Beef Apple (Food)
	 * 
	 *    Purpur Apple (??)
	 *    Lucky Apple (Rabbit Foot)
	 *    Evil Apple (Found in nether chests!)
	 *    Magma Block Apple (Move up quicker in water?)
	 *    Spooky Apple (Drops bad apples when eaten in October, otherwise negative effect)
	 *    Cheat Apple (Only in creative menu, changes player gamemode.)
	 *    
	 *    Apples from villager trades?
	 *    
	 *    
	 */

	public static final Set<Item> SET_ITEMS = new HashSet<>();
	
	public static void init() {
		
		/* 10 */
		itemAppleApple = new ItemBaseApple("itemappleapple", 10, 10, false, MobEffects.SATURATION, 20, 0).setCreativeTab(appleTab);
		/** [Not Complete] Drop an anvil on the player **/
		//itemAppleAnvil = new ItemBaseApple("itemappleanvil", 10, 10, false, MobEffects.REGENERATION, 10, 0).setCreativeTab(appleTab);
		/** [Complete] Shoots arrows out of player **/
		itemAppleArrow = new ItemAppleArrow("itemapplearrow", 4, 3, false).setCreativeTab(appleTab);
		/** [Complete] Spawns bats around the player when eaten **/
		itemAppleBat = new ItemAppleBat("itemapplebat", 8, 8, false).setCreativeTab(appleTab);
		/** [Complete] Make the player into a beacon **/
		itemAppleBeacon = new ItemBaseApple("itemapplebeacon", 20, 20, false, PotionRegister.potionBeacon, 3600, 0).setCreativeTab(appleTab);
		/** [Complete] Change time to day/night **/
		itemAppleBed = new ItemAppleBed("itemapplebed", 8, 6, false).setCreativeTab(appleTab);
		itemAppleBedrock = new ItemBaseApple("itemapplebedrock", 12, 10, false, MobEffects.HASTE, 3600, 10).setCreativeTab(appleTab);
		/** [Not Complete] Push blazes away from player? Stop blazes from targeting player? **/
		itemAppleBlazeRod = new ItemBaseApple("itemappleblazerod", 6, 4, false, MobEffects.FIRE_RESISTANCE, 90, 1).setCreativeTab(appleTab);
		/** [Complete] Bonemeal's area around the player **/
		itemAppleBone = new ItemAppleBone("itemapplebone", 8, 6, false).setCreativeTab(appleTab);
		itemAppleBook = new ItemBaseApple("itemapplebook", 8, 6, false, MobEffects.LUCK, 90, 1).setCreativeTab(appleTab);
		
		/* 20 */
		itemAppleBread = new ItemBaseApple("itemapplebread", 16, 16, false, MobEffects.SATURATION, 45, 0).setCreativeTab(appleTab);
		itemAppleBrick = new ItemBaseApple("itemapplebrick", 4, 3, false, MobEffects.ABSORPTION, 10, 0).setCreativeTab(appleTab);
		/** [Complete] In game chat: "Drink cactus juice, it'll quench ya, nothings quenchier, it's the quenchiest!" + Nausea **/
		itemAppleCactus = new ItemAppleCactus("itemapplecactus", 6, 5, false, MobEffects.INSTANT_DAMAGE, 1, 0).setCreativeTab(appleTab);
		/** [Complete] Places fake cakes behind the player as they walk, disappears after some time, can not be eaten, if broken has chance to drop cake **/
		itemAppleCake = new ItemBaseApple("itemapplecake", 20, 20, false, PotionRegister.potionCake, 8, 0).setCreativeTab(appleTab);
		itemAppleCandy = new ItemBaseApple("itemapplecandy", 10, 10, false, MobEffects.SPEED, 30, 2).setCreativeTab(appleTab);
		itemAppleCandycane = new ItemBaseApple("itemapplecandycane", 12, 12, false, MobEffects.SPEED, 15, 9).setCreativeTab(appleTab);
		itemAppleCaramel = new ItemBaseApple("itemapplecaramel", 8, 8, false, MobEffects.SPEED, 30, 0).setCreativeTab(appleTab);
		/** [Complete] Plant carrot farm **/
		itemAppleCarrot = new ItemAppleSeed("itemapplecarrot", 11, 7, false).setCreativeTab(appleTab);
		itemAppleChain = new ItemBaseApple("itemapplechain", 6, 1, false, MobEffects.RESISTANCE, 120, 0).setCreativeTab(appleTab);
		itemAppleChicken = new ItemBaseApple("itemapplechicken", 2, 9, false, MobEffects.NAUSEA, 22, 0).setCreativeTab(appleTab);
		
		/* 30 */
		itemAppleClay = new ItemBaseApple("itemappleclay", 6, 5, false, MobEffects.MINING_FATIGUE, 16, 0).setCreativeTab(appleTab);
		itemAppleCoal = new ItemBaseApple("itemapplecoal", 6, 5, false, MobEffects.BLINDNESS, 16, 0).setCreativeTab(appleTab);
		itemAppleCobweb = new ItemBaseApple("itemapplecobweb", 5, 6, false, MobEffects.SLOWNESS, 30, 3).setCreativeTab(appleTab);
		itemAppleCookie = new ItemBaseApple("itemapplecookie", 20, 20, false, MobEffects.SATURATION, 15, 0).setCreativeTab(appleTab);
		//itemAppleCreeper = new ItemBaseApple("itemapplecreeper", 10, 10, false, MobEffects.REGENERATION, 10, 0).setCreativeTab(appleTab);
		/** [Complete] Random bad effects **/
		itemAppleCursed = new ItemAppleCursed("itemapplecursed", 12, 10, false).setCreativeTab(appleTab);
		itemAppleDiamond = new ItemBaseApple("itemapplediamond", 10, 10, false, MobEffects.REGENERATION, 120, 0).setCreativeTab(appleTab);
		itemAppleDirt = new ItemBaseApple("itemappledirt", 3, 7, false, MobEffects.WITHER, 15, 0).setCreativeTab(appleTab);
		itemAppleEaten = new ItemBaseApple("itemappleeaten", 2, 2, false, null, 0, 0).setCreativeTab(appleTab);
		
		/* 40 */
		/** [Complete] Throws egg **/
		itemAppleEgg = new ItemAppleEgg("itemappleegg", 6, 6, false).setCreativeTab(appleTab);
		itemAppleEggnog = new ItemBaseApple("itemappleeggnog", 20, 20, false, MobEffects.SATURATION, 90, 0).setCreativeTab(appleTab);
		/** [Not Complete] Makes villager trades better (1.14+) / Spawns villagers (1.12) **/
		itemAppleEmerald = new ItemAppleEmerald("itemappleemerald", 6, 14, false).setCreativeTab(appleTab);
		/** [Complete] Gives the player flight **/
		itemAppleEnderEgg = new ItemAppleDragonEgg("itemappleenderegg", 20, 20, false).setCreativeTab(appleTab);
		/** [Complete] Teleport's the player to a random location **/
		itemAppleEnderPearl = new ItemAppleEnderPearl("itemappleenderpearl", 6, 6, false).setCreativeTab(appleTab);
		/** [Complete] Gives the player experience **/
		itemAppleExp = new ItemAppleExp("itemappleexp", 6, 6, false).setCreativeTab(appleTab);
		/** [Complete] Launches the player into the air short distance and applies levitation **/
		itemAppleFeather = new ItemAppleFeather("itemapplefeather", 5, 5, false).setCreativeTab(appleTab);
		itemAppleFermented = new ItemBaseApple("itemapplefermented", 3, 2, false, MobEffects.NAUSEA, 60, 2).setCreativeTab(appleTab);
		/** [Complete] Spawns fireballs around the player **/
		itemAppleFireball = new ItemAppleFireball("itemapplefireball", 4, 3, false).setCreativeTab(appleTab);
		/** [Not Complete] Spawns fireworks with random effects  **/
		itemAppleFirework = new ItemAppleFirework("itemapplefirework", 5, 6, false).setCreativeTab(appleTab);
		
		/* 50 */
		itemAppleFish = new ItemBaseApple("itemapplefish", 4, 4, false, null, 0, 0).setCreativeTab(appleTab);
		itemAppleFishCooked = new ItemBaseApple("itemapplefishcooked", 14, 16, false, MobEffects.SATURATION, 60, 0).setCreativeTab(appleTab);
		itemAppleFlint = new ItemBaseApple("itemappleflint", 4, 3, false, MobEffects.MINING_FATIGUE, 6, 0).setCreativeTab(appleTab);
		/** [Complete] Plants flowers around the player **/
		itemAppleFlowerPot = new ItemAppleFlowerpot("itemappleflowerpot", 5, 4, false).setCreativeTab(appleTab);
		//itemAppleFruitcake = new ItemBaseApple("itemapplefruitcake", 10, 10, false, MobEffects.REGENERATION, 10, 0).setCreativeTab(appleTab);
		/** [Complete] Ghast noises **/
		itemAppleGhastTear = new ItemAppleGhastTear("itemappleghasttear", 8, 8, false, MobEffects.REGENERATION, 10, 0).setCreativeTab(appleTab);
		//itemAppleGingerbread = new ItemBaseApple("itemapplegingerbread", 10, 10, false, MobEffects.REGENERATION, 10, 0).setCreativeTab(appleTab);
		/** [Complete] Makes the player a dynamic light source **/
		itemAppleGlowstone = new ItemBaseApple("itemappleglowstone", 5, 4, false, PotionRegister.potionGlow, 55, 0).setCreativeTab(appleTab);
		/** [Complete] Makes the player a dynamic light source **/
		itemAppleGlowstoneDust = new ItemBaseApple("itemappleglowstonedust", 5, 4, false, PotionRegister.potionGlow, 15, 0).setCreativeTab(appleTab);
		
		/* 60 */
		itemAppleGoldNugget = new ItemBaseApple("itemapplegoldnugget", 4, 4, false, MobEffects.REGENERATION, 9, 0).setCreativeTab(appleTab);
		itemAppleGrass = new ItemBaseApple("itemapplegrass", 4, 4, false, MobEffects.LEVITATION, 13, 0).setCreativeTab(appleTab);
		itemAppleGravel = new ItemBaseApple("itemapplegravel", 4, 4, false, MobEffects.FIRE_RESISTANCE, 1, 0).setCreativeTab(appleTab);
		/** [Complete] The player explodes **/
		itemAppleGunpowder = new ItemAppleGunpowder("itemapplegunpowder", 4, 4, false, 4.0F).setCreativeTab(appleTab);
		itemAppleHeart = new ItemBaseApple("itemappleheart", 10, 10, false, MobEffects.ABSORPTION, 240, 1).setCreativeTab(appleTab);
		/** [Complete] Provide protection to a horse/pig that the player is riding **/
		itemAppleHorseArmor = new ItemAppleHorseArmor("itemapplehorsearmor", 8, 6, false).setCreativeTab(appleTab);
		/** [Complete] Freezes water that the player walks over **/
		itemAppleIce = new ItemBaseApple("itemappleice", 4, 3, false, PotionRegister.potionFreeze, 30, 0).setCreativeTab(appleTab);
		itemAppleInvisible = new ItemBaseApple("itemappleinvisible", 4, 3, false, MobEffects.INVISIBILITY, 120, 0).setCreativeTab(appleTab);
		itemAppleIron = new ItemBaseApple("itemappleiron", 6, 6, false, MobEffects.RESISTANCE, 90, 0).setCreativeTab(appleTab);
		/** [Not Complete] Boost the enchantment level of enchantments by +1 if eligible **/
		itemAppleLapisLazuli = new ItemBaseApple("itemapplelapislazuli", 8, 8, false, MobEffects.LUCK, 60, 0).setCreativeTab(appleTab);
		
		/* 70 */
		/** [Complete] Sets the player on fire **/
		itemAppleLava = new ItemAppleLava("itemapplelava", 5, 4, false).setCreativeTab(appleTab);
		itemAppleLeather = new ItemBaseApple("itemappleleather", 7, 6, false, MobEffects.RESISTANCE, 20, 0).setCreativeTab(appleTab);
		itemAppleLeaves = new ItemBaseApple("itemappleleaves", 6, 7, false, MobEffects.WEAKNESS, 10, 0).setCreativeTab(appleTab);
		itemAppleMelonSlice = new ItemBaseApple("itemapplemelonslice", 10, 10, false, MobEffects.SATURATION, 2, 0).setCreativeTab(appleTab);
		itemAppleMelonBlock = new ItemBaseApple("itemapplemelonblock", 20, 20, false, MobEffects.SATURATION, 20, 0).setCreativeTab(appleTab);
		/** [Complete] Removes all potion effects **/
		itemAppleMilk = new ItemAppleMilk("itemapplemilk", 8, 8, false).setCreativeTab(appleTab);
		itemAppleMinecart = new ItemBaseApple("itemappleminecart", 5, 5, false, MobEffects.HASTE, 240, 1).setCreativeTab(appleTab);
		itemAppleNetherBrick = new ItemBaseApple("itemapplenetherbrick", 2, 2, false, MobEffects.STRENGTH, 23, 0).setCreativeTab(appleTab);
		itemAppleNetherrack = new ItemBaseApple("itemapplenetherrack", 1, 1, false, MobEffects.FIRE_RESISTANCE, 1, 0).setCreativeTab(appleTab);
		itemAppleNetherStar = new ItemBaseApple("itemapplenetherstar", 20, 20, false, MobEffects.RESISTANCE, 3600, 49).setCreativeTab(appleTab);
		
		/* 80 */
		/** [Complete] Plants a netherwart farm **/
		itemAppleNetherWart = new ItemAppleSeed("itemapplenetherwart", 6, 6, false).setCreativeTab(appleTab);
		itemApplePaper = new ItemBaseApple("itemapplepaper", 5, 4, false, MobEffects.STRENGTH, 3, 99).setCreativeTab(appleTab);
		itemApplePorkchopCooked = new ItemBaseApple("itemappleporkchopcooked", 18, 18, false, MobEffects.SATURATION, 90, 0).setCreativeTab(appleTab);
		/** [Complete] Plant potato farm **/
		itemApplePorkchopRaw = new ItemBaseApple("itemappleporkchopraw", 3, 3, false, MobEffects.NAUSEA, 10, 0).setCreativeTab(appleTab);
		itemApplePotatoBaked = new ItemBaseApple("itemapplepotatobaked", 16, 16, false, MobEffects.SATURATION, 30, 0).setCreativeTab(appleTab);
		itemApplePotatoPoisonous = new ItemBaseApple("itemapplepotatopoisonous", 4, 5, false, MobEffects.POISON, 30, 0).setCreativeTab(appleTab);
		itemApplePotatoRaw = new ItemAppleSeed("itemapplepotatoraw", 5, 9, false).setCreativeTab(appleTab);
		/** [Complete] Make the player not aggro endermen... well not exactly, it just forces a pumpkin on the player's head **/
		itemApplePumpkin = new ItemBaseApple("itemapplepumpkin", 5, 5, false, PotionRegister.potionPumpkin, 60, 0).setCreativeTab(appleTab);
		/** [Complete] Make the player a dynamic light source **/
		itemApplePumpkinLit = new ItemBaseApple("itemapplepumpkinlit", 5, 5, false, PotionRegister.potionGlow, 180, 0).setCreativeTab(appleTab);
		itemApplePumpkinPie = new ItemBaseApple("itemapplepumpkinpie", 20, 20, false, MobEffects.SATURATION, 120, 0).setCreativeTab(appleTab);
		
		/* 90*/
		/** [Not Complete] Drop random apples **/
		//itemApplePresent = new ItemBaseApple("itemapplepresent", 10, 10, false, MobEffects.REGENERATION, 10, 0).setCreativeTab(appleTab);
		itemAppleQuartz = new ItemBaseApple("itemapplequartz", 6, 5, false, MobEffects.NIGHT_VISION, 90, 0).setCreativeTab(appleTab);
		/** [Complete] Plays a random record **/
		itemAppleRecord = new ItemAppleRecord("itemapplerecord", 6, 5, false).setCreativeTab(appleTab);
		/** [Not Complete] Increase drop rate of redstone **/
		itemAppleRedstone = new ItemBaseApple("itemappleredstone", 4, 3, false, MobEffects.WATER_BREATHING, 30, 0).setCreativeTab(appleTab);
		itemAppleRottenFlesh = new ItemBaseApple("itemapplerottenflesh", 5, 5, false, MobEffects.HUNGER, 25, 19).setCreativeTab(appleTab);
		/** [Not Complete] Apply fortune effect to the player **/
		itemAppleRuby = new ItemBaseApple("itemappleruby", 10, 10, false, MobEffects.STRENGTH, 120, 0).setCreativeTab(appleTab);
		itemAppleSaddle = new ItemBaseApple("itemapplesaddle", 8, 10, false, MobEffects.JUMP_BOOST, 30, 0).setCreativeTab(appleTab);
		/** [Complete] Plants random crops **/
		itemAppleSeeds = new ItemAppleSeed("itemappleseeds", 4, 3, false).setCreativeTab(appleTab);
		/** [Complete] Makes player bounce after large falls **/
		itemAppleSlimeball = new ItemBaseApple("itemappleslimeball", 4, 3, false, PotionRegister.potionSlime, 30, 0).setCreativeTab(appleTab);
		
		/* 100 */
		/** [Complete] Throws snowball **/
		itemAppleSnowball = new ItemAppleSnowball("itemapplesnowball", 5, 4, false).setCreativeTab(appleTab);
		/** [Complete] Ghast noises**/
		itemAppleSoulSand = new ItemAppleGhastTear("itemapplesoulsand", 7, 9, false, MobEffects.SLOWNESS, 30, 9).setCreativeTab(appleTab);
		itemAppleSpeckledMelon = new ItemBaseApple("itemapplespeckledmelon", 10, 10, false, MobEffects.REGENERATION, 5, 1).setCreativeTab(appleTab);
		itemAppleSpiderEye = new ItemBaseApple("itemapplespidereye", 3, 3, false, MobEffects.POISON, 45, 9).setCreativeTab(appleTab);
		/** [Not Complete] Soaks up water around the player (1.14+) **/
		itemAppleSponge = new ItemBaseApple("itemapplesponge", 5, 4, false, MobEffects.WATER_BREATHING, 60, 0).setCreativeTab(appleTab);
		/** [Complete] Player hurt sound, drop item on use **/
		itemAppleSteve = new ItemAppleSteve("itemapplesteve", 4, 3, false).setCreativeTab(appleTab);
		/** [Complete] Player gets negative jump **/
		itemAppleStick = new ItemBaseApple("itemapplestick", 4, 3, false, MobEffects.JUMP_BOOST, 60, -256).setCreativeTab(appleTab);
		itemAppleStone = new ItemBaseApple("itemapplestone", 3, 4, false, MobEffects.MINING_FATIGUE, 20, 4).setCreativeTab(appleTab);
		itemAppleString = new ItemBaseApple("itemapplestring", 5, 4, false, PotionRegister.potionNoFall, 30, 0).setCreativeTab(appleTab);
		itemAppleSugar = new ItemBaseApple("itemapplesugar", 8, 8, false, MobEffects.SPEED, 15, 0).setCreativeTab(appleTab);
		
		/* 110 */
		/** [Complete] Plants sugar cane to sky limit **/
		itemAppleSugarCane = new ItemAppleSugarCane("itemapplesugarcane", 8, 8, false).setCreativeTab(appleTab);
		/** [Complete] Makes bigger explosion that gunpowder apple **/
		itemAppleTNT = new ItemAppleGunpowder("itemappletnt", 20, 20, false, 12.0F).setCreativeTab(appleTab);
		/** [Complete] Extinguish the player if they are on fire **/
		itemAppleWater = new ItemAppleWater("itemapplewater", 5, 4, false).setCreativeTab(appleTab);
		/** [Complete] Plants a wheat farm **/
		itemAppleWheat = new ItemAppleSeed("itemapplewheat", 5, 5, false).setCreativeTab(appleTab);
		//itemAppleWitch = new ItemBaseApple("itemapplewitch", 10, 10, false, MobEffects.REGENERATION, 10, 0).setCreativeTab(appleTab);
		itemAppleWood = new ItemBaseApple("itemapplewood", 5, 4, false, MobEffects.LEVITATION, 3, 0).setCreativeTab(appleTab);
		/** [Complete] Random potion effect **/
		itemAppleWool = new ItemAppleWool("itemapplewool", 5, 2, false).setCreativeTab(appleTab);
		//itemAppleZombie = new ItemBaseApple("itemapplezombie", 10, 10, false, MobEffects.REGENERATION, 10, 0).setCreativeTab(appleTab);
		
		itemApple4Bit = new ItemBaseApple("itemapple4bit", 5, 0, false, MobEffects.REGENERATION, 1, 0).setCreativeTab(appleTab);
		itemApple8Bit = new ItemBaseApple("itemapple8bit", 10, 5, false, MobEffects.REGENERATION, 1, 0).setCreativeTab(appleTab);
		itemApple32Bit = new ItemBaseApple("itemapple32bit", 15, 10, false, MobEffects.REGENERATION, 1, 0).setCreativeTab(appleTab);
		itemApple64Bit = new ItemBaseApple("itemapple64bit", 20, 15, false, MobEffects.REGENERATION, 1, 0).setCreativeTab(appleTab);
		
		/** [Not Complete] This has placeholder effect currently **/
		itemAppleUltimate = new ItemAppleUltimate("itemappleultimate", 20, 20, false, null, 0, 0).setCreativeTab(appleTab);
		
		/* NON-APPLE FOODS */
		itemAppleJuice = new ItemBaseApple("itemapplejuice", 3, 3, false, MobEffects.SATURATION, 5, 0).setCreativeTab(appleTab);
		itemAppleCider = new ItemBaseApple("itemapplecider", 5, 5, false, MobEffects.SATURATION, 10, 0).setCreativeTab(appleTab);
		itemAppleSauce = new ItemBaseApple("itemapplesauce", 5, 5, false, MobEffects.SATURATION, 10, 0).setCreativeTab(appleTab);
		itemApplePie = new ItemBaseApple("itemapplepie", 12, 12, false, MobEffects.SATURATION, 60, 0).setCreativeTab(appleTab);
		//itemAppleNog = new ItemBaseApple("itemapplenog", 5, 5, false, MobEffects.SATURATION, 10, 0).setCreativeTab(appleTab);
		
		/* TOOLS */
		itemBedrockAxe = new ItemNewAxe("itembedrockaxe", ItemHelper.bedrockMaterial, 12.0F, -3.0F).setCreativeTab(appleTab);
		itemBedrockHoe = new ItemNewHoe("itembedrockhoe", ItemHelper.bedrockMaterial).setCreativeTab(appleTab);
		itemBedrockPickaxe = new ItemNewPickaxe("itembedrockpickaxe", ItemHelper.bedrockMaterial).setCreativeTab(appleTab);
		itemBedrockShovel = new ItemNewShovel("itembedrockshovel", ItemHelper.bedrockMaterial).setCreativeTab(appleTab);
		itemBedrockSword = new ItemNewSword("itembedrocksword", ItemHelper.bedrockMaterial).setCreativeTab(appleTab);
		itemRubyAxe = new ItemNewAxe("itemrubyaxe", ItemHelper.rubyMaterial, 9.0F, -3.0F).setCreativeTab(appleTab);
		itemRubyHoe = new ItemNewHoe("itemrubyhoe", ItemHelper.rubyMaterial).setCreativeTab(appleTab);
		itemRubyPickaxe = new ItemNewPickaxe("itemrubypickaxe", ItemHelper.rubyMaterial).setCreativeTab(appleTab);
		itemRubyShovel = new ItemNewShovel("itemrubyshovel", ItemHelper.rubyMaterial).setCreativeTab(appleTab);
		itemRubySword = new ItemNewSword("itemrubysword", ItemHelper.rubyMaterial).setCreativeTab(appleTab);
		itemKnife = new ItemNewSword("itemknife", ItemHelper.knifeMaterial).setCreativeTab(appleTab);
		
		
		/* MISC */
		//itemAppleFlower = new ItemCrafting("itemappleflower").setCreativeTab(appleTab);
		itemMug = new ItemCrafting("itemmug").setCreativeTab(appleTab);
		itemMugMagic = new ItemCrafting("itemmugmagic").setCreativeTab(appleTab);
		itemRuby = new ItemCrafting("itemruby").setCreativeTab(appleTab);
		itemBedrockFragment = new ItemCrafting("itembedrockfragment").setCreativeTab(appleTab);
		
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		
		for(final Item item : arrayOut()) {
			
			event.getRegistry().register(item);
			SET_ITEMS.add(item);
		
		}
		
	}
	
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent mre) {
		
		for(final Item item : arrayOut()) {
			
			ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "normal"));
		
		}
		
	}
	
	private static final Item[] arrayOut() {
		
		final Item[] arrayItem = {
				
				/* APPLES */
				itemAppleApple,
				//itemAppleAnvil,
				itemAppleArrow,
				itemAppleBat,
				itemAppleBeacon,
				itemAppleBed,
				itemAppleBedrock,
				itemAppleBlazeRod,
				itemAppleBone,
				itemAppleBook,
				itemAppleBread,
				itemAppleBrick,
				itemAppleCactus,
				itemAppleCake,
				itemAppleCandy,
				itemAppleCandycane,
				itemAppleCaramel,
				itemAppleCarrot,
				itemAppleChain,
				itemAppleChicken,
				itemAppleClay,
				itemAppleCoal,
				itemAppleCobweb,
				itemAppleCookie,
				//itemAppleCreeper,
				itemAppleCursed,
				itemAppleDiamond,
				itemAppleDirt,
				itemAppleEaten,
				itemAppleEgg,
				itemAppleEggnog,
				itemAppleEmerald,
				itemAppleEnderEgg,
				itemAppleEnderPearl,
				//itemAppleEvil,
				itemAppleExp,
				itemAppleFeather,
				itemAppleFermented,
				itemAppleFireball,
				itemAppleFirework,
				itemAppleFish,
				itemAppleFishCooked,
				itemAppleFlint,
				itemAppleFlowerPot,
				//itemAppleFruitcake,
				itemAppleGhastTear,
				//itemAppleGingerbread,
				itemAppleGlowstone,
				itemAppleGlowstoneDust,
				itemAppleGoldNugget,
				itemAppleGrass,
				itemAppleGravel,
				itemAppleGunpowder,
				itemAppleHeart,
				itemAppleHorseArmor,
				itemAppleIce,
				itemAppleInvisible,
				itemAppleIron,
				itemAppleLapisLazuli,
				itemAppleLava,
				itemAppleLeather,
				itemAppleLeaves,
				itemAppleMelonSlice,
				itemAppleMelonBlock,
				itemAppleMilk,
				itemAppleMinecart,
				itemAppleNetherBrick,
				itemAppleNetherrack,
				itemAppleNetherStar,
				itemAppleNetherWart,
				itemApplePaper,
				itemApplePorkchopCooked,
				itemApplePorkchopRaw,
				itemApplePotatoBaked,
				itemApplePotatoPoisonous,
				itemApplePotatoRaw,
				itemApplePumpkin,
				itemApplePumpkinLit,
				itemApplePumpkinPie,
				//itemApplePresent,
				itemAppleQuartz,
				itemAppleRecord,
				itemAppleRedstone,
				itemAppleRottenFlesh,
				itemAppleRuby,
				itemAppleSaddle,
				itemAppleSeeds,
				itemAppleSlimeball,
				itemAppleSnowball,
				itemAppleSoulSand,
				itemAppleSpeckledMelon,
				itemAppleSpiderEye,
				itemAppleSponge,
				itemAppleSteve,
				itemAppleStick,
				itemAppleStone,
				itemAppleString,
				itemAppleSugar,
				itemAppleSugarCane,
				itemAppleTNT,
				itemAppleWater,
				itemAppleWheat,
				//itemAppleWitch,
				itemAppleWood,
				itemAppleWool,
				//itemAppleZombie,
				itemApple4Bit,
				itemApple8Bit,
				itemApple32Bit,
				itemApple64Bit,
				
				/* NON-APPLE FOODS */
				itemAppleJuice,
				itemAppleCider,
				itemAppleSauce,
				itemApplePie,
				//itemAppleNog,
				
				/* TOOLS */
				itemBedrockAxe,
				itemBedrockHoe,
				itemBedrockPickaxe,
				itemBedrockShovel,
				itemBedrockSword,
				itemKnife,
				itemRubyAxe,
				itemRubyHoe,
				itemRubyPickaxe,
				itemRubyShovel,
				itemRubySword,
					
				/* MISC */
				//itemAppleFlower,
				itemMug,
				itemMugMagic,
				itemRuby,
				itemBedrockFragment,
				
				itemAppleUltimate
			
		};
		
		return arrayItem;
		
	}
	
	static final CreativeTabs appleTab = (new CreativeTabs("appleTab") {
		
		@Override
        public ItemStack getTabIconItem()
        {
			
            return new ItemStack(itemAppleDiamond);
            
        }
		
	});
	

}
