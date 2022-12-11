package com.apples.network;

import com.apples.Main;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fmllegacy.network.NetworkRegistry;
import net.minecraftforge.fmllegacy.network.simple.SimpleChannel;

public class PacketHandler {
	
	private static final String PROTOCOL_VERSION = "1";

	public static final SimpleChannel SIMPLE_CHANNEL = NetworkRegistry.newSimpleChannel(new ResourceLocation(Main.MODID, "main"), () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);

	public static int index = 0;
	
	public static void load() {
		
		SIMPLE_CHANNEL.registerMessage(index++, PacketRightMouseDown.class, PacketRightMouseDown::encode, PacketRightMouseDown::new, PacketRightMouseDown::messageHandler);
		
	}
	
	public static void sendToServer(Object object) {
		
		SIMPLE_CHANNEL.sendToServer(object);
		
	}

}
