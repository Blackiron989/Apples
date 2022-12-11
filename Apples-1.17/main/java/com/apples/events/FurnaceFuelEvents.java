package com.apples.events;

import java.util.ArrayList;

import com.apples.items.ItemLoader;

import net.minecraft.world.item.Item;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class FurnaceFuelEvents {

	@SubscribeEvent
	public static void furnaceFuelEvent(FurnaceFuelBurnTimeEvent event) {
		
		ArrayList<ItemContainer> list = new ArrayList<>();
		
		list.add(new ItemContainer(10800, ItemLoader.APPLECOAL.get()));
		list.add(new ItemContainer(160000, ItemLoader.APPLELAVA.get()));
		list.add(new ItemContainer(2400, ItemLoader.APPLEWOOD.get()));
		
		Item item = event.getItemStack().getItem();
		
		for(ItemContainer stack : list) {
			
			if(stack.item() == item) {
				
				event.setBurnTime(stack.burntime());
				
			}
			
		}
		
	}
	
	private static class ItemContainer {
		
		private int burntime;
		private Item item;
		
		private ItemContainer(int burntime, Item item) {
			this.burntime = burntime;
			this.item = item;
		}
		
		public int burntime() {
			return burntime;
		}
		
		public Item item() {
			return item;
		}
		
	}
	
}
