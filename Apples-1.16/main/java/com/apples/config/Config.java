package com.apples.config;

import java.nio.file.Path;

import org.apache.commons.lang3.tuple.Pair;

import com.apples.Main;
import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;

import net.minecraftforge.common.ForgeConfigSpec;

public class Config {

	public static final ForgeConfigSpec CLIENT_SPEC;
	public static final ForgeConfigSpec SERVER_SPEC;
	
	static final ClientConfig CLIENT;
	static final ServerConfig SERVER;

	static {

		{
			
			final Pair<ClientConfig, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(ClientConfig::new);
			CLIENT = specPair.getLeft();
			CLIENT_SPEC = specPair.getRight();
			
		}
		
		{
			
			final Pair<ServerConfig, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(ServerConfig::new);
			SERVER = specPair.getLeft();
			SERVER_SPEC = specPair.getRight();
			
		}
		
	}
	
	public static void loadConfig(ForgeConfigSpec spec, Path path) {
		
		final CommentedFileConfig configdata = CommentedFileConfig.builder(path)
				.sync()
				.autosave()
				.writingMode(WritingMode.REPLACE)
				.build();

		configdata.load();
		spec.setConfig(configdata);
		
	}
	
	public static final class Holder {
		
		public static boolean rubyGeneration;
		public static boolean bedrockGeneration;
		
		public static void load() {
			
			rubyGeneration = SERVER.rubyGeneration.get();
			bedrockGeneration = SERVER.bedrockGeneration.get();
			
			Main.LOGGER.info("Apples+ ruby config generation value = " + rubyGeneration);
			Main.LOGGER.info("Apples+ bedrock config generation value = " + bedrockGeneration);
			
		}
		
	}

}
