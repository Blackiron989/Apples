package com.apples.items;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

import com.apples.blocks.BlockLoader;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.util.Mth;
import net.minecraft.world.level.Level;

public class ApplePresentItem extends Item {

	private ArrayList<ItemStack> general() {
		
		ArrayList<ItemStack> list = new ArrayList<>();
		
		list.add(new ItemStack(ItemLoader.APPLELOOT.get()));
		list.add(new ItemStack(ItemLoader.APPLECOAL.get()));
		list.add(new ItemStack(ItemLoader.APPLEDIAMOND.get()));
		list.add(new ItemStack(ItemLoader.APPLEIRON.get()));
		list.add(new ItemStack(ItemLoader.APPLEEMERALD.get()));
		list.add(new ItemStack(ItemLoader.APPLERUBY.get()));
		list.add(new ItemStack(ItemLoader.RUBY.get()));
		
		return list;
		
	}
	
	private ArrayList<ItemStack> december() {
		
		ArrayList<ItemStack> list = new ArrayList<>();
		
		list.add(new ItemStack(ItemLoader.APPLEEGGNOG.get()));
		list.add(new ItemStack(ItemLoader.APPLECANDYCANE.get()));
		list.add(new ItemStack(ItemLoader.APPLECIDER.get()));
		list.add(new ItemStack(ItemLoader.APPLECOOKIE.get()));
		list.add(new ItemStack(BlockLoader.APPLE_PIE_ITEM.get()));
		list.add(new ItemStack(Items.ENCHANTED_GOLDEN_APPLE));
		list.add(new ItemStack(ItemLoader.APPLECOAL.get()));
		
		return list;
		
	}
	
	private ArrayList<ItemStack> october() {
		
		ArrayList<ItemStack> list = new ArrayList<>();
		
		list.add(new ItemStack(ItemLoader.APPLEBAT.get()));
		list.add(new ItemStack(ItemLoader.APPLEBONE.get()));
		list.add(new ItemStack(ItemLoader.APPLECANDY.get()));
		list.add(new ItemStack(ItemLoader.APPLECARAMEL.get()));
		list.add(new ItemStack(ItemLoader.APPLECOBWEB.get()));
		list.add(new ItemStack(ItemLoader.APPLEEATEN.get()));
		list.add(new ItemStack(ItemLoader.APPLEPUMPKIN.get()));
		list.add(new ItemStack(ItemLoader.APPLEPUMPKINLIT.get()));
		list.add(new ItemStack(ItemLoader.APPLEPUMPKINPIE.get()));
		list.add(new ItemStack(ItemLoader.APPLEWITCH.get()));
		list.add(new ItemStack(ItemLoader.APPLEZOMBIE.get()));
		list.add(new ItemStack(ItemLoader.APPLESTONE.get()));
		
		return list;
		
	}

	private ArrayList<ItemStack> july() {
	
		ArrayList<ItemStack> list = new ArrayList<>();
		
		list.add(new ItemStack(BlockLoader.APPLE_PIE_ITEM.get()));
		list.add(new ItemStack(ItemLoader.APPLEFIREWORK.get()));
		list.add(new ItemStack(ItemLoader.APPLEGUNPOWDER.get()));
		list.add(new ItemStack(ItemLoader.APPLEFIREBALL.get()));
		list.add(new ItemStack(ItemLoader.APPLETNT.get()));
		
		return list;
	
	}
	
	public ApplePresentItem(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {
		
		if(!level.isClientSide()) {
			
			Random random = new Random();
			
			LocalDate date = LocalDate.now();
			
			switch(date.getMonth()) {
			
				case DECEMBER:
					
					if(december().size() > 0) {
						
						int i = Mth.nextInt(random, 1, december().size());
								
						livingentity.spawnAtLocation(december().get(i - 1), 0);
					
					}
					
				break;
				
				case OCTOBER: 
					
					if(october().size() > 0) {
						
						int i = Mth.nextInt(random, 1, october().size());
								
						livingentity.spawnAtLocation(october().get(i - 1), 0);
					
					}
					
				break;
				case JULY: 
					
					if(july().size() > 0) {
						
						int i = Mth.nextInt(random, 1, july().size());
								
						livingentity.spawnAtLocation(july().get(i - 1), 0);
					
					}
					
				break;
				
				default:
					
					if(general().size() > 0) {
						
						int i = Mth.nextInt(random, 1, general().size());
								
						livingentity.spawnAtLocation(general().get(i - 1), 0);
					
					}
					
				break;
			
			}
			
		}

		return livingentity.eat(level, itemstack);
		
	}

}
