package com.apples.events;

import com.apples.items.ItemLoader;

import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.BasicItemListing;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class WanderingTraderEvents {
	
	@SubscribeEvent
	public static void wanderingTraderEvent(WandererTradesEvent wanderertradesevent) {

		wanderertradesevent.getRareTrades().add(new BasicItemListing(4, new ItemStack(ItemLoader.APPLEGREEN.get()), 8, 1));
		wanderertradesevent.getRareTrades().add(new BasicItemListing(8, new ItemStack(ItemLoader.APPLEVANISHING.get()), 4, 1));
		wanderertradesevent.getRareTrades().add(new BasicItemListing(8, new ItemStack(ItemLoader.APPLEBINDING.get()), 4, 1));
		
	}

}
