package com.apples.items;

import com.apples.Group;
import com.apples.Main;

import net.minecraft.item.AxeItem;
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

	//public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Main.MODID);
	
	/** Apples **/
	public static final RegistryObject<Item> APPLEAPPLE = ITEMS.register("itemappleapple", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEAPPLE))); //No Effect
	public static final RegistryObject<Item> APPLEANVIL = ITEMS.register("itemappleanvil", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEANVIL))); //Effect
	public static final RegistryObject<Item> APPLEARROW = ITEMS.register("itemapplearrow", () -> new ItemAppleArrow(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEARROW))); //Effect
	public static final RegistryObject<Item> APPLEBAT = ITEMS.register("itemapplebat", () -> new ItemAppleBat(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEBAT))); //Effect
	public static final RegistryObject<Item> APPLEBEACON = ITEMS.register("itemapplebeacon", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEBEACON).rarity(Rarity.EPIC))); //Effect
	public static final RegistryObject<Item> APPLEBED = ITEMS.register("itemapplebed", () -> new ItemAppleBed(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEBED))); //Effect
	public static final RegistryObject<Item> APPLEBEDROCK = ITEMS.register("itemapplebedrock", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEBEDROCK).rarity(Rarity.UNCOMMON))); //No Effect
	public static final RegistryObject<Item> APPLEBLAZEROD = ITEMS.register("itemappleblazerod", () -> new ItemAppleBlazerod(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEBLAZEROD))); //Effect
	public static final RegistryObject<Item> APPLEBONE = ITEMS.register("itemapplebone", () -> new ItemAppleBone(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEBONE))); //Effect
	public static final RegistryObject<Item> APPLEBOOK = ITEMS.register("itemapplebook", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEBOOK))); //No Effect
	
	public static final RegistryObject<Item> APPLEBREAD = ITEMS.register("itemapplebread", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEBREAD))); //No Effect
	public static final RegistryObject<Item> APPLEBRICK = ITEMS.register("itemapplebrick", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEBRICK))); //No Effect
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
	public static final RegistryObject<Item> APPLECOBWEB = ITEMS.register("itemapplecobweb", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLECOBWEB))); //Effect
	public static final RegistryObject<Item> APPLECOOKIE = ITEMS.register("itemapplecookie", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLECOOKIE))); //No Effect
	public static final RegistryObject<Item> APPLECREEPER = ITEMS.register("itemapplecreeper", () -> new ItemAppleCreeper(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLECREEPER))); //Effect
	public static final RegistryObject<Item> APPLECURSED = ITEMS.register("itemapplecursed", () -> new ItemAppleCursed(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLECURSED).rarity(Rarity.UNCOMMON))); //Effect
	public static final RegistryObject<Item> APPLEDIAMOND = ITEMS.register("itemapplediamond", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEDIAMOND))); //Effect
	public static final RegistryObject<Item> APPLEDIRT = ITEMS.register("itemappledirt", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEDIRT))); //No Effect
	public static final RegistryObject<Item> APPLEEATEN = ITEMS.register("itemappleeaten", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEEATEN).rarity(Rarity.EPIC))); //No Effect
	public static final RegistryObject<Item> APPLEEGG = ITEMS.register("itemappleegg", () -> new ItemAppleEgg(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEEGG))); //Effect
	
	public static final RegistryObject<Item> APPLEEGGNOG = ITEMS.register("itemappleeggnog", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEEGGNOG))); //No Effect
	public static final RegistryObject<Item> APPLEEMERALD = ITEMS.register("itemappleemerald", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEEMERALD))); //No Effect
	public static final RegistryObject<Item> APPLEENDEREGG = ITEMS.register("itemappleenderegg", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEENDEREGG).rarity(Rarity.EPIC))); //Effect
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
	public static final RegistryObject<Item> APPLELAVA = ITEMS.register("itemapplelava", () -> new ItemAppleLava(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLELAVA))); //Effect
	public static final RegistryObject<Item> APPLELEATHER = ITEMS.register("itemappleleather", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLELEATHER))); //No Effect
	public static final RegistryObject<Item> APPLELEAVES = ITEMS.register("itemappleleaves", () -> new ItemAppleLeaves(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLELEAVES))); //Effect
	public static final RegistryObject<Item> APPLELOOT = ITEMS.register("itemappleloot", () -> new ItemAppleLoot(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLELOOT).rarity(Rarity.UNCOMMON))); //Effect
	public static final RegistryObject<Item> APPLEMELONSLICE = ITEMS.register("itemapplemelonslice", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEMELONSLICE))); //No Effect
	
	public static final RegistryObject<Item> APPLEMELONBLOCK = ITEMS.register("itemapplemelonblock", () -> new ItemAppleMelonBlock(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEMELONBLOCK))); //Effect
	public static final RegistryObject<Item> APPLEMILK = ITEMS.register("itemapplemilk", () -> new ItemAppleMilk(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEMILK))); //Effect
	public static final RegistryObject<Item> APPLEMINECART = ITEMS.register("itemappleminecart", () -> new ItemAppleMinecart(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEMINECART))); //Effect
	public static final RegistryObject<Item> APPLENETHERBRICK = ITEMS.register("itemapplenetherbrick", () -> new ItemAppleNetherBrick(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLENETHERBRICK))); //Effect
	public static final RegistryObject<Item> APPLENETHERRACK = ITEMS.register("itemapplenetherrack", () -> new ItemAppleNetherrack(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLENETHERRACK))); //Effect
	public static final RegistryObject<Item> APPLENETHERSTAR = ITEMS.register("itemapplenetherstar", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLENETHERSTAR).rarity(Rarity.EPIC))); //No Effect
	public static final RegistryObject<Item> APPLENETHERWART = ITEMS.register("itemapplenetherwart", () -> new ItemAppleNetherwart(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLENETHERWART))); //Effect
	public static final RegistryObject<Item> APPLEPAPER = ITEMS.register("itemapplepaper", () -> new ItemApplePaper(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEPAPER))); //Effect
	public static final RegistryObject<Item> APPLEPORKCHOPCOOKED = ITEMS.register("itemappleporkchopcooked", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEPORKCHOPCOOKED))); //No Effect
	public static final RegistryObject<Item> APPLEPORKCHOPRAW = ITEMS.register("itemappleporkchopraw", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEPORKCHOPRAW))); //No Effect
	
	public static final RegistryObject<Item> APPLEPOTATOBAKED = ITEMS.register("itemapplepotatobaked", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEPOTATOBAKED))); //No Effect
	public static final RegistryObject<Item> APPLEPOTATOPOISONOUS = ITEMS.register("itemapplepotatopoisonous", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEPOTATOPOISONOUS))); //No Effect
	public static final RegistryObject<Item> APPLEPOTATORAW = ITEMS.register("itemapplepotatoraw", () -> new ItemAppleSeeds(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEPOTATORAW), "potato")); //Effect
	public static final RegistryObject<Item> APPLEPUMPKIN = ITEMS.register("itemapplepumpkin", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEPUMPKIN))); //Effect
	public static final RegistryObject<Item> APPLEPUMPKINLIT = ITEMS.register("itemapplepumpkinlit", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEPUMPKINLIT))); //No Effect //Removed custom effect do to performance issues
	public static final RegistryObject<Item> APPLEPUMPKINPIE = ITEMS.register("itemapplepumpkinpie", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEPUMPKINPIE))); //No Effect
	public static final RegistryObject<Item> APPLEPRESENT = ITEMS.register("itemapplepresent", () -> new ItemApplePresent(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEPRESENT).rarity(Rarity.UNCOMMON))); //Effect
	public static final RegistryObject<Item> APPLEQUARTZ = ITEMS.register("itemapplequartz", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEQUARTZ))); //No Effect
	public static final RegistryObject<Item> APPLERECORD = ITEMS.register("itemapplerecord", () -> new ItemAppleRecord(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLERECORD))); //Effect
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
	public static final RegistryObject<Item> APPLEWATER = ITEMS.register("itemapplewater", () -> new ItemAppleWater(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEWATER))); //Effect //NOTE: Implement waterlogging for campfire
	public static final RegistryObject<Item> APPLEWHEAT = ITEMS.register("itemapplewheat", () -> new ItemAppleSeeds(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEWHEAT), "wheat")); //Effect
	public static final RegistryObject<Item> APPLEWITCH = ITEMS.register("itemapplewitch", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEWITCH))); //Effect
	
	public static final RegistryObject<Item> APPLEWOOD = ITEMS.register("itemapplewood", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEWOOD))); //No Effect
	public static final RegistryObject<Item> APPLEWOOL = ITEMS.register("itemapplewool", () -> new ItemAppleWool(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEWOOL)));
	public static final RegistryObject<Item> APPLEZOMBIE = ITEMS.register("itemapplezombie", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEZOMBIE))); //Effect
	public static final RegistryObject<Item> APPLE4BIT = ITEMS.register("itemapple4bit", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLE4BIT))); //No Effect
	public static final RegistryObject<Item> APPLE8BIT = ITEMS.register("itemapple8bit", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLE8BIT))); //No Effect
	public static final RegistryObject<Item> APPLE32BIT = ITEMS.register("itemapple32bit", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLE32BIT))); //No Effect
	public static final RegistryObject<Item> APPLE64BIT = ITEMS.register("itemapple64bit", () -> new Item(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLE64BIT).rarity(Rarity.RARE))); //No Effect
	
	public static final RegistryObject<Item> APPLEULTIMATE = ITEMS.register("itemappleultimate", () -> new ItemAppleUltimate(new Properties().group(Group.APPLE_GROUP).food(FoodLoader.APPLEULTIMATE).rarity(Rarity.EPIC))); //No Effect //CURRENTLY...
	
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
	public static final RegistryObject<Item> BEDROCKHOE = ITEMS.register("itembedrockhoe", () -> new HoeItem(ToolTier.BEDROCK, 0.0F, new Properties().group(Group.APPLE_GROUP)));
	public static final RegistryObject<Item> BEDROCKPICKAXE = ITEMS.register("itembedrockpickaxe", () -> new PickaxeItem(ToolTier.BEDROCK, 1, -2.8F, new Properties().group(Group.APPLE_GROUP)));
	public static final RegistryObject<Item> BEDROCKSHOVEL = ITEMS.register("itembedrockshovel", () -> new ShovelItem(ToolTier.BEDROCK, 1.5F, -3.0F, new Properties().group(Group.APPLE_GROUP)));
	public static final RegistryObject<Item> BEDROCKSWORD = ITEMS.register("itembedrocksword", () -> new SwordItem(ToolTier.BEDROCK, 3, -2.4F, new Properties().group(Group.APPLE_GROUP)));
	public static final RegistryObject<Item> RUBYAXE = ITEMS.register("itemrubyaxe", () -> new AxeItem(ToolTier.RUBY, 5.0F, -2.7F, new Properties().group(Group.APPLE_GROUP)));
	public static final RegistryObject<Item> RUBYHOE = ITEMS.register("itemrubyhoe", () -> new HoeItem(ToolTier.RUBY, 1.0F, new Properties().group(Group.APPLE_GROUP)));
	public static final RegistryObject<Item> RUBYPICKAXE = ITEMS.register("itemrubypickaxe", () -> new PickaxeItem(ToolTier.RUBY, 1, -2.6F, new Properties().group(Group.APPLE_GROUP)));
	public static final RegistryObject<Item> RUBYSHOVEL = ITEMS.register("itemrubyshovel", () -> new ShovelItem(ToolTier.RUBY, 1.5F, -2.8F, new Properties().group(Group.APPLE_GROUP)));
	public static final RegistryObject<Item> RUBYSWORD = ITEMS.register("itemrubysword", () -> new SwordItem(ToolTier.RUBY, 3, -2.1F, new Properties().group(Group.APPLE_GROUP)));

}
