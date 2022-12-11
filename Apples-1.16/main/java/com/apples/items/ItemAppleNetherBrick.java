package com.apples.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.server.ServerWorld;

public class ItemAppleNetherBrick extends Item {

	public ItemAppleNetherBrick(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity livingentity) {
		
		if(!world.isRemote) {
			
			if(world.getDimensionKey() == World.THE_NETHER) {

				ServerWorld serverworld = (ServerWorld) world;
				
				//BlockPos blockpos = serverworld.findNearestStructure("Fortress", livingentity.getPosition(), 100, false);
				BlockPos blockpos = serverworld.func_241117_a_(Structure.FORTRESS, livingentity.getPosition(), 100, false);
				
				if(blockpos == null) {
					
					ITextComponent itextcomponent = new StringTextComponent("No Fortress Nearby");
					livingentity.sendMessage(itextcomponent, livingentity.getUniqueID());
					
				} else {
				
					ITextComponent itextcomponent = TextComponentUtils.wrapWithSquareBrackets(new TranslationTextComponent("chat.coordinates", blockpos.getX(), "~", blockpos.getZ()));
					livingentity.sendMessage(itextcomponent, livingentity.getUniqueID());
				
				}
			
			} else {
				
				livingentity.addPotionEffect(new EffectInstance(Effects.WEAKNESS, 600, 0));
				
			}
			
		}

		return this.isFood() ? livingentity.onFoodEaten(world, itemstack) : itemstack;
		
	}

}
