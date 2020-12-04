package com.apples.blocks;

import java.util.ArrayList;
import java.util.List;

import com.apples.Group;
import com.apples.Main;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockLoader {
	
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Main.MODID);
	
	public static final RegistryObject<Block> BEDROCK_ORE = BLOCKS.register("bedrockore", () -> new BlockOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(50.0F, 1200.0F)));
	public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("rubyore", () -> new BlockOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F)));
	public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("rubyblock", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0F, 6.0F)));
	public static final RegistryObject<Block> FAKE_CAKE = BLOCKS.register("fakecake", () -> new BlockFakeCake(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.5F).sound(SoundType.CLOTH).tickRandomly().noDrops()));
	public static final RegistryObject<Block> GLOW_BLOCK = BLOCKS.register("glowblock", () -> new BlockGlow(Block.Properties.create(Material.AIR).hardnessAndResistance(0F).doesNotBlockMovement().lightValue(15)));
	
	public static List<BlockItem> items = new ArrayList<BlockItem>();
	
	public static List<BlockItem> blockItems() {
		
		final Item.Properties properties = new Item.Properties().group(Group.APPLE_GROUP);
		
		final BlockItem BEDROCK_ORE_ITEM = new BlockItem(BEDROCK_ORE.get(), properties);
		final BlockItem RUBY_ORE_ITEM = new BlockItem(RUBY_ORE.get(), properties);
		final BlockItem RUBY_BLOCK_ITEM = new BlockItem(RUBY_BLOCK.get(), properties);
		
		BEDROCK_ORE_ITEM.setRegistryName(BEDROCK_ORE.get().getRegistryName());
		RUBY_ORE_ITEM.setRegistryName(RUBY_ORE.get().getRegistryName());
		RUBY_BLOCK_ITEM.setRegistryName(RUBY_BLOCK.get().getRegistryName());
		
		items.add(BEDROCK_ORE_ITEM);
		items.add(RUBY_ORE_ITEM);
		items.add(RUBY_BLOCK_ITEM);
		
		return items;
		
	}

}
