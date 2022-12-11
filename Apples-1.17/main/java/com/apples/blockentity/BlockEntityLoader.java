package com.apples.blockentity;

import com.apples.Main;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockEntityLoader {
	
	public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, Main.MODID);
	
	//public static final RegistryObject<BlockEntityType<?>> GLOW_BLOCK_ENTITY = BLOCK_ENTITIES.register("tileentityglow", () -> BlockEntityType.Builder.of(GlowBlockEntity::new, BlockLoader.GLOW_BLOCK.get()).build(null));
	
}
