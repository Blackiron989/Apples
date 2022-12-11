package com.apples.items;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.core.BlockPos;
import net.minecraft.data.worldgen.StructureFeatures;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.ComponentUtils;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.levelgen.feature.StructureFeature;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;

public class AppleNetherBrickItem extends Item {

	public AppleNetherBrickItem(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {
		
		if(!level.isClientSide()) {
			
			if(level.dimension() == Level.NETHER) {

				ServerLevel server = (ServerLevel)level;
				
				BlockPos blockpos = server.getLevel().findNearestMapFeature(StructureFeature.NETHER_BRIDGE, livingentity.blockPosition(), 100, false);
				
				if(blockpos == null) {
					
					livingentity.sendMessage(new TranslatableComponent("No Fortress Nearby"), livingentity.getUUID());
					
				} else {

					int i = Mth.floor(dist((int)livingentity.getX(), (int)livingentity.getZ(), blockpos.getX(), blockpos.getZ()));
					Component component = ComponentUtils.wrapInSquareBrackets(new TranslatableComponent("chat.coordinates", blockpos.getX(), "~", blockpos.getZ()));
					livingentity.sendMessage(new TranslatableComponent("commands.locate.success", StructureFeatures.NETHER_BRIDGE.feature.getFeatureName(), component, i), livingentity.getUUID());
				
				}
			
			} else {
				
				livingentity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 600, 0));
				
			}
			
		}

		return livingentity.eat(level, itemstack);
		
	}
	
	private static float dist(int playerx, int playerz, int fortressx, int fortressz) {
		
      int i = fortressx - playerx;
      int j = fortressz - playerz;
      
      return Mth.sqrt((float)(i * i + j * j));
      
   }

}
