package com.apples;

import net.minecraftforge.oredict.OreDictionary;

public class OreEntry {

	public static void init() {
		
	    OreDictionary.registerOre("oreRuby", BlockHelper.rubyOre);
	    OreDictionary.registerOre("oreBedrock", BlockHelper.bedrockOre);
		
	}
	
}
