package com.apples.items;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class AppleMelonBlockItem extends Item {

	public AppleMelonBlockItem(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level level, LivingEntity livingentity) {
		
		if(!level.isClientSide()) {
			
			EquipmentSlot slot = LivingEntity.getEquipmentSlotForItem(new ItemStack(Items.DIAMOND_HELMET));
			
			ItemStack itemstack1 = livingentity.getItemBySlot(slot);
			((Player)livingentity).drop(itemstack1, false, true);
			
			livingentity.setItemSlot(slot, new ItemStack(Blocks.MELON.asItem()));
			
		}

		return livingentity.eat(level, itemstack);
		
	}

}
