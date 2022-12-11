package com.apples.items;

import java.util.Random;

import com.apples.ApplesPlusUtils;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.entity.monster.WitherSkeleton;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class AppleWitherSkullItem extends Item {

	private boolean isEnchanted = false;
	
	public AppleWitherSkullItem(Properties properties, boolean enchanted) {
		
		super(properties);
		this.isEnchanted = enchanted;
		
	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {
	
		if(!level.isClientSide()) {
			
			Random random = new Random();
			
			if(random.nextBoolean()) {
				
				if(isEnchanted) {
					
					WitherBoss wither = new WitherBoss(EntityType.WITHER, level);
					wither.setPos(livingentity.getX(), livingentity.getY(), livingentity.getZ());
					level.addFreshEntity(wither);
					
				} else {
	
					WitherSkeleton wither = new WitherSkeleton(EntityType.WITHER_SKELETON, level);
					wither.setPos(livingentity.getX(), livingentity.getY(), livingentity.getZ());
					level.addFreshEntity(wither);
					
				}
			
			}
		
		}
		
		if(itemstack.isDamageableItem()) {
			
			return ApplesPlusUtils.damageableEat(level, itemstack, livingentity);
			
		}
		
		return livingentity.eat(level, itemstack);
		
	}
	
	@Override
	public boolean isFoil(ItemStack itemstack) {
		
		return isEnchanted;
		
	}

}
