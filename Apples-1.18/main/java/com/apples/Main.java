package com.apples;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.apples.blockentity.BlockEntityLoader;
import com.apples.blocks.BlockLoader;
import com.apples.config.Config;
import com.apples.entity.EntityLoader;
import com.apples.events.EventHandler;
import com.apples.items.ItemLoader;
import com.apples.loot.ChestLootModifier;
import com.apples.network.PacketHandler;
import com.apples.potions.PotionCrafting;
import com.apples.potions.PotionLoader;

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
     *  1.18+ To Do:
     *  Improve firework apple performance
     *  Add system to record apple to check if already playing a record track or not...
     *  damageable apples can be enchanted, maybe look into???
     *  make rocket apple turn player into rocket (modify player position/angle/yaw etc.)
     *  creature apples could turn the player into the creature type of the apple (change model/functionality)
     *  Make empty apple when "consumed" at a non fillable area eat as normal but when complete kill the player displaying a custom death message
     *  	stating the player was bottled.  At the players death spot will be a "Bottle of Player" which can then be used to craft the steve apple.
     *  Update registry...
     *  Improve glass apple texture
     *  Make a texture for the apple pie block
     *  Move collection/skip function from inactive item to util for general use
     *  Add apple farming system;
     *  	Add square apple as a chance drop from this system, this can be used to craft present and loot apples.  Rare drop in this case!
     *  Split fortune effect into multiple effects instead of level based system, they can then have individual strength levels.
     *  
     *  Add crafting recipe to eggnog apple of milk bottle apple and egg apple.
     *  Fix crafting recipe for bee apple (should be bee hives) currently conflicts with bee nest apple.
     *  enchanted redstone and glowstone dust apples do not have recipes.
     *  string apple should give a free lasso effect
     *  flower pot apple is just called "Flower Pot" plz fix
     * 
     */

    public Main() {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        
        final IEventBus ieventbus = FMLJavaModLoadingContext.get().getModEventBus();
        
        BlockEntityLoader.BLOCK_ENTITIES.register(ieventbus);
        BlockLoader.BLOCKS.register(ieventbus);
        BlockLoader.BLOCK_ITEM.register(ieventbus);

        PotionLoader.EFFECTS.register(ieventbus);
        ItemLoader.ITEMS.register(ieventbus);
        EntityLoader.ENTITIES.register(ieventbus);
        
        EventHandler.load();
        ChestLootModifier.GLOBAL_LOOT_MODIFIER.register(ieventbus);
        
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

        event.enqueueWork(new Runnable() {

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