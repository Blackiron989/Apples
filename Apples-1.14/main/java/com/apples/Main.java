package com.apples;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.apples.blocks.BlockLoader;
import com.apples.config.Config;
import com.apples.items.ItemLoader;
import com.apples.network.PacketHandler;
import com.apples.potions.PotionCrafting;
import com.apples.potions.PotionLoader;
import com.apples.tileentity.TileEntityLoader;
import com.apples.world.OreGeneration;

/**
 * 
 * 	Update the mods.toml file!
 * 
 * **/

@Mod(Main.MODID)
public class Main {

	public static final String MODID = "apples";
	
    public static final Logger LOGGER = LogManager.getLogger();
    
    /**
     * 	TO DO
     * 
     *  make apples made of fuels burnable
     *  make apple pie model textures for placement
     *  add campfire extinguish to water bucket apple, turn magma blocks into netherrack, maybe more...
     *  finish ultimate apple
     *  add ruby and bedrock ore to both use ORE forge tags
     *  have lava, milk, and water bucket apples give an empty bucket apple back.  Allow them to be "refilled" by clicking on the source for each.
     *  have the rotten flesh apple stop zombies from targeting the player.
     *  
     *  Possibly make blazerod apple stop targeting from blazes? Enchanted version?
     *  
     *  Apples:
     *  
     *  Blast Furnace Apple - Smelts one stack of ore on the hotbar.
     *  Bucket Apple - Crafted, returned to player after using lava apple, water apple, etc. Can right click to fill with that fluid.
     *  Campfire Apple - Smelts one stack of food on the hotbar
     *  Ender Eye Apple - Finds stronghold
     *  
     *  Chest Apple - One time chest access, drops contents on ground when leaving ui.
     *  Crafting Bench Apple - One time crafting bench access.
     *  Ender Chest Apple - One time ender chest access.
     *  Furnace Apple - One time furnace access.
     *  
     *  Enchanted Apples:
     *  
     *  Enchanted Blast Furnace Apple - Smelts all ore on player hotbar
     *  Enchanted Campfire Apple - Smelts all food on player hotbar
     *  Enchanted Glass Apple - Glass Cannon - Make player invisible, mobs won't target the player but any damage will kill the player.
     *  Enchanted Spider Eye Apple - Makes the player immune to poison.
     *  Enchanted TNT Apple - Larger explosion, though if used on bedrock will not destroy blocks, has small chance to drop bedrock fragments and even smaller chance to destroy block entirely.
     *  
     *  Enchanted Chest Apple - Unlimited portable chest access, does not work like an apple but rather just opens UI when right clicked.
     *  Enchanted Crafting Bench Apple - Unlimited crafting bench access, does not work like an apple but rather just opens UI when right clicked.
     *  Enchanted Ender Chest Apple - Unlimited ender chest access, does not work like an apple but rather just opens UI when right clicked.
     *  Enchanted Furnace Apple - Unlimited furnace access, does not work like an apple but rather just opens UI when right clicked.
     * 
     */

    public Main() {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        //FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        
        final IEventBus ieventbus = FMLJavaModLoadingContext.get().getModEventBus();
        
        TileEntityLoader.TILES.register(ieventbus);
        BlockLoader.BLOCKS.register(ieventbus);

        PotionLoader.load();
        ItemLoader.ITEMS.register(ieventbus);
        
        MinecraftForge.EVENT_BUS.register(this);
        
    }
    
	@SuppressWarnings("deprecation")
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
				
				OreGeneration.load();
				PotionCrafting.load();
				
			}
			
    	});
    	
    }
    
	/**
    private void clientSetup(final FMLClientSetupEvent event) {
    }
    **/
    
}