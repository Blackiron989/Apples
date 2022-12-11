package com.apples.items;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.monster.CreeperEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class ItemAppleCreeper extends Item {

	public ItemAppleCreeper(Properties properties) {
		
		super(properties);

	}

	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity livingentity) {
		
		if(!world.isRemote) {
			
			double random = Math.random() * 10;
			
			if(random > 1) {
				
				CreeperEntity creeperentity = new CreeperEntity(EntityType.CREEPER, world);
				
				creeperentity.setPosition(livingentity.getPosX(), livingentity.getPosY(), livingentity.getPosZ());
				
				world.addEntity(creeperentity);
				
				if(livingentity.isPassenger()) {
				
					livingentity.stopRiding();
				
				}
				
				livingentity.startRiding(creeperentity);
				
			} else {
				
				CreeperEntity creeperentity = new CreeperEntity(EntityType.CREEPER, world);
				LightningBoltEntity lightningboltentity = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, world);
				
				creeperentity.setPosition(livingentity.getPosX(), livingentity.getPosY(), livingentity.getPosZ());
				creeperentity.func_241841_a((ServerWorld) world, lightningboltentity);
				
				world.addEntity(creeperentity);
				
				if(livingentity.isPassenger()) {
				
					livingentity.stopRiding();
				
				}
				
				livingentity.startRiding(creeperentity);
				
			}
			
		}
	
		return this.isFood() ? livingentity.onFoodEaten(world, itemstack) : itemstack;
		
	}	
	
}
