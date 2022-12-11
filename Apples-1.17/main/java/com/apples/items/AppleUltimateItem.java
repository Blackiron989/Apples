package com.apples.items;

import com.apples.config.Config;

import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.Level;

public class AppleUltimateItem extends Item {

	private boolean config = Config.Holder.ultimateAppleEffect;
	
	public AppleUltimateItem(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {
		
		if(!level.isClientSide() && config) {
			
			livingentity.sendMessage(new TranslatableComponent("Congratulations!"), livingentity.getUUID());
			if(livingentity instanceof ServerPlayer) {
				
				if(!((ServerPlayer)livingentity).getAbilities().instabuild) {
				
					((ServerPlayer)livingentity).setGameMode(GameType.CREATIVE);
				
				}
				
			}
			
		}

		return itemstack;
		
	}
	
	@Override
	public boolean isFoil(ItemStack itemstack) {
		
		return true;
		
	}

}
