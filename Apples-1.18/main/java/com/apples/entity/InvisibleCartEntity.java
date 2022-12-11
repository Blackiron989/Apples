package com.apples.entity;

import net.minecraft.network.protocol.Packet;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.AbstractMinecart;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

public class InvisibleCartEntity extends AbstractMinecart {

	public InvisibleCartEntity(EntityType<?> entitytype, Level level) {
		
		super(entitytype, level);

	}
	
	public InvisibleCartEntity(PlayMessages.SpawnEntity packet, Level level) {
		
		super(EntityLoader.INVISIBLE_CART.get(), level);
		
	}

	@Override
	public Type getMinecartType() {

		return AbstractMinecart.Type.RIDEABLE;
		
	}
	
	@Override
	public void checkDespawn() {

		if(!this.isVehicle()) {
			
			this.discard();
		
		}
		
	}
	
	@Override
	public void destroy(DamageSource damagesource) {
		
		this.ejectPassengers();
		this.discard();
		
	}
	
	@Override
	public boolean hurt(DamageSource damagesource, float amount) {
		
		if(!this.level.isClientSide() && !this.isRemoved()) {
			
			if(this.isInvulnerableTo(damagesource)) {
				
				return false;
				
			} else {
				
				this.ejectPassengers();
				this.discard();
				
				return true;
				
			}
			
		}
		
		return true;
		
	}
	
	@Override
	public Packet<?> getAddEntityPacket() {
		
		return NetworkHooks.getEntitySpawningPacket(this);
		
	}

}
