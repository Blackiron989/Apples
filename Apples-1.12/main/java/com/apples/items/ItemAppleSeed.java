package com.apples.items;

import com.apples.ItemHelper;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;


public class ItemAppleSeed extends ItemFood implements IPlantable {

	private Block crops;
	
	IBlockState seedstate;
	
	public ItemAppleSeed(String name, int amount, float saturation, boolean isWolfFood) {
		
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setAlwaysEdible();
		
	}
	
	@Override
	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer entityplayer) {

		if(!world.isRemote) {
			
               plant(world, entityplayer);
			
		}
		
	}
	
	private void plant(World world, EntityPlayer entityplayer) {
		
		if(entityplayer.getHeldItemMainhand().getItem() == ItemHelper.itemAppleCarrot) { 

			seedstate = Blocks.CARROTS.getDefaultState();
			
		}
			
		if(entityplayer.getHeldItemMainhand().getItem() == ItemHelper.itemApplePotatoRaw) { 
			
			seedstate = Blocks.POTATOES.getDefaultState();
			
		}
				
		if(entityplayer.getHeldItemMainhand().getItem() == ItemHelper.itemAppleWheat) {
			
			seedstate = Blocks.WHEAT.getDefaultState();
			
		}
		
		if(entityplayer.getHeldItemMainhand().getItem() == ItemHelper.itemAppleSeeds) {
	
			double rand = Math.random() * 4 + 1;
			
			switch((int)rand) {
			
				case 1: seedstate = Blocks.WHEAT.getDefaultState(); break;
				case 2: seedstate = Blocks.POTATOES.getDefaultState(); break;
				case 3: seedstate = Blocks.CARROTS.getDefaultState(); break;
				case 4: seedstate = Blocks.BEETROOTS.getDefaultState(); break;
				default: seedstate = Blocks.BEETROOTS.getDefaultState(); break;
			
			}
			
		}
		
		double playerX = entityplayer.posX;
		double playerY = entityplayer.posY;
		double playerZ = entityplayer.posZ;
		
		BlockPos pos = new BlockPos(playerX, playerY, playerZ);
		
		for(BlockPos blockpos : BlockPos.getAllInBoxMutable(pos.add(-2.0D, -1.0D, -2.0D), pos.add(2.0D, 1.0D, 2.0D))) {
			
			IBlockState blockstate = world.getBlockState(blockpos);
			
			if(entityplayer.getHeldItemMainhand().getItem() != ItemHelper.itemAppleNetherWart) {
				
				if((blockstate == Blocks.DIRT.getDefaultState() || blockstate == Blocks.GRASS.getDefaultState()) && world.isAirBlock(blockpos.up())) {
					
					world.setBlockState(blockpos, Blocks.FARMLAND.getDefaultState());
					
				}
			
			}
			
		}
		
		for(BlockPos blockpos1 : BlockPos.getAllInBoxMutable(pos.add(-2.0D, -1.0D, -2.0D), pos.add(2.0D, 1.0D, 2.0D))) {
			
			IBlockState blockstate1 = world.getBlockState(blockpos1.down());

			if(entityplayer.getHeldItemMainhand().getItem() != ItemHelper.itemAppleNetherWart) {
				
				if(blockstate1.getBlock().canSustainPlant(blockstate1, world, blockpos1, EnumFacing.UP, this) && world.isAirBlock(blockpos1)) {
					
					world.setBlockState(blockpos1, seedstate);
					
				}

			} else {
				
				if(world.mayPlace(Blocks.NETHER_WART, blockpos1, false, EnumFacing.DOWN, (EntityPlayer)null) && world.isAirBlock(blockpos1)) {
					
					world.setBlockState(blockpos1, Blocks.NETHER_WART.getDefaultState());
					
				}
				
			}
			
		}
		
	}

	@Override
	public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
		
		return this.crops == net.minecraft.init.Blocks.NETHER_WART ? net.minecraftforge.common.EnumPlantType.Nether : net.minecraftforge.common.EnumPlantType.Crop ;
		
	}

	@Override
	public IBlockState getPlant(IBlockAccess world, BlockPos pos) {

		return this.seedstate;
		
	}
	
}
