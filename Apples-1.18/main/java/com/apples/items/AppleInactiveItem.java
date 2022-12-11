package com.apples.items;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.RegistryObject;

public class AppleInactiveItem extends Item {

	public AppleInactiveItem(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {
		
		if(!level.isClientSide() && livingentity instanceof Player) {
			
			Player player = (Player)livingentity;
			
			List<ItemStack> list = player.getInventory().items;
			Collection<RegistryObject<Item>> collection = ItemLoader.ITEMS.getEntries();

			CompoundTag apples = itemstack.getOrCreateTagElement("apples");
			ListTag tagList = new ListTag();

			if(!apples.isEmpty()) {

				tagList = (ListTag) apples.get("list");
				
			}
			
			for(RegistryObject<Item> obj : collection) {
				
				String str = obj.get().toString();
				
				if(!skip(str)) {
				
					for(ItemStack stack : list) {
						
						if(!stack.isEmpty()) {
							
							if(stack.getItem().toString().matches(str)) {

								CompoundTag tag = new CompoundTag();
								tag.putString("item", str);
								
								if(!tagList.contains(tag)) {

									tagList.add(tag);
									
								}
								
							}
							
						}
						
					}
				
				}
				
			}
			
			apples.put("list", tagList);
			itemstack.addTagElement("apples", apples);

			if(listComplete(collection, tagList)) {
				
				level.playSound(null, player.blockPosition(), SoundEvents.END_PORTAL_SPAWN, SoundSource.PLAYERS, 1.0F, 1.0F);
				return new ItemStack(ItemLoader.APPLEULTIMATE.get());
				
			} else {

				String s = String.valueOf(tagList.size());
				livingentity.sendMessage(new TranslatableComponent("A strange feeling washes over you, it's as if this apple wasn't complete yet. [" + s + "/" + String.valueOf(collection.size() - stringList().size()) + "]"), livingentity.getUUID());
				return itemstack;
				
			}
			
		}
	
		return itemstack;
		
	}
	
	private ArrayList<String> stringList() {
		
		//"Do not include" items for ultimate apple
		ArrayList<String> pass = new ArrayList<>();
		pass.add(ItemLoader.BEDROCKFRAGMENT.get().toString());
		pass.add(ItemLoader.MUGMAGIC.get().toString());
		pass.add(ItemLoader.RUBY.get().toString());
		pass.add(ItemLoader.APPLEJUICE.get().toString());
		pass.add(ItemLoader.APPLESAUCE.get().toString());
		pass.add(ItemLoader.APPLECIDER.get().toString());
		pass.add(ItemLoader.APPLEULTIMATE.get().toString());
		pass.add(ItemLoader.APPLEINACTIVEULTIMATE.get().toString());
		pass.add(ItemLoader.APPLEGREEN.get().toString());
		pass.add(ItemLoader.ENCHANTEDAPPLECOBWEB.get().toString());
		pass.add(ItemLoader.ENCHANTEDAPPLEFEATHER.get().toString());
		//pass.add(ItemLoader.ENCHANTEDAPPLEGLASS.get().toString());
		pass.add(ItemLoader.ENCHANTEDAPPLEGLOWSTONE.get().toString());
		pass.add(ItemLoader.ENCHANTEDAPPLEREDSTONE.get().toString());
		//pass.add(ItemLoader.ENCHANTEDAPPLEROTTENFLESH.get().toString());
		//pass.add(ItemLoader.ENCHANTEDAPPLESPIDEREYE.get().toString());
		//pass.add(ItemLoader.ENCHANTEDAPPLETNT.get().toString());
		pass.add(ItemLoader.ENCHANTEDAPPLEWITHERSKULL.get().toString());
		
		return pass;
		
	}
	
	private boolean skip(String string) {

		for(String str : stringList()) {
			
			if(string.matches(str)) {
				
				return true;
				
			}
			
		}
		
		return false;
		
	}
	
	private boolean listComplete(Collection<RegistryObject<Item>> collection, ListTag list) {
	
		int count = 0;
		
		if(list.isEmpty()) return false;

		for(RegistryObject<Item> obj : collection) {
			
			String str = obj.get().toString();
			
			if(!skip(str)) {
				
				CompoundTag tag = new CompoundTag();
				tag.putString("item", str);
				
				if(!list.contains(tag)) {
					
					break;
					
				} else {
					
					count++;
					
				}
			
			}
			
		}
		
		if(count != collection.size() - stringList().size()) {
			
			return false;
			
		} else {
			
			return true;
			
		}
		
	}

}
