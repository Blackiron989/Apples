package com.apples.tileentity;

import java.util.List;

import com.apples.potions.PotionLoader;

import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.AxisAlignedBB;

public class TileEntityGlow extends TileEntity implements ITickableTileEntity {
	
	public TileEntityGlow() {
		
		super(TileEntityLoader.GLOW_TILE.get());
		
	}

	@Override
	public void tick() {

		if(!this.world.isRemote) {
			
			List<Entity> list = this.world.getEntitiesWithinAABBExcludingEntity(null, new AxisAlignedBB(this.getPos()));
			
			if(!list.isEmpty()) {
				
				for(int i = 0; i < list.size(); i++) {
					
					if(list.get(i) instanceof PlayerEntity) {
						
						PlayerEntity playerentity = (PlayerEntity) list.get(i);
						
						if(playerentity.isPotionActive(PotionLoader.PotionPumpkinLit)) {
							
							break;
							
						}
						
					}
					
					if(i + 1 == list.size()) {
						
						this.world.setBlockState(this.getPos(), Blocks.AIR.getDefaultState());
						this.remove();
						
					}
					
				}
			
			} else {
				
				this.world.setBlockState(this.getPos(), Blocks.AIR.getDefaultState());
				this.remove();
				
			}
			
		}
		
	}

}
