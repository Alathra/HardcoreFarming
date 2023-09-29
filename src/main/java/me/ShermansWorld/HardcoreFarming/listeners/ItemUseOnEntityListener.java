package me.ShermansWorld.HardcoreFarming.listeners;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Animals;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

import me.ShermansWorld.HardcoreFarming.Config;
import me.ShermansWorld.HardcoreFarming.Helper;
import me.ShermansWorld.HardcoreFarming.HardcoreFarming;

public class ItemUseOnEntityListener implements Listener {

	@EventHandler
	public static void onItemUseOnEntity(PlayerInteractEntityEvent e) {

		final Player p = e.getPlayer();
		ItemStack item;
		if (e.getHand() == EquipmentSlot.HAND) {
			item = p.getInventory().getItemInMainHand();
		} else {
			item = p.getInventory().getItemInOffHand();
		}
		if (e.getRightClicked() instanceof Animals) {
			Animals animal = (Animals) e.getRightClicked();
			if (!animal.isBreedItem(item)) {
				return;
			}
			if (!animal.isAdult()) {
				e.setCancelled(true);
				return;
			}
			if (!animal.canBreed()) {
				e.setCancelled(true);
				return;
			}
			if (animal.isLoveMode()) {
				e.setCancelled(true);
				return;
			}
			int feedAmount;
			switch (animal.getType()) {
			case BEE:
				feedAmount = Config.beeFeedAmount;
				break;
			case CAT:
				feedAmount = Config.catFeedAmount;
				break;
			case CHICKEN:
				feedAmount = Config.chickenFeedAmount;
				break;
			case COW:
				feedAmount = Config.cowFeedAmount;
				break;
			case DONKEY:
				feedAmount = Config.donkeyFeedAmount;
				break;
			case FROG:
				feedAmount = Config.frogFeedAmount;
				break;
			case FOX:
				feedAmount = Config.foxFeedAmount;
				break;
			case GOAT:
				feedAmount = Config.goatFeedAmount;
				break;
			case HOGLIN:
				feedAmount = Config.hoglinFeedAmount;
				break;
			case HORSE:
				feedAmount = Config.horseFeedAmount;
				break;
			case LLAMA:
				feedAmount = Config.llamaFeedAmount;
				break;
			case TRADER_LLAMA:
				feedAmount = Config.llamaFeedAmount;
				break;
			case MUSHROOM_COW:
				feedAmount = Config.mooshroomFeedAmount;
				break;
			case OCELOT:
				feedAmount = Config.ocelotFeedAmount;
				break;
			case PANDA:
				feedAmount = Config.pandaFeedAmount;
				break;
			case PIG:
				feedAmount = Config.pigFeedAmount;
				break;
			case RABBIT:
				feedAmount = Config.rabbitFeedAmount;
				break;
			case SHEEP:
				feedAmount = Config.sheepFeedAmount;
				break;
			case STRIDER:
				feedAmount = Config.striderFeedAmount;
				break;
			case TURTLE:
				feedAmount = Config.turtleFeedAmount;
				break;
			case WOLF:
				if (animal.getHealth() < animal.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()) {
					return;
				}
				feedAmount = Config.wolfFeedAmount;
				break;
			default:
				feedAmount = 1;
				break;
			}
			if (item.getAmount() >= feedAmount) {
				if (item.getAmount() == feedAmount) {
					final int tempFeedAmount = feedAmount;
					final ItemStack tempItem = item;
					new BukkitRunnable() {
						@Override
						public void run() {
							tempItem.setAmount(tempItem.getAmount() - (tempFeedAmount));
					    	p.getInventory().remove(tempItem);
						}
					}.runTaskLater(HardcoreFarming.getInstance(), 5L);
				} else {
					if (e.getHand() == EquipmentSlot.HAND) {
						p.getInventory().setItem(EquipmentSlot.HAND, new ItemStack(Material.AIR));;
						item.setAmount(item.getAmount() - feedAmount);
						p.getInventory().addItem(item);
					} else {
						p.getInventory().setItem(EquipmentSlot.OFF_HAND, new ItemStack(Material.AIR));;
						item.setAmount(item.getAmount() - feedAmount);
						p.getInventory().setItem(EquipmentSlot.OFF_HAND, item);
					}
				}
			} else {
				p.sendMessage(Helper.Chatlabel() + Helper.color("&cYou need " + String.valueOf(feedAmount) + " "
						+ item.getType().toString() + " to breed this animal"));
				e.setCancelled(true);
			}
		}
	}

}
