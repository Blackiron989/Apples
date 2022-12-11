package com.apples.potions;

import java.util.List;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;

public class AppleCobwebEffect extends ApplesPlusEffect {

	//OLD COBWEB EFFECT CODE - TO BE REMOVED
	//private int webTimer = 0;
	
	protected AppleCobwebEffect(MobEffectCategory category, int liquidcolor) {
		
		super(category, liquidcolor);

	}
	
	@Override
	public void applyEffectTick(LivingEntity livingentity, int amplifier) { //If isReady returned true, fires every tick...
	
		if(this == PotionLoader.POTION_COBWEB.get()) {
			
			Level level = livingentity.level;
			
			if (!level.isClientSide()) {
				
		        AABB axisalignedbb = (new AABB(livingentity.blockPosition())).inflate(30).expandTowards(0.0D, (double)level.getHeight(), 0.0D);
		        List<LivingEntity> list = level.getEntitiesOfClass(LivingEntity.class, axisalignedbb);
	
		        for(LivingEntity living : list) {
		        	
		        	if(livingentity != living) {
		        		
		        		if(living.isAffectedByPotions()) {
		        		
		        			living.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100, 1, true, true));
		        		
		        		}
		        	
		        	}
		            
		        }
	
			}
			
		}
		
		//OLD COBWEB POTION EFFECT CODE - TO BE REMOVED
		/* if(this == PotionLoader.POTION_COBWEB.get()) {
			
			World world = livingentity.world;
			
			if(world.isRemote) {
				
				if(webTimer > 20) {
					
					if(rightMouseDown()) {
						
						PacketHandler.sendToServer(new PacketRightMouseDown());
						webTimer = 0;
						
					}
				
				} else {
					
					webTimer++;
					
				}
			
			}
	
			if(rightMouseDown) {
				
				float f = -MathHelper.sin(livingentity.rotationYaw * ((float)Math.PI / 180F)) * MathHelper.cos(livingentity.rotationPitch * ((float)Math.PI / 180F));
			    float f1 = -MathHelper.sin(livingentity.rotationPitch * ((float)Math.PI / 180F));
			    float f2 = MathHelper.cos(livingentity.rotationYaw * ((float)Math.PI / 180F)) * MathHelper.cos(livingentity.rotationPitch * ((float)Math.PI / 180F));
				
			    Random random = new Random();
			    
			    int rand = MathHelper.nextInt(random, 1, 100);
			    
			    if(rand > 25) {
			    	
			    	FallingBlockEntity fallingblockentity = new FallingBlockEntity(world, livingentity.getPosX(), livingentity.getPosY(), livingentity.getPosZ(), Blocks.COBWEB.getDefaultState());
			    	
			    	fallingblockentity.setPosition(livingentity.getPosX(), livingentity.getPosY() + 1, livingentity.getPosZ());
			    	fallingblockentity.setMotion((double)f, (double)f1, (double)f2);
					fallingblockentity.fallTime = 50;
					
					world.addEntity(fallingblockentity);
			    	
			    } else if(rand > 10) {
			    	
			    	SpiderEntity spiderentity = new SpiderEntity(EntityType.SPIDER, world);
			    	
			    	spiderentity.setPosition(livingentity.getPosX(), livingentity.getPosY() + 1, livingentity.getPosZ());
			    	spiderentity.setMotion((double)f, (double)f1, (double)f2);
			    	
			    	world.addEntity(spiderentity);
			    	
			    } else {
			    	
			    	CaveSpiderEntity cavespiderentity = new CaveSpiderEntity(EntityType.CAVE_SPIDER, world);
			    	
			    	cavespiderentity.setPosition(livingentity.getPosX(), livingentity.getPosY() + 1, livingentity.getPosZ());
			    	cavespiderentity.setMotion((double)f, (double)f1, (double)f2);
			    	
			    	world.addEntity(cavespiderentity);
			    	
			    }
			    
			    rightMouseDown = false;
				
			}
	
		} */
		
	}

}
