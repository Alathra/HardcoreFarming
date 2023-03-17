package me.ShermansWorld.HardcoreFarming.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.StructureGrowEvent;

import me.ShermansWorld.HardcoreFarming.ConfigVals;

public class StructureGrowListener implements Listener {
	@EventHandler
	public static void StructureEvent(StructureGrowEvent e) {
		double chance = Math.random(); // pick a random number between 0 and 1
		switch (e.getSpecies()) {
		case ACACIA:
			if (chance > ConfigVals.acaciaGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case AZALEA:
			if (chance > ConfigVals.azaleaGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case BIG_TREE:
			if (chance > ConfigVals.oakGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case BIRCH:
			if (chance > ConfigVals.birchGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case BROWN_MUSHROOM:
			if (chance > ConfigVals.brownMushroomGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case CHORUS_PLANT:
			if (chance > ConfigVals.chorusGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case COCOA_TREE:
			if (chance > ConfigVals.jungleGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case CRIMSON_FUNGUS:
			if (chance > ConfigVals.crimsonFungusGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case DARK_OAK:
			if (chance > ConfigVals.darkOakGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case JUNGLE:
			if (chance > ConfigVals.jungleGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case JUNGLE_BUSH:
			if (chance > ConfigVals.jungleGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case MANGROVE:
			if (chance > ConfigVals.mangroveGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case MEGA_REDWOOD:
			if (chance > ConfigVals.spruceGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case RED_MUSHROOM:
			if (chance > ConfigVals.redMushroomGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case REDWOOD:
			if (chance > ConfigVals.spruceGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case SMALL_JUNGLE:
			if (chance > ConfigVals.jungleGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case SWAMP:
			if (chance > ConfigVals.oakGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case TALL_BIRCH:
			if (chance > ConfigVals.birchGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case TALL_MANGROVE:
			if (chance > ConfigVals.mangroveGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case TALL_REDWOOD:
			if (chance > ConfigVals.spruceGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case TREE:
			if (chance > ConfigVals.oakGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case WARPED_FUNGUS:
			if (chance > ConfigVals.warpedFungusGrowthRate) {
				e.setCancelled(true);
			}
			return;

		default:
			return;
		}

	}
}
