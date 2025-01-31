package me.ShermansWorld.HardcoreFarming.listeners;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockGrowEvent;

import me.ShermansWorld.HardcoreFarming.Config;

public class GrowListener implements Listener {

	@EventHandler
	public static void GrowEvent(BlockGrowEvent e) {
		double chance = Math.random(); // pick a random number between 0 and 1
		Block block = e.getBlock();
		switch (block.getType()) {
		case AIR:
			Location currentLoc = block.getLocation();
			Location below = new Location(currentLoc.getWorld(), currentLoc.getBlockX(), currentLoc.getBlockY() - 1,
					currentLoc.getBlockZ());
			if (below.getBlock().getType() == Material.CACTUS) {
				if (chance > Config.cactusGrowrthRate) {
					e.setCancelled(true);
				}
				return;
			} else if (below.getBlock().getType() == Material.SUGAR_CANE) {
				if (chance > Config.sugarCaneGrowthRate) {
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

			if (north.getBlock().getType() == Material.MELON_STEM || south.getBlock().getType() == Material.MELON_STEM
					|| east.getBlock().getType() == Material.MELON_STEM
					|| west.getBlock().getType() == Material.MELON_STEM) {
				if (chance > Config.melonGrowthRate) {
					e.setCancelled(true);
				}
				return;
			}
			if (north.getBlock().getType() == Material.PUMPKIN_STEM
					|| south.getBlock().getType() == Material.PUMPKIN_STEM
					|| east.getBlock().getType() == Material.PUMPKIN_STEM
					|| west.getBlock().getType() == Material.PUMPKIN_STEM) {
				if (chance > Config.pumpkinGrowthRate) {
					e.setCancelled(true);
				}
				return;
			}
		case BEETROOTS:
			if (chance > Config.beetrootGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case CARROTS:
			if (chance > Config.carrotGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case CHORUS_FLOWER:
			if (chance > Config.chorusGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case COCOA:
			if (chance > Config.cocoaGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case MELON_STEM:
			if (chance > Config.melonGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case NETHER_WART:
			if (chance > Config.netherWartGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case POTATOES:
			if (chance > Config.potatoGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case PUMPKIN_STEM:
			if (chance > Config.pumpkinGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case SWEET_BERRY_BUSH:
			if (chance > Config.sweetBerryGrowthRate) {
				e.setCancelled(true);
			}
			return;
		case WHEAT:
			if (chance > Config.wheatGrowthRate) {
				e.setCancelled(true);
			}
			return;
		default:
			return;
		}

	}
}