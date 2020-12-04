package com.apples.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityTippedArrow;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class ItemAppleArrow extends ItemFood {
	
	public ItemAppleArrow(String name, int amount, float saturation, boolean isWolfFood) {
		
		super(amount, saturation, isWolfFood);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setAlwaysEdible();
		
	}
	
	@Override
	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		
		if(!world.isRemote) {  
            
            for(int i = 0; i < 7; i++) {
            	
            	double random = Math.random() * 120 + 1;
            	float entitypitch = (float) (random * entityplayer.rotationPitch);
            	float entityyaw = (float) (random * entityplayer.rotationYaw);
            	
            	EntityArrow entityarrow = ItemAppleArrow.createArrow(world, itemstack, entityplayer);
            	entityarrow.shoot(entityplayer, entitypitch, entityyaw, 0.0F, 3.0F, 1.0F);
            	world.spawnEntity(entityarrow);
            	
            }
            
		}
		
	}
	
	
	private static EntityArrow createArrow(World world, ItemStack stack, EntityLivingBase living)
    {
        EntityTippedArrow entitytippedarrow = new EntityTippedArrow(world, living);
        entitytippedarrow.setPotionEffect(stack);
        return entitytippedarrow;
    }

}