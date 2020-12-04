package com.apples;

import java.util.HashSet;
import java.util.Set;

import com.apples.blocks.BlockFakeCake;
import com.apples.blocks.BlockGlow;
import com.apples.blocks.BlockOres;
import com.apples.blocks.BlockRuby;

import com.google.common.base.Preconditions;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

@Mod.EventBusSubscriber(modid = Main.MODID)
public class BlockHelper{
	
	public static Block rubyOre;
	public static Block bedrockOre;
	public static Block rubyBlock;
	public static Block fakeCake;
	public static Block glowBlock;
	
	public static final Set<Block> SET_BLOCKS = new HashSet<>();
	public static final Set<Item> SET_ITEMS = new HashSet<>();
	
	public static void init() {
		
		rubyOre = new BlockOres(Material.ROCK, "rubyore", 3, 1.5F).setCreativeTab(ItemHelper.appleTab);
		bedrockOre = new BlockOres(Material.ROCK, "bedrockore", 3, 2.5F).setCreativeTab(ItemHelper.appleTab);
		rubyBlock = new BlockRuby(Material.ROCK, "rubyblock", 0, 3F).setCreativeTab(ItemHelper.appleTab);
		fakeCake = new BlockFakeCake(Material.CAKE, "fakecake", 0, 1F);
		glowBlock = new BlockGlow(Material.AIR, "glowblock", 0, 1F);
		
	}
	
	@SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
		
		final Block[] arrayBlock = {
				
			rubyOre,
			bedrockOre,
			rubyBlock,
			fakeCake,
			glowBlock
				
		};
		
		for(final Block block : arrayBlock) {
        
			event.getRegistry().register(block);
			SET_BLOCKS.add(block);
        
		}
    	
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
    	
    	final ItemBlock[] arrayItem = {
    			
			new ItemBlock(rubyOre),
			new ItemBlock(bedrockOre),
			new ItemBlock(rubyBlock),
			new ItemBlock(fakeCake),
			new ItemBlock(glowBlock)
    				
    	};
    	
    	for(final ItemBlock item : arrayItem) {
    		
    		final Block block = item.getBlock();
			final ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(), "Block %s  : Null Registry Name.", block);
    		
    		event.getRegistry().register(item.setRegistryName(registryName));
    	
    	}
    	
    }
    
    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent mre) {
    	
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(rubyOre), 0, new ModelResourceLocation(rubyOre.getRegistryName(), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(bedrockOre), 0, new ModelResourceLocation(bedrockOre.getRegistryName(), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(rubyBlock), 0, new ModelResourceLocation(rubyBlock.getRegistryName(), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(fakeCake), 0, new ModelResourceLocation(fakeCake.getRegistryName(), "age=0"));
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(glowBlock), 0, new ModelResourceLocation(glowBlock.getRegistryName(), "normal"));
    	
    }

}
