package com.apples.items;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.monster.CreeperEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

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
				
				creeperentity.setPosition(livingentity.posX, livingentity.posY, livingentity.posZ);
				
				world.addEntity(creeperentity);
				
				if(livingentity.isPassenger()) {
				
					livingentity.stopRiding();
				
				}
				
				livingentity.startRiding(creeperentity);
				
			} else {
				
				CreeperEntity creeperentity = new CreeperEntity(EntityType.CREEPER, world);
				LightningBoltEntity lightningboltentity = new LightningBoltEntity(world, livingentity.posX, livingentity.posY, livingentity.posZ, true);
				
				creeperentity.setPosition(livingentity.posX, livingentity.posY, livingentity.posZ);
				creeperentity.onStruckByLightning(lightningboltentity);
				
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
