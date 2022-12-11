package com.apples.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class ItemAppleUltimate extends ItemFood {

	private Potion potionID;
	private int potionLength;
	private int potionAmplifier;
	
	public ItemAppleUltimate(String name, int amount, float saturation, boolean isWolfFood, Potion potion, int effectAmount, int effectModifier) {
		
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
				entityplayer.addPotionEffect(new PotionEffect(potionID, potionLength * 20, potionAmplifier, false, false));
			
			}
			
		}
	
	}
	
	@SideOnly(Side.CLIENT)
	@Override
    public boolean hasEffect(ItemStack stack)
    {
        return true;
    }
	
}