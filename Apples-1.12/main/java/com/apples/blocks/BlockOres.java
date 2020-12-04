package com.apples.blocks;

import java.util.Random;

import com.apples.BlockHelper;
import com.apples.ItemHelper;
import com.apples.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockOres extends Block{

	public BlockOres(Material material, String name, int level, float hardness) {
		
		super(material);

		setUnlocalizedName(name);
		setRegistryName(name);
		setHarvestLevel("pickaxe", level);
		setHardness(hardness);
		
	}
	
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		
		if(this == BlockHelper.bedrockOre) {
			
			return ItemHelper.itemBedrockFragment;
			
		} else if(this == BlockHelper.rubyOre) {
			
			return ItemHelper.itemRuby;
			
		} else {
			
			return ItemHelper.itemRuby;
			
		}
		
	}

}
