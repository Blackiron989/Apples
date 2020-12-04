package com.apples.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;


public class ItemAppleSteve extends ItemFood {
	
	public ItemAppleSteve(String name, int amount, float saturation, boolean isWolfFood) {
		
		super(amount, saturation, isWolfFood);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setAlwaysEdible();
		
	}
	
	@Override
	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		
		if(!world.isRemote) {
			
			world.playSound(null, entityplayer.posX, entityplayer.posY, entityplayer.posZ, SoundEvents.ENTITY_GHAST_HURT, SoundCategory.PLAYERS, 1.0F, 1.0F);
			entityplayer.sendMessage(new TextComponentString("A horrible chill goes down your spine... "));
		
		}
		
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer entityplayer, EnumHand hand) {

		ItemStack itemstack = entityplayer.getHeldItem(hand);

        if (entityplayer.canEat(true)) {
        
        	double rand = Math.random();
        	if(rand > 0.6) {
        	
        		entityplayer.setActiveHand(hand);
        		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
        	
        	} else {
        		
        		Item item = itemstack.getItem();
        		if(item == this) {
        		
        			if(!world.isRemote) {
        				
        				entityplayer.dropItem(item, 1);
        				itemstack.shrink(1);
        				world.playSound(null, entityplayer.posX, entityplayer.posY, entityplayer.posZ, SoundEvents.ENTITY_PLAYER_HURT, SoundCategory.PLAYERS, 1.0F, 1.0F);
            		
        			}
        		
        		}
        		
        		return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
        		
        	}
        
        } else {
        	
        	return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
        	
        }
		
    }

}
