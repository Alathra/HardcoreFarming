package me.ShermansWorld.HardcoreFarming.listeners;

import java.util.HashSet;
import java.util.Set;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;


public class DurabilityListener implements Listener {
	
	private static final Set<Material> cropBlocks = new HashSet<>();

	static {
		cropBlocks.add(Material.BEETROOTS);
		cropBlocks.add(Material.BROWN_MUSHROOM);
		cropBlocks.add(Material.CAVE_VINES);
		cropBlocks.add(Material.CARROTS);
		cropBlocks.add(Material.COCOA);
		cropBlocks.add(Material.KELP);
		cropBlocks.add(Material.MELON_STEM);
		cropBlocks.add(Material.NETHER_WART);
		cropBlocks.add(Material.POTATOES);
		cropBlocks.add(Material.PUMPKIN_STEM);
		cropBlocks.add(Material.RED_MUSHROOM);
		cropBlocks.add(Material.SUGAR_CANE);
		cropBlocks.add(Material.SWEET_BERRY_BUSH);
		cropBlocks.add(Material.WHEAT);
	}
	
	private static final Set<Material> hoes = new HashSet<>();
	
	static {
		hoes.add(Material.WOODEN_HOE);
		hoes.add(Material.STONE_HOE);
		hoes.add(Material.IRON_HOE);
		hoes.add(Material.GOLDEN_HOE);
		hoes.add(Material.DIAMOND_HOE);
		hoes.add(Material.NETHERITE_HOE);
	}

	@EventHandler
	public static void onBlockBreak(BlockBreakEvent e) {
		Block b = e.getBlock();
		if (cropBlocks.contains(b.getType())) {
			Player p = e.getPlayer();
			if (p.getGameMode() == GameMode.CREATIVE) {
				return;
			}
			if (hoes.contains(p.getInventory().getItemInMainHand().getType())) {
				ItemStack hoe = p.getInventory().getItemInMainHand();
				Damageable dmg = (Damageable) hoe.getItemMeta();
				dmg.setDamage(dmg.getDamage()+1);
				hoe.setItemMeta(dmg);
				p.getInventory().setItemInMainHand(hoe);
				if (hoe.getType().getMaxDurability() <= dmg.getDamage()) {
					p.getInventory().remove(hoe);
					p.playSound(p.getLocation(), Sound.ENTITY_ITEM_BREAK, 1.0F, 1.0F);
				}
			}
		}
	}
}