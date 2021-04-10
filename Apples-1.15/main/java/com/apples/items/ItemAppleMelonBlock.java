package com.apples.items;

import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class ItemAppleMelonBlock extends Item {

	public ItemAppleMelonBlock(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity livingentity) {
		
		if(!world.isRemote) {
			
			EquipmentSlotType equipmentslottype = MobEntity.getSlotForItemStack(new ItemStack(Items.DIAMOND_HELMET));
			
			ItemStack itemstack1 = livingentity.getItemStackFromSlot(equipmentslottype);
			livingentity.entityDropItem(itemstack1);
			
			livingentity.setItemStackToSlot(equipmentslottype, new ItemStack(Blocks.MELON.asItem()));
			
		}

		return this.isFood() ? livingentity.onFoodEaten(world, itemstack) : itemstack;
		
	}

}
