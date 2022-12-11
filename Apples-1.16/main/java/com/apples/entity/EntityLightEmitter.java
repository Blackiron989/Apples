package com.apples.entity;

import com.apples.potions.PotionLoader;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.network.NetworkHooks;

public class EntityLightEmitter extends Entity {
	
	public EntityLightEmitter(EntityType<? extends Entity> entitytype, World world) {
		
		super(entitytype, world);

	}
	
	public EntityLightEmitter(FMLPlayMessages.SpawnEntity packet, World world) {
		
		super(EntityLoader.LIGHT_EMITTER.get(), world);
		
	}
	
	@Override
	public void tick() {

		if(!this.world.isRemote) {
			
			if(this.getRidingEntity() instanceof PlayerEntity) {
				
				PlayerEntity playerentity = (PlayerEntity) this.getRidingEntity();
				
				if(playerentity.getActivePotionEffect(PotionLoader.POTION_EMITLIGHT.get()) == null) {
					
					this.remove();
					
				}
				
				if(!playerentity.isAlive()) {
					
					this.remove();
					
				}
				
			} else {
				
				this.remove();
				
			}
			
		}
		
	}

	@Override
	protected void registerData() {
		
	}

	@Override
	protected void readAdditional(CompoundNBT compound) {

	}

	@Override
	protected void writeAdditional(CompoundNBT compound) {

	}
	
	@Override
	public IPacket<?> createSpawnPacket() {
		
		return NetworkHooks.getEntitySpawningPacket(this);
		
	}

}
