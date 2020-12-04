package com.apples;


import com.apples.tileentity.TileEntityGlowBlock;
import com.apples.worldgen.OreGenerator;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;


@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION)
public class Main {

	public static final String MODID = "applesplus";
	public static final String NAME = "Apples+";
	public static final String VERSION = "2.0";
	
	@Instance
	public static Main instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		PotionRegister.init();
		
		ItemHelper.init();
		BlockHelper.init();
		
		GameRegistry.registerWorldGenerator(new OreGenerator(), 1);
		GameRegistry.registerTileEntity(TileEntityGlowBlock.class, "applesplus:tileentityglowblock");
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		
		OreEntry.init();
		RecipeHelper.init();
		
		MinecraftForge.EVENT_BUS.register(new LootHelper());
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
		//Noot Noot
		
	}
	
	/**
	 * 		ToDo:
	 * 
	 * 		Fix apples with stem issues
	 * 		Update snowball apple for random chance to spawn a snowman.
	 * 		Update steve apple if thrown in lava to play ghast screams and global chat message, "The ancient spirits of light and dark have been released.", then kill player.
	 * 		Implement unused items.
	 * 		Remove mug based items and replace with variants that use the bottle and bowl.
	 * 
	 **/
	
}
