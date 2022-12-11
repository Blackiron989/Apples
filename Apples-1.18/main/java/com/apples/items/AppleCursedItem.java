package com.apples.items;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.level.Level;

public class AppleCursedItem extends Item {

	public AppleCursedItem(Properties properties) {
		
		super(properties);
		
	}
	
	private ArrayList<ItemStack> apples() {
		
		ArrayList<ItemStack> list = new ArrayList<>();
		
		list.add(ItemLoader.APPLEDIRT.get().getDefaultInstance());
		list.add(ItemLoader.APPLECOAL.get().getDefaultInstance());
		list.add(ItemLoader.APPLEBRICK.get().getDefaultInstance());
		list.add(ItemLoader.APPLECLAY.get().getDefaultInstance());
		list.add(ItemLoader.APPLEEATEN.get().getDefaultInstance());
		list.add(ItemLoader.APPLESTICK.get().getDefaultInstance());
		list.add(ItemLoader.APPLESTONE.get().getDefaultInstance());
		list.add(ItemLoader.APPLEROTTENFLESH.get().getDefaultInstance());
		list.add(ItemLoader.APPLESPIDEREYE.get().getDefaultInstance());
		
		return list;
		
	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {
		
		if(!level.isClientSide()) {
			
			Random random = new Random();
			
			int i = Mth.nextInt(random, 0, 4);
			
			switch(i) {
			
				case 0:
					
					livingentity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 400, 0));
					livingentity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 400, 0));
					
				break;
					
				case 1:
					
					if(level.canSeeSky(livingentity.blockPosition())) {
						
						LightningBolt lightningbolt = EntityType.LIGHTNING_BOLT.create(level);

						lightningbolt.moveTo(livingentity.getX(), livingentity.getY(), livingentity.getZ());
						
						level.addFreshEntity(lightningbolt);

						
					} else {
						
						livingentity.setSecondsOnFire(10);
						
					}
					
				break;
				
				case 2:
					
					int height = (int)livingentity.getY();
					
					while(height > 1) {
						
						BlockPos blockpos = new BlockPos(livingentity.getX(), height, livingentity.getZ());
						BlockState blockstate = level.getBlockState(blockpos);
						
						if(blockstate.getBlock() != Blocks.BEDROCK) {
							
							level.setBlockAndUpdate(blockpos, Blocks.AIR.defaultBlockState());
							
						} else {
							
							height = 0;
							
						}
						
						height--;
						
					}
					
				break;
				
				case 3:
					
					int rand = Mth.nextInt(random, 1, apples().size());
					
					if(apples().size() > 0) {
						
						livingentity.spawnAtLocation(apples().get(rand - 1));
						
					}
					
				break;
			
			}
			
		}
	
		return livingentity.eat(level, itemstack);
		
	}
	
}
