package com.apples.loot;

import java.util.List;
import java.util.NavigableMap;
import java.util.Random;
import java.util.TreeMap;

import com.apples.Main;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ChestLootModifier extends LootModifier {

	/** Registry **/
	
	public static final DeferredRegister<GlobalLootModifierSerializer<?>> GLOBAL_LOOT_MODIFIER = DeferredRegister.create(ForgeRegistries.LOOT_MODIFIER_SERIALIZERS, Main.MODID);
	
	//private static final RegistryObject<ChestLootModifier.Serializer> DUNGEON_LOOT = GLOBAL_LOOT_MODIFIER.register("dungeon_loot", ChestLootModifier.Serializer::new);
	@SuppressWarnings("unused")
	private static final RegistryObject<ChestLootModifier.Serializer> ABANDONED_MINESHAFT_LOOT = GLOBAL_LOOT_MODIFIER.register("abandoned_mineshaft", ChestLootModifier.Serializer::new);
	@SuppressWarnings("unused")
	private static final RegistryObject<ChestLootModifier.Serializer> BURIED_TREASURE_LOOT = GLOBAL_LOOT_MODIFIER.register("buried_treasure", ChestLootModifier.Serializer::new);
	@SuppressWarnings("unused")
	private static final RegistryObject<ChestLootModifier.Serializer> NETHER_BRIDGE_LOOT = GLOBAL_LOOT_MODIFIER.register("nether_bridge", ChestLootModifier.Serializer::new);
	@SuppressWarnings("unused")
	private static final RegistryObject<ChestLootModifier.Serializer> SIMPLE_DUNGEON_LOOT = GLOBAL_LOOT_MODIFIER.register("simple_dungeon", ChestLootModifier.Serializer::new);
	@SuppressWarnings("unused")
	private static final RegistryObject<ChestLootModifier.Serializer> WOODLAND_MANSION_LOOT = GLOBAL_LOOT_MODIFIER.register("woodland_mansion", ChestLootModifier.Serializer::new);
	
	/** Loot Modifier **/
	
	private NavigableMap<Double, Item> map = new TreeMap<Double, Item>();
	private double total = 0;
	
	protected ChestLootModifier(LootItemCondition[] conditions, NavigableMap<Double, Item> map, double total) {
		
		super(conditions);

		this.map = map;
		this.total = total;

	}

	@Override
	protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
		
		//if config loot generation enabled

		Random random = new Random();
		double value = random.nextDouble() * total;
		Item item = map.higherEntry(value).getValue();
		
		System.out.println(item);
		
		if(item != Items.AIR) {

			generatedLoot.add(new ItemStack(item, 1));
		
		}
		return generatedLoot;
		
	}
	
	private static class Serializer extends GlobalLootModifierSerializer<ChestLootModifier> {

		@Override
		public ChestLootModifier read(ResourceLocation location, JsonObject object, LootItemCondition[] ailootcondition) {

			NavigableMap<Double, Item> loot = new TreeMap<Double, Item>();
			double t = 0;
			
			JsonArray arr = object.getAsJsonArray("entries");
			for(JsonElement element : arr) {
				
				if(element.isJsonObject()) {

					JsonElement e = ((JsonObject)element).get("name");
					JsonElement e1 = ((JsonObject)element).get("weight");

					if(e1.isJsonPrimitive()) {
						
						t += e1.getAsDouble();
						if(e == null || !e.isJsonPrimitive()) {

							loot.put(t, Items.AIR);
							
						} else {

							ResourceLocation resource = new ResourceLocation(e.getAsString());
							Item item = ForgeRegistries.ITEMS.getValue(resource);
							loot.put(t, item);
							
						}
						
					}
				
				}
				
			}

			return new ChestLootModifier(ailootcondition, loot, t);
			
		}

		@Override
		public JsonObject write(ChestLootModifier instance) {

			JsonObject json = this.makeConditions(instance.conditions);
			json.addProperty("entries", instance.map.toString());
			return json;
			
		}
		
	}

}
