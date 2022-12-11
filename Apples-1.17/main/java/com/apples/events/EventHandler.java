package com.apples.events;

import net.minecraftforge.common.MinecraftForge;

public class EventHandler { 
	
	public static void load() {
		
		//MinecraftForge.EVENT_BUS.register(BiomeLoadEvents.class); /* Disabled - Used for ore generation */
		MinecraftForge.EVENT_BUS.register(BlockEvents.class);
		MinecraftForge.EVENT_BUS.register(EntityMountEvents.class);
		MinecraftForge.EVENT_BUS.register(LivingAttackEvents.class);
		MinecraftForge.EVENT_BUS.register(LivingDeathEvents.class);
		MinecraftForge.EVENT_BUS.register(LivingDropsEvents.class);
		MinecraftForge.EVENT_BUS.register(LivingFallEvents.class);
		MinecraftForge.EVENT_BUS.register(LivingSetAttackTargetEvents.class);
		//MinecraftForge.EVENT_BUS.register(LootTableLoadEvents.class);
		MinecraftForge.EVENT_BUS.register(PlayerEvents.class);
		MinecraftForge.EVENT_BUS.register(PlayerTickEvents.class);
		MinecraftForge.EVENT_BUS.register(PotionEvents.class);
		MinecraftForge.EVENT_BUS.register(RenderPlayerEvents.class);
		MinecraftForge.EVENT_BUS.register(WanderingTraderEvents.class);
		MinecraftForge.EVENT_BUS.register(FurnaceFuelEvents.class);

	}

}
