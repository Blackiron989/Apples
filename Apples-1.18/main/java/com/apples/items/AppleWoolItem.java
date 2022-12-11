package com.apples.items;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.util.Mth;
import net.minecraft.world.level.Level;

public class AppleWoolItem extends Item {

	private ArrayList<MobEffect> array() {
		
		ArrayList<MobEffect> list = new ArrayList<>();
		
		list.add(MobEffects.ABSORPTION);
		list.add(MobEffects.BLINDNESS);
		list.add(MobEffects.FIRE_RESISTANCE);
		list.add(MobEffects.DIG_SPEED);
		list.add(MobEffects.HUNGER);
		list.add(MobEffects.HARM);
		list.add(MobEffects.HEAL);
		list.add(MobEffects.INVISIBILITY);
		list.add(MobEffects.JUMP);
		list.add(MobEffects.LEVITATION);
		list.add(MobEffects.DIG_SLOWDOWN);
		list.add(MobEffects.CONFUSION);
		list.add(MobEffects.NIGHT_VISION);
		list.add(MobEffects.POISON);
		list.add(MobEffects.SLOW_FALLING);
		list.add(MobEffects.DAMAGE_BOOST);
		list.add(MobEffects.WEAKNESS);
		list.add(MobEffects.WITHER);
		
		return list;
		
	}
	
	public AppleWoolItem(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {
		
		if(!level.isClientSide()) {
			
			Random random = new Random();
			
			if(array().size() > 0) {
				
				int i = Mth.nextInt(random, 1, array().size());
						
				livingentity.addEffect(new MobEffectInstance(array().get(i - 1), 2400, 0));
			
			}
			
		}

		return livingentity.eat(level, itemstack);
		
	}

}
