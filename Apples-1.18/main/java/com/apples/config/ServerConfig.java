package com.apples.config;

import com.apples.Main;

import net.minecraftforge.common.ForgeConfigSpec;

public class ServerConfig {
	
	//final ForgeConfigSpec.BooleanValue rubyGeneration;
	//final ForgeConfigSpec.BooleanValue bedrockGeneration;
	final ForgeConfigSpec.BooleanValue ultimateAppleEffect;
	
	ServerConfig(final ForgeConfigSpec.Builder builder) {
		
		builder.push("general");
		
		/*rubyGeneration = builder
				.comment("Should Ruby Ore Generate?")
				.translation(Main.MODID + ".config.rubyGeneration")
				.define("rubyGeneration", true);
		bedrockGeneration = builder
				.comment("Should Bedrock Ore Generate?")
				.translation(Main.MODID + "config.bedrockGeneration")
				.define("bedrockGeneration", true);*/
		ultimateAppleEffect = builder
				.comment("Enable ultimate apple effect?")
				.translation(Main.MODID + ".config.ultimateAppleEffect")
				.define("ultimateAppleEffect", true);
		builder.pop();
		
	}

}
