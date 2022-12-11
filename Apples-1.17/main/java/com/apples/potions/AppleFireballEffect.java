package com.apples.potions;

import com.apples.network.PacketHandler;
import com.apples.network.PacketRightMouseDown;

import net.minecraft.client.Minecraft;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.LargeFireball;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class AppleFireballEffect extends ApplesPlusEffect {

	public static boolean rightMouseDown = false;
	private static int delay = 0;
	
	protected AppleFireballEffect(MobEffectCategory category, int liquidcolor) {
		
		super(category, liquidcolor);

	}
	
	@Override
	public void applyEffectTick(LivingEntity livingentity, int amplifier) { //If isReady returned true, fires every tick...
		
		if(this == PotionLoader.POTION_FIREBALL.get()) {
			
			Level level = livingentity.level;
			
			if(delay == 0) {
			
				if(level.isClientSide() && !rightMouseDown) {
					
					if(Minecraft.getInstance().mouseHandler.isRightPressed()) {
						
						PacketHandler.sendToServer(new PacketRightMouseDown(0));
						
					}
					
				}
	
				if(rightMouseDown) {
					
					delay = 16;
					
					if(!level.isClientSide()) {
	
						Vec3 vec3 = livingentity.getViewVector(1.0F);
			            double d2 = livingentity.getX() - (livingentity.getX() + vec3.x * 4.0D);
			            double d3 = livingentity.getY(0.5D) - (0.5D + livingentity.getY(0.5D));
			            double d4 = livingentity.getZ() - (livingentity.getZ() + vec3.z * 4.0D);
	
						LargeFireball fireball = new LargeFireball(level, livingentity, -d2, d3, -d4, 2);
						
						//fireball.setPos(livingentity.getX() + vec3.x * 4.0D, livingentity.getY(0.5D) + 0.5D, fireball.getZ() + vec3.z * 4.0D);
						fireball.shootFromRotation(livingentity, livingentity.getXRot(), livingentity.getYRot(), 0.0F, 1.5F, 1.0F);
						
						level.addFreshEntity(fireball);
					
					}
					
					rightMouseDown = false;
					
				}
				
			}
			
		}
		
		delay = Math.max(0, --delay);
		
	}

}
