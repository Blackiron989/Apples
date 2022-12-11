package com.apples.items;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class ItemAppleCursed extends Item {

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
	
	public ItemAppleCursed(Properties properties) {
		
		super(properties);
		
	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity livingentity) {
		
		if(!world.isRemote) {
			
			Random random = new Random();
			
			int i = MathHelper.nextInt(random, 0, 3);
			
			switch(i) {
			
				case 0:
					
					livingentity.addPotionEffect(new EffectInstance(Effects.BLINDNESS, 400, 0));
					livingentity.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 400, 0));
					
				break;
					
				case 1:
					
					if(world.canBlockSeeSky(livingentity.getPosition())) {
						
						LightningBoltEntity lightningboltentity = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, world);
						
						world.addEntity(lightningboltentity);
						
					} else {
						
						livingentity.setFire(10);
						
					}
					
				break;
				
				case 2:
					
					int height = (int)livingentity.getPosY();
					
					while(height > 1) {
						
						BlockPos blockpos = new BlockPos(livingentity.getPosX(), height, livingentity.getPosZ());
						BlockState blockstate = world.getBlockState(blockpos);
						
						if(blockstate.getBlockHardness(world, blockpos) > -1) {
							
							world.setBlockState(blockpos, Blocks.AIR.getDefaultState());
							
						} else {
							
							height = 0;
							
						}
						
						height--;
						
					}
					
				break;
				
				case 3:
					
					int j = MathHelper.nextInt(random, 1, apples().size());
					
					if(apples().size() > 0) {
						
						livingentity.entityDropItem(apples().get(j - 1), 0);
						
					}
					
				break;
			
			}
			
		}
	
		return this.isFood() ? livingentity.onFoodEaten(world, itemstack) : itemstack;
		
	}
	
}
