package com.apples.entity;

import com.apples.Main;

import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityLoader {
	
	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, Main.MODID);
	
	public static final RegistryObject<EntityType<LightEmitterEntity>> LIGHT_EMITTER = ENTITIES.register("lightemitter", () -> EntityType.Builder.<LightEmitterEntity>of(LightEmitterEntity::new, MobCategory.MISC)
			.sized(0F, 0F)
			.setCustomClientFactory(LightEmitterEntity::new)
			.build("lightemitter"));
	
	public static final RegistryObject<EntityType<InvisibleCartEntity>> INVISIBLE_CART = ENTITIES.register("invisiblecart", () -> EntityType.Builder.<InvisibleCartEntity>of(InvisibleCartEntity::new, MobCategory.MISC)
			.sized(0F, 0F)
			.setCustomClientFactory(InvisibleCartEntity::new)
			.build("invisiblecart"));
	
	public static void renderingRegistries() {
		
		EntityRenderers.register(INVISIBLE_CART.get(), RenderCart::new);
		EntityRenderers.register(LIGHT_EMITTER.get(), RenderLightEmitter::new);
		
	}

}