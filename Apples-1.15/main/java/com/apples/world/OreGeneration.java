package com.apples.world;

import com.apples.Main;
import com.apples.blocks.BlockLoader;
import com.apples.config.Config;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGeneration {
	
	//private static final OreFeatureConfig.FillerBlockType APPLES_BEDROCK = OreFeatureConfig.FillerBlockType.create("APPLES_BEDROCK", "apples_bedrock", new BlockMatcher(Blocks.BEDROCK));
	
	public static void load() {
		
		Main.LOGGER.info("Apples+ ruby config generation value = " + Config.Holder.rubyGeneration);
		Main.LOGGER.info("Apples+ bedrock config generation value = " + Config.Holder.bedrockGeneration);
		
		if(Config.Holder.rubyGeneration) {
			
			oreGeneration(new OreFeatureConfig(FillerBlockType.NATURAL_STONE, BlockLoader.RUBY_ORE.get().getDefaultState(), 8), 1, 0, 0, 16);
			
		}
		
		if(Config.Holder.bedrockGeneration) {

			oreGeneration(new OreFeatureConfig(FillerBlockType.NATURAL_STONE, BlockLoader.BEDROCK_ORE.get().getDefaultState(), 4), 2, 0, 0, 5);
			
		}
		
	}
	
	private static void oreGeneration(OreFeatureConfig orefeatureconfig, int count, int bottomoffset, int topoffset, int max) {
		
		ConfiguredFeature<?, ?> configuredfeature = new ConfiguredFeature<>(Feature.ORE, orefeatureconfig).withPlacement(
				
					new ConfiguredPlacement<>(Placement.COUNT_RANGE, new CountRangeConfig(count, bottomoffset, topoffset, max))
				
				);

		for(Biome biome : ForgeRegistries.BIOMES.getValues()) {
			
			biome.addFeature(Decoration.UNDERGROUND_ORES, configuredfeature); 
			
		}
		
	}
	
}
