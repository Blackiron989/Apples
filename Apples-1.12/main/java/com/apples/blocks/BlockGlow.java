package com.apples.blocks;

import java.util.Random;

import com.apples.BlockHelper;
import com.apples.Main;
import com.apples.tileentity.TileEntityGlowBlock;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockGlow extends Block implements ITileEntityProvider{

	public static AxisAlignedBB boundingBox = new AxisAlignedBB(0.5D, 0.5D, 0.5D, 0.5D, 0.5D, 0.5D);
	
	public BlockGlow(Material material, String name, int level, float hardness) {
		
		super(material);

		setUnlocalizedName(name);
		setRegistryName(name);
		setTickRandomly(false);
		setLightLevel(1.0F);
		
	}
	
	@Override
    public AxisAlignedBB getBoundingBox(IBlockState blockstate, IBlockAccess world, BlockPos blockpos) {
		
        return boundingBox;
        
    }
    
    @Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess world, BlockPos blockpos) {
    	
        return NULL_AABB;
        
    }

    @Override
	public boolean canCollideCheck(IBlockState blockstate, boolean hitIfLiquid) {
    	
        return false;
        
    }

    @Override
    public boolean isOpaqueCube(IBlockState blockstate) {
    	
        return false;
        
    }

    @Override
    public boolean isFullCube(IBlockState blockstate) {
    	
        return false;
        
    }

    @Override
    public boolean canPlaceBlockAt(World world, BlockPos blockpos) {
    	
        return true;
        
    }

    @Override
    public void onBlockAdded(World world, BlockPos blockpos, IBlockState blockstate) {
    	
        return;
        
    }

    @Override
    public void onNeighborChange(IBlockAccess world, BlockPos blockpos, BlockPos blockpos1) {
    	
        return;
        
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
    	
        return getDefaultState();
        
    }

    @Override
    public int getMetaFromState(IBlockState blockstate) {
    	
        return 0;
        
    }

	@Override
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		
	    return BlockRenderLayer.CUTOUT;
	    
	}

    @Override
    public void onFallenUpon(World world, BlockPos blockpos, Entity entity, float fallDistance) {

        return;
        
    }

    @Override
    public void onLanded(World world, Entity entity) {
    	
        return;
        
    }
    
	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		
		return new TileEntityGlowBlock();
		
	}
	
	@Override
	public boolean hasTileEntity(IBlockState blockstate) {
		
		return true;
		
	}

}
