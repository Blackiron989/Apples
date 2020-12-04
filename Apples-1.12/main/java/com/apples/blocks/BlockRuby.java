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
import net.minecraft.item.ItemSpade;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockRuby extends Block{

	public BlockRuby(Material material, String name, int level, float hardness) {
		
		super(material);

		setUnlocalizedName(name);
		setRegistryName(name);
		setHarvestLevel("pickaxe", level);
		setHardness(hardness);
		
	}

}
