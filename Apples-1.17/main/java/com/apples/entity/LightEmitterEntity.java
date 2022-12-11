package com.apples.entity;

import com.apples.potions.PotionLoader;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraftforge.fmllegacy.network.FMLPlayMessages;
import net.minecraftforge.fmllegacy.network.NetworkHooks;

public class LightEmitterEntity extends Entity {
	
	public LightEmitterEntity(EntityType<? extends Entity> entitytype, Level level) {
		
		super(entitytype, level);

	}
	
	public LightEmitterEntity(FMLPlayMessages.SpawnEntity packet, Level level) {
		
		super(EntityLoader.LIGHT_EMITTER.get(), level);
		
	}
	
	@Override
	public void tick() {

		if(!this.level.isClientSide()) {
			
			if(this.getFirstPassenger() instanceof Player) {
				
				Player playerentity = (Player) this.getFirstPassenger();
				
				if(!playerentity.hasEffect(PotionLoader.POTION_EMITLIGHT.get())) {
					
					this.remove(RemovalReason.DISCARDED);
					
				}
				
				if(!playerentity.isAlive()) {
					
					this.remove(RemovalReason.DISCARDED);
					
				}
				
			} else {
				
				this.remove(RemovalReason.DISCARDED);
				
			}
			
		}
		
	}

	@Override
	protected void defineSynchedData() {
	}

	@Override
	protected void readAdditionalSaveData(CompoundTag p_20052_) {
	}

	@Override
	protected void addAdditionalSaveData(CompoundTag p_20139_) {	
	}
	
	@Override
	public Packet<?> getAddEntityPacket() {
		
		return NetworkHooks.getEntitySpawningPacket(this);
		
	}

}
