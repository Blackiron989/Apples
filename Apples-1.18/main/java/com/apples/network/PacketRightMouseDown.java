package com.apples.network;

import java.util.function.Supplier;

import com.apples.potions.AppleFireballEffect;
import com.apples.potions.AppleFireworkEffect;
import com.apples.potions.AppleSnowballEffect;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.network.NetworkEvent;

public class PacketRightMouseDown {
		
	private int id;
	
	public PacketRightMouseDown(FriendlyByteBuf buf) {
		id = buf.readInt();
	}
	
	public PacketRightMouseDown(int i) {
		this.id = i;
	}

	public static void encode(PacketRightMouseDown msg, FriendlyByteBuf buf) {
		buf.writeInt(msg.id);
	}
	
	/*public static PacketRightMouseDown decode(FriendlyByteBuf buf) {
		return new PacketRightMouseDown(0);
	}*/
	
	public static void messageHandler(PacketRightMouseDown msg, Supplier<NetworkEvent.Context> ctx) {
		
		ctx.get().enqueueWork(() -> {
			
			ServerPlayer serverplayerentity = ctx.get().getSender(); 
			
			if(serverplayerentity == null) {

				return;
				
			}

			effectClass(msg);
			
		});
		
		ctx.get().setPacketHandled(true);
		
	}
	
	private static void effectClass(PacketRightMouseDown msg) {
		
		switch(msg.id) {
		
			case 0: 
				AppleFireballEffect.rightMouseDown = true;
				break;
			case 1: 
				AppleFireworkEffect.rightMouseDown = true;
				break;
			case 2: 
				AppleSnowballEffect.rightMouseDown = true;
				break;
	
		} 
		
	}

}
