package com.apples.items;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class ItemAppleLoot extends Item {

	private ArrayList<ItemStack> loot() {
		
		ArrayList<ItemStack> list = new ArrayList<>();
	
		list.add(new ItemStack(ItemLoader.APPLEAPPLE.get()));    
		list.add(new ItemStack(ItemLoader.APPLEANVIL.get()));    
		list.add(new ItemStack(ItemLoader.APPLEARROW.get()));    
		list.add(new ItemStack(ItemLoader.APPLEBAT.get()));   
		list.add(new ItemStack(ItemLoader.APPLEBEACON.get()));   
		list.add(new ItemStack(ItemLoader.APPLEBED.get())); 
		list.add(new ItemStack(ItemLoader.APPLEBEDROCK.get()));    
		list.add(new ItemStack(ItemLoader.APPLEBLAZEROD.get()));   
		list.add(new ItemStack(ItemLoader.APPLEBONE.get()));   
		list.add(new ItemStack(ItemLoader.APPLEBOOK.get()));   
		list.add(new ItemStack(ItemLoader.APPLEBREAD.get()));    
		list.add(new ItemStack(ItemLoader.APPLEBRICK.get()));
		list.add(new ItemStack(ItemLoader.APPLEBEE.get()));
		list.add(new ItemStack(ItemLoader.APPLEBEEF.get()));
		list.add(new ItemStack(ItemLoader.APPLEBEEFRAW.get()));
		list.add(new ItemStack(ItemLoader.APPLEBEET.get()));
		list.add(new ItemStack(ItemLoader.APPLEBINDING.get()));
		list.add(new ItemStack(ItemLoader.APPLEBUCKET.get()));
		list.add(new ItemStack(ItemLoader.APPLECACTUS.get()));
		list.add(new ItemStack(ItemLoader.APPLECAKE.get()));    
		list.add(new ItemStack(ItemLoader.APPLECANDY.get()));  
		list.add(new ItemStack(ItemLoader.APPLECANDYCANE.get()));    
		list.add(new ItemStack(ItemLoader.APPLECARAMEL.get()));     
		list.add(new ItemStack(ItemLoader.APPLECARROT.get()));   
		list.add(new ItemStack(ItemLoader.APPLECHAIN.get()));   
		list.add(new ItemStack(ItemLoader.APPLECHICKEN.get()));   
		list.add(new ItemStack(ItemLoader.APPLECHICKENCOOKED.get()));   
		list.add(new ItemStack(ItemLoader.APPLECLAY.get()));   
		list.add(new ItemStack(ItemLoader.APPLECOAL.get()));   
		list.add(new ItemStack(ItemLoader.APPLECOBWEB.get()));     
		list.add(new ItemStack(ItemLoader.APPLECOOKIE.get()));   
		list.add(new ItemStack(ItemLoader.APPLECREEPER.get()));   
		list.add(new ItemStack(ItemLoader.APPLECURSED.get()));   
		list.add(new ItemStack(ItemLoader.APPLEDIAMOND.get()));   
		list.add(new ItemStack(ItemLoader.APPLEDIRT.get()));
		list.add(new ItemStack(ItemLoader.APPLEEATEN.get()));   
		list.add(new ItemStack(ItemLoader.APPLEEGG.get()));   
		list.add(new ItemStack(ItemLoader.APPLEEGGNOG.get()));   
		list.add(new ItemStack(ItemLoader.APPLEEMERALD.get()));   
		list.add(new ItemStack(ItemLoader.APPLEENDEREGG.get()));  
		list.add(new ItemStack(ItemLoader.APPLEENDERPEARL.get()));  
		list.add(new ItemStack(ItemLoader.APPLEEXP.get()));  
		list.add(new ItemStack(ItemLoader.APPLEFEATHER.get()));   
		list.add(new ItemStack(ItemLoader.APPLEFERMENTED.get()));    
		list.add(new ItemStack(ItemLoader.APPLEFIREBALL.get()));   
		list.add(new ItemStack(ItemLoader.APPLEFIREWORK.get()));  
		list.add(new ItemStack(ItemLoader.APPLEFISH.get()));  
		list.add(new ItemStack(ItemLoader.APPLEFISHCOOKED.get()));   
		list.add(new ItemStack(ItemLoader.APPLEFLINT.get()));  
		list.add(new ItemStack(ItemLoader.APPLEFLOWERPOT.get()));    
		list.add(new ItemStack(ItemLoader.APPLEGHASTTEAR.get()));    
		list.add(new ItemStack(ItemLoader.APPLEGLOWSTONE.get()));   
		list.add(new ItemStack(ItemLoader.APPLEGLOWSTONEDUST.get()));  
		list.add(new ItemStack(ItemLoader.APPLEGOLDNUGGET.get()));   
		list.add(new ItemStack(ItemLoader.APPLEGRASS.get()));  
		list.add(new ItemStack(ItemLoader.APPLEGRAVEL.get()));  
		list.add(new ItemStack(ItemLoader.APPLEGREEN.get()));    
		list.add(new ItemStack(ItemLoader.APPLEGUNPOWDER.get()));    
		list.add(new ItemStack(ItemLoader.APPLEHEART.get()));   
		list.add(new ItemStack(ItemLoader.APPLEHORSEARMOR.get()));  
		list.add(new ItemStack(ItemLoader.APPLEICE.get()));  
		list.add(new ItemStack(ItemLoader.APPLEINVISIBLE.get()));   
		list.add(new ItemStack(ItemLoader.APPLEIRON.get()));   
		list.add(new ItemStack(ItemLoader.APPLELAPISLAZULI.get()));   
		list.add(new ItemStack(ItemLoader.APPLELAVA.get()));   
		list.add(new ItemStack(ItemLoader.APPLELEATHER.get()));   
		list.add(new ItemStack(ItemLoader.APPLELEAVES.get()));  
		//list.add(new ItemStack(ItemLoader.APPLELOOT.get())); 
		list.add(new ItemStack(ItemLoader.APPLEMELONSLICE.get()));  
		list.add(new ItemStack(ItemLoader.APPLEMELONBLOCK.get()));  
		list.add(new ItemStack(ItemLoader.APPLEMILK.get()));  
		list.add(new ItemStack(ItemLoader.APPLEMINECART.get()));   
		list.add(new ItemStack(ItemLoader.APPLENETHERBRICK.get()));    
		list.add(new ItemStack(ItemLoader.APPLENETHERRACK.get()));   
		list.add(new ItemStack(ItemLoader.APPLENETHERSTAR.get()));    
		list.add(new ItemStack(ItemLoader.APPLENETHERWART.get()));  
		list.add(new ItemStack(ItemLoader.APPLEPAPER.get())); 
		list.add(new ItemStack(ItemLoader.APPLEPORKCHOPCOOKED.get()));   
		list.add(new ItemStack(ItemLoader.APPLEPORKCHOPRAW.get()));  
		list.add(new ItemStack(ItemLoader.APPLEPOTATOBAKED.get()));   
		list.add(new ItemStack(ItemLoader.APPLEPOTATOPOISONOUS.get()));   
		list.add(new ItemStack(ItemLoader.APPLEPOTATORAW.get()));  
		list.add(new ItemStack(ItemLoader.APPLEPUMPKIN.get()));  
		list.add(new ItemStack(ItemLoader.APPLEPUMPKINLIT.get()));   
		list.add(new ItemStack(ItemLoader.APPLEPUMPKINPIE.get()));   
		list.add(new ItemStack(ItemLoader.APPLEPRESENT.get()));   
		list.add(new ItemStack(ItemLoader.APPLEQUARTZ.get()));   
		list.add(new ItemStack(ItemLoader.APPLERECORD.get()));  
		list.add(new ItemStack(ItemLoader.APPLEREDSTONE.get()));  
		list.add(new ItemStack(ItemLoader.APPLEROTTENFLESH.get()));  
		list.add(new ItemStack(ItemLoader.APPLERUBY.get()));  
		list.add(new ItemStack(ItemLoader.APPLESADDLE.get()));  
		list.add(new ItemStack(ItemLoader.APPLESLIMEBALL.get()));  
		list.add(new ItemStack(ItemLoader.APPLESNOWBALL.get()));  
		list.add(new ItemStack(ItemLoader.APPLESOULSAND.get()));    
		list.add(new ItemStack(ItemLoader.APPLESPECKLEDMELON.get()));    
		list.add(new ItemStack(ItemLoader.APPLESPIDEREYE.get()));  
		list.add(new ItemStack(ItemLoader.APPLESPONGE.get()));   
		list.add(new ItemStack(ItemLoader.APPLESTEVE.get()));  
		list.add(new ItemStack(ItemLoader.APPLESTICK.get()));  
		list.add(new ItemStack(ItemLoader.APPLESTONE.get()));  
		list.add(new ItemStack(ItemLoader.APPLESTRING.get()));  
		list.add(new ItemStack(ItemLoader.APPLESUGAR.get()));  
		list.add(new ItemStack(ItemLoader.APPLESUGARCANE.get()));   
		list.add(new ItemStack(ItemLoader.APPLETNT.get()));
		list.add(new ItemStack(ItemLoader.APPLEUNDYING.get()));
		list.add(new ItemStack(ItemLoader.APPLEVANISHING.get()));
		list.add(new ItemStack(ItemLoader.APPLEWATER.get()));  
		list.add(new ItemStack(ItemLoader.APPLEWHEAT.get()));   
		list.add(new ItemStack(ItemLoader.APPLEWITCH.get()));   
		list.add(new ItemStack(ItemLoader.APPLEWOOD.get()));   
		list.add(new ItemStack(ItemLoader.APPLEWOOL.get()));   
		list.add(new ItemStack(ItemLoader.APPLEZOMBIE.get())); 
		list.add(new ItemStack(ItemLoader.APPLE4BIT.get()));  
		list.add(new ItemStack(ItemLoader.APPLE8BIT.get())); 
		list.add(new ItemStack(ItemLoader.APPLE32BIT.get()));   
		list.add(new ItemStack(ItemLoader.APPLE64BIT.get()));
		
		return list;
		
	}
	
	public ItemAppleLoot(Properties properties) {
		
		super(properties);

	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity livingentity) {
		
		if(!world.isRemote) {
			
			Random random = new Random();
			
			if(loot().size() > 0) {
				
				int i = MathHelper.nextInt(random, 1, loot().size());
						
				livingentity.entityDropItem(loot().get(i - 1), 0);
			
			}
			
		}

		return this.isFood() ? livingentity.onFoodEaten(world, itemstack) : itemstack;
		
	}

}
