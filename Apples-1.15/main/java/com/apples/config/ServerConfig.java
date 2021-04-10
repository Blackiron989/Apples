package com.apples.config;

import com.apples.Main;

import net.minecraftforge.common.ForgeConfigSpec;

public class ServerConfig {
	
	final ForgeConfigSpec.BooleanValue rubyGeneration;
	final ForgeConfigSpec.BooleanValue bedrockGeneration;
	
	ServerConfig(final ForgeConfigSpec.Builder builder) {
		
		builder.push("general");
		
		rubyGeneration = builder
				.comment("Should Ruby Ore Generate?")
				.translation(Main.MODID + ".config.rubyGeneration")
				.define("rubyGeneration", true);
		bedrockGeneration = builder
				.comment("Should Bedrock Ore Generate?")
				.translation(Main.MODID + "config.bedrockGeneration")
				.define("bedrockGeneration", true);
		builder.pop();
		
	}

}
