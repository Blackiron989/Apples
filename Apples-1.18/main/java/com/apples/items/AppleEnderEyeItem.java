package com.apples.items;

import net.minecraft.core.BlockPos;
import net.minecraft.data.worldgen.StructureFeatures;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.ComponentUtils;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.ConfiguredStructureTags;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
public class AppleEnderEyeItem extends Item {

	public AppleEnderEyeItem(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {
		
		if(!level.isClientSide()) {
			
			if(level.dimension() == Level.OVERWORLD) {

				ServerLevel server = (ServerLevel)level;

				BlockPos blockpos = server.findNearestMapFeature(ConfiguredStructureTags.EYE_OF_ENDER_LOCATED, livingentity.blockPosition(), 100, false);
				
				if(blockpos == null) {
					
					livingentity.sendMessage(new TranslatableComponent("No Stronghold Nearby"), livingentity.getUUID());
					
				} else {

					int i = Mth.floor(dist((int)livingentity.getX(), (int)livingentity.getZ(), blockpos.getX(), blockpos.getZ()));
					Component component = ComponentUtils.wrapInSquareBrackets(new TranslatableComponent("chat.coordinates", blockpos.getX(), "~", blockpos.getZ()));
					ResourceLocation location = StructureFeatures.STRONGHOLD.unwrapKey().get().location();
					livingentity.sendMessage(new TranslatableComponent("commands.locate.success", location, component, i), livingentity.getUUID());
				
				}
			
			} else {
				
				level.playSound(null, livingentity.blockPosition(), SoundEvents.ENDER_EYE_DEATH, SoundSource.PLAYERS, 1.0F, 1.0F);
				
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
