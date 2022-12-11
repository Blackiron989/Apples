package com.apples.potions;

import java.util.Random;

import com.apples.network.PacketHandler;
import com.apples.network.PacketRightMouseDown;

import net.minecraft.client.Minecraft;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.Snowball;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class AppleSnowballEffect extends ApplesPlusEffect {

	public static boolean rightMouseDown = false;
	private static int delay = 0;
	
	protected AppleSnowballEffect(MobEffectCategory category, int liquidcolor) {
		
		super(category, liquidcolor);

	}
	
	@Override
	public void applyEffectTick(LivingEntity livingentity, int amplifier) { //If isReady returned true, fires every tick...
		
		if(this == PotionLoader.POTION_SNOWBALL.get()) {
			
			Level level = livingentity.level;
			
			if(delay == 0) {
			
				if(level.isClientSide() && !rightMouseDown) {
					
					if(Minecraft.getInstance().mouseHandler.isRightPressed()) {
						
						PacketHandler.sendToServer(new PacketRightMouseDown(2));
						
					}
					
				}
				
				if(rightMouseDown) {
					
					delay = 5;
					
					if(!level.isClientSide()) {
	
						Random random = new Random();
						for(int i = 0; i < Mth.randomBetweenInclusive(random, 1, 7); i++) {
						
							Snowball snowball = new Snowball(level, livingentity);
					        snowball.setItem(new ItemStack(Items.SNOWBALL));
					        
					        float f = random.nextFloat() * 10;
					        snowball.shootFromRotation(livingentity, livingentity.getXRot(), livingentity.getYRot(), 0.0F, 1.5F, f);
							
							level.addFreshEntity(snowball);
						
						}
					
					}
					
					rightMouseDown = false;
					
				}
				
			}
			
		}
			
		delay = Math.max(0, --delay);

	}

}
