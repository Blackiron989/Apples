package com.apples.potions;

import com.apples.Main;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class PotionLoader {
	
	public static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Main.MODID);
	
	public static final RegistryObject<MobEffect> POTION_ANVIL = EFFECTS.register("potionanvil", () -> new AppleAnvilEffect(MobEffectCategory.HARMFUL, 0));
	public static final RegistryObject<MobEffect> POTION_BEACON = EFFECTS.register("potionbeacon", () -> new AppleBeaconEffect(MobEffectCategory.BENEFICIAL, 0));
	public static final RegistryObject<MobEffect> POTION_BEENEST = EFFECTS.register("potionbeenest", () -> new ApplesPlusEffect(MobEffectCategory.NEUTRAL, 0));
	public static final RegistryObject<MobEffect> POTION_BINDING = EFFECTS.register("potionbinding", () -> new ApplesPlusEffect(MobEffectCategory.BENEFICIAL, 0));
	public static final RegistryObject<MobEffect> POTION_CAKE = EFFECTS.register("potioncake", () -> new AppleCakeEffect(MobEffectCategory.NEUTRAL, 0));
	public static final RegistryObject<MobEffect> POTION_COBWEB = EFFECTS.register("potioncobweb", () -> new AppleCobwebEffect(MobEffectCategory.NEUTRAL, 0));
	public static final RegistryObject<MobEffect> POTION_DRAGONEGG = EFFECTS.register("potiondragonegg", () -> new AppleDragonEggEffect(MobEffectCategory.BENEFICIAL, 0));
	public static final RegistryObject<MobEffect> POTION_EMITLIGHT = EFFECTS.register("potionemitlight", () -> new ApplesPlusEffect(MobEffectCategory.NEUTRAL, 0));
	public static final RegistryObject<MobEffect> POTION_EXP = EFFECTS.register("potionexp", () -> new AppleExpEffect(MobEffectCategory.BENEFICIAL, 0));
	public static final RegistryObject<MobEffect> POTION_FIREBALL = EFFECTS.register("potionfireball", () -> new AppleFireballEffect(MobEffectCategory.HARMFUL, 0));
	public static final RegistryObject<MobEffect> POTION_FIREWORK = EFFECTS.register("potionfirework", () -> new AppleFireworkEffect(MobEffectCategory.NEUTRAL, 0));
	public static final RegistryObject<MobEffect> POTION_FORTUNE = EFFECTS.register("potionfortune", () -> new ApplesPlusEffect(MobEffectCategory.NEUTRAL, 0));
	public static final RegistryObject<MobEffect> POTION_FROSTWALKER = EFFECTS.register("potionfrostwalker", () -> new AppleFrostwalkerEffect(MobEffectCategory.NEUTRAL, 0));
	public static final RegistryObject<MobEffect> POTION_PUMPKIN = EFFECTS.register("potionpumpkin", () -> new ApplesPlusEffect(MobEffectCategory.BENEFICIAL, 0));
	public static final RegistryObject<MobEffect> POTION_RUBY = EFFECTS.register("potionruby", () -> new ApplesPlusEffect(MobEffectCategory.BENEFICIAL, 0));
	public static final RegistryObject<MobEffect> POTION_SINKING = EFFECTS.register("potionsinking", () -> new ApplesPlusEffect(MobEffectCategory.HARMFUL, 0));
	public static final RegistryObject<MobEffect> POTION_SLIMEBALL = EFFECTS.register("potionslimeball", () -> new ApplesPlusEffect(MobEffectCategory.NEUTRAL, 0));
	public static final RegistryObject<MobEffect> POTION_SNOWBALL = EFFECTS.register("potionsnowball", () -> new AppleSnowballEffect(MobEffectCategory.NEUTRAL, 0));
	public static final RegistryObject<MobEffect> POTION_UNDYING = EFFECTS.register("potionundying", () -> new ApplesPlusEffect(MobEffectCategory.BENEFICIAL, 0));
	public static final RegistryObject<MobEffect> POTION_VANISHING = EFFECTS.register("potionvanishing", () -> new ApplesPlusEffect(MobEffectCategory.HARMFUL, 0));
	public static final RegistryObject<MobEffect> POTION_WITCH = EFFECTS.register("potionwitch", () -> new AppleWitchEffect(MobEffectCategory.NEUTRAL, 0));
	public static final RegistryObject<MobEffect> POTION_WITHERSKULL = EFFECTS.register("potionwitherskull", () -> new AppleWitherSkullEffect(MobEffectCategory.BENEFICIAL, 0));
	public static final RegistryObject<MobEffect> POTION_ZOMBIE = EFFECTS.register("potionzombie", () -> new ApplesPlusEffect(MobEffectCategory.HARMFUL, 0));

}
