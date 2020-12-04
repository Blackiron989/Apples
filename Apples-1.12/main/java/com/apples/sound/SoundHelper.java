package com.apples.sound;

import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.SoundEvent;

public class SoundHelper {
	
	public static void player(SoundEvent sound) {
		
		Minecraft.getMinecraft().getSoundHandler().playSound(PositionedSoundRecord.getRecord(sound, 1.0F, 1.0F));
		
	}

}
