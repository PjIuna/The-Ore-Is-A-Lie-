package net.mcreator.theoreisalie.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import java.util.Random;

public class LieEmeraldOrePlayerStartsToDestroyProcedure {
	public static boolean eventResult = true;

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		if (new Random().nextGaussian() < 0.25) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				_level.explode(null, x, y, z, 4, Level.ExplosionInteraction.NONE);
			}
		} else {
			if (new Random().nextGaussian() < 0.25) {
				for (int index0 = 0; index0 < 3; index0++) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn_2 = EntityType.CREEPER.spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
						if (entityToSpawn_2 != null) {
							entityToSpawn_2.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
			} else {
				if (new Random().nextGaussian() < 0.25) {
					for (int index1 = 0; index1 < 10; index1++) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn_3 = new ItemEntity(_level, x, y, z, new ItemStack(Items.ROTTEN_FLESH));
							entityToSpawn_3.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn_3);
						}
					}
				} else {
					if (entity instanceof ServerPlayer _player && _player.level() instanceof ServerLevel _level) {
						AdvancementHolder _adv4 = _level.getServer().getAdvancements().get(ResourceLocation.parse("the_ore_is_a_lie:prevent_lie"));
						if (_adv4 != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv4);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv4, criteria);
							}
						}
					}
				}
			}
		}
	}
}