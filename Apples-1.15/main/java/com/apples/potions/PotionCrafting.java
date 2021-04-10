package com.apples.potions;

import java.util.ArrayList;

import com.apples.items.ItemLoader;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.potion.PotionUtils;
import net.minecraft.potion.Potions;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

public class PotionCrafting {
	
	//private static List<ItemStack> potionList = new ArrayList<ItemStack>();
	
	private static ArrayList<ItemStack> potions() {
		
		ArrayList<ItemStack> potionList = new ArrayList<>();
		
		potionList.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.FIRE_RESISTANCE));
		potionList.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.LONG_FIRE_RESISTANCE));
		
		potionList.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.HEALING));
		potionList.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.STRONG_HEALING));
		
		potionList.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.HARMING));
		potionList.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.STRONG_HARMING));
		
		potionList.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.INVISIBILITY));
		potionList.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.LONG_INVISIBILITY));
		
		potionList.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.LEAPING));
		potionList.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.LONG_LEAPING));
		potionList.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.STRONG_LEAPING));
		
		potionList.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.LUCK));
		
		potionList.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.NIGHT_VISION));
		potionList.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.LONG_NIGHT_VISION));
		
		potionList.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.POISON));
		potionList.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.LONG_POISON));
		potionList.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.STRONG_POISON));
		
		potionList.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.REGENERATION));
		potionList.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.LONG_REGENERATION));
		potionList.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.STRONG_REGENERATION));
		
		potionList.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.SLOW_FALLING));
		potionList.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.LONG_SLOW_FALLING));
		
		potionList.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.SLOWNESS));
		potionList.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.LONG_SLOWNESS));
		potionList.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.STRONG_SLOWNESS));
		
		potionList.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.STRENGTH));
		potionList.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.LONG_STRENGTH));
		potionList.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.STRONG_STRENGTH));
		
		potionList.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.SWIFTNESS));
		potionList.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.LONG_SWIFTNESS));
		potionList.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.STRONG_SWIFTNESS));
		
		potionList.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.TURTLE_MASTER));
		potionList.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.LONG_TURTLE_MASTER));
		potionList.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.STRONG_TURTLE_MASTER));
		
		potionList.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.WATER_BREATHING));
		potionList.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.LONG_WATER_BREATHING));
		
		potionList.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.WEAKNESS));
		potionList.add(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.LONG_WEAKNESS));
		
		return potionList;
		
	} 
	
	public static void load() {
		
		BrewingRecipeRegistry.addRecipe(Ingredient.fromStacks(PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.WATER)), Ingredient.fromStacks(new ItemStack(Items.APPLE)), new ItemStack(ItemLoader.APPLEJUICE.get()));
		BrewingRecipeRegistry.addRecipe(Ingredient.fromStacks(new ItemStack(ItemLoader.APPLEJUICE.get())), Ingredient.fromStacks(new ItemStack(Items.APPLE)), new ItemStack(ItemLoader.APPLECIDER.get()));

		//Bottle of Magic Recipes
		
		
		for(int i = 0; i < potions().size(); i++) {
			
			BrewingRecipeRegistry.addRecipe(Ingredient.fromStacks(potions().get(i)), Ingredient.fromStacks(new ItemStack(ItemLoader.APPLEDIAMOND.get())), new ItemStack(ItemLoader.MUGMAGIC.get()));
			BrewingRecipeRegistry.addRecipe(Ingredient.fromStacks(potions().get(i)), Ingredient.fromStacks(new ItemStack(ItemLoader.APPLEEMERALD.get())), new ItemStack(ItemLoader.MUGMAGIC.get()));
			BrewingRecipeRegistry.addRecipe(Ingredient.fromStacks(potions().get(i)), Ingredient.fromStacks(new ItemStack(ItemLoader.APPLERUBY.get())), new ItemStack(ItemLoader.MUGMAGIC.get()));
			
		}
		
		/*
		BrewingRecipeRegistry.addRecipe(Ingredient.fromStacks(Items.POTION.getDefaultInstance()), Ingredient.fromStacks(Items.APPLE.getDefaultInstance()), ItemLoader.APPLEJUICE.get().getDefaultInstance());
		BrewingRecipeRegistry.addRecipe(Ingredient.fromStacks(ItemLoader.APPLEJUICE.get().getDefaultInstance()), Ingredient.fromStacks(Items.APPLE.getDefaultInstance()), ItemLoader.APPLECIDER.get().getDefaultInstance());

		//Bottle of Magic Recipes
		BrewingRecipeRegistry.addRecipe(Ingredient.fromStacks(Items.POTION.getDefaultInstance()), Ingredient.fromStacks(ItemLoader.APPLEDIAMOND.get().getDefaultInstance()), ItemLoader.MUGMAGIC.get().getDefaultInstance());
		BrewingRecipeRegistry.addRecipe(Ingredient.fromStacks(Items.POTION.getDefaultInstance()), Ingredient.fromStacks(ItemLoader.APPLEEMERALD.get().getDefaultInstance()), ItemLoader.MUGMAGIC.get().getDefaultInstance());
		BrewingRecipeRegistry.addRecipe(Ingredient.fromStacks(Items.POTION.getDefaultInstance()), Ingredient.fromStacks(ItemLoader.APPLERUBY.get().getDefaultInstance()), ItemLoader.MUGMAGIC.get().getDefaultInstance());
		*/
		
	}

}
