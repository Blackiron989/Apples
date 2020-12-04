package com.apples;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootEntry;
import net.minecraft.world.storage.loot.LootEntryTable;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.world.storage.loot.RandomValueRange;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public final class LootHelper {
	
	public LootHelper() {
		
		LootTableList.register(new ResourceLocation("applesplus:inject/simple_dungeon"));
		
	}

	@SubscribeEvent
	public void lootLoad(LootTableLoadEvent evt) {
	
    if (evt.getName().toString().equals("minecraft:chests/simple_dungeon")) {
        
    		LootEntry entry = new LootEntryTable(new ResourceLocation("applesplus:inject/simple_dungeon"), 1, 0, new LootCondition[0], "apples_entry");

    		LootPool pool = new LootPool(new LootEntry[] {entry}, new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0, 1), "apples_pool");
    	
    		evt.getTable().addPool(pool);
    	
    	}
    
	}

}
