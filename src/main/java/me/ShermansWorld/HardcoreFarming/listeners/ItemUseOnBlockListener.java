package me.ShermansWorld.HardcoreFarming.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import me.ShermansWorld.HardcoreFarming.Config;
import me.ShermansWorld.HardcoreFarming.Helper;

public class ItemUseOnBlockListener implements Listener {
	@EventHandler
	public static void StructureEvent(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		if (e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
			if (p.getInventory().getItemInMainHand().getType() == Material.BONE_MEAL) {
				if (Config.disableBoneMeal) {
					e.setCancelled(true);
					p.sendMessage(Helper.Chatlabel() + Helper.color("&cThe use of bone meal is disabled on this server."));
				}
			}
		}
	}

}
