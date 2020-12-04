package com.apples.blocks;

import java.util.Random;

import com.apples.BlockHelper;
import com.apples.ItemHelper;
import com.apples.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockFakeCake extends Block {
	
	public static final PropertyInteger AGE = PropertyInteger.create("age", 0, 3);

	protected static final AxisAlignedBB CAKE_AABB = new AxisAlignedBB(0.0625D, 0.0D, 0.0625D, 0.9375D, 0.5D, 0.9375D);
	
	public BlockFakeCake(Material material, String name, int level, float hardness) {
		
		super(material);

		setUnlocalizedName(name);
		setRegistryName(name);
		setHarvestLevel("pickaxe", level);
		setHardness(hardness);
		setTickRandomly(true);
		
		this.setDefaultState(this.blockState.getBaseState().withProperty(AGE, Integer.valueOf(0)));
		
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		
        return CAKE_AABB;
    
	}

	@Override
    public boolean isFullCube(IBlockState state) {
		
        return false;
    
	}

	@Override
    public boolean isOpaqueCube(IBlockState state) {
    	
        return false;
    
    }
	
    @Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		
    	double random = Math.random();
		if(random > 0.8) {
			
			return Items.CAKE;
			
		} else {
			
			return Items.AIR;
			
		}
		
	}
    
    @Override
    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
    	
        return ItemStack.EMPTY;
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
    	
        return this.getDefaultState().withProperty(AGE, Integer.valueOf(MathHelper.clamp(meta, 0, 3)));
    
    }
    
    /** Deprecated**/
	@Override
    public int getMetaFromState(IBlockState state) {
    	
        return ((Integer)state.getValue(AGE)).intValue();
    
    }
	
    @Override
    public void updateTick(World world, BlockPos blockpos, IBlockState blockstate, Random rand) {

        if (rand.nextInt(3) == 0 || this.countNeighbors(world, blockpos) < 4) {
            
        	this.decay(world, blockpos, blockstate, rand, true);
        
        } else {
        	
            world.scheduleUpdate(blockpos, this, MathHelper.getInt(rand, 20, 40));
        
        }
        
    }
    
    @Override
    public void neighborChanged(IBlockState blockstate, World world, BlockPos blockpos, Block block, BlockPos fromPos) {
    	
        if (block == this) {
        	
            int i = this.countNeighbors(world, blockpos);

            if (i < 2) {
            	
            	world.setBlockToAir(blockpos);
            
            }
            
        }
        
    }
    
    private int countNeighbors(World world, BlockPos blockpos) {
    	
        int i = 0;

        for (EnumFacing enumfacing : EnumFacing.values()) {
        	
            if (world.getBlockState(blockpos.offset(enumfacing)).getBlock() == this) {
            	
                i++;

                if (i >= 4) {
                	
                    return i;
                
                }
                
            }
            
        }

        return i;
        
    }
    
    protected void decay(World world, BlockPos blockpos, IBlockState blockstate, Random rand, boolean meltNeighbors) {
    	
        int i = ((Integer)blockstate.getValue(AGE)).intValue();

        if (i < 3) {
        	
            world.setBlockState(blockpos, blockstate.withProperty(AGE, Integer.valueOf(i + 1)), 2);
            world.scheduleUpdate(blockpos, this, MathHelper.getInt(rand, 20, 40));
            
        } else {
        	
        	world.setBlockToAir(blockpos);

        }
        
    }

    protected BlockStateContainer createBlockState() {
    	
        return new BlockStateContainer(this, new IProperty[] {AGE});
    
    }
    
    /** Deprecated **/
    @Override
    public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face) {
    	
        return BlockFaceShape.UNDEFINED;
    
    }
    
    @Override
    public boolean canPlaceBlockAt(World world, BlockPos blockpos) {
    	
        return super.canPlaceBlockAt(world, blockpos) ? this.canBlockStay(world, blockpos) : false;
        
    }
    
    private boolean canBlockStay(World world, BlockPos blockpos) {
    	
        return world.getBlockState(blockpos.down()).getMaterial().isSolid();
        
    }

}
