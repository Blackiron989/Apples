package com.apples.blocks;

import com.apples.ApplesPlusTab;
import com.apples.Main;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CakeBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockLoader {
	
	/** BLOCKS **/
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MODID);

	public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("rubyblock", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_RED).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
	public static final RegistryObject<Block> FAKE_CAKE = BLOCKS.register("fakecake", () -> new BlockFakeCake(Block.Properties.of(Material.CAKE).strength(0.5F).sound(SoundType.WOOL).randomTicks().noDrops()));
	public static final RegistryObject<Block> APPLE_PIE = BLOCKS.register("applepie", () -> new CakeBlock(Block.Properties.of(Material.CAKE).strength(0.5F).sound(SoundType.WOOL).noDrops()));
	
	/** BLOCK ITEMS **/
	public static final DeferredRegister<Item> BLOCK_ITEM = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);
	
	static final Item.Properties properties = new Item.Properties().tab(ApplesPlusTab.APPLE_TAB);

	public static final RegistryObject<Item> RUBY_BLOCK_ITEM = BLOCK_ITEM.register("rubyblockitem", () -> new BlockItem(RUBY_BLOCK.get(), properties));
	public static final RegistryObject<Item> APPLE_PIE_ITEM = BLOCK_ITEM.register("applepieitem", () -> new BlockItem(APPLE_PIE.get(), properties.stacksTo(1)));

}
