/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theoreisalie.init;

import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.theoreisalie.block.*;
import net.mcreator.theoreisalie.TheOreIsALieMod;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

import java.util.function.Predicate;

public class TheOreIsALieModFeatures {
	public static void load() {
		register("lie_emerald_ore", new OreFeature(OreConfiguration.CODEC), LieEmeraldOreBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("lie_diamond_ore", new OreFeature(OreConfiguration.CODEC), LieDiamondOreBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("lie_gold_ore", new OreFeature(OreConfiguration.CODEC), LieGoldOreBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("lie_coal_ore", new OreFeature(OreConfiguration.CODEC), LieCoalOreBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("lie_iron_ore", new OreFeature(OreConfiguration.CODEC), LieIronOreBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("lie_redstone_ore", new OreFeature(OreConfiguration.CODEC), LieRedstoneOreBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("lie_lapis_ore", new OreFeature(OreConfiguration.CODEC), LieLapisOreBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("lie_copper_ore", new OreFeature(OreConfiguration.CODEC), LieCopperOreBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
	}

	private static void register(String registryname, Feature feature, Predicate<BiomeSelectionContext> biomes, GenerationStep.Decoration stage) {
		register(registryname, feature);
		BiomeModifications.addFeature(biomes, stage, ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(TheOreIsALieMod.MODID, registryname)));
	}

	private static void register(String registryname, Feature feature) {
		Registry.register(BuiltInRegistries.FEATURE, ResourceLocation.fromNamespaceAndPath(TheOreIsALieMod.MODID, registryname), feature);
	}
}