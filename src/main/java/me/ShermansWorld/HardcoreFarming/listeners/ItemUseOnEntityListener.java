package me.ShermansWorld.HardcoreFarming.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Animals;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;

import me.ShermansWorld.HardcoreFarming.ConfigVals;
import me.ShermansWorld.HardcoreFarming.Helper;
import me.ShermansWorld.HardcoreFarming.Main;

public class ItemUseOnEntityListener implements Listener {

	@EventHandler
	public static void ItemUseOnEntity(PlayerInteractEntityEvent e) {

		Player p = e.getPlayer();
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
				feedAmount = ConfigVals.beeFeedAmount;
				break;
			case CAT:
				feedAmount = ConfigVals.catFeedAmount;
				break;
			case CHICKEN:
				feedAmount = ConfigVals.chickenFeedAmount;
				break;
			case COW:
				feedAmount = ConfigVals.cowFeedAmount;
				break;
			case DONKEY:
				feedAmount = ConfigVals.donkeyFeedAmount;
				break;
			case FROG:
				feedAmount = ConfigVals.frogFeedAmount;
				break;
			case FOX:
				feedAmount = ConfigVals.foxFeedAmount;
				break;
			case GOAT:
				feedAmount = ConfigVals.goatFeedAmount;
				break;
			case HOGLIN:
				feedAmount = ConfigVals.hoglinFeedAmount;
				break;
			case HORSE:
				feedAmount = ConfigVals.horseFeedAmount;
				break;
			case LLAMA:
				feedAmount = ConfigVals.llamaFeedAmount;
				break;
			case TRADER_LLAMA:
				feedAmount = ConfigVals.llamaFeedAmount;
				break;
			case MUSHROOM_COW:
				feedAmount = ConfigVals.mooshroomFeedAmount;
				break;
			case OCELOT:
				feedAmount = ConfigVals.ocelotFeedAmount;
				break;
			case PANDA:
				feedAmount = ConfigVals.pandaFeedAmount;
				break;
			case PIG:
				feedAmount = ConfigVals.pigFeedAmount;
				break;
			case RABBIT:
				feedAmount = ConfigVals.rabbitFeedAmount;
				break;
			case SHEEP:
				feedAmount = ConfigVals.sheepFeedAmount;
				break;
			case STRIDER:
				feedAmount = ConfigVals.striderFeedAmount;
				break;
			case TURTLE:
				feedAmount = ConfigVals.turtleFeedAmount;
				break;
			case WOLF:
				if (animal.getHealth() < animal.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()) {
					return;
				}
				feedAmount = ConfigVals.wolfFeedAmount;
				break;
			default:
				feedAmount = 1;
				break;
			}
			if (item.getAmount() >= feedAmount) {
				if (item.getAmount() == feedAmount) {
					Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getInstance(), new Runnable() {
					    @Override
					    public void run() {
					    	item.setAmount(item.getAmount() - (feedAmount));
					    	p.getInventory().remove(item);
					    }
					}, 5L); //20 Tick (1 Second) delay before run() is called
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
