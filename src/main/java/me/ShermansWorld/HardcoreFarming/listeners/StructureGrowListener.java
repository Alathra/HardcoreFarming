package me.ShermansWorld.HardcoreFarming.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.StructureGrowEvent;

import me.ShermansWorld.HardcoreFarming.Config;

public class StructureGrowListener implements Listener {
	@EventHandler
	public static void StructureEvent(StructureGrowEvent e) {
		double chance = Math.random(); // pick a random number between 0 and 1
		switch (e.getSpecies()) {
		case ACACIA:
			if (chance > Config.acaciaGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case AZALEA:
			if (chance > Config.azaleaGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case BIG_TREE:
			if (chance > Config.oakGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case BIRCH:
			if (chance > Config.birchGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case BROWN_MUSHROOM:
			if (chance > Config.brownMushroomGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case CHORUS_PLANT:
			if (chance > Config.chorusGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case COCOA_TREE:
			if (chance > Config.jungleGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case CRIMSON_FUNGUS:
			if (chance > Config.crimsonFungusGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case DARK_OAK:
			if (chance > Config.darkOakGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case JUNGLE:
			if (chance > Config.jungleGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case JUNGLE_BUSH:
			if (chance > Config.jungleGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case MANGROVE:
			if (chance > Config.mangroveGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case MEGA_REDWOOD:
			if (chance > Config.spruceGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case RED_MUSHROOM:
			if (chance > Config.redMushroomGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case REDWOOD:
			if (chance > Config.spruceGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case SMALL_JUNGLE:
			if (chance > Config.jungleGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case SWAMP:
			if (chance > Config.oakGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case TALL_BIRCH:
			if (chance > Config.birchGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case TALL_MANGROVE:
			if (chance > Config.mangroveGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case TALL_REDWOOD:
			if (chance > Config.spruceGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case TREE:
			if (chance > Config.oakGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case WARPED_FUNGUS:
			if (chance > Config.warpedFungusGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case CHERRY:
			if (chance > Config.cherryGrowthRate) {
				e.setCancelled(true);
			}
			return;

		default:
			return;
		}

	}
}
