package com.apples.potions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.apples.network.PacketHandler;
import com.apples.network.PacketRightMouseDown;
import com.google.common.collect.Lists;

import net.minecraft.client.Minecraft;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.FireworkRocketEntity;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.FireworkRocketItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class AppleFireworkEffect extends ApplesPlusEffect {

	public static boolean rightMouseDown = false;
	private static int delay = 0;
	
	protected AppleFireworkEffect(MobEffectCategory category, int liquidcolor) {
		
		super(category, liquidcolor);

	}
	
	@Override
	public void applyEffectTick(LivingEntity livingentity, int amplifier) { //If isReady returned true, fires every tick...
		
		if(this == PotionLoader.POTION_FIREWORK.get()) {
			
			Level level = livingentity.level;
			
			if(delay == 0) {
			
				if(level.isClientSide() && !rightMouseDown) {
					
					if(Minecraft.getInstance().mouseHandler.isRightPressed()) {
						
						PacketHandler.sendToServer(new PacketRightMouseDown(1));
						
					}
					
				}
				
				if(rightMouseDown) {
					
					delay = 16;
					
					if(!level.isClientSide()) {
					
						float f = -Mth.sin(livingentity.getYRot() * ((float)Math.PI / 180F)) * Mth.cos(livingentity.getXRot() * ((float)Math.PI / 180F));
					    float f1 = -Mth.sin(livingentity.getXRot() * ((float)Math.PI / 180F));
					    float f2 = Mth.cos(livingentity.getYRot() * ((float)Math.PI / 180F)) * Mth.cos(livingentity.getXRot() * ((float)Math.PI / 180F));
						
					    ItemStack itemstack = createFirework();
					    
						FireworkRocketEntity fireworkrocketentity = new FireworkRocketEntity(level, livingentity.getX(), livingentity.getY(), livingentity.getZ(), itemstack);
		
						fireworkrocketentity.shoot((double)f, (double)f1, (double)f2, 0.1F, 1.0F);
						
						level.addFreshEntity(fireworkrocketentity);
						
						if(livingentity.isPassenger()) {
							
							livingentity.stopRiding();
							
						}
						
						livingentity.startRiding(fireworkrocketentity);
					
					}
					
					rightMouseDown = false;
				
				}
				
			}
		
			delay = Math.max(0, --delay);
			
		}
		
	}
	
	private ItemStack createFirework() {
		
		Random random = new Random();
		
		ItemStack itemstack = new ItemStack(Items.FIREWORK_ROCKET);
		
		FireworkRocketItem.Shape shape = FireworkRocketItem.Shape.SMALL_BALL;
		
		ArrayList<FireworkRocketItem.Shape> shapes = new ArrayList<>();
		
		shapes.add(FireworkRocketItem.Shape.SMALL_BALL);
		shapes.add(FireworkRocketItem.Shape.LARGE_BALL);
		shapes.add(FireworkRocketItem.Shape.STAR);
		shapes.add(FireworkRocketItem.Shape.BURST);
		shapes.add(FireworkRocketItem.Shape.CREEPER);

		int length = shapes.size();
		for(int y = 0; y < length; y++) {

			shape = shapes.get(y);
			
			int rand = Mth.nextInt(random, 0, 1);
			
			if(rand > 0) {
				
				break;
				
			}
			
		}
		
		itemstack.getOrCreateTagElement("Fireworks"); ///// ?????? 
		
		CompoundTag compoundnbt = itemstack.getTagElement("Fireworks"); ///// ??????
		
		ItemStack itemstack1 = new ItemStack(Items.FIREWORK_STAR);
		
		itemstack1.getOrCreateTagElement("Explosion");
		
		CompoundTag compoundnbt1 = itemstack1.getTagElement("Explosion");
		
		ListTag listnbt = new ListTag();
		
		List<Integer> list = Lists.newArrayList();
		
		DyeColor[] arr = DyeColor.values();
		for(int u = arr.length - 1; u > 0; u--) {
			
			int j = random.nextInt(u);
			
			DyeColor temp = arr[u]; 
            arr[u] = arr[j]; 
            arr[j] = temp;
			
		}
		
		int colors = DyeColor.values().length;
		
		for(int i = 0; i < colors; i++) {
			
			list.add(DyeColor.byId(arr[i].getId()).getFireworkColor());
			
			int rand = Mth.nextInt(random, 0, 1);
			
			if(rand > 0) {
				
				break;
				
			}
			
		}
		
		compoundnbt1.putBoolean("Flicker", true);
		compoundnbt1.putBoolean("Trail", true);
		compoundnbt1.putIntArray("Colors", list);
		compoundnbt1.putByte("Type", (byte)shape.getId()); ///// ??????? 
		
		listnbt.add(compoundnbt1);
		
		compoundnbt.putByte("Flight", (byte)1);
		compoundnbt.put("Explosions", listnbt);
		
		return itemstack;
		
	}

}
