package com.apples.potions;

import java.util.ArrayList;

import com.apples.items.ItemLoader;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

public class PotionCrafting {
	
	private static ArrayList<ItemStack> potions() {
		
		ArrayList<ItemStack> potionList = new ArrayList<>();
		
		potionList.add(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.FIRE_RESISTANCE));
		potionList.add(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.LONG_FIRE_RESISTANCE));
		
		potionList.add(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.HEALING));
		potionList.add(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.STRONG_HEALING));
		
		potionList.add(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.HARMING));
		potionList.add(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.STRONG_HARMING));
		
		potionList.add(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.INVISIBILITY));
		potionList.add(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.LONG_INVISIBILITY));
		
		potionList.add(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.LEAPING));
		potionList.add(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.LONG_LEAPING));
		potionList.add(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.STRONG_LEAPING));
		
		potionList.add(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.LUCK));
		
		potionList.add(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.NIGHT_VISION));
		potionList.add(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.LONG_NIGHT_VISION));
		
		potionList.add(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.POISON));
		potionList.add(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.LONG_POISON));
		potionList.add(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.STRONG_POISON));
		
		potionList.add(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.REGENERATION));
		potionList.add(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.LONG_REGENERATION));
		potionList.add(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.STRONG_REGENERATION));
		
		potionList.add(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.SLOW_FALLING));
		potionList.add(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.LONG_SLOW_FALLING));
		
		potionList.add(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.SLOWNESS));
		potionList.add(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.LONG_SLOWNESS));
		potionList.add(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.STRONG_SLOWNESS));
		
		potionList.add(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.STRENGTH));
		potionList.add(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.LONG_STRENGTH));
		potionList.add(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.STRONG_STRENGTH));
		
		potionList.add(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.SWIFTNESS));
		potionList.add(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.LONG_SWIFTNESS));
		potionList.add(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.STRONG_SWIFTNESS));
		
		potionList.add(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.TURTLE_MASTER));
		potionList.add(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.LONG_TURTLE_MASTER));
		potionList.add(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.STRONG_TURTLE_MASTER));
		
		potionList.add(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.WATER_BREATHING));
		potionList.add(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.LONG_WATER_BREATHING));
		
		potionList.add(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.WEAKNESS));
		potionList.add(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.LONG_WEAKNESS));
		
		return potionList;
		
	} 
	
	public static void load() {
		
		BrewingRecipeRegistry.addRecipe(Ingredient.of(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.WATER)), Ingredient.of(new ItemStack(Items.APPLE)), new ItemStack(ItemLoader.APPLEJUICE.get()));
		BrewingRecipeRegistry.addRecipe(Ingredient.of(new ItemStack(ItemLoader.APPLEJUICE.get())), Ingredient.of(new ItemStack(Items.APPLE)), new ItemStack(ItemLoader.APPLECIDER.get()));

		//Bottle of Magic Recipes
		for(int i = 0; i < potions().size(); i++) {
			
			BrewingRecipeRegistry.addRecipe(Ingredient.of(potions().get(i)), Ingredient.of(new ItemStack(ItemLoader.APPLEDIAMOND.get())), new ItemStack(ItemLoader.MUGMAGIC.get()));
			BrewingRecipeRegistry.addRecipe(Ingredient.of(potions().get(i)), Ingredient.of(new ItemStack(ItemLoader.APPLEEMERALD.get())), new ItemStack(ItemLoader.MUGMAGIC.get()));
			BrewingRecipeRegistry.addRecipe(Ingredient.of(potions().get(i)), Ingredient.of(new ItemStack(ItemLoader.APPLERUBY.get())), new ItemStack(ItemLoader.MUGMAGIC.get()));
			
		}
		
	}

}
