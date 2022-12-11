package com.apples.config;

import com.apples.Main;

import net.minecraftforge.common.ForgeConfigSpec;

public class ClientConfig {
	
	final ForgeConfigSpec.BooleanValue client;
	
	ClientConfig(final ForgeConfigSpec.Builder builder) {
		
		builder.push("general");
		
		client = builder
				.comment("client")
				.translation(Main.MODID + ".config.client")
				.define("client", true);
		builder.pop();
		
	}

}
