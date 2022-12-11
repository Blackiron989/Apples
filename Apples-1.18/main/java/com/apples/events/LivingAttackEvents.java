package com.apples.events;

import java.util.List;
import java.util.Random;

import com.apples.potions.PotionLoader;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.Difficulty;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.IndirectEntityDamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class LivingAttackEvents {
	
	@SubscribeEvent
	public static void attackEvent(LivingAttackEvent livingattackevent) {
		
		if(livingattackevent.getEntityLiving().hasEffect(PotionLoader.POTION_BEENEST.get())) {
			
			LivingEntity livingentity = livingattackevent.getEntityLiving();
			Level level = livingentity.level;
			
			if(!level.isClientSide()) {

				if(livingattackevent.getSource().getDirectEntity() instanceof LivingEntity) {
					
					Bee bee = new Bee(EntityType.BEE, level);
					bee.setTarget((LivingEntity) livingattackevent.getSource().getDirectEntity());
					bee.setPos(livingentity.getX(), livingentity.getY() + 1, livingentity.getZ());
					level.addFreshEntity(bee);
				
				}
				
			}

		}
		
		if(livingattackevent.getEntityLiving().hasEffect(PotionLoader.POTION_RUBY.get())) {
			
			if(livingattackevent.getSource() instanceof IndirectEntityDamageSource) {

				livingattackevent.setCanceled(true);
				
			}

		}
		
		if(livingattackevent.getEntityLiving().hasEffect(PotionLoader.POTION_DRAGONEGG.get())) { 
			
			if(livingattackevent.getSource() == DamageSource.FALL) {
				
				livingattackevent.setCanceled(true);
				
			}
			
		}
		
		if(livingattackevent.getEntityLiving().hasEffect(PotionLoader.POTION_ZOMBIE.get())) {
			
			LivingEntity livingentity = livingattackevent.getEntityLiving();
			Level level = livingentity.level;
			
			if(!level.isClientSide()) {
				
				if(livingattackevent.getSource().getDirectEntity() instanceof Monster) {
					
					Monster monster = (Monster)livingattackevent.getSource().getDirectEntity();
			
					AABB axisalignedbb = (new AABB(livingentity.blockPosition())).inflate(10);
			        List<Entity> list = level.getEntities(null, axisalignedbb);
			        
			        Random rand = new Random();
	
			        if(list.size() <= 10) {
			        	
			        	if(monster != null && level.getDifficulty() != Difficulty.PEACEFUL) {
			        		
			        		int i = Mth.floor(livingentity.getX());
			                int j = Mth.floor(livingentity.getY());
			                int k = Mth.floor(livingentity.getZ());
			                
			                Zombie zombie = new Zombie(EntityType.ZOMBIE, level);
			                
			                for(int l = 0; l < 50; ++l) {
		
			                    int i1 = i + Mth.nextInt(rand, 3, 15) * Mth.nextInt(rand, -1, 1);
			                    int j1 = j + Mth.nextInt(rand, 3, 15) * Mth.nextInt(rand, -1, 1);
			                    int k1 = k + Mth.nextInt(rand, 3, 15) * Mth.nextInt(rand, -1, 1);
			                    
			                    BlockPos blockpos = new BlockPos(i1, j1 - 1, k1);
		
			                    if (level.getBlockState(blockpos).isValidSpawn(level, blockpos, zombie.getType())) {
			                    	
			                        zombie.setPos((double)i1, (double)j1, (double)k1);
	
			                        if (!level.hasNearbyAlivePlayer((double)i1, (double)j1, (double)k1, 7.0D) && level.isUnobstructed(zombie) && level.noCollision(zombie) && !level.containsAnyLiquid(zombie.getBoundingBox())) {	

			                        	zombie.setTarget(monster);
			                        	zombie.finalizeSpawn((ServerLevel)level, level.getCurrentDifficultyAt(livingentity.blockPosition()), MobSpawnType.REINFORCEMENT, (SpawnGroupData)null, (CompoundTag)null);
			                        	
			                        	level.addFreshEntity(zombie);
			                           
			                        	break;
			                           
			                        }
			                        
			                     }
			                    
			                }
			        		
			        	}
			        	
			        }
		        
				}
				
			}
			
		}
		
	}

}
