package me.ShermansWorld.HardcoreFarming.listeners;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockSpreadEvent;

import me.ShermansWorld.HardcoreFarming.ConfigVals;

//DOES NOT ACCOUNT FOR GROWING MUSHROOMS (spread not giant)
public class SpreadListener implements Listener {
	@EventHandler
	public static void SpreadEvent(BlockSpreadEvent e) {
		double chance = Math.random(); // pick a random number between 0 and 1
		Block block = e.getBlock();
		switch (block.getType()) {
		case DIRT:
			// Grass or Mycellium block spreading
			return;
		case AIR:
			Location currentLoc = block.getLocation();
			Location below = new Location(currentLoc.getWorld(), currentLoc.getBlockX(), currentLoc.getBlockY() - 1,
					currentLoc.getBlockZ());
			if (below.getBlock().getType() == Material.BAMBOO
					|| below.getBlock().getType() == Material.BAMBOO_SAPLING) {
				if (chance > ConfigVals.bambooGrowthRate) {
					e.setCancelled(true);
				}
				return;
			} else if (below.getBlock().getType() == Material.CHORUS_FLOWER) {
				if (chance > ConfigVals.chorusGrowthRate) {
					e.setCancelled(true);
				}
				return;
			}
			Location north = new Location(currentLoc.getWorld(), currentLoc.getBlockX(), currentLoc.getBlockY(),
					currentLoc.getBlockZ() - 1);
			Location south = new Location(currentLoc.getWorld(), currentLoc.getBlockX(), currentLoc.getBlockY(),
					currentLoc.getBlockZ() + 1);
			Location east = new Location(currentLoc.getWorld(), currentLoc.getBlockX() + 1, currentLoc.getBlockY(),
					currentLoc.getBlockZ());
			Location west = new Location(currentLoc.getWorld(), currentLoc.getBlockX() - 1, currentLoc.getBlockY(),
					currentLoc.getBlockZ());
			if (north.getBlock().getType() == Material.CHORUS_FLOWER
					|| south.getBlock().getType() == Material.CHORUS_FLOWER
					|| east.getBlock().getType() == Material.CHORUS_FLOWER
					|| west.getBlock().getType() == Material.CHORUS_FLOWER) {
				if (chance > ConfigVals.chorusGrowthRate) {
					e.setCancelled(true);
				}
				return;
			}
			Location above = new Location(currentLoc.getWorld(), currentLoc.getBlockX(), currentLoc.getBlockY() + 1,
					currentLoc.getBlockZ());
			if (above.getBlock().getType() == Material.CAVE_VINES) {
				if (chance > ConfigVals.glowBerryGrowthRate) {
					e.setCancelled(true);
				}
				return;
			}
		case WATER:
			Location currentLoc2 = block.getLocation();
			Location below2 = new Location(currentLoc2.getWorld(), currentLoc2.getBlockX(), currentLoc2.getBlockY() - 1,
					currentLoc2.getBlockZ());
			if (below2.getBlock().getType() == Material.KELP) {
				if (chance > ConfigVals.kelpGrowthRate) {
					e.setCancelled(true);
				}
				return;
			}
		default:
			// ALL OTHER PLANTS
			//Bukkit.broadcastMessage("OTHER: " + block.getType().toString());
			return;
		}

	}
}