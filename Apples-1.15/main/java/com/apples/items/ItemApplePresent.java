package com.apples.items;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class ItemApplePresent extends Item {

	private ArrayList<ItemStack> general() {
		
		ArrayList<ItemStack> list = new ArrayList<>();
		
		list.add(new ItemStack(ItemLoader.APPLELOOT.get()));
		list.add(new ItemStack(ItemLoader.APPLECOAL.get()));
		list.add(new ItemStack(ItemLoader.APPLEDIAMOND.get()));
		list.add(new ItemStack(ItemLoader.APPLEIRON.get()));
		list.add(new ItemStack(ItemLoader.APPLEEMERALD.get()));
		list.add(new ItemStack(ItemLoader.APPLERUBY.get()));
		list.add(new ItemStack(ItemLoader.RUBY.get()));
		list.add(new ItemStack(ItemLoader.RUBYAXE.get()));
		list.add(new ItemStack(ItemLoader.RUBYHOE.get()));
		list.add(new ItemStack(ItemLoader.RUBYPICKAXE.get()));
		list.add(new ItemStack(ItemLoader.RUBYSWORD.get()));
		list.add(new ItemStack(ItemLoader.RUBYSHOVEL.get()));
		
		return list;
		
	}
	
	private ArrayList<ItemStack> december() {
		
		ArrayList<ItemStack> list = new ArrayList<>();
		
		list.add(new ItemStack(ItemLoader.APPLEEGGNOG.get()));
		list.add(new ItemStack(ItemLoader.APPLECANDYCANE.get()));
		list.add(new ItemStack(ItemLoader.APPLECIDER.get()));
		list.add(new ItemStack(ItemLoader.APPLECOOKIE.get()));
		list.add(new ItemStack(ItemLoader.APPLEPIE.get()));
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
		
		list.add(new ItemStack(ItemLoader.APPLEPIE.get()));
		list.add(new ItemStack(ItemLoader.APPLEFIREWORK.get()));
		list.add(new ItemStack(ItemLoader.APPLEGUNPOWDER.get()));
		list.add(new ItemStack(ItemLoader.APPLEFIREBALL.get()));
		list.add(new ItemStack(ItemLoader.APPLETNT.get()));
		
		return list;
	
	}
	
	public ItemApplePresent(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity livingentity) {
		
		if(!world.isRemote) {
			
			Random random = new Random();
			
			LocalDate date = LocalDate.now();
			
			switch(date.getMonth()) {
			
				case DECEMBER:
					
					if(december().size() > 0) {
						
						int i = MathHelper.nextInt(random, 1, december().size());
								
						livingentity.entityDropItem(december().get(i - 1), 0);
					
					}
					
				break;
				
				case OCTOBER: 
					
					if(october().size() > 0) {
						
						int i = MathHelper.nextInt(random, 1, october().size());
								
						livingentity.entityDropItem(october().get(i - 1), 0);
					
					}
					
				break;
				case JULY: 
					
					if(july().size() > 0) {
						
						int i = MathHelper.nextInt(random, 1, july().size());
								
						livingentity.entityDropItem(july().get(i - 1), 0);
					
					}
					
				break;
				
				default:
					
					if(general().size() > 0) {
						
						int i = MathHelper.nextInt(random, 1, general().size());
								
						livingentity.entityDropItem(general().get(i - 1), 0);
					
					}
					
				break;
			
			}
			
		}

		return this.isFood() ? livingentity.onFoodEaten(world, itemstack) : itemstack;
		
	}

}
