package com.apples.items;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;


public class ItemNewAxe extends ItemTool {
	
	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE);
	
	public ItemNewAxe(String name, ToolMaterial material, float attackDamage, float attackSpeed) {
		
		super(material, EFFECTIVE_ON);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		
		this.attackDamage = attackDamage;
        this.attackSpeed = attackSpeed;
		
	}

	@Override
    public float getDestroySpeed(ItemStack stack, IBlockState state) {
    	
        Material material = state.getMaterial();
        return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? super.getDestroySpeed(stack, state) : this.efficiency;
        
    }

}