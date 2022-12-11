package com.apples;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.apples.blocks.BlockLoader;
import com.apples.config.Config;
import com.apples.entity.EntityLoader;
import com.apples.items.ItemLoader;
import com.apples.network.PacketHandler;
import com.apples.potions.PotionCrafting;
import com.apples.potions.PotionLoader;
import com.apples.tileentity.TileEntityLoader;

/**
 * 
 * 	Update the mods.toml file!
 * 
 * **/

@SuppressWarnings("deprecation")
@Mod(Main.MODID)
public class Main {

	public static final String MODID = "apples";
	
    public static final Logger LOGGER = LogManager.getLogger();
    
    /**
     * 	TO DO
     * 
     * 	empty/container/(functionally a fillable apple that can be used to capture mobs and resources)
     * 	ex: Could be used in negative y values to capture void air to create a void apple.  Would coinside well with an update to allow bedrock picks to break bedrock.
     * 
     *  ultimate apple should have a crafting recipe of bottles of magic surrounding an apple
     *  ultimate apple should start in an inactive state, to activate you have to add every single apple to it
     * 
     *  remove the unique effect from the netherwart, glowstone dust, and redstone apples and place the effect on to enchanted versions of those apples.
     * 
     *  damageable apples can be enchanted, maybe look into???
     *  damageable apples do not apply potion effects or food values properly, check itemappledamageable for reference for potential fix
     * 
     * 	change apples to 8+ use system if they would benefit
     * 	make rocket apple turn player into rocket (modify player position/angle/yaw etc.)
     * 	creature apples could turn the player into the creature type of the apple (change model/functionality)
     * 
     *  make apples made of fuels burnable
     *  make apple pie model textures for placement
     *  add campfire extinguish to water bucket apple, turn magma blocks into netherrack, maybe more...
     *  finish ultimate apple
     *  add ruby and bedrock ore to both use ORE forge tags
     *  have the rotten flesh apple stop zombies from targeting the player.
     *  bedrock pick should be able to break bedrock for fragments
     *  
     *  allow soul soil to be used to craft soul sand apple
     *  
     *  split fortune effect into multiple effects and give each effect multiple levels for length & %chance to occur
     *  
     *  Possibly make blazerod apple stop targeting from blazes? Enchanted version?
     *  
     *  Unorganized Apples:
     *  
     *  Obsidian - Blast Protection
     *  Crying Obsidian - ???
     *  Gilded Blackstone - Makes piglins not attack the player for not wearing golden armor
     *  Blackstone (craftable with all blackstone variants) - negative effect, enchanted variant gives fortune for nether materials!
     *  concrete + powdered variants (all colors?) - not sure on effect, just want to be able to throw powered apple into water and make the hardened version!
     *  Crimson+Warped Fungus - not an apple but rather a magical shroomy apple seed/sappling which can be used to farm apples
     *  shulker box (all colors?) - like a shulker shell but just opened with item instead, non consumable, maybe you can shift click to eat and destroy everything
     *  colored glass apple (all colors?) - effect... not sure
     *  coral apple - water breathing, maybe other water related effects
     *  wither skull apple - wither immunity, maybe tiny chance to spawn wither skelly/wither
     *  bee nest/bee hive - spawn angry bees when attacked, maybe target attacker
     *  ender crystal - spawn ender dragon
     *  target - make mobs target you?
     *  conduit - works just like the beacon apple but with conduit abilities
     *  netherrite - fortune but for netherrite and bedrock ore
     *  prismarine crystal - ???
     *  chorus fruit - ???
     *  pigstep - plays pigstep (free?)
     *  honey, honey bottle - makes you stick to blocks like honey
     *  meat + other foods - just make the rest of the food items into apples
     *  compass apple - gives cords for compass heading
     *  dragons breath - ???
     *  phantom membrane - ???
     *  hopper apple - drop everything in your inventory
     *  lodestone - ???
     *  wither rose - contacting mobs gives wither? attacking mobs gives wither?
     *  flowers - make bees friendly
     *  lantern - emit some light or something
     *  enchanted soul sand apple - soul speed effect
     *  magma block - float in water, do what ever the boat does to float
     *  
     *  Apples:
     *  
     *  ** = kind of hmm, other options maybe?
     *  
     *  **Blast Furnace Apple - Smelts one stack of ore on the hotbar.
     *  Bucket Apple - Crafted, returned to player after using lava apple, water apple, etc. Can right click to fill with that fluid.
     *  Campfire Apple (also blue campfire for craft) - Smelts one stack of food on the hotbar
     *  Ender Eye Apple - Finds stronghold
     *  
     *  **Chest Apple - One time chest access, drops contents on ground when leaving ui.
     *  Crafting Bench Apple - One time crafting bench access.
     *  Ender Chest Apple - One time ender chest access.
     *  Furnace Apple - One time furnace access.
     *  
     *  Enchanted Apples:
     *  
     *  **Enchanted Blast Furnace Apple - Smelts all ore on player hotbar
     *  Enchanted Campfire Apple - Smelts all food on player hotbar
     *  Enchanted Glass Apple - Glass Cannon - Make player invisible, mobs won't target the player but any damage will kill the player.
     *  Enchanted Spider Eye Apple - Makes the player immune to poison.
     *  Enchanted TNT Apple - Larger explosion, though if used on bedrock will not destroy blocks, has small chance to drop bedrock fragments and even smaller chance to destroy block entirely.
     *  
     *  **Enchanted Chest Apple - Unlimited portable chest access, does not work like an apple but rather just opens UI when right clicked.
     *  Enchanted Crafting Bench Apple - Unlimited crafting bench access, does not work like an apple but rather just opens UI when right clicked.
     *  Enchanted Ender Chest Apple - Unlimited ender chest access, does not work like an apple but rather just opens UI when right clicked.
     *  Enchanted Furnace Apple - Unlimited furnace access, does not work like an apple but rather just opens UI when right clicked.
     * 
     */
    
    /*
     * Changelog:
     * 
     * */

    public Main() {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        
        final IEventBus ieventbus = FMLJavaModLoadingContext.get().getModEventBus();
        
        TileEntityLoader.TILES.register(ieventbus);
        BlockLoader.BLOCKS.register(ieventbus);
        BlockLoader.BLOCK_ITEM.register(ieventbus);

        PotionLoader.EFFECTS.register(ieventbus);
        ItemLoader.ITEMS.register(ieventbus);
        EntityLoader.ENTITIES.register(ieventbus);
        
        MinecraftForge.EVENT_BUS.register(this);
        
    }

	private void commonSetup(final FMLCommonSetupEvent event) {
		
		PacketHandler.load();
		
		final ModLoadingContext modloadingcontext = ModLoadingContext.get();
		
		//modloadingcontext.registerConfig(ModConfig.Type.CLIENT, Config.CLIENT_SPEC);
        modloadingcontext.registerConfig(ModConfig.Type.COMMON, Config.SERVER_SPEC);
        
        //Config.loadConfig(Config.CLIENT_SPEC, FMLPaths.CONFIGDIR.get().resolve(MODID + ".toml"));
        Config.loadConfig(Config.SERVER_SPEC, FMLPaths.CONFIGDIR.get().resolve(MODID + ".toml"));
        
        Config.Holder.load();

    	DeferredWorkQueue.runLater(new Runnable() {

			@Override
			public void run() {

				PotionCrafting.load();
				
			}
			
    	});
    	
    }
    
    private void clientSetup(final FMLClientSetupEvent event) {
    	
    	EntityLoader.renderingRegistries();
    	
    }
    
}