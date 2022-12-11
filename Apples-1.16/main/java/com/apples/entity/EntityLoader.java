package com.apples.entity;

import com.apples.Main;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityLoader {
	
	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, Main.MODID);
	
	public static final RegistryObject<EntityType<EntityLightEmitter>> LIGHT_EMITTER = ENTITIES.register("lightemitter", () -> EntityType.Builder.<EntityLightEmitter>create(EntityLightEmitter::new, EntityClassification.MISC)
			.size(0F, 0F)
			.setCustomClientFactory(EntityLightEmitter::new)
			.build("lightemitter"));
	
	public static final RegistryObject<EntityType<EntityCart>> INVISIBLE_CART = ENTITIES.register("invisiblecart", () -> EntityType.Builder.<EntityCart>create(EntityCart::new, EntityClassification.MISC)
			.size(0F, 0F)
			.setCustomClientFactory(EntityCart::new)
			.build("invisiblecart"));
	
	public static void renderingRegistries() {
		
		RenderingRegistry.registerEntityRenderingHandler(INVISIBLE_CART.get(), RenderCart::new);
		RenderingRegistry.registerEntityRenderingHandler(LIGHT_EMITTER.get(), RenderLightEmitter::new);
		
	}

}