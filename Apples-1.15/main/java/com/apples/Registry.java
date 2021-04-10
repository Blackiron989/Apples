package com.apples;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;

import com.apples.blocks.BlockLoader;
import com.apples.config.Config;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.potion.Effect;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.registries.IForgeRegistry;

public class Registry {
	
	private static List<Block> blocksToRegister = new ArrayList<Block>();
	private static List<Item>  itemsToRegister  = new ArrayList<Item>();
	private static List<Effect> potionsToRegister = new ArrayList<Effect>();
	private static List<TileEntityType<?>> tilesToRegister = new ArrayList<TileEntityType<?>>();

	//Register Blocks
	public static void registerBlock(Block block, String registryname) {
	
		block.setRegistryName(registryname);
		blocksToRegister.add(block);
		
	}
	
	public static void registerBlock(Block block, String registryname, Item.Properties properties) {
		
		BlockItem item = new BlockItem(block, properties);
		
		block.setRegistryName(registryname);
		item.setRegistryName(registryname); 
		
		blocksToRegister.add(block);
		itemsToRegister.add(item);
		
	}
	
	public static void registerBlock(Block block, String registryname, BlockItem item) {
		
		block.setRegistryName(registryname);
		item.setRegistryName(registryname);
		
		blocksToRegister.add(block);
		itemsToRegister.add(item);
		
	}
	
	//Register Items
	public static void registerItem(Item item, String registryname) {
		
		item.setRegistryName(registryname);
		itemsToRegister.add(item);
		
	}
	
	//Register Potions
	public static void registerPotion(Effect effect, String registryname) {
		
		effect.setRegistryName(registryname);
		potionsToRegister.add(effect);
		
	}
	
	//Register Tile Entities
	public static void registerTileEntity(TileEntityType<?> tileentitytype) {

		tilesToRegister.add(tileentitytype);
		
	}

	@EventBusSubscriber(modid = Main.MODID, bus = EventBusSubscriber.Bus.MOD)
	public static class Registration {
		
		@SubscribeEvent
		public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
			
			final IForgeRegistry<Item> registry = event.getRegistry();

			/*
			BlockLoader.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {

				final Item.Properties properties = new Item.Properties().group(Group.APPLE_GROUP);
				
				final BlockItem blockitem = new BlockItem(block, properties);
				
				blockitem.setRegistryName(block.getRegistryName());

				registry.register(blockitem);
				
			});
			*/
			
			registry.registerAll(BlockLoader.blockItems().toArray(new Item[0]));
			
			registry.registerAll(itemsToRegister.toArray(new Item[0]));

		}
		
		@SubscribeEvent
		public static void onRegisterBlocks(@Nonnull final RegistryEvent.Register<Block> event) {
			
			event.getRegistry().registerAll(blocksToRegister.toArray(new Block[0]));
			
		}
		
		@SubscribeEvent
		public static void onModConfigEvent(@Nonnull final ModConfig.ModConfigEvent event) {
			
			final ModConfig config = event.getConfig();
			
			if (config.getSpec() == Config.CLIENT_SPEC) {
				
				//Config.bakeClient(config);
				
			} else if (config.getSpec() == Config.SERVER_SPEC) {
				
				//Config.bakeServer(config);
				
			}
			
		}
		
		@SubscribeEvent
		public static void onRegisterPotions(@Nonnull final RegistryEvent.Register<Effect> event) {
			
			final IForgeRegistry<Effect> registry = event.getRegistry();
			
			registry.registerAll(potionsToRegister.toArray(new Effect[0]));
			
		}
		
		@SubscribeEvent
		public static void onRegisterTileEntities(@Nonnull final RegistryEvent.Register<TileEntityType<?>> event) {
			
			for(TileEntityType<?> tile : tilesToRegister) {
				
				event.getRegistry().registerAll(tile);
				
			}
			
		}
		
	}
	
}
