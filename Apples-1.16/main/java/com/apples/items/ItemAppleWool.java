package com.apples.items;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class ItemAppleWool extends Item {

	private ArrayList<Effect> array() {
		
		ArrayList<Effect> list = new ArrayList<>();
		
		list.add(Effects.ABSORPTION);
		list.add(Effects.BLINDNESS);
		list.add(Effects.FIRE_RESISTANCE);
		list.add(Effects.HASTE);
		list.add(Effects.HUNGER);
		list.add(Effects.INSTANT_DAMAGE);
		list.add(Effects.INSTANT_HEALTH);
		list.add(Effects.INVISIBILITY);
		list.add(Effects.JUMP_BOOST);
		list.add(Effects.LEVITATION);
		list.add(Effects.MINING_FATIGUE);
		list.add(Effects.NAUSEA);
		list.add(Effects.NIGHT_VISION);
		list.add(Effects.POISON);
		list.add(Effects.SLOW_FALLING);
		list.add(Effects.STRENGTH);
		list.add(Effects.WEAKNESS);
		list.add(Effects.WITHER);
		
		return list;
		
	}
	
	public ItemAppleWool(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity livingentity) {
		
		if(!world.isRemote) {
			
			Random random = new Random();
			
			if(array().size() > 0) {
				
				int i = MathHelper.nextInt(random, 1, array().size());
						
				livingentity.addPotionEffect(new EffectInstance(array().get(i - 1), 2400, 0));
			
			}
			
		}

		return this.isFood() ? livingentity.onFoodEaten(world, itemstack) : itemstack;
		
	}

}
