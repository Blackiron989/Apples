package com.apples.tileentity;

import java.util.Iterator;
import java.util.List;

import com.apples.PotionRegister;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TileEntityGlowBlock extends TileEntity implements ITickable {
	
	boolean exist = true;
	
	private EntityLivingBase livingbase;
	
	public TileEntityGlowBlock() { }
	
	@Override
	public void update() {
		
		if(livingbase == null) {
			
			livingbase = getClosestEntityLiving(this.world, this.getPos().toImmutable(), 2.0D);
			
		}
		
		if(!exist) {
			
			this.world.setBlockToAir(this.getPos());
			
		} else {
			
			if(this.world != null) {
				
				if(livingbase != null) {
					
					boolean potionActive = livingbase.isPotionActive(PotionRegister.potionGlow);
					if(!potionActive) {
						
						exist = false;
						
					}
				
				} else {
					
					exist = false;
					
				}
				
			}
			
		}

	}
	
	public static EntityLivingBase getClosestEntityLiving(World world, BlockPos blockpos, double maxDistance) {
    	
    	EntityLivingBase closestLiving = null;
    	double distanceSq = Math.pow(maxDistance, 2);
    	
    	AxisAlignedBB aabb = new AxisAlignedBB(blockpos.getX() - maxDistance, blockpos.getY() - maxDistance, blockpos.getZ() - maxDistance, blockpos.getX() + maxDistance, blockpos.getY() + maxDistance, blockpos.getZ() + maxDistance);
    	List<EntityLivingBase> listEntitiesInRange = world.getEntitiesWithinAABB(EntityLivingBase.class, aabb);
    	Iterator<EntityLivingBase> iterator = listEntitiesInRange.iterator();
    	
    	while (iterator.hasNext()) {
    		
    		EntityLivingBase next = iterator.next();
    		if (getDistanceSq(next.getPosition(), blockpos) < distanceSq) {
    			
				closestLiving = next;
				
			}		
    		
    	}
    	
    	return closestLiving;
    	
    }
	
	protected static double getDistanceSq(BlockPos blockpos, BlockPos blockpos1) {
		
    	return Math.pow(blockpos.getX() - blockpos1.getX(), 2) + Math.pow(blockpos.getY() - blockpos1.getY(), 2) + Math.pow(blockpos.getZ() - blockpos1.getZ(), 2);
    	
    }

}