package com.apples.items;

import net.minecraft.block.Blocks;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum ToolTier implements IItemTier {
	
	RUBY(3, 989, 12.0F, 3.0F, 18, Ingredient.fromItems(ItemLoader.RUBY.get())),
	
	BEDROCK(4, 4657, 8.0F, 10.0F, 10, Ingredient.fromItems(Blocks.BEDROCK));


	private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Ingredient repairMaterial;

    private ToolTier(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Ingredient repairMaterialIn) {
	   
       this.harvestLevel = harvestLevelIn;
       this.maxUses = maxUsesIn;
       this.efficiency = efficiencyIn;
       this.attackDamage = attackDamageIn;
       this.enchantability = enchantabilityIn;
       this.repairMaterial = (Ingredient) repairMaterialIn;
      
    }

    public int getMaxUses() {
	   
       return this.maxUses;
      
    }

    public float getEfficiency() {
	   
       return this.efficiency;
      
    }

    public float getAttackDamage() {
	   
       return this.attackDamage;
      
    }

    public int getHarvestLevel() {
	   
       return this.harvestLevel;
      
    }

    public int getEnchantability() {
	   
       return this.enchantability;
      
    }

    public Ingredient getRepairMaterial() {
 	   
       return this.repairMaterial;
      
    }

}
