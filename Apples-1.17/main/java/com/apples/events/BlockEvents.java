package com.apples.events;

import java.util.List;
import java.util.Set;

import com.apples.potions.PotionLoader;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.Tags;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class BlockEvents {
	
	@SubscribeEvent
	public static void blockHarvestEvent(BlockEvent.BreakEvent breakevent) {

		if(breakevent.getPlayer() != null) {
			
			MobEffectInstance effectinstance = breakevent.getPlayer().getEffect(PotionLoader.POTION_FORTUNE.get());
			
			if(effectinstance != null) {
				
				int amplifier = effectinstance.getAmplifier();
				
				BlockState blockstate = breakevent.getState();
				
				Set<ResourceLocation> tags = blockstate.getBlock().getTags();
				
				switch(amplifier) {
				
					case 0: //Wood
						
						if(tags.contains(BlockTags.LOGS.getName())) {
							
							spawnDrops(blockstate, breakevent.getPos(), breakevent.getPlayer());
							
						}
						
					break;
					
					case 1: //Stone

						if(tags.contains(Tags.Blocks.STONE.getName())) {
							
							spawnDrops(blockstate, breakevent.getPos(), breakevent.getPlayer());
							
						}
						
					break;
					
					case 2: //Ores

						if(tags.contains(Tags.Blocks.ORES.getName())) {
							
							spawnDrops(blockstate, breakevent.getPos(), breakevent.getPlayer());
							
						}
						
					break;
					
					case 3: //Full
						
						if(tags.contains(BlockTags.LOGS.getName()) || tags.contains(Tags.Blocks.ORES.getName()) || tags.contains(Tags.Blocks.STONE.getName()) || tags.contains(Tags.Blocks.NETHERRACK.getName()) || tags.contains(Tags.Blocks.END_STONES.getName()) || tags.contains(Tags.Blocks.OBSIDIAN.getName())) {
							
							spawnDrops(blockstate, breakevent.getPos(), breakevent.getPlayer());
							
						}
						
					break;
					
					default: /*Somebody has made a mistake.. was it me?*/ break;
				
				}
				
			}
			
		}
		
	}
	
	private static void spawnDrops(BlockState blockstate, BlockPos blockpos, Player player) {
		
		if(blockstate.canHarvestBlock(player.level, blockpos, player)) {
			
			List<ItemStack> items = Block.getDrops(blockstate, ((ServerLevel)player.level), blockpos, null);
	
			for(int i = 0; i < items.size(); i++) {
				
				ItemStack itemstack = items.get(i);
				
				//Block.dropResources(blockstate, player.level, blockpos, null);
				
				//Block.dropResources(blockstate, player.level, blockpos, null, null, itemstack);
				//.dropResources(blockstate, player.level, blockpos);
				
				Block.popResource(player.level, blockpos, itemstack);
				
				//Block.spawnAsEntity((Level) iworld, blockpos, itemstack);
			
			}
		
		}
		
	}

}
