package com.apples;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHelper {
	
	public static void init() {
		
		GameRegistry.addSmelting(ItemHelper.itemAppleSugar, new ItemStack(ItemHelper.itemAppleCaramel), 1.0f);
		GameRegistry.addSmelting(ItemHelper.itemApplePorkchopRaw, new ItemStack(ItemHelper.itemApplePorkchopCooked), 1.0f);
		GameRegistry.addSmelting(ItemHelper.itemAppleFish, new ItemStack(ItemHelper.itemAppleFishCooked), 1.0f);
		GameRegistry.addSmelting(ItemHelper.itemApplePotatoRaw, new ItemStack(ItemHelper.itemApplePotatoBaked), 1.0f);
		GameRegistry.addSmelting(ItemHelper.itemAppleJuice, new ItemStack(ItemHelper.itemAppleCider), 1.0f);

		FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(BlockHelper.rubyOre), new ItemStack(ItemHelper.itemRuby), 1.0f);
		FurnaceRecipes.instance().addSmeltingRecipe(new ItemStack(BlockHelper.bedrockOre), new ItemStack(ItemHelper.itemBedrockFragment), 1.0f);
		
	}

}
