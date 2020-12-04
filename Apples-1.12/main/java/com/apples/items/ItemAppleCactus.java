package com.apples.items;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemAppleCactus extends ItemFood {
	
	private Potion potionID;
	private int potionLength;
	private int potionAmplifier;
	
	public ItemAppleCactus(String name, int amount, float saturation, boolean isWolfFood, Potion potion, int effectAmount, int effectModifier) {
		
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setAlwaysEdible();
		
		potionID = potion;
		potionLength = effectAmount;
		potionAmplifier = effectModifier;
		
	}
	
	@Override
	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		
		if(!world.isRemote) {
			
			if(potionID != null) {
			
											/** Effect / Effect Amount / Effect Modifier / Beacon Effect / Show Particles **/
				entityplayer.addPotionEffect(new PotionEffect(potionID, potionLength * 5, potionAmplifier, false, false));
				entityplayer.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 15 * 20, potionAmplifier, false, false));
			
			}
			
		}
		
		if(world.isRemote) {
			
			Minecraft.getMinecraft().player.sendChatMessage("Drink cactus juice! It'll quench ya! Nothings quenchier! It's the quenchiest!");
			
		}
		
	}

}
