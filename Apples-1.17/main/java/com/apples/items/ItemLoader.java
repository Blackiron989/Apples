package com.apples.items;

import com.apples.ApplesPlusTab;
import com.apples.Main;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item.Properties;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemLoader {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);
	
	/* Apples **/
	public static final RegistryObject<Item> APPLEAPPLE = ITEMS.register("itemappleapple", () -> new Item(properties(FoodLoader.APPLEAPPLE))); //No Effect
	public static final RegistryObject<Item> APPLEANVIL = ITEMS.register("itemappleanvil", () -> new Item(properties(FoodLoader.APPLEANVIL))); //Effect
	public static final RegistryObject<Item> APPLEARROW = ITEMS.register("itemapplearrow", () -> new AppleArrowItem(properties(FoodLoader.APPLEARROW))); //Effect
	public static final RegistryObject<Item> APPLEBAT = ITEMS.register("itemapplebat", () -> new AppleBatItem(properties(FoodLoader.APPLEBAT))); //Effect
	public static final RegistryObject<Item> APPLEBEACON = ITEMS.register("itemapplebeacon", () -> new DamageableAppleItem(properties(FoodLoader.APPLEBEACON).rarity(Rarity.EPIC).durability(8))); //Effect
	public static final RegistryObject<Item> APPLEBED = ITEMS.register("itemapplebed", () -> new AppleBedItem(properties(FoodLoader.APPLEBED).durability(8))); //Effect
	public static final RegistryObject<Item> APPLEBEDROCK = ITEMS.register("itemapplebedrock", () -> new Item(properties(FoodLoader.APPLEBEDROCK).rarity(Rarity.UNCOMMON))); //No Effect
	
	public static final RegistryObject<Item> APPLEBEE = ITEMS.register("itemapplebee", () -> new Item(properties(FoodLoader.APPLEBEE))); //No Effect
	public static final RegistryObject<Item> APPLEBEENEST = ITEMS.register("itemapplebeenest", () -> new Item(properties(FoodLoader.APPLEBEENEST))); //Effect
	public static final RegistryObject<Item> APPLEBEEF = ITEMS.register("itemapplebeef", () -> new Item(properties(FoodLoader.APPLEBEEF))); //No Effect
	public static final RegistryObject<Item> APPLEBEEFRAW = ITEMS.register("itemapplebeefraw", () -> new Item(properties(FoodLoader.APPLEBEEFRAW))); //No Effect
	public static final RegistryObject<Item> APPLEBEET = ITEMS.register("itemapplebeet", () -> new AppleSeedsItem(properties(FoodLoader.APPLEBEET), "beetroot")); //Effect
	public static final RegistryObject<Item> APPLEBINDING = ITEMS.register("itemapplebinding", () -> new EnchantedAppleItem(properties(FoodLoader.APPLEBINDING))); //Effect
	public static final RegistryObject<Item> APPLEBLAZEROD = ITEMS.register("itemappleblazerod", () -> new AppleBlazerodItem(properties(FoodLoader.APPLEBLAZEROD))); //Effect
	public static final RegistryObject<Item> APPLEBONE = ITEMS.register("itemapplebone", () -> new AppleBoneItem(properties(FoodLoader.APPLEBONE))); //Effect
	public static final RegistryObject<Item> APPLEBOOK = ITEMS.register("itemapplebook", () -> new Item(properties(FoodLoader.APPLEBOOK))); //No Effect
	public static final RegistryObject<Item> APPLEBOTTLE = ITEMS.register("itemapplebottle", () -> new AppleBottleItem(properties(FoodLoader.APPLEBOTTLE))); //Effect
	
	public static final RegistryObject<Item> APPLEBREAD = ITEMS.register("itemapplebread", () -> new Item(properties(FoodLoader.APPLEBREAD))); //No Effect
	public static final RegistryObject<Item> APPLEBRICK = ITEMS.register("itemapplebrick", () -> new Item(properties(FoodLoader.APPLEBRICK))); //No Effect
	public static final RegistryObject<Item> APPLEBUCKET = ITEMS.register("itemapplebucket", () -> new AppleBucketItem(properties(FoodLoader.APPLEBUCKET).stacksTo(1))); //Effect
	public static final RegistryObject<Item> APPLECACTUS = ITEMS.register("itemapplecactus", () -> new AppleCactusItem(properties(FoodLoader.APPLECACTUS))); //Effect
	public static final RegistryObject<Item> APPLECAKE = ITEMS.register("itemapplecake", () -> new Item(properties(FoodLoader.APPLECAKE))); //Effect
	public static final RegistryObject<Item> APPLECANDY = ITEMS.register("itemapplecandy", () -> new Item(properties(FoodLoader.APPLECANDY))); //No Effect
	public static final RegistryObject<Item> APPLECANDYCANE = ITEMS.register("itemapplecandycane", () -> new Item(properties(FoodLoader.APPLECANDYCANE))); //No Effect
	public static final RegistryObject<Item> APPLECARAMEL = ITEMS.register("itemapplecaramel", () -> new Item(properties(FoodLoader.APPLECARAMEL))); //No Effect
	public static final RegistryObject<Item> APPLECARROT = ITEMS.register("itemapplecarrot", () -> new AppleSeedsItem(properties(FoodLoader.APPLECARROT), "carrot")); //Effect
	public static final RegistryObject<Item> APPLECHAIN = ITEMS.register("itemapplechain", () -> new Item(properties(FoodLoader.APPLECHAIN))); //No Effect
	public static final RegistryObject<Item> APPLECHICKEN = ITEMS.register("itemapplechicken", () -> new Item(properties(FoodLoader.APPLECHICKEN))); //No Effect
	public static final RegistryObject<Item> APPLECHICKENCOOKED = ITEMS.register("itemapplechickencooked", () -> new Item(properties(FoodLoader.APPLECHICKENCOOKED))); //No Effect
	
	public static final RegistryObject<Item> APPLECLAY = ITEMS.register("itemappleclay", () -> new Item(properties(FoodLoader.APPLECLAY))); //No Effect
	public static final RegistryObject<Item> APPLECOAL = ITEMS.register("itemapplecoal", () -> new Item(properties(FoodLoader.APPLECOAL))); //No Effect
	public static final RegistryObject<Item> APPLECOBWEB = ITEMS.register("itemapplecobweb", () -> new AppleCobwebItem(properties(FoodLoader.APPLECOBWEB))); //Effect
	public static final RegistryObject<Item> ENCHANTEDAPPLECOBWEB = ITEMS.register("itemenchantedapplecobweb", () -> new EnchantedAppleItem(properties(FoodLoader.ENCHANTEDAPPLECOBWEB))); //Effect
	public static final RegistryObject<Item> APPLECOOKIE = ITEMS.register("itemapplecookie", () -> new Item(properties(FoodLoader.APPLECOOKIE))); //No Effect
	public static final RegistryObject<Item> APPLECREEPER = ITEMS.register("itemapplecreeper", () -> new AppleCreeperItem(properties(FoodLoader.APPLECREEPER))); //Effect
	public static final RegistryObject<Item> APPLECURSED = ITEMS.register("itemapplecursed", () -> new AppleCursedItem(properties(FoodLoader.APPLECURSED).rarity(Rarity.UNCOMMON))); //Effect
	public static final RegistryObject<Item> APPLEDIAMOND = ITEMS.register("itemapplediamond", () -> new Item(properties(FoodLoader.APPLEDIAMOND))); //Effect
	public static final RegistryObject<Item> APPLEDIRT = ITEMS.register("itemappledirt", () -> new Item(properties(FoodLoader.APPLEDIRT))); //No Effect
	public static final RegistryObject<Item> APPLEDOLPHIN = ITEMS.register("itemappledolphin", () -> new Item(properties(FoodLoader.APPLEDOLPHIN))); //No Effect
	public static final RegistryObject<Item> APPLEEATEN = ITEMS.register("itemappleeaten", () -> new Item(properties(FoodLoader.APPLEEATEN).rarity(Rarity.EPIC))); //No Effect
	public static final RegistryObject<Item> APPLEEGG = ITEMS.register("itemappleegg", () -> new AppleEggItem(properties(FoodLoader.APPLEEGG))); //Effect
	
	public static final RegistryObject<Item> APPLEEGGNOG = ITEMS.register("itemappleeggnog", () -> new Item(properties(FoodLoader.APPLEEGGNOG))); //No Effect
	public static final RegistryObject<Item> APPLEEMERALD = ITEMS.register("itemappleemerald", () -> new Item(properties(FoodLoader.APPLEEMERALD))); //No Effect
	public static final RegistryObject<Item> APPLEENDEREGG = ITEMS.register("itemappleenderegg", () -> new DamageableAppleItem(properties(FoodLoader.APPLEENDEREGG).rarity(Rarity.EPIC).durability(8))); //Effect
	public static final RegistryObject<Item> APPLEENDEREYE = ITEMS.register("itemappleendereye", () -> new AppleEnderEyeItem(properties(FoodLoader.APPLEENDEREYE))); //Effect
	public static final RegistryObject<Item> APPLEENDERPEARL = ITEMS.register("itemappleenderpearl", () -> new AppleEnderPearlItem(properties(FoodLoader.APPLEENDERPEARL))); //Effect
	public static final RegistryObject<Item> APPLEEXP = ITEMS.register("itemappleexp", () -> new Item(properties(FoodLoader.APPLEEXP))); //Effect
	public static final RegistryObject<Item> APPLEFEATHER = ITEMS.register("itemapplefeather", () -> new Item(properties(FoodLoader.APPLEFEATHER))); //No Effect
	public static final RegistryObject<Item> ENCHANTEDAPPLEFEATHER = ITEMS.register("itemenchantedapplefeather", () -> new EnchantedAppleFeatherItem(properties(FoodLoader.ENCHANTEDAPPLEFEATHER).durability(8))); //Effect
	public static final RegistryObject<Item> APPLEFERMENTED = ITEMS.register("itemapplefermented", () -> new Item(properties(FoodLoader.APPLEFERMENTED))); //No Effect
	public static final RegistryObject<Item> APPLEFIREBALL = ITEMS.register("itemapplefireball", () -> new Item(properties(FoodLoader.APPLEFIREBALL))); //Effect
	public static final RegistryObject<Item> APPLEFIREWORK = ITEMS.register("itemapplefirework", () -> new Item(properties(FoodLoader.APPLEFIREWORK))); //Effect //FINISH POTION EFFECT
	public static final RegistryObject<Item> APPLEFISH = ITEMS.register("itemapplefish", () -> new Item(properties(FoodLoader.APPLEFISH))); //No Effect
	
	public static final RegistryObject<Item> APPLEFISHCOOKED = ITEMS.register("itemapplefishcooked", () -> new Item(properties(FoodLoader.APPLEFISHCOOKED))); //No Effect
	public static final RegistryObject<Item> APPLEFLINT = ITEMS.register("itemappleflint", () -> new Item(properties(FoodLoader.APPLEFLINT))); //No Effect
	public static final RegistryObject<Item> APPLEFLOWERPOT = ITEMS.register("itemappleflowerpot", () -> new AppleFlowerPotItem(properties(FoodLoader.APPLEFLOWERPOT))); //Effect
	public static final RegistryObject<Item> APPLEGHASTTEAR = ITEMS.register("itemappleghasttear", () -> new AppleGhastTearItem(properties(FoodLoader.APPLEGHASTTEAR))); //Effect
	/*Glistering*/public static final RegistryObject<Item> APPLESPECKLEDMELON = ITEMS.register("itemapplespeckledmelon", () -> new Item(properties(FoodLoader.APPLESPECKLEDMELON))); //No Effect
	public static final RegistryObject<Item> APPLEGLOWSTONE = ITEMS.register("itemappleglowstone", () -> new Item(properties(FoodLoader.APPLEGLOWSTONE))); //No Effect
	
	public static final RegistryObject<Item> APPLEGLOWSTONEDUST = ITEMS.register("itemappleglowstonedust", () -> new Item(properties(FoodLoader.APPLEGLOWSTONEDUST))); //Effect
	public static final RegistryObject<Item> ENCHANTEDAPPLEGLOWSTONE = ITEMS.register("itemenchantedappleglowstone", () -> new AppleNetherwartItem(properties(FoodLoader.ENCHANTEDAPPLEGLOWSTONE), true)); //No Effect
	//Converts all potions in inventory to strong variants
	
	public static final RegistryObject<Item> APPLEGOLDNUGGET = ITEMS.register("itemapplegoldnugget", () -> new Item(properties(FoodLoader.APPLEGOLDNUGGET))); //No Effect
	public static final RegistryObject<Item> APPLEGRASS = ITEMS.register("itemapplegrass", () -> new AppleGrassItem(properties(FoodLoader.APPLEGRASS))); //Effect
	public static final RegistryObject<Item> APPLEGRAVEL = ITEMS.register("itemapplegravel", () -> new Item(properties(FoodLoader.APPLEGRAVEL))); //Effect
	public static final RegistryObject<Item> APPLEGREEN = ITEMS.register("itemapplegreen", () -> new Item(properties(FoodLoader.APPLEGREEN).rarity(Rarity.RARE))); //No Effect
	public static final RegistryObject<Item> APPLEGUNPOWDER = ITEMS.register("itemapplegunpowder", () -> new AppleGunpowderItem(properties(FoodLoader.APPLEGUNPOWDER), 1.0F, false)); //Effect
	
	public static final RegistryObject<Item> APPLEHEART = ITEMS.register("itemappleheart", () -> new Item(properties(FoodLoader.APPLEHEART).rarity(Rarity.UNCOMMON))); //No Effect
	public static final RegistryObject<Item> APPLEHORSEARMOR = ITEMS.register("itemapplehorsearmor", () -> new AppleHorseArmorItem(properties(FoodLoader.APPLEHORSEARMOR).durability(8))); //Effect
	public static final RegistryObject<Item> APPLEICE = ITEMS.register("itemappleice", () -> new Item(properties(FoodLoader.APPLEICE))); //Effect
	public static final RegistryObject<Item> APPLEINVISIBLE = ITEMS.register("itemappleinvisible", () -> new Item(properties(FoodLoader.APPLEINVISIBLE))); //No Effect
	public static final RegistryObject<Item> APPLEIRON = ITEMS.register("itemappleiron", () -> new Item(properties(FoodLoader.APPLEIRON))); //No Effect
	public static final RegistryObject<Item> APPLELAPISLAZULI = ITEMS.register("itemapplelapislazuli", () -> new Item(properties(FoodLoader.APPLELAPISLAZULI))); //No Effect
	public static final RegistryObject<Item> APPLELAVA = ITEMS.register("itemapplelava", () -> new AppleLavaItem(properties(FoodLoader.APPLELAVA).stacksTo(1))); //Effect
	public static final RegistryObject<Item> APPLELEATHER = ITEMS.register("itemappleleather", () -> new Item(properties(FoodLoader.APPLELEATHER))); //No Effect
	public static final RegistryObject<Item> APPLELEAVES = ITEMS.register("itemappleleaves", () -> new AppleLeavesItem(properties(FoodLoader.APPLELEAVES))); //Effect
	public static final RegistryObject<Item> APPLELOOT = ITEMS.register("itemappleloot", () -> new AppleLootItem(properties(FoodLoader.APPLELOOT).rarity(Rarity.UNCOMMON))); //Effect
	public static final RegistryObject<Item> APPLEMELONSLICE = ITEMS.register("itemapplemelonslice", () -> new Item(properties(FoodLoader.APPLEMELONSLICE))); //No Effect
	
	public static final RegistryObject<Item> APPLEMELONBLOCK = ITEMS.register("itemapplemelonblock", () -> new AppleMelonBlockItem(properties(FoodLoader.APPLEMELONBLOCK))); //Effect
	public static final RegistryObject<Item> APPLEMILK = ITEMS.register("itemapplemilk", () -> new AppleMilkItem(properties(FoodLoader.APPLEMILK).stacksTo(1))); //Effect
	public static final RegistryObject<Item> APPLEMINECART = ITEMS.register("itemappleminecart", () -> new AppleMinecartItem(properties(FoodLoader.APPLEMINECART).durability(8))); //Effect
	public static final RegistryObject<Item> APPLENETHERBRICK = ITEMS.register("itemapplenetherbrick", () -> new AppleNetherBrickItem(properties(FoodLoader.APPLENETHERBRICK))); //Effect
	public static final RegistryObject<Item> APPLENETHERRACK = ITEMS.register("itemapplenetherrack", () -> new AppleNetherrackItem(properties(FoodLoader.APPLENETHERRACK))); //Effect
	public static final RegistryObject<Item> APPLENETHERSTAR = ITEMS.register("itemapplenetherstar", () -> new DamageableAppleItem(properties(FoodLoader.APPLENETHERSTAR).rarity(Rarity.EPIC).durability(8))); //No Effect
	public static final RegistryObject<Item> APPLENETHERWART = ITEMS.register("itemapplenetherwart", () -> new AppleNetherwartItem(properties(FoodLoader.APPLENETHERWART), false)); //Effect
	public static final RegistryObject<Item> APPLEOBSIDIAN = ITEMS.register("itemappleobsidian", () -> new Item(properties(FoodLoader.APPLEOBSIDIAN))); //No Effect
	public static final RegistryObject<Item> APPLEPAPER = ITEMS.register("itemapplepaper", () -> new ApplePaperItem(properties(FoodLoader.APPLEPAPER))); //Effect
	public static final RegistryObject<Item> APPLEPORKCHOPCOOKED = ITEMS.register("itemappleporkchopcooked", () -> new Item(properties(FoodLoader.APPLEPORKCHOPCOOKED))); //No Effect
	public static final RegistryObject<Item> APPLEPORKCHOPRAW = ITEMS.register("itemappleporkchopraw", () -> new Item(properties(FoodLoader.APPLEPORKCHOPRAW))); //No Effect
	
	public static final RegistryObject<Item> APPLEPOTATOBAKED = ITEMS.register("itemapplepotatobaked", () -> new Item(properties(FoodLoader.APPLEPOTATOBAKED))); //No Effect
	public static final RegistryObject<Item> APPLEPOTATOPOISONOUS = ITEMS.register("itemapplepotatopoisonous", () -> new Item(properties(FoodLoader.APPLEPOTATOPOISONOUS))); //No Effect
	public static final RegistryObject<Item> APPLEPOTATORAW = ITEMS.register("itemapplepotatoraw", () -> new AppleSeedsItem(properties(FoodLoader.APPLEPOTATORAW), "potato")); //Effect
	public static final RegistryObject<Item> APPLEPUMPKIN = ITEMS.register("itemapplepumpkin", () -> new Item(properties(FoodLoader.APPLEPUMPKIN))); //Effect
	public static final RegistryObject<Item> APPLEPUMPKINLIT = ITEMS.register("itemapplepumpkinlit", () -> new AppleLightEmitterItem(properties(FoodLoader.APPLEPUMPKINLIT))); //Effect
	public static final RegistryObject<Item> APPLEPUMPKINPIE = ITEMS.register("itemapplepumpkinpie", () -> new Item(properties(FoodLoader.APPLEPUMPKINPIE))); //No Effect
	public static final RegistryObject<Item> APPLEPRESENT = ITEMS.register("itemapplepresent", () -> new ApplePresentItem(properties(FoodLoader.APPLEPRESENT).rarity(Rarity.UNCOMMON))); //Effect
	public static final RegistryObject<Item> APPLEQUARTZ = ITEMS.register("itemapplequartz", () -> new Item(properties(FoodLoader.APPLEQUARTZ))); //No Effect
	public static final RegistryObject<Item> APPLERECORD = ITEMS.register("itemapplerecord", () -> new AppleRecordItem(properties(FoodLoader.APPLERECORD).durability(8))); //Effect
	public static final RegistryObject<Item> APPLEREDSTONE = ITEMS.register("itemappleredstone", () -> new Item(properties(FoodLoader.APPLEREDSTONE))); //No Effect
	public static final RegistryObject<Item> ENCHANTEDAPPLEREDSTONE = ITEMS.register("itemenchantedappleredstone", () -> new AppleNetherwartItem(properties(FoodLoader.ENCHANTEDAPPLEREDSTONE), true)); //Effect
	//Converts all potions in inventory to long variants
	
	public static final RegistryObject<Item> APPLEROTTENFLESH = ITEMS.register("itemapplerottenflesh", () -> new Item(properties(FoodLoader.APPLEROTTENFLESH))); //No Effect
	public static final RegistryObject<Item> APPLERUBY = ITEMS.register("itemappleruby", () -> new Item(properties(FoodLoader.APPLERUBY))); //Effect
	public static final RegistryObject<Item> APPLESADDLE = ITEMS.register("itemapplesaddle", () -> new AppleSaddleItem(properties(FoodLoader.APPLESADDLE).durability(8))); //Effect
	public static final RegistryObject<Item> APPLESLIMEBALL = ITEMS.register("itemappleslimeball", () -> new Item(properties(FoodLoader.APPLESLIMEBALL))); //Effect
	public static final RegistryObject<Item> APPLESNOWBALL = ITEMS.register("itemapplesnowball", () -> new Item(properties(FoodLoader.APPLESNOWBALL))); //Effect
	public static final RegistryObject<Item> APPLESOULSAND = ITEMS.register("itemapplesoulsand", () -> new Item(properties(FoodLoader.APPLESOULSAND))); //No Effect
	public static final RegistryObject<Item> APPLESPIDEREYE = ITEMS.register("itemapplespidereye", () -> new Item(properties(FoodLoader.APPLESPIDEREYE))); //No Effect
	public static final RegistryObject<Item> APPLESPONGE = ITEMS.register("itemapplesponge", () -> new AppleSpongeItem(properties(FoodLoader.APPLESPONGE))); //Effect
	
	public static final RegistryObject<Item> APPLESTEVE = ITEMS.register("itemapplesteve", () -> new AppleSteveItem(properties(FoodLoader.APPLESTEVE).rarity(Rarity.RARE))); //Effect
	public static final RegistryObject<Item> APPLESTICK = ITEMS.register("itemapplestick", () -> new Item(properties(FoodLoader.APPLESTICK))); //No Effect
	public static final RegistryObject<Item> APPLESTONE = ITEMS.register("itemapplestone", () -> new Item(properties(FoodLoader.APPLESTONE))); //No Effect
	public static final RegistryObject<Item> APPLESTRING = ITEMS.register("itemapplestring", () -> new Item(properties(FoodLoader.APPLESTRING))); //No Effect
	public static final RegistryObject<Item> APPLESUGAR = ITEMS.register("itemapplesugar", () -> new Item(properties(FoodLoader.APPLESUGAR))); //No Effect
	public static final RegistryObject<Item> APPLESUGARCANE = ITEMS.register("itemapplesugarcane", () -> new AppleSugarcaneItem(properties(FoodLoader.APPLESUGARCANE))); //Effect
	public static final RegistryObject<Item> APPLETNT = ITEMS.register("itemappletnt", () -> new AppleGunpowderItem(properties(FoodLoader.APPLETNT), 5.0F, false)); //Effect
	
	public static final RegistryObject<Item> APPLEUNDYING = ITEMS.register("itemappleundying", () -> new DamageableAppleItem(properties(FoodLoader.APPLEUNDYING).durability(8))); //Effect
	
	public static final RegistryObject<Item> APPLEULTIMATE = ITEMS.register("itemappleultimate", () -> new AppleUltimateItem(properties(FoodLoader.APPLEULTIMATE).rarity(Rarity.EPIC))); //No Effect //CURRENTLY...
	public static final RegistryObject<Item> APPLEINACTIVEULTIMATE = ITEMS.register("itemappleinactiveultimate", () -> new AppleInactiveItem(properties(FoodLoader.APPLEINACTIVEULTIMATE).rarity(Rarity.RARE).stacksTo(1))); //No Effect
	//Requires every type of apple be added to it to activate, can be added by activating the item, crafted with magic bottles
	
	public static final RegistryObject<Item> APPLEVANISHING = ITEMS.register("itemapplevanishing", () -> new EnchantedAppleItem(properties(FoodLoader.APPLEVANISHING))); //Effect
	public static final RegistryObject<Item> APPLEVOID = ITEMS.register("itemapplevoid", () -> new AppleVoidItem(properties(FoodLoader.APPLEVOID))); //Effect
	public static final RegistryObject<Item> APPLEWATER = ITEMS.register("itemapplewater", () -> new AppleWaterItem(properties(FoodLoader.APPLEWATER).stacksTo(1))); //Effect //NOTE: Implement waterlogging for campfire
	public static final RegistryObject<Item> APPLEWHEAT = ITEMS.register("itemapplewheat", () -> new AppleSeedsItem(properties(FoodLoader.APPLEWHEAT), "wheat")); //Effect
	public static final RegistryObject<Item> APPLEWITCH = ITEMS.register("itemapplewitch", () -> new Item(properties(FoodLoader.APPLEWITCH).stacksTo(1))); //Effect
	public static final RegistryObject<Item> APPLEWITHERSKULL = ITEMS.register("itemapplewitherskull", () -> new AppleWitherSkullItem(properties(FoodLoader.APPLEWITHERSKULL), false)); //Effect
	public static final RegistryObject<Item> ENCHANTEDAPPLEWITHERSKULL = ITEMS.register("itemenchantedapplewitherskull", () -> new AppleWitherSkullItem(properties(FoodLoader.ENCHANTEDAPPLEWITHERSKULL).durability(8), true)); //Effect
	
	public static final RegistryObject<Item> APPLEWOOD = ITEMS.register("itemapplewood", () -> new Item(properties(FoodLoader.APPLEWOOD))); //No Effect
	public static final RegistryObject<Item> APPLEWOOL = ITEMS.register("itemapplewool", () -> new AppleWoolItem(properties(FoodLoader.APPLEWOOL)));
	public static final RegistryObject<Item> APPLEZOMBIE = ITEMS.register("itemapplezombie", () -> new Item(properties(FoodLoader.APPLEZOMBIE))); //Effect
	public static final RegistryObject<Item> APPLE4BIT = ITEMS.register("itemapple4bit", () -> new Item(properties(FoodLoader.APPLE4BIT))); //No Effect
	public static final RegistryObject<Item> APPLE8BIT = ITEMS.register("itemapple8bit", () -> new Item(properties(FoodLoader.APPLE8BIT))); //No Effect
	public static final RegistryObject<Item> APPLE32BIT = ITEMS.register("itemapple32bit", () -> new Item(properties(FoodLoader.APPLE32BIT))); //No Effect
	public static final RegistryObject<Item> APPLE64BIT = ITEMS.register("itemapple64bit", () -> new Item(properties(FoodLoader.APPLE64BIT).rarity(Rarity.RARE))); //No Effect

	/** New To-Be Integrated Apples **/ //Move up when finished!

	//1.18+
	//public static final RegistryObject<Item> APPLEFLOWER = ITEMS.register("itemappleflower", () -> new Item(properties(FoodLoader.APPLEFLOWER))); //No Effect
	//Hostile bees wont target player, Could also be planted to grow a apple growing plant when harvested gives 2-3 apples.
	//public static final RegistryObject<Item> APPLEGILDEDBLACKSTONE = ITEMS.register("itemapplegildedblackstone", () -> new Item(properties(FoodLoader.APPLEGILDEDBLACKSTONE))); //No Effect
	//Pigman wont target the player, does not effect brutes.
	//public static final RegistryObject<Item> APPLEWITHERROSE = ITEMS.register("itemapplewitherrose", () -> new Item(properties(FoodLoader.APPLEWITHERROSE))); //No Effect
	//Applies wither to any monster entities you attack
	//public static final RegistryObject<Item> ENCHANTEDAPPLEOBSIDIAN = ITEMS.register("itemenchantedappleobsidian", () -> new Item(properties(FoodLoader.ENCHANTEDAPPLEOBSIDIAN))); //Effect
	//Makes the player blast resistant
	//public static final RegistryObject<Item> ENCHANTEDAPPLESPIDEREYE = ITEMS.register("itemenchantedapplespidereye", () -> new Item(properties(FoodLoader.ENCHANTEDAPPLESPIDEREYE))); //No Effect
	//Makes player immune to poison for 10 minutes
	//public static final RegistryObject<Item> ENCHANTEDAPPLETNT = ITEMS.register("itemenchantedappletnt", () -> new Item(properties(FoodLoader.ENCHANTEDAPPLETNT))); //No Effect
	//Makes the player explode in a vary large explosion, if standing on a bedrock block has a 25% to destroy it leaving behind 7-8 bedrock fragments
	//public static final RegistryObject<Item> ENCHANTEDAPPLEGLASS = ITEMS.register("itemenchantedappleglass", () -> new Item(properties(FoodLoader.ENCHANTEDAPPLEGLASS))); //No Effect
	//Glass Cannon - Makes the player invisible, no hostile mobs will target the player but if the player takes damage they will instantly die or if the player attacks a monster it will do double damage
	//but the effect will be cleared after the damage is applied.
	//public static final RegistryObject<Item> ENCHANTEDAPPLEROTTENFLESH = ITEMS.register("itemenchantedapplerottenflesh", () -> new Item(properties(FoodLoader.ENCHANTEDAPPLEROTTENFLESH))); //No Effect
	//Zombies will not longer target the player
	
	/**
	    Ideas:
		Crying Obsidian, Fungus, Shulker Box, Coral, Ender Crystal, Target, Conduit, Netherrite, Prismarine, Chorus, Honey,
		Compass, Dragons Breath, Hopper, Phantom, Lodestone, Lantern, Enchanted Soul Sand, Magma, Chest, Furnace, Campfire,
		Ender Chest, Enchanted Variants, etc...
		
		Enchanted Sugarcane has very small chance to spawn a build limit -1 sugarcane with a 50/50 good loot or trapped chest placed at the top.
	**/
	
	
	/** Food Items **/
	public static final RegistryObject<Item> APPLEJUICE = ITEMS.register("itemapplejuice", () -> new AppleJuiceItem(properties(FoodLoader.APPLEJUICE))); //No Effect
	public static final RegistryObject<Item> APPLECIDER = ITEMS.register("itemapplecider", () -> new AppleJuiceItem(properties(FoodLoader.APPLECIDER))); //No Effect
	public static final RegistryObject<Item> APPLESAUCE = ITEMS.register("itemapplesauce", () -> new Item(properties(FoodLoader.APPLESAUCE))); //No Effect
	
	/** Crafting Materials **/
	public static final RegistryObject<Item> MUGMAGIC = ITEMS.register("itemmugmagic", () -> new BottleOfMagicItem(properties(null)));
	public static final RegistryObject<Item> RUBY = ITEMS.register("itemruby", () -> new Item(properties(null)));
	public static final RegistryObject<Item> BEDROCKFRAGMENT = ITEMS.register("itembedrockfragment", () -> new Item(properties(null)));
	
	private static Properties properties(FoodProperties food) {
		
		if(food != null) {
			
			return new Properties().tab(ApplesPlusTab.APPLE_TAB).food(food);
			
		} 
		
		return new Properties().tab(ApplesPlusTab.APPLE_TAB);
		
	}
	
	/* -- -- -- -- */
	
	//public static final RegistryObject<Item> APPLEBLACKCONCRETE = ITEMS.register("itemappleblackconcrete", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEBLACKCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEBLACKGLASS = ITEMS.register("itemappleblackglass", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEBLACKGLASS))); //No Effect
	//public static final RegistryObject<Item> APPLEBLACKPOWDEREDCONCRETE = ITEMS.register("itemappleblackpowderedconcrete", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEBLACKPOWDEREDCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEBLACKSHULKER = ITEMS.register("itemappleblackshulker", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEBLACKSHULKER))); //No Effect
	//public static final RegistryObject<Item> APPLEBLACKSTONE = ITEMS.register("itemappleblackstone", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEBLACKSTONE))); //No Effect
	//**public static final RegistryObject<Item> APPLEBLASTFURNACE = ITEMS.register("itemappleblastfurnace", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEBLASTFURNACE))); //No Effect
	//public static final RegistryObject<Item> APPLEBLUECONCRETE = ITEMS.register("itemappleblueconcrete", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEBLUECONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEBLUEGLASS = ITEMS.register("itemappleblueglass", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEBLUEGLASS))); //No Effect
	//public static final RegistryObject<Item> APPLEBLUEPOWDEREDCONCRETE = ITEMS.register("itemapplebluepowderedconcrete", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEBLUEPOWDEREDCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEBLUESHULKER = ITEMS.register("itemappleblueshulker", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEBLUESHULKER))); //No Effect
	//public static final RegistryObject<Item> APPLEBROWNCONCRETE = ITEMS.register("itemapplebrownconcrete", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEBROWNCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEBROWNGLASS = ITEMS.register("itemapplebrownglass", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEBROWNGLASS))); //No Effect
	//public static final RegistryObject<Item> APPLEBROWNPOWDEREDCONCRETE = ITEMS.register("itemapplebrownpowderedconcrete", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEBROWNPOWDEREDCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEBROWNSHULKER = ITEMS.register("itemapplebrownshulker", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEBROWNSHULKER))); //No Effect
	
	
	//public static final RegistryObject<Item> APPLECAMPFIRE = ITEMS.register("itemapplecampfire", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLECAMPFIRE))); //No Effect
	//public static final RegistryObject<Item> APPLECHORUS = ITEMS.register("itemapplechorus", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLECHORUS))); //No Effect
	//public static final RegistryObject<Item> APPLECOMPASS = ITEMS.register("itemapplecompass", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLECOMPASS))); //No Effect
	//public static final RegistryObject<Item> APPLECONDUIT = ITEMS.register("itemappleconduit", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLECONDUIT))); //No Effect
	//public static final RegistryObject<Item> APPLECORAL = ITEMS.register("itemapplecoral", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLECORAL))); //No Effect
	//public static final RegistryObject<Item> APPLECRAFTING = ITEMS.register("itemapplecrafting", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLECRAFTING))); //No Effect
	//public static final RegistryObject<Item> APPLECRYINGOBSIDIAN = ITEMS.register("itemapplecryingobsidian", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLECRYINGOBSIDIAN))); //No Effect
	//public static final RegistryObject<Item> APPLECYANCONCRETE = ITEMS.register("itemapplecyanconcrete", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLECYANCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLECYANGLASS = ITEMS.register("itemapplecyanglass", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLECYANGLASS))); //No Effect
	//public static final RegistryObject<Item> APPLECYANPOWDEREDCONCRETE = ITEMS.register("itemapplecyanpowderedconcrete", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLECYANPOWDEREDCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLECYANSHULKER = ITEMS.register("itemapplecyanshulker", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLECYANSHULKER))); //No Effect
	//public static final RegistryObject<Item> APPLEDRAGONSBREATH = ITEMS.register("itemappledragonsbreath", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEDRAGONSBREATH))); //No Effect
	//public static final RegistryObject<Item> APPLEENDCRYSTAL = ITEMS.register("itemappleendcrystal", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEENDCRYSTAL))); //No Effect
	//public static final RegistryObject<Item> APPLEENDERCHEST = ITEMS.register("itemappleenderchest", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEENDERCHEST))); //No Effect
	
	//public static final RegistryObject<Item> APPLEFURNACE = ITEMS.register("itemapplefurnace", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEFURNACE))); //No Effect
	//public static final RegistryObject<Item> APPLEGRAYCONCRETE = ITEMS.register("itemapplegrayconcrete", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEGRAYCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEGRAYGLASS = ITEMS.register("itemapplegrayglass", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEGRAYGLASS))); //No Effect
	//public static final RegistryObject<Item> APPLEGRAYPOWDEREDCONCRETE = ITEMS.register("itemapplegraypowderedconcrete", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEGRAYPOWDEREDCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEGRAYSHULKER = ITEMS.register("itemapplegrayshulker", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEGRAYSHULKER))); //No Effect
	//public static final RegistryObject<Item> APPLEGREENCONCRETE = ITEMS.register("itemapplegreenconcrete", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEGREENCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEGREENGLASS = ITEMS.register("itemapplegreenglass", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEGREENGLASS))); //No Effect
	//public static final RegistryObject<Item> APPLEGREENPOWDEREDCONCRETE = ITEMS.register("itemapplegreenpowderedconcrete", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEGREENPOWDEREDCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEGREENSHULKER = ITEMS.register("itemapplegreenshulker", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEGREENSHULKER))); //No Effect
	//public static final RegistryObject<Item> APPLEHONEY = ITEMS.register("itemapplehoney", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEHONEY))); //No Effect
	//public static final RegistryObject<Item> APPLEHOPPER = ITEMS.register("itemapplehopper", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEHOPPER))); //No Effect
	//public static final RegistryObject<Item> APPLELANTERN = ITEMS.register("itemapplelantern", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLELANTERN))); //No Effect
	//public static final RegistryObject<Item> APPLELIGHTBLUECONCRETE = ITEMS.register("itemapplelightblueconcrete", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLELIGHTBLUECONCRETE))); //No Effect
	
	//public static final RegistryObject<Item> APPLELIGHTBLUEGLASS = ITEMS.register("itemapplelightblueglass", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLELIGHTBLUEGLASS))); //No Effect
	//public static final RegistryObject<Item> APPLELIGHTBLUEPOWDEREDCONCRETE = ITEMS.register("itemapplelightbluepowderedconcrete", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLELIGHTBLUEPOWDEREDCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLELIGHTBLUESHULKER = ITEMS.register("itemapplelightblueshulker", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLELIGHTBLUESHULKER))); //No Effect
	//public static final RegistryObject<Item> APPLELIGHTGRAYCONCRETE = ITEMS.register("itemapplelightgrayconcrete", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLELIGHTGRAYCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLELIGHTGRAYGLASS = ITEMS.register("itemapplelightgrayglass", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLELIGHTGRAYGLASS))); //No Effect
	//public static final RegistryObject<Item> APPLELIGHTGRAYPOWDEREDCONCRETE = ITEMS.register("itemapplelightgraypowderedconcrete", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLELIGHTGRAYPOWDEREDCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLELIGHTGRAYSHULKER = ITEMS.register("itemapplelightgrayshulker", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLELIGHTGRAYSHULKER))); //No Effect
	//public static final RegistryObject<Item> APPLELIMECONCRETE = ITEMS.register("itemapplelimeconcrete", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLELIMECONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLELIMEGLASS = ITEMS.register("itemapplelimeglass", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLELIMEGLASS))); //No Effect
	//public static final RegistryObject<Item> APPLELIMEPOWDEREDCONCRETE = ITEMS.register("itemapplelimepowderedconcrete", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLELIMEPOWDEREDCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLELIMESHULKER = ITEMS.register("itemapplelimeshulker", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLELIMESHULKER))); //No Effect
	//public static final RegistryObject<Item> APPLELOADSTONE = ITEMS.register("itemappleloadstone", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLELOADSTONE))); //No Effect
	//public static final RegistryObject<Item> APPLEMAGENTACONCRETE = ITEMS.register("itemapplemagentaconcrete", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEMAGENTACONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEMAGENTAGLASS = ITEMS.register("itemapplemagentaglass", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEMAGENTAGLASS))); //No Effect
	//public static final RegistryObject<Item> APPLEMAGENTAPOWDEREDCONCRETE = ITEMS.register("itemapplemagentapowderedconcrete", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEMAGENTAPOWDEREDCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEMAGENTASHULKER = ITEMS.register("itemapplemagentashulker", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEMAGENTASHULKER))); //No Effect
	
	//public static final RegistryObject<Item> APPLEMAGMA = ITEMS.register("itemapplemagma", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEMAGMA))); //No Effect
	//public static final RegistryObject<Item> APPLEMEMBRANE = ITEMS.register("itemapplemembrane", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEMEMBRANE))); //No Effect
	//public static final RegistryObject<Item> APPLENETHERRITE = ITEMS.register("itemapplenetherrite", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLENETHERRITE))); //No Effect
	//public static final RegistryObject<Item> APPLEORANGECONCRETE = ITEMS.register("itemappleorangeconcrete", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEORANGECONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEORANGEGLASS = ITEMS.register("itemappleorangeglass", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEORANGEGLASS))); //No Effect
	//public static final RegistryObject<Item> APPLEORANGEPOWDEREDCONCRETE = ITEMS.register("itemappleorangepowderedconcrete", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEORANGEPOWDEREDCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEORANGESHULKER = ITEMS.register("itemappleorangeshulker", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEORANGESHULKER))); //No Effect
	//public static final RegistryObject<Item> APPLEPIGSTEP = ITEMS.register("itemapplepigstep", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEPIGSTEP))); //No Effect
	//public static final RegistryObject<Item> APPLEPINKCONCRETE = ITEMS.register("itemapplepinkconcrete", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEPINKCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEPINKGLASS = ITEMS.register("itemapplepinkglass", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEPINKGLASS))); //No Effect
	
	//public static final RegistryObject<Item> APPLEPINKPOWDEREDCONCRETE = ITEMS.register("itemapplepinkpowderedconcrete", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEPINKPOWDEREDCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEPINKSHULKER = ITEMS.register("itemapplepinkshulker", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEPINKSHULKER))); //No Effect
	//public static final RegistryObject<Item> APPLEPRISMARINE = ITEMS.register("itemappleprismarine", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEPRISMARINE))); //No Effect
	//public static final RegistryObject<Item> APPLEPURPLECONCRETE = ITEMS.register("itemapplepurpleconcrete", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEPURPLECONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEPURPLEGLASS = ITEMS.register("itemapplepurpleglass", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEPURPLEGLASS))); //No Effect
	//public static final RegistryObject<Item> APPLEPURPLEPOWDEREDCONCRETE = ITEMS.register("itemapplepurplepowderedconcrete", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEPURPLEPOWDEREDCONCRETE))); //No Effect
	
	//public static final RegistryObject<Item> APPLEPURPLESHULKER = ITEMS.register("itemapplepurpleshulker", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEPURPLESHULKER))); //No Effect
	//public static final RegistryObject<Item> APPLEREDCONCRETE = ITEMS.register("itemappleredconcrete", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEREDCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEREDGLASS = ITEMS.register("itemappleredglass", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEREDGLASS))); //No Effect
	//public static final RegistryObject<Item> APPLEREDPOWDEREDCONCRETE = ITEMS.register("itemappleredpowderedconcrete", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEREDPOWDEREDCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEREDSHULKER = ITEMS.register("itemappleredshulker", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEREDSHULKER))); //No Effect
	//public static final RegistryObject<Item> APPLETARGET = ITEMS.register("itemappletarget", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLETARGET))); //No Effect
	
	//public static final RegistryObject<Item> APPLEWHITECONCRETE = ITEMS.register("itemapplewhiteconcrete", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEWHITECONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEWHITEGLASS = ITEMS.register("itemapplewhiteglass", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEWHITEGLASS))); //No Effect
	//public static final RegistryObject<Item> APPLEWHITEPOWDEREDCONCRETE = ITEMS.register("itemapplewhitepowderedconcrete", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEWHITEPOWDEREDCONCRETE))); //No Effect
	
	//public static final RegistryObject<Item> APPLEWHITESHULKER = ITEMS.register("itemapplewhiteshulker", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEWHITESHULKER))); //No Effect
	//public static final RegistryObject<Item> APPLEYELLOWCONCRETE = ITEMS.register("itemappleyellowconcrete", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEYELLOWCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEYELLOWGLASS = ITEMS.register("itemappleyellowglass", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEYELLOWGLASS))); //No Effect
	//public static final RegistryObject<Item> APPLEYELLOWPOWDEREDCONCRETE = ITEMS.register("itemappleyellowpowderedconcrete", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEYELLOWPOWDEREDCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEYELLOWSHULKER = ITEMS.register("itemappleyellowshulker", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.APPLEYELLOWSHULKER))); //No Effect
	
	//public static final RegistryObject<Item> ENCHANTEDAPPLEBLASTFURNACE = ITEMS.register("itemenchantedappleblastfurnace", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.ENCHANTEDAPPLEBLASTFURNACE))); //No Effect
	//public static final RegistryObject<Item> ENCHANTEDAPPLECAMPFIRE = ITEMS.register("itemenchantedapplecampfire", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.ENCHANTEDAPPLECAMPFIRE))); //No Effect
	//public static final RegistryObject<Item> ENCHANTEDAPPLECRAFTING = ITEMS.register("itemenchantedapplecrafting", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.ENCHANTEDAPPLECRAFTING))); //No Effect
	//public static final RegistryObject<Item> ENCHANTEDAPPLEENDERCHEST = ITEMS.register("itemenchantedappleenderchest", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.ENCHANTEDAPPLEENDERCHEST))); //No Effect
	//public static final RegistryObject<Item> ENCHANTEDAPPLEFURNACE = ITEMS.register("itemenchantedapplefurnace", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.ENCHANTEDAPPLEFURNACE))); //No Effect
	//public static final RegistryObject<Item> ENCHANTEDAPPLESOULSAND = ITEMS.register("itemenchantedapplesoulsand", () -> new Item(new Properties().tab(ApplesPlusTab.APPLE_TAB).food(FoodLoader.ENCHANTEDAPPLESOULSAND))); //No Effect

}
