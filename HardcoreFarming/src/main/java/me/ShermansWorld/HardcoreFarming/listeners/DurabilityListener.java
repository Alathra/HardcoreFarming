package me.ShermansWorld.HardcoreFarming.listeners;

import java.util.HashSet;
import java.util.Set;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;

import me.ShermansWorld.HardcoreFarming.Config;

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

	private static final Set<Material> tools = new HashSet<>();

	static {
		// axes
		tools.add(Material.WOODEN_AXE);
		tools.add(Material.STONE_AXE);
		tools.add(Material.IRON_AXE);
		tools.add(Material.GOLDEN_AXE);
		tools.add(Material.DIAMOND_AXE);
		tools.add(Material.NETHERITE_AXE);

		// hoes
		tools.add(Material.WOODEN_HOE);
		tools.add(Material.STONE_HOE);
		tools.add(Material.IRON_HOE);
		tools.add(Material.GOLDEN_HOE);
		tools.add(Material.DIAMOND_HOE);
		tools.add(Material.NETHERITE_HOE);

		// pickaxes
		tools.add(Material.WOODEN_PICKAXE);
		tools.add(Material.STONE_PICKAXE);
		tools.add(Material.IRON_PICKAXE);
		tools.add(Material.GOLDEN_PICKAXE);
		tools.add(Material.DIAMOND_PICKAXE);
		tools.add(Material.NETHERITE_PICKAXE);

	}

	@EventHandler
	public static void onBlockBreak(BlockBreakEvent e) {
		if (!Config.enableHoeDurability) {
			return;
		}
		Block b = e.getBlock();
		if (cropBlocks.contains(b.getType())) {
			Player p = e.getPlayer();
			if (p.getGameMode() == GameMode.CREATIVE) {
				return;
			}
			if (tools.contains(p.getInventory().getItemInMainHand().getType())) {
				ItemStack tool = p.getInventory().getItemInMainHand();
				double chance = 1.0;
				double rand = Math.random();
				// unbreaking formula
				if (tool.containsEnchantment(Enchantment.DURABILITY)) {
					chance = (100.0 / ( (double) tool.getEnchantmentLevel(Enchantment.DURABILITY) + 1.0))/100;
				}
				Damageable dmg = (Damageable) tool.getItemMeta();
				// chance to remove durability
				if (chance >= rand) {
					// remove 1 durability from item
					dmg.setDamage(dmg.getDamage() + 1);
					tool.setItemMeta(dmg);
					p.getInventory().setItemInMainHand(tool);
				}
				if (tool.getType().getMaxDurability() <= dmg.getDamage()) {
					p.getInventory().remove(tool);
					p.playSound(p.getLocation(), Sound.ENTITY_ITEM_BREAK, 1.0F, 1.0F);
				}
			}
		}
	}
}