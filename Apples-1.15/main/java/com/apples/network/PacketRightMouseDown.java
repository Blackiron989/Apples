package com.apples.network;

import java.util.function.Supplier;

import com.apples.potions.PotionEffect;

import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.network.NetworkEvent;

public class PacketRightMouseDown {
		
	public static void encode(PacketRightMouseDown msg, PacketBuffer packetbuffer) {
		
		//packetbuffer.writeBoolean();
		
	}
	
	public static PacketRightMouseDown decode(PacketBuffer packetbuffer) {
		
		return new PacketRightMouseDown();
		
	}
	
	public static void messageHandler(PacketRightMouseDown msg, Supplier<NetworkEvent.Context> ctx) {
		
		ctx.get().enqueueWork(() -> {
			
			ServerPlayerEntity serverplayerentity = ctx.get().getSender(); 
			
			if(serverplayerentity == null) {

				return;
				
			}

			PotionEffect.rightMouseDown = true;
			
		});
		
		ctx.get().setPacketHandled(true);
		
	}

}
