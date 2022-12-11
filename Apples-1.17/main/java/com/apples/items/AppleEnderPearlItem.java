package com.apples.items;

import net.minecraft.world.Difficulty;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Endermite;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.Level;

public class AppleEnderPearlItem extends Item {

	public AppleEnderPearlItem(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {
		
		if(!level.isClientSide()) {

	        for(int i = 0; i < 16; ++i) {
	        	
	        	double d = livingentity.getX() + (livingentity.getRandom().nextDouble() - 0.5D) * 64.0D;
	            double d1 = Mth.clamp(livingentity.getY() + (double)(livingentity.getRandom().nextInt(16) - 8), 0.0D, (double)(level.getHeight() - 1));
	            double d2 = livingentity.getZ() + (livingentity.getRandom().nextDouble() - 0.5D) * 64.0D;
	           
	            if (livingentity.isPassenger()) {
	        	   
	            	livingentity.stopRiding();
	               
	            } 
	
	            if(livingentity.randomTeleport(d, d1, d2, true)) {
	            	
	            	if(Math.random() <= 0.1D && level.getDifficulty() != Difficulty.PEACEFUL && level.getGameRules().getBoolean(GameRules.RULE_DOMOBSPAWNING)) {
	            		
	            		Endermite mite = new Endermite(EntityType.ENDERMITE, level);
	            		mite.setPos(livingentity.getX(), livingentity.getY(), livingentity.getZ());
	            		level.addFreshEntity(mite);
	            		
	            	}
	            	
	                level.playSound((Player)null, livingentity.getX(), livingentity.getY(), livingentity.getZ(), SoundEvents.ENDERMAN_TELEPORT, SoundSource.PLAYERS, 1.0F, 1.0F);
	                livingentity.playSound(SoundEvents.ENDERMAN_TELEPORT, 1.0F, 1.0F);
	                break;
	                
	            }
	            
	        }
			
		}
	
		return livingentity.eat(level, itemstack);
		
	}

}
