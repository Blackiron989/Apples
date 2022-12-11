package com.apples.potions;

import com.apples.Main;

import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class PotionLoader {
	
	public static final DeferredRegister<Effect> EFFECTS = DeferredRegister.create(ForgeRegistries.POTIONS, Main.MODID);
	
	public static final RegistryObject<Effect> POTION_ANVIL = EFFECTS.register("potionanvil", () -> new PotionEffect(EffectType.HARMFUL, 0));
	public static final RegistryObject<Effect> POTION_BEACON = EFFECTS.register("potionbeacon", () -> new PotionEffect(EffectType.BENEFICIAL, 0));
	public static final RegistryObject<Effect> POTION_BINDING = EFFECTS.register("potionbinding", () -> new PotionEffect(EffectType.BENEFICIAL, 0));
	public static final RegistryObject<Effect> POTION_CAKE = EFFECTS.register("potioncake", () -> new PotionEffect(EffectType.NEUTRAL, 0));
	public static final RegistryObject<Effect> POTION_COBWEB = EFFECTS.register("potioncobweb", () -> new PotionEffect(EffectType.NEUTRAL, 0));
	public static final RegistryObject<Effect> POTION_DRAGONEGG = EFFECTS.register("potiondragonegg", () -> new PotionEffect(EffectType.BENEFICIAL, 0));
	public static final RegistryObject<Effect> POTION_EMITLIGHT = EFFECTS.register("potionemitlight", () -> new PotionEffect(EffectType.NEUTRAL, 0));
	public static final RegistryObject<Effect> POTION_EXP = EFFECTS.register("potionexp", () -> new PotionEffect(EffectType.BENEFICIAL, 0));
	public static final RegistryObject<Effect> POTION_FIREBALL = EFFECTS.register("potionfireball", () -> new PotionEffect(EffectType.HARMFUL, 0));
	public static final RegistryObject<Effect> POTION_FIREWORK = EFFECTS.register("potionfirework", () -> new PotionEffect(EffectType.NEUTRAL, 0));
	public static final RegistryObject<Effect> POTION_FORTUNE = EFFECTS.register("potionfortune", () -> new PotionEffect(EffectType.NEUTRAL, 0));
	public static final RegistryObject<Effect> POTION_FROSTWALKER = EFFECTS.register("potionfrostwalker", () -> new PotionEffect(EffectType.NEUTRAL, 0));
	public static final RegistryObject<Effect> POTION_PUMPKIN = EFFECTS.register("potionpumpkin", () -> new PotionEffect(EffectType.BENEFICIAL, 0));
	public static final RegistryObject<Effect> POTION_RUBY = EFFECTS.register("potionruby", () -> new PotionEffect(EffectType.BENEFICIAL, 0));
	public static final RegistryObject<Effect> POTION_SINKING = EFFECTS.register("potionsinking", () -> new PotionEffect(EffectType.HARMFUL, 0));
	public static final RegistryObject<Effect> POTION_SLIMEBALL = EFFECTS.register("potionslimeball", () -> new PotionEffect(EffectType.NEUTRAL, 0));
	public static final RegistryObject<Effect> POTION_SNOWBALL = EFFECTS.register("potionsnowball", () -> new PotionEffect(EffectType.NEUTRAL, 0));
	public static final RegistryObject<Effect> POTION_UNDYING = EFFECTS.register("potionundying", () -> new PotionEffect(EffectType.BENEFICIAL, 0));
	public static final RegistryObject<Effect> POTION_VANISHING = EFFECTS.register("potionvanishing", () -> new PotionEffect(EffectType.HARMFUL, 0));
	public static final RegistryObject<Effect> POTION_WITCH = EFFECTS.register("potionwitch", () -> new PotionEffect(EffectType.NEUTRAL, 0));
	public static final RegistryObject<Effect> POTION_ZOMBIE = EFFECTS.register("potionzombie", () -> new PotionEffect(EffectType.HARMFUL, 0));

}
