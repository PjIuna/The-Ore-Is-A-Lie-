/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theoreisalie.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.theoreisalie.TheOreIsALieMod;

import java.util.function.Function;

public class TheOreIsALieModItems {
	public static Item LIE_EMERALD_ORE;
	public static Item LIE_DIAMOND_ORE;
	public static Item LIE_GOLD_ORE;
	public static Item LIE_COAL_ORE;
	public static Item LIE_IRON_ORE;
	public static Item LIE_REDSTONE_ORE;
	public static Item LIE_LAPIS_ORE;
	public static Item LIE_COPPER_ORE;

	public static void load() {
		LIE_EMERALD_ORE = block(TheOreIsALieModBlocks.LIE_EMERALD_ORE, "lie_emerald_ore");
		LIE_DIAMOND_ORE = block(TheOreIsALieModBlocks.LIE_DIAMOND_ORE, "lie_diamond_ore");
		LIE_GOLD_ORE = block(TheOreIsALieModBlocks.LIE_GOLD_ORE, "lie_gold_ore");
		LIE_COAL_ORE = block(TheOreIsALieModBlocks.LIE_COAL_ORE, "lie_coal_ore");
		LIE_IRON_ORE = block(TheOreIsALieModBlocks.LIE_IRON_ORE, "lie_iron_ore");
		LIE_REDSTONE_ORE = block(TheOreIsALieModBlocks.LIE_REDSTONE_ORE, "lie_redstone_ore");
		LIE_LAPIS_ORE = block(TheOreIsALieModBlocks.LIE_LAPIS_ORE, "lie_lapis_ore");
		LIE_COPPER_ORE = block(TheOreIsALieModBlocks.LIE_COPPER_ORE, "lie_copper_ore");
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> I register(String name, Function<Item.Properties, ? extends I> supplier) {
		return (I) Items.registerItem(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(TheOreIsALieMod.MODID, name)), (Function<Item.Properties, Item>) supplier);
	}

	private static Item block(Block block, String name) {
		return block(block, name, new Item.Properties());
	}

	private static Item block(Block block, String name, Item.Properties properties) {
		return Items.registerItem(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(TheOreIsALieMod.MODID, name)), prop -> new BlockItem(block, prop), properties);
	}
}