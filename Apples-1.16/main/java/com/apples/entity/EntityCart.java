package com.apples.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.item.minecart.AbstractMinecartEntity;
import net.minecraft.network.IPacket;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.network.NetworkHooks;

public class EntityCart extends AbstractMinecartEntity {

	public EntityCart(EntityType<?> entitytype, World world) {
		
		super(entitytype, world);

	}
	
	public EntityCart(FMLPlayMessages.SpawnEntity packet, World world) {
		
		super(EntityLoader.INVISIBLE_CART.get(), world);
		
	}

	@Override
	public Type getMinecartType() {

		return AbstractMinecartEntity.Type.RIDEABLE;
		
	}
	
	@Override
	public void killMinecart(DamageSource damagesource) {
		
		this.remove();
		
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public boolean attackEntityFrom(DamageSource damagesource, float amount) {
		
		if(!this.world.isRemote && !this.removed) {
			
			if(this.isInvulnerableTo(damagesource)) {
				
				return false;
				
			} else {
				
				this.killMinecart(damagesource);
				return true;
				
			}
			
		}
		
		return true;
		
	}
	
	@Override
	public IPacket<?> createSpawnPacket() {
		
		return NetworkHooks.getEntitySpawningPacket(this);
		
	}

}
