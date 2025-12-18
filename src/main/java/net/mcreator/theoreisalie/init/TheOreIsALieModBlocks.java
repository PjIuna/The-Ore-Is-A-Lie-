/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theoreisalie.init;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.theoreisalie.block.*;
import net.mcreator.theoreisalie.TheOreIsALieMod;

import java.util.function.Function;

public class TheOreIsALieModBlocks {
	public static Block LIE_EMERALD_ORE;
	public static Block LIE_DIAMOND_ORE;
	public static Block LIE_GOLD_ORE;
	public static Block LIE_COAL_ORE;
	public static Block LIE_IRON_ORE;
	public static Block LIE_REDSTONE_ORE;
	public static Block LIE_LAPIS_ORE;
	public static Block LIE_COPPER_ORE;

	public static void load() {
		LIE_EMERALD_ORE = register("lie_emerald_ore", LieEmeraldOreBlock::new);
		LIE_DIAMOND_ORE = register("lie_diamond_ore", LieDiamondOreBlock::new);
		LIE_GOLD_ORE = register("lie_gold_ore", LieGoldOreBlock::new);
		LIE_COAL_ORE = register("lie_coal_ore", LieCoalOreBlock::new);
		LIE_IRON_ORE = register("lie_iron_ore", LieIronOreBlock::new);
		LIE_REDSTONE_ORE = register("lie_redstone_ore", LieRedstoneOreBlock::new);
		LIE_LAPIS_ORE = register("lie_lapis_ore", LieLapisOreBlock::new);
		LIE_COPPER_ORE = register("lie_copper_ore", LieCopperOreBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> B register(String name, Function<BlockBehaviour.Properties, B> supplier) {
		return (B) Blocks.register(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(TheOreIsALieMod.MODID, name)), (Function<BlockBehaviour.Properties, Block>) supplier, BlockBehaviour.Properties.of());
	}
}