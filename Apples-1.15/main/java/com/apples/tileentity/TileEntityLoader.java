package com.apples.tileentity;

import com.apples.Main;
import com.apples.blocks.BlockLoader;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityLoader {
	
	//public static final DeferredRegister<TileEntityType<?>> TILES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, Main.MODID);
	public static final DeferredRegister<TileEntityType<?>> TILES = new DeferredRegister<>(ForgeRegistries.TILE_ENTITIES, Main.MODID);
	
	public static final RegistryObject<TileEntityType<?>> GLOW_TILE = TILES.register("tileentityglow", () -> TileEntityType.Builder.create(TileEntityGlow::new, BlockLoader.GLOW_BLOCK.get()).build(null));
	
}
