package com.apples.potions;

import java.util.List;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class AppleWitchEffect extends ApplesPlusEffect {

	private int potionUseTimer = 0;
	
	protected AppleWitchEffect(MobEffectCategory category, int liquidcolor) {
		
		super(category, liquidcolor);

	}
	
	@Override
	public void applyEffectTick(LivingEntity livingentity, int amplifier) { //If isReady returned true, fires every tick...
		
		if(this == PotionLoader.POTION_WITCH.get()) {
			
			if(potionUseTimer <= 0) {
				
				if(!livingentity.level.isClientSide()) {
					
					double d0 = livingentity.getX();
			        double d1 = livingentity.getY() + livingentity.getEyeHeight();
			        double d2 = livingentity.getZ();
			        float f = Mth.sqrt((float)(d0 * d0 + d2 * d2));
			        int timer = 50;
			        float velocity = 0.75f;
			        
			        Potion potion = null;
					
					AABB axisalignedbb = (new AABB(livingentity.blockPosition())).inflate(5);
			        List<Monster> list = livingentity.level.getEntitiesOfClass(Monster.class, axisalignedbb);

			        for(Monster monsterentity : list) {
			        	
			        	Vec3 vec3 = monsterentity.getDeltaMovement();
				        d0 = monsterentity.getX() + vec3.x - livingentity.getX();
				        d1 = monsterentity.getY() + (double)monsterentity.getEyeHeight() - (double)1.1F - livingentity.getY();
				        d2 = monsterentity.getZ() + vec3.z - livingentity.getZ();
				        
			        	if(!monsterentity.isInvertedHealAndHarm()) {
			        		
			        		double r = Math.random();
			        		
			        		if(r > 0.6D) {
			        			
			        			potion = Potions.POISON;
			        			
			        		} else {
			        			
			        			potion = Potions.HARMING;
			        			
			        		}
			        		
			        	} else {
			        		
			        		potion = Potions.STRONG_HEALING;
			        		
			        	}	      

		                velocity = 0.75f;
		                
		                break;
			            
			        }
			        
			        if(livingentity.getHealth() <= 10.0F) {
		        		
		        		d0 = livingentity.getX();
		        		d1 = livingentity.getY() + livingentity.getEyeHeight();
		        		d2 = livingentity.getZ();
		        		
		        		potion = Potions.HEALING;

		                velocity = 0f;
		        		
		        	}
		        	
		        	if(livingentity.isOnFire() && !livingentity.hasEffect(MobEffects.FIRE_RESISTANCE)) {
		        		
		        		d0 = livingentity.getX();
		        		d1 = livingentity.getY() + livingentity.getEyeHeight();
		        		d2 = livingentity.getZ();
		        		
		        		potion = Potions.FIRE_RESISTANCE;

		                velocity = 0f;
		        		
		        	}
		        	
		        	if(potion != null) {
		        		
		        		f = Mth.sqrt((float)(d0 * d0 + d2 * d2));
			        	ThrownPotion thrownpotion = new ThrownPotion(livingentity.level, livingentity);
			        	thrownpotion.setItem(PotionUtils.setPotion(new ItemStack(Items.SPLASH_POTION), potion));
			        	thrownpotion.setXRot(thrownpotion.getXRot() - -20.0F);;
			        	thrownpotion.shoot(d0, d1 + (double)(f * 0.2F), d2, velocity, 8.0F);
		                livingentity.level.playSound((Player)null, livingentity.getX(), livingentity.getY(), livingentity.getZ(), SoundEvents.WITCH_THROW, SoundSource.HOSTILE, 1.0F, 1.0F);
		                livingentity.level.addFreshEntity(thrownpotion);
		                
		                timer = 50;
	                
		        	}
	                
	                potionUseTimer = timer;
					
				}
				
			} else {
				
				potionUseTimer--;
				
			}
			
		}
		
	}

}
