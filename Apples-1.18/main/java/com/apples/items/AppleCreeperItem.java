package com.apples.items;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;

public class AppleCreeperItem extends Item {

	public AppleCreeperItem(Properties properties) {
		
		super(properties);

	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {
		
		if(!level.isClientSide()) {
			
			double random = Math.random() * 10;
			
			if(random > 1) {
				
				Creeper creeper = new Creeper(EntityType.CREEPER, level);
				
				creeper.setPos(livingentity.getX(), livingentity.getY(), livingentity.getZ());
				
				level.addFreshEntity(creeper);
				
				if(livingentity.isPassenger()) {
				
					livingentity.stopRiding();
				
				}
				
				livingentity.startRiding(creeper);
				
			} else {
				
				Creeper creeper = new Creeper(EntityType.CREEPER, level);
				
				LightningBolt lightningbolt = EntityType.LIGHTNING_BOLT.create(level);
				
				creeper.setPos(livingentity.getX(), livingentity.getY(), livingentity.getZ());
				creeper.thunderHit((ServerLevel) level, lightningbolt);
				
				level.addFreshEntity(creeper);
				
				if(livingentity.isPassenger()) {
				
					livingentity.stopRiding();
				
				}
				
				livingentity.startRiding(creeper);
				
			}
			
		}
	
		return livingentity.eat(level, itemstack);
		
	}	
	
}
