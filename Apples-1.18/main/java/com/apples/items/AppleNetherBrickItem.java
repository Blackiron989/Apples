package com.apples.items;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.StructureFeatures;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.ComponentUtils;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.levelgen.feature.ConfiguredStructureFeature;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.TagKey;
import net.minecraft.util.Mth;

public class AppleNetherBrickItem extends Item {

	public AppleNetherBrickItem(Properties properties) {
		
		super(properties);

	}
	
	TagKey<ConfiguredStructureFeature<?, ?>> NETHER_FORTRESS = create("fortress");

	private static TagKey<ConfiguredStructureFeature<?, ?>> create(String str) {
      
		return TagKey.create(Registry.CONFIGURED_STRUCTURE_FEATURE_REGISTRY, new ResourceLocation(str));
	
	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {
		
		if(!level.isClientSide()) {
			
			if(level.dimension() == Level.NETHER) {

				ServerLevel server = (ServerLevel)level;
				BlockPos blockpos = null;

				blockpos = server.findNearestMapFeature(NETHER_FORTRESS, livingentity.blockPosition(), 100, false);

				if(blockpos == null) {
					
					livingentity.sendMessage(new TranslatableComponent("No Fortress Nearby"), livingentity.getUUID());
					
				} else {

					int i = Mth.floor(dist((int)livingentity.getX(), (int)livingentity.getZ(), blockpos.getX(), blockpos.getZ()));
					Component component = ComponentUtils.wrapInSquareBrackets(new TranslatableComponent("chat.coordinates", blockpos.getX(), "~", blockpos.getZ()));
					ResourceLocation location = StructureFeatures.FORTRESS.unwrapKey().get().location();
					livingentity.sendMessage(new TranslatableComponent("commands.locate.success", location, component, i), livingentity.getUUID());
				
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
