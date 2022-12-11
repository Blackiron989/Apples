package com.apples.items;

import com.apples.Group;
import com.apples.Main;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.PickaxeItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemLoader {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);
	
	/* Apples **/
	public static final RegistryObject<Item> APPLEAPPLE = ITEMS.register("itemappleapple", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEAPPLE))); //No Effect
	public static final RegistryObject<Item> APPLEANVIL = ITEMS.register("itemappleanvil", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEANVIL))); //Effect
	public static final RegistryObject<Item> APPLEARROW = ITEMS.register("itemapplearrow", () -> new ItemAppleArrow(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEARROW))); //Effect
	public static final RegistryObject<Item> APPLEBAT = ITEMS.register("itemapplebat", () -> new ItemAppleBat(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEBAT))); //Effect
	public static final RegistryObject<Item> APPLEBEACON = ITEMS.register("itemapplebeacon", () -> new ItemAppleDamageable(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEBEACON).rarity(Rarity.EPIC).maxDamage(8))); //Effect
	public static final RegistryObject<Item> APPLEBED = ITEMS.register("itemapplebed", () -> new ItemAppleBed(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEBED).maxDamage(8))); //Effect
	public static final RegistryObject<Item> APPLEBEDROCK = ITEMS.register("itemapplebedrock", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEBEDROCK).rarity(Rarity.UNCOMMON))); //No Effect
	public static final RegistryObject<Item> APPLEBEE = ITEMS.register("itemapplebee", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEBEE))); //No Effect
	public static final RegistryObject<Item> APPLEBEEF = ITEMS.register("itemapplebeef", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEBEEF))); //No Effect
	public static final RegistryObject<Item> APPLEBEEFRAW = ITEMS.register("itemapplebeefraw", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEBEEFRAW))); //No Effect
	public static final RegistryObject<Item> APPLEBEET = ITEMS.register("itemapplebeet", () -> new ItemAppleSeeds(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEBEET), "beetroot")); //Effect
	public static final RegistryObject<Item> APPLEBINDING = ITEMS.register("itemapplebinding", () -> new ItemAppleEnchanted(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEBINDING))); //Effect
	public static final RegistryObject<Item> APPLEBLAZEROD = ITEMS.register("itemappleblazerod", () -> new ItemAppleBlazerod(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEBLAZEROD))); //Effect
	public static final RegistryObject<Item> APPLEBONE = ITEMS.register("itemapplebone", () -> new ItemAppleBone(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEBONE))); //Effect
	public static final RegistryObject<Item> APPLEBOOK = ITEMS.register("itemapplebook", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEBOOK))); //No Effect
	
	public static final RegistryObject<Item> APPLEBREAD = ITEMS.register("itemapplebread", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEBREAD))); //No Effect
	public static final RegistryObject<Item> APPLEBRICK = ITEMS.register("itemapplebrick", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEBRICK))); //No Effect
	public static final RegistryObject<Item> APPLEBUCKET = ITEMS.register("itemapplebucket", () -> new ItemAppleBucket(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEBUCKET).maxStackSize(1))); //Effect
	public static final RegistryObject<Item> APPLECACTUS = ITEMS.register("itemapplecactus", () -> new ItemAppleCactus(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLECACTUS))); //Effect
	public static final RegistryObject<Item> APPLECAKE = ITEMS.register("itemapplecake", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLECAKE))); //Effect
	public static final RegistryObject<Item> APPLECANDY = ITEMS.register("itemapplecandy", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLECANDY))); //No Effect
	public static final RegistryObject<Item> APPLECANDYCANE = ITEMS.register("itemapplecandycane", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLECANDYCANE))); //No Effect
	public static final RegistryObject<Item> APPLECARAMEL = ITEMS.register("itemapplecaramel", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLECARAMEL))); //No Effect
	public static final RegistryObject<Item> APPLECARROT = ITEMS.register("itemapplecarrot", () -> new ItemAppleSeeds(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLECARROT), "carrot")); //Effect
	public static final RegistryObject<Item> APPLECHAIN = ITEMS.register("itemapplechain", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLECHAIN))); //No Effect
	public static final RegistryObject<Item> APPLECHICKEN = ITEMS.register("itemapplechicken", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLECHICKEN))); //No Effect
	public static final RegistryObject<Item> APPLECHICKENCOOKED = ITEMS.register("itemapplechickencooked", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLECHICKENCOOKED))); //No Effect
	
	public static final RegistryObject<Item> APPLECLAY = ITEMS.register("itemappleclay", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLECLAY))); //No Effect
	public static final RegistryObject<Item> APPLECOAL = ITEMS.register("itemapplecoal", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLECOAL))); //No Effect
	public static final RegistryObject<Item> APPLECOBWEB = ITEMS.register("itemapplecobweb", () -> new ItemAppleCobweb(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLECOBWEB))); //Effect
	public static final RegistryObject<Item> ENCHANTEDAPPLECOBWEB = ITEMS.register("itemenchantedapplecobweb", () -> new ItemAppleEnchanted(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.ENCHANTEDAPPLECOBWEB))); //Effect
	public static final RegistryObject<Item> APPLECOOKIE = ITEMS.register("itemapplecookie", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLECOOKIE))); //No Effect
	public static final RegistryObject<Item> APPLECREEPER = ITEMS.register("itemapplecreeper", () -> new ItemAppleCreeper(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLECREEPER))); //Effect
	public static final RegistryObject<Item> APPLECURSED = ITEMS.register("itemapplecursed", () -> new ItemAppleCursed(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLECURSED).rarity(Rarity.UNCOMMON))); //Effect
	public static final RegistryObject<Item> APPLEDIAMOND = ITEMS.register("itemapplediamond", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEDIAMOND))); //Effect
	public static final RegistryObject<Item> APPLEDIRT = ITEMS.register("itemappledirt", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEDIRT))); //No Effect
	public static final RegistryObject<Item> APPLEEATEN = ITEMS.register("itemappleeaten", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEEATEN).rarity(Rarity.EPIC))); //No Effect
	public static final RegistryObject<Item> APPLEEGG = ITEMS.register("itemappleegg", () -> new ItemAppleEgg(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEEGG))); //Effect
	
	public static final RegistryObject<Item> APPLEEGGNOG = ITEMS.register("itemappleeggnog", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEEGGNOG))); //No Effect
	public static final RegistryObject<Item> APPLEEMERALD = ITEMS.register("itemappleemerald", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEEMERALD))); //No Effect
	public static final RegistryObject<Item> APPLEENDEREGG = ITEMS.register("itemappleenderegg", () -> new ItemAppleDamageable(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEENDEREGG).rarity(Rarity.EPIC).maxDamage(8))); //Effect
	public static final RegistryObject<Item> APPLEENDERPEARL = ITEMS.register("itemappleenderpearl", () -> new ItemAppleEnderPearl(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEENDERPEARL))); //Effect
	public static final RegistryObject<Item> APPLEEXP = ITEMS.register("itemappleexp", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEEXP))); //Effect
	public static final RegistryObject<Item> APPLEFEATHER = ITEMS.register("itemapplefeather", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEFEATHER))); //No Effect
	public static final RegistryObject<Item> APPLEFERMENTED = ITEMS.register("itemapplefermented", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEFERMENTED))); //No Effect
	public static final RegistryObject<Item> APPLEFIREBALL = ITEMS.register("itemapplefireball", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEFIREBALL))); //Effect
	public static final RegistryObject<Item> APPLEFIREWORK = ITEMS.register("itemapplefirework", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEFIREWORK))); //Effect //FINISH POTION EFFECT
	public static final RegistryObject<Item> APPLEFISH = ITEMS.register("itemapplefish", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEFISH))); //No Effect
	
	public static final RegistryObject<Item> APPLEFISHCOOKED = ITEMS.register("itemapplefishcooked", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEFISHCOOKED))); //No Effect
	public static final RegistryObject<Item> APPLEFLINT = ITEMS.register("itemappleflint", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEFLINT))); //No Effect
	public static final RegistryObject<Item> APPLEFLOWERPOT = ITEMS.register("itemappleflowerpot", () -> new ItemAppleFlowerPot(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEFLOWERPOT))); //Effect
	public static final RegistryObject<Item> APPLEGHASTTEAR = ITEMS.register("itemappleghasttear", () -> new ItemAppleGhastTear(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEGHASTTEAR))); //Effect
	/*Glistering*/public static final RegistryObject<Item> APPLESPECKLEDMELON = ITEMS.register("itemapplespeckledmelon", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLESPECKLEDMELON))); //No Effect
	public static final RegistryObject<Item> APPLEGLOWSTONE = ITEMS.register("itemappleglowstone", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEGLOWSTONE))); //No Effect
	public static final RegistryObject<Item> APPLEGLOWSTONEDUST = ITEMS.register("itemappleglowstonedust", () -> new ItemAppleNetherwart(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEGLOWSTONEDUST))); //Effect
	public static final RegistryObject<Item> APPLEGOLDNUGGET = ITEMS.register("itemapplegoldnugget", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEGOLDNUGGET))); //No Effect
	public static final RegistryObject<Item> APPLEGRASS = ITEMS.register("itemapplegrass", () -> new ItemAppleGrass(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEGRASS))); //Effect
	public static final RegistryObject<Item> APPLEGRAVEL = ITEMS.register("itemapplegravel", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEGRAVEL))); //Effect
	public static final RegistryObject<Item> APPLEGREEN = ITEMS.register("itemapplegreen", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEGREEN).rarity(Rarity.RARE))); //No Effect
	public static final RegistryObject<Item> APPLEGUNPOWDER = ITEMS.register("itemapplegunpowder", () -> new ItemAppleGunpowder(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEGUNPOWDER), 1.0F, false)); //Effect
	
	public static final RegistryObject<Item> APPLEHEART = ITEMS.register("itemappleheart", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEHEART).rarity(Rarity.UNCOMMON))); //No Effect
	public static final RegistryObject<Item> APPLEHORSEARMOR = ITEMS.register("itemapplehorsearmor", () -> new ItemAppleHorseArmor(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEHORSEARMOR))); //Effect
	public static final RegistryObject<Item> APPLEICE = ITEMS.register("itemappleice", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEICE))); //Effect
	public static final RegistryObject<Item> APPLEINVISIBLE = ITEMS.register("itemappleinvisible", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEINVISIBLE))); //No Effect
	public static final RegistryObject<Item> APPLEIRON = ITEMS.register("itemappleiron", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEIRON))); //No Effect
	public static final RegistryObject<Item> APPLELAPISLAZULI = ITEMS.register("itemapplelapislazuli", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLELAPISLAZULI))); //No Effect
	public static final RegistryObject<Item> APPLELAVA = ITEMS.register("itemapplelava", () -> new ItemAppleLava(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLELAVA).maxStackSize(1))); //Effect
	public static final RegistryObject<Item> APPLELEATHER = ITEMS.register("itemappleleather", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLELEATHER))); //No Effect
	public static final RegistryObject<Item> APPLELEAVES = ITEMS.register("itemappleleaves", () -> new ItemAppleLeaves(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLELEAVES))); //Effect
	public static final RegistryObject<Item> APPLELOOT = ITEMS.register("itemappleloot", () -> new ItemAppleLoot(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLELOOT).rarity(Rarity.UNCOMMON))); //Effect
	public static final RegistryObject<Item> APPLEMELONSLICE = ITEMS.register("itemapplemelonslice", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEMELONSLICE))); //No Effect
	
	public static final RegistryObject<Item> APPLEMELONBLOCK = ITEMS.register("itemapplemelonblock", () -> new ItemAppleMelonBlock(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEMELONBLOCK))); //Effect
	public static final RegistryObject<Item> APPLEMILK = ITEMS.register("itemapplemilk", () -> new ItemAppleMilk(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEMILK).maxStackSize(1))); //Effect
	public static final RegistryObject<Item> APPLEMINECART = ITEMS.register("itemappleminecart", () -> new ItemAppleMinecart(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEMINECART).maxDamage(8))); //Effect
	public static final RegistryObject<Item> APPLENETHERBRICK = ITEMS.register("itemapplenetherbrick", () -> new ItemAppleNetherBrick(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLENETHERBRICK))); //Effect
	public static final RegistryObject<Item> APPLENETHERRACK = ITEMS.register("itemapplenetherrack", () -> new ItemAppleNetherrack(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLENETHERRACK))); //Effect
	public static final RegistryObject<Item> APPLENETHERSTAR = ITEMS.register("itemapplenetherstar", () -> new ItemAppleDamageable(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLENETHERSTAR).rarity(Rarity.EPIC).maxDamage(8))); //No Effect
	public static final RegistryObject<Item> APPLENETHERWART = ITEMS.register("itemapplenetherwart", () -> new ItemAppleNetherwart(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLENETHERWART))); //Effect
	public static final RegistryObject<Item> APPLEPAPER = ITEMS.register("itemapplepaper", () -> new ItemApplePaper(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEPAPER))); //Effect
	public static final RegistryObject<Item> APPLEPORKCHOPCOOKED = ITEMS.register("itemappleporkchopcooked", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEPORKCHOPCOOKED))); //No Effect
	public static final RegistryObject<Item> APPLEPORKCHOPRAW = ITEMS.register("itemappleporkchopraw", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEPORKCHOPRAW))); //No Effect
	
	public static final RegistryObject<Item> APPLEPOTATOBAKED = ITEMS.register("itemapplepotatobaked", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEPOTATOBAKED))); //No Effect
	public static final RegistryObject<Item> APPLEPOTATOPOISONOUS = ITEMS.register("itemapplepotatopoisonous", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEPOTATOPOISONOUS))); //No Effect
	public static final RegistryObject<Item> APPLEPOTATORAW = ITEMS.register("itemapplepotatoraw", () -> new ItemAppleSeeds(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEPOTATORAW), "potato")); //Effect
	public static final RegistryObject<Item> APPLEPUMPKIN = ITEMS.register("itemapplepumpkin", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEPUMPKIN))); //Effect
	public static final RegistryObject<Item> APPLEPUMPKINLIT = ITEMS.register("itemapplepumpkinlit", () -> new ItemAppleEmitLight(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEPUMPKINLIT))); //Effect
	public static final RegistryObject<Item> APPLEPUMPKINPIE = ITEMS.register("itemapplepumpkinpie", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEPUMPKINPIE))); //No Effect
	public static final RegistryObject<Item> APPLEPRESENT = ITEMS.register("itemapplepresent", () -> new ItemApplePresent(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEPRESENT).rarity(Rarity.UNCOMMON))); //Effect
	public static final RegistryObject<Item> APPLEQUARTZ = ITEMS.register("itemapplequartz", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEQUARTZ))); //No Effect
	public static final RegistryObject<Item> APPLERECORD = ITEMS.register("itemapplerecord", () -> new ItemAppleRecord(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLERECORD).maxDamage(8))); //Effect
	public static final RegistryObject<Item> APPLEREDSTONE = ITEMS.register("itemappleredstone", () -> new ItemAppleNetherwart(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEREDSTONE))); //Effect
	
	public static final RegistryObject<Item> APPLEROTTENFLESH = ITEMS.register("itemapplerottenflesh", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEROTTENFLESH))); //No Effect
	public static final RegistryObject<Item> APPLERUBY = ITEMS.register("itemappleruby", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLERUBY))); //Effect
	public static final RegistryObject<Item> APPLESADDLE = ITEMS.register("itemapplesaddle", () -> new ItemAppleSaddle(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLESADDLE))); //Effect
	//public static final RegistryObject<Item> APPLESEEDS = ITEMS.register("itemappleseeds", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLESEEDS))); //Removed
	public static final RegistryObject<Item> APPLESLIMEBALL = ITEMS.register("itemappleslimeball", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLESLIMEBALL))); //Effect
	public static final RegistryObject<Item> APPLESNOWBALL = ITEMS.register("itemapplesnowball", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLESNOWBALL))); //Effect
	public static final RegistryObject<Item> APPLESOULSAND = ITEMS.register("itemapplesoulsand", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLESOULSAND))); //No Effect
	public static final RegistryObject<Item> APPLESPIDEREYE = ITEMS.register("itemapplespidereye", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLESPIDEREYE))); //No Effect
	public static final RegistryObject<Item> APPLESPONGE = ITEMS.register("itemapplesponge", () -> new ItemAppleSponge(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLESPONGE))); //Effect
	
	public static final RegistryObject<Item> APPLESTEVE = ITEMS.register("itemapplesteve", () -> new ItemAppleSteve(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLESTEVE).rarity(Rarity.RARE))); //Effect
	public static final RegistryObject<Item> APPLESTICK = ITEMS.register("itemapplestick", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLESTICK))); //No Effect
	public static final RegistryObject<Item> APPLESTONE = ITEMS.register("itemapplestone", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLESTONE))); //No Effect
	public static final RegistryObject<Item> APPLESTRING = ITEMS.register("itemapplestring", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLESTRING))); //No Effect
	public static final RegistryObject<Item> APPLESUGAR = ITEMS.register("itemapplesugar", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLESUGAR))); //No Effect
	public static final RegistryObject<Item> APPLESUGARCANE = ITEMS.register("itemapplesugarcane", () -> new ItemAppleSugarcane(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLESUGARCANE))); //Effect
	public static final RegistryObject<Item> APPLETNT = ITEMS.register("itemappletnt", () -> new ItemAppleGunpowder(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLETNT), 5.0F, false)); //Effect
	
	public static final RegistryObject<Item> APPLEUNDYING = ITEMS.register("itemappleundying", () -> new ItemAppleDamageable(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEUNDYING).maxDamage(8))); //Effect
	
	public static final RegistryObject<Item> APPLEULTIMATE = ITEMS.register("itemappleultimate", () -> new ItemAppleUltimate(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEULTIMATE).rarity(Rarity.EPIC))); //No Effect //CURRENTLY...
	public static final RegistryObject<Item> APPLEVANISHING = ITEMS.register("itemapplevanishing", () -> new ItemAppleEnchanted(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEVANISHING))); //Effect
	public static final RegistryObject<Item> APPLEWATER = ITEMS.register("itemapplewater", () -> new ItemAppleWater(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEWATER).maxStackSize(1))); //Effect //NOTE: Implement waterlogging for campfire
	public static final RegistryObject<Item> APPLEWHEAT = ITEMS.register("itemapplewheat", () -> new ItemAppleSeeds(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEWHEAT), "wheat")); //Effect
	public static final RegistryObject<Item> APPLEWITCH = ITEMS.register("itemapplewitch", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEWITCH).maxStackSize(1))); //Effect
	
	public static final RegistryObject<Item> APPLEWOOD = ITEMS.register("itemapplewood", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEWOOD))); //No Effect
	public static final RegistryObject<Item> APPLEWOOL = ITEMS.register("itemapplewool", () -> new ItemAppleWool(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEWOOL)));
	public static final RegistryObject<Item> APPLEZOMBIE = ITEMS.register("itemapplezombie", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEZOMBIE))); //Effect
	public static final RegistryObject<Item> APPLE4BIT = ITEMS.register("itemapple4bit", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLE4BIT))); //No Effect
	public static final RegistryObject<Item> APPLE8BIT = ITEMS.register("itemapple8bit", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLE8BIT))); //No Effect
	public static final RegistryObject<Item> APPLE32BIT = ITEMS.register("itemapple32bit", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLE32BIT))); //No Effect
	public static final RegistryObject<Item> APPLE64BIT = ITEMS.register("itemapple64bit", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLE64BIT).rarity(Rarity.RARE))); //No Effect

	/** Food Items **/
	public static final RegistryObject<Item> APPLEJUICE = ITEMS.register("itemapplejuice", () -> new ItemAppleJuice(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEJUICE))); //No Effect
	public static final RegistryObject<Item> APPLECIDER = ITEMS.register("itemapplecider", () -> new ItemAppleJuice(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLECIDER))); //No Effect
	public static final RegistryObject<Item> APPLESAUCE = ITEMS.register("itemapplesauce", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLESAUCE))); //No Effect
	public static final RegistryObject<Item> APPLEPIE = ITEMS.register("itemapplepie", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEPIE))); //No Effect
	
	/** Crafting Materials **/
	public static final RegistryObject<Item> MUGMAGIC = ITEMS.register("itemmugmagic", () -> new ItemBottleMagic(new Properties().group(Group.APPLE_GROUP)));
	public static final RegistryObject<Item> RUBY = ITEMS.register("itemruby", () -> new Item(new Properties().group(Group.APPLE_GROUP)));
	public static final RegistryObject<Item> BEDROCKFRAGMENT = ITEMS.register("itembedrockfragment", () -> new Item(new Properties().group(Group.APPLE_GROUP)));
	
	/** Tools **/
	public static final RegistryObject<Item> BEDROCKAXE = ITEMS.register("itembedrockaxe", () -> new AxeItem(ToolTier.BEDROCK, 5.0F, -3.0F, new Properties().group(Group.APPLE_GROUP)));
	public static final RegistryObject<Item> BEDROCKHOE = ITEMS.register("itembedrockhoe", () -> new HoeItem(ToolTier.BEDROCK, -3, 0.0F, new Properties().group(Group.APPLE_GROUP)));
	public static final RegistryObject<Item> BEDROCKPICKAXE = ITEMS.register("itembedrockpickaxe", () -> new PickaxeItem(ToolTier.BEDROCK, 1, -2.8F, new Properties().group(Group.APPLE_GROUP)));
	public static final RegistryObject<Item> BEDROCKSHOVEL = ITEMS.register("itembedrockshovel", () -> new ShovelItem(ToolTier.BEDROCK, 1.5F, -3.0F, new Properties().group(Group.APPLE_GROUP)));
	public static final RegistryObject<Item> BEDROCKSWORD = ITEMS.register("itembedrocksword", () -> new SwordItem(ToolTier.BEDROCK, 3, -2.4F, new Properties().group(Group.APPLE_GROUP)));
	public static final RegistryObject<Item> RUBYAXE = ITEMS.register("itemrubyaxe", () -> new AxeItem(ToolTier.RUBY, 5.0F, -2.7F, new Properties().group(Group.APPLE_GROUP)));
	public static final RegistryObject<Item> RUBYHOE = ITEMS.register("itemrubyhoe", () -> new HoeItem(ToolTier.RUBY, -3, 1.0F, new Properties().group(Group.APPLE_GROUP)));
	public static final RegistryObject<Item> RUBYPICKAXE = ITEMS.register("itemrubypickaxe", () -> new PickaxeItem(ToolTier.RUBY, 1, -2.6F, new Properties().group(Group.APPLE_GROUP)));
	public static final RegistryObject<Item> RUBYSHOVEL = ITEMS.register("itemrubyshovel", () -> new ShovelItem(ToolTier.RUBY, 1.5F, -2.8F, new Properties().group(Group.APPLE_GROUP)));
	public static final RegistryObject<Item> RUBYSWORD = ITEMS.register("itemrubysword", () -> new SwordItem(ToolTier.RUBY, 3, -2.1F, new Properties().group(Group.APPLE_GROUP)));
	
	/* BEGIN NEW STUFF */
	
	// NEW APPLES, WILL NEED TO BE SORTED ONCE IMPLEMENTED
	
	//public static final RegistryObject<Item> APPLEBLACKCONCRETE = ITEMS.register("itemappleblackconcrete", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEBLACKCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEBLACKGLASS = ITEMS.register("itemappleblackglass", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEBLACKGLASS))); //No Effect
	//public static final RegistryObject<Item> APPLEBLACKPOWDEREDCONCRETE = ITEMS.register("itemappleblackpowderedconcrete", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEBLACKPOWDEREDCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEBLACKSHULKER = ITEMS.register("itemappleblackshulker", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEBLACKSHULKER))); //No Effect
	//public static final RegistryObject<Item> APPLEBLACKSTONE = ITEMS.register("itemappleblackstone", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEBLACKSTONE))); //No Effect
	//**public static final RegistryObject<Item> APPLEBLASTFURNACE = ITEMS.register("itemappleblastfurnace", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEBLASTFURNACE))); //No Effect
	//public static final RegistryObject<Item> APPLEBLUECONCRETE = ITEMS.register("itemappleblueconcrete", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEBLUECONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEBLUEGLASS = ITEMS.register("itemappleblueglass", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEBLUEGLASS))); //No Effect
	//public static final RegistryObject<Item> APPLEBLUEPOWDEREDCONCRETE = ITEMS.register("itemapplebluepowderedconcrete", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEBLUEPOWDEREDCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEBLUESHULKER = ITEMS.register("itemappleblueshulker", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEBLUESHULKER))); //No Effect
	//public static final RegistryObject<Item> APPLEBROWNCONCRETE = ITEMS.register("itemapplebrownconcrete", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEBROWNCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEBROWNGLASS = ITEMS.register("itemapplebrownglass", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEBROWNGLASS))); //No Effect
	//public static final RegistryObject<Item> APPLEBROWNPOWDEREDCONCRETE = ITEMS.register("itemapplebrownpowderedconcrete", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEBROWNPOWDEREDCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEBROWNSHULKER = ITEMS.register("itemapplebrownshulker", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEBROWNSHULKER))); //No Effect
	
	
	//public static final RegistryObject<Item> APPLECAMPFIRE = ITEMS.register("itemapplecampfire", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLECAMPFIRE))); //No Effect
	//public static final RegistryObject<Item> APPLECHORUS = ITEMS.register("itemapplechorus", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLECHORUS))); //No Effect
	//public static final RegistryObject<Item> APPLECOMPASS = ITEMS.register("itemapplecompass", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLECOMPASS))); //No Effect
	//public static final RegistryObject<Item> APPLECONDUIT = ITEMS.register("itemappleconduit", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLECONDUIT))); //No Effect
	//public static final RegistryObject<Item> APPLECORAL = ITEMS.register("itemapplecoral", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLECORAL))); //No Effect
	//public static final RegistryObject<Item> APPLECRAFTING = ITEMS.register("itemapplecrafting", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLECRAFTING))); //No Effect
	//public static final RegistryObject<Item> APPLECRYINGOBSIDIAN = ITEMS.register("itemapplecryingobsidian", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLECRYINGOBSIDIAN))); //No Effect
	//public static final RegistryObject<Item> APPLECYANCONCRETE = ITEMS.register("itemapplecyanconcrete", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLECYANCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLECYANGLASS = ITEMS.register("itemapplecyanglass", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLECYANGLASS))); //No Effect
	//public static final RegistryObject<Item> APPLECYANPOWDEREDCONCRETE = ITEMS.register("itemapplecyanpowderedconcrete", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLECYANPOWDEREDCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLECYANSHULKER = ITEMS.register("itemapplecyanshulker", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLECYANSHULKER))); //No Effect
	//public static final RegistryObject<Item> APPLEDRAGONSBREATH = ITEMS.register("itemappledragonsbreath", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEDRAGONSBREATH))); //No Effect
	//public static final RegistryObject<Item> APPLEENDCRYSTAL = ITEMS.register("itemappleendcrystal", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEENDCRYSTAL))); //No Effect
	//public static final RegistryObject<Item> APPLEENDERCHEST = ITEMS.register("itemappleenderchest", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEENDERCHEST))); //No Effect
	//public static final RegistryObject<Item> APPLEENDEREYE = ITEMS.register("itemappleendereye", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEENDEREYE))); //No Effect
	//public static final RegistryObject<Item> APPLEFLOWERS = ITEMS.register("itemappleflowers", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEFLOWERS))); //No Effect
	
	//public static final RegistryObject<Item> APPLEFURNACE = ITEMS.register("itemapplefurnace", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEFURNACE))); //No Effect
	//public static final RegistryObject<Item> APPLEGILDEDBLACKSTONE = ITEMS.register("itemapplegildedblackstone", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEGILDEDBLACKSTONE))); //No Effect
	//public static final RegistryObject<Item> APPLEGRAYCONCRETE = ITEMS.register("itemapplegrayconcrete", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEGRAYCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEGRAYGLASS = ITEMS.register("itemapplegrayglass", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEGRAYGLASS))); //No Effect
	//public static final RegistryObject<Item> APPLEGRAYPOWDEREDCONCRETE = ITEMS.register("itemapplegraypowderedconcrete", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEGRAYPOWDEREDCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEGRAYSHULKER = ITEMS.register("itemapplegrayshulker", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEGRAYSHULKER))); //No Effect
	//public static final RegistryObject<Item> APPLEGREENCONCRETE = ITEMS.register("itemapplegreenconcrete", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEGREENCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEGREENGLASS = ITEMS.register("itemapplegreenglass", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEGREENGLASS))); //No Effect
	//public static final RegistryObject<Item> APPLEGREENPOWDEREDCONCRETE = ITEMS.register("itemapplegreenpowderedconcrete", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEGREENPOWDEREDCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEGREENSHULKER = ITEMS.register("itemapplegreenshulker", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEGREENSHULKER))); //No Effect
	//public static final RegistryObject<Item> APPLEHONEY = ITEMS.register("itemapplehoney", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEHONEY))); //No Effect
	//public static final RegistryObject<Item> APPLEHOPPER = ITEMS.register("itemapplehopper", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEHOPPER))); //No Effect
	//**public static final RegistryObject<Item> APPLELAMB = ITEMS.register("itemapplelamb", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLELAMB))); //No Effect
	//**public static final RegistryObject<Item> APPLELAMBRAW = ITEMS.register("itemapplelambraw", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLELAMBRAW))); //No Effect
	//public static final RegistryObject<Item> APPLELANTERN = ITEMS.register("itemapplelantern", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLELANTERN))); //No Effect
	//public static final RegistryObject<Item> APPLELIGHTBLUECONCRETE = ITEMS.register("itemapplelightblueconcrete", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLELIGHTBLUECONCRETE))); //No Effect
	
	//public static final RegistryObject<Item> APPLELIGHTBLUEGLASS = ITEMS.register("itemapplelightblueglass", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLELIGHTBLUEGLASS))); //No Effect
	//public static final RegistryObject<Item> APPLELIGHTBLUEPOWDEREDCONCRETE = ITEMS.register("itemapplelightbluepowderedconcrete", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLELIGHTBLUEPOWDEREDCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLELIGHTBLUESHULKER = ITEMS.register("itemapplelightblueshulker", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLELIGHTBLUESHULKER))); //No Effect
	//public static final RegistryObject<Item> APPLELIGHTGRAYCONCRETE = ITEMS.register("itemapplelightgrayconcrete", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLELIGHTGRAYCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLELIGHTGRAYGLASS = ITEMS.register("itemapplelightgrayglass", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLELIGHTGRAYGLASS))); //No Effect
	//public static final RegistryObject<Item> APPLELIGHTGRAYPOWDEREDCONCRETE = ITEMS.register("itemapplelightgraypowderedconcrete", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLELIGHTGRAYPOWDEREDCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLELIGHTGRAYSHULKER = ITEMS.register("itemapplelightgrayshulker", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLELIGHTGRAYSHULKER))); //No Effect
	//public static final RegistryObject<Item> APPLELIMECONCRETE = ITEMS.register("itemapplelimeconcrete", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLELIMECONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLELIMEGLASS = ITEMS.register("itemapplelimeglass", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLELIMEGLASS))); //No Effect
	//public static final RegistryObject<Item> APPLELIMEPOWDEREDCONCRETE = ITEMS.register("itemapplelimepowderedconcrete", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLELIMEPOWDEREDCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLELIMESHULKER = ITEMS.register("itemapplelimeshulker", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLELIMESHULKER))); //No Effect
	//public static final RegistryObject<Item> APPLELOADSTONE = ITEMS.register("itemappleloadstone", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLELOADSTONE))); //No Effect
	//public static final RegistryObject<Item> APPLEMAGENTACONCRETE = ITEMS.register("itemapplemagentaconcrete", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEMAGENTACONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEMAGENTAGLASS = ITEMS.register("itemapplemagentaglass", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEMAGENTAGLASS))); //No Effect
	//public static final RegistryObject<Item> APPLEMAGENTAPOWDEREDCONCRETE = ITEMS.register("itemapplemagentapowderedconcrete", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEMAGENTAPOWDEREDCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEMAGENTASHULKER = ITEMS.register("itemapplemagentashulker", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEMAGENTASHULKER))); //No Effect
	
	//public static final RegistryObject<Item> APPLEMAGMA = ITEMS.register("itemapplemagma", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEMAGMA))); //No Effect
	//public static final RegistryObject<Item> APPLEMEMBRANE = ITEMS.register("itemapplemembrane", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEMEMBRANE))); //No Effect
	//public static final RegistryObject<Item> APPLENETHERRITE = ITEMS.register("itemapplenetherrite", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLENETHERRITE))); //No Effect
	//public static final RegistryObject<Item> APPLEOBSIDIAN = ITEMS.register("itemappleobsidian", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEOBSIDIAN))); //No Effect
	//public static final RegistryObject<Item> APPLEORANGECONCRETE = ITEMS.register("itemappleorangeconcrete", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEORANGECONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEORANGEGLASS = ITEMS.register("itemappleorangeglass", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEORANGEGLASS))); //No Effect
	//public static final RegistryObject<Item> APPLEORANGEPOWDEREDCONCRETE = ITEMS.register("itemappleorangepowderedconcrete", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEORANGEPOWDEREDCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEORANGESHULKER = ITEMS.register("itemappleorangeshulker", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEORANGESHULKER))); //No Effect
	//public static final RegistryObject<Item> APPLEPIGSTEP = ITEMS.register("itemapplepigstep", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEPIGSTEP))); //No Effect
	//public static final RegistryObject<Item> APPLEPINKCONCRETE = ITEMS.register("itemapplepinkconcrete", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEPINKCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEPINKGLASS = ITEMS.register("itemapplepinkglass", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEPINKGLASS))); //No Effect
	
	//public static final RegistryObject<Item> APPLEPINKPOWDEREDCONCRETE = ITEMS.register("itemapplepinkpowderedconcrete", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEPINKPOWDEREDCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEPINKSHULKER = ITEMS.register("itemapplepinkshulker", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEPINKSHULKER))); //No Effect
	//public static final RegistryObject<Item> APPLEPRISMARINE = ITEMS.register("itemappleprismarine", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEPRISMARINE))); //No Effect
	//public static final RegistryObject<Item> APPLEPURPLECONCRETE = ITEMS.register("itemapplepurpleconcrete", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEPURPLECONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEPURPLEGLASS = ITEMS.register("itemapplepurpleglass", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEPURPLEGLASS))); //No Effect
	//public static final RegistryObject<Item> APPLEPURPLEPOWDEREDCONCRETE = ITEMS.register("itemapplepurplepowderedconcrete", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEPURPLEPOWDEREDCONCRETE))); //No Effect
	
	//public static final RegistryObject<Item> APPLEPURPLESHULKER = ITEMS.register("itemapplepurpleshulker", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEPURPLESHULKER))); //No Effect
	//**public static final RegistryObject<Item> APPLERABBIT = ITEMS.register("itemapplerabbit", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLERABBIT))); //No Effect
	//**public static final RegistryObject<Item> APPLERABBITRAW = ITEMS.register("itemapplerabbitraw", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLERABBITRAW))); //No Effect
	//public static final RegistryObject<Item> APPLEREDCONCRETE = ITEMS.register("itemappleredconcrete", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEREDCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEREDGLASS = ITEMS.register("itemappleredglass", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEREDGLASS))); //No Effect
	//public static final RegistryObject<Item> APPLEREDPOWDEREDCONCRETE = ITEMS.register("itemappleredpowderedconcrete", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEREDPOWDEREDCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEREDSHULKER = ITEMS.register("itemappleredshulker", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEREDSHULKER))); //No Effect
	//public static final RegistryObject<Item> APPLETARGET = ITEMS.register("itemappletarget", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLETARGET))); //No Effect
	
	//public static final RegistryObject<Item> APPLEWHITECONCRETE = ITEMS.register("itemapplewhiteconcrete", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEWHITECONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEWHITEGLASS = ITEMS.register("itemapplewhiteglass", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEWHITEGLASS))); //No Effect
	//public static final RegistryObject<Item> APPLEWHITEPOWDEREDCONCRETE = ITEMS.register("itemapplewhitepowderedconcrete", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEWHITEPOWDEREDCONCRETE))); //No Effect
	
	//public static final RegistryObject<Item> APPLEWHITESHULKER = ITEMS.register("itemapplewhiteshulker", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEWHITESHULKER))); //No Effect
	//public static final RegistryObject<Item> APPLEWITHER = ITEMS.register("itemapplewither", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEWITHER))); //No Effect
	//public static final RegistryObject<Item> APPLEWITHERROSE = ITEMS.register("itemapplewitherrose", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEWITHERROSE))); //No Effect
	//public static final RegistryObject<Item> APPLEYELLOWCONCRETE = ITEMS.register("itemappleyellowconcrete", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEYELLOWCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEYELLOWGLASS = ITEMS.register("itemappleyellowglass", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEYELLOWGLASS))); //No Effect
	//public static final RegistryObject<Item> APPLEYELLOWPOWDEREDCONCRETE = ITEMS.register("itemappleyellowpowderedconcrete", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEYELLOWPOWDEREDCONCRETE))); //No Effect
	//public static final RegistryObject<Item> APPLEYELLOWSHULKER = ITEMS.register("itemappleyellowshulker", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEYELLOWSHULKER))); //No Effect
	
	//**public static final RegistryObject<Item> ENCHANTEDAPPLEBLASTFURNACE = ITEMS.register("itemenchantedappleblastfurnace", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.ENCHANTEDAPPLEBLASTFURNACE))); //No Effect
	//public static final RegistryObject<Item> ENCHANTEDAPPLECAMPFIRE = ITEMS.register("itemenchantedapplecampfire", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.ENCHANTEDAPPLECAMPFIRE))); //No Effect
	//public static final RegistryObject<Item> ENCHANTEDAPPLECRAFTING = ITEMS.register("itemenchantedapplecrafting", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.ENCHANTEDAPPLECRAFTING))); //No Effect
	//public static final RegistryObject<Item> ENCHANTEDAPPLEENDERCHEST = ITEMS.register("itemenchantedappleenderchest", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.ENCHANTEDAPPLEENDERCHEST))); //No Effect
	//public static final RegistryObject<Item> ENCHANTEDAPPLEFURNACE = ITEMS.register("itemenchantedapplefurnace", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.ENCHANTEDAPPLEFURNACE))); //No Effect
	//public static final RegistryObject<Item> ENCHANTEDAPPLEGLASS = ITEMS.register("itemenchantedappleglass", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.ENCHANTEDAPPLEGLASS))); //No Effect
	//public static final RegistryObject<Item> ENCHANTEDAPPLESOULSAND = ITEMS.register("itemenchantedapplesoulsand", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.ENCHANTEDAPPLESOULSAND))); //No Effect
	//public static final RegistryObject<Item> ENCHANTEDAPPLESPIDEREYE = ITEMS.register("itemenchantedapplespidereye", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.ENCHANTEDAPPLESPIDEREYE))); //No Effect
	//public static final RegistryObject<Item> ENCHANTEDAPPLETNT = ITEMS.register("itemenchantedappletnt", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.ENCHANTEDAPPLETNT))); //No Effect
	
	//public static final RegistryObject<Item> FUNGUSAPPLE = ITEMS.register("itemfungusapple", () -> new Item(new Properties().group(Group.APPLE_GROUP))); //No Effect
	
    /* END NEW STUFF */
	
	/* private static RegistryObject<Item> register(String string, Item item) {
		
		return ITEMS.register(string, () -> item);
		
	} */

}
