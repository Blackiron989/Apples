package com.apples.world;

/*import java.util.HashMap;
import java.util.Map;

import com.apples.Main;
import com.apples.blocks.BlockLoader;
import com.apples.config.Config;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;*/

public class OreGeneration { //Remove before 1.17 release!

	//private static final OreFeatureConfig.FillerBlockType APPLES_BEDROCK = OreFeatureConfig.FillerBlockType.create("APPLES_BEDROCK", "apples_bedrock", new BlockMatcher(Blocks.BEDROCK));
	
	/*
	public static Map<String, ConfiguredFeature<?, ?>> features = new HashMap<>();

	public static Map<String, ConfiguredFeature<?, ?>> load() {

		if(Config.Holder.rubyGeneration) {

			oreGeneration(new OreFeatureConfig(FillerBlockType.BASE_STONE_OVERWORLD, BlockLoader.RUBY_ORE.get().getDefaultState(), 8), "ruby_ore", 0, 0, 16);

		}

		if(Config.Holder.bedrockGeneration) {

			oreGeneration(new OreFeatureConfig(FillerBlockType.BASE_STONE_OVERWORLD, BlockLoader.BEDROCK_ORE.get().getDefaultState(), 4), "bedrock_ore", 0, 0, 5);

		}

		return features;

	}

	private static void oreGeneration(OreFeatureConfig orefeatureconfig, String string, int bottomoffset, int topoffset, int max) {

		ConfiguredFeature<?, ?> configuredfeature = register(new ResourceLocation(Main.MODID, string), new ConfiguredFeature<>(Feature.ORE, orefeatureconfig)

			.withPlacement(

				Placement.RANGE.configure(new TopSolidRangeConfig(bottomoffset, topoffset, max)).square()

			)

		);

		features.put(string, configuredfeature);

	}
	
	private static <FC extends IFeatureConfig>
	ConfiguredFeature<FC, ?> register(ResourceLocation key, ConfiguredFeature<FC, ?> configuredFeature) {

		return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, key, configuredFeature);

	}
	*/

}
