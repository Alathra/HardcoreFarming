package me.ShermansWorld.HardcoreFarming.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.ShermansWorld.HardcoreFarming.ConfigVals;
import me.ShermansWorld.HardcoreFarming.Helper;
import me.ShermansWorld.HardcoreFarming.Main;

public class HardcoreFarmingCommands implements CommandExecutor {
	String version = Bukkit.getPluginManager().getPlugin("HardcoreFarming").getDescription().getVersion();

	public HardcoreFarmingCommands(Main plugin) {
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if (args.length == 0) {
			player.sendMessage(Helper.Chatlabel() + Helper.color("&e/HardcoreFarming reload &a- Reloads the config.yml"));
			return true;
		}
		if (args.length == 1) {
			if (args[0].equalsIgnoreCase("help")) {
				if (args.length == 0) {
					player.sendMessage(Helper.Chatlabel() + Helper.color("&e/HardcoreFarming reload &a- Reloads the config.yml"));
					return true;
				}
			} else if (args[0].equalsIgnoreCase("reload")) {
				if (!player.hasPermission("HardcoreFarming.reload")) {
					player.sendMessage(Helper.Chatlabel() + Helper.color("&cYou do not have permission to do this!"));
					return false;
				}
				player.sendMessage(Helper.Chatlabel() + Helper.color("&aconfig.yml reloaded!"));
				Main.getInstance().reloadConfig();
				Main.getInstance().saveDefaultConfig();
				ConfigVals.getConfigVals();
				return true;
			}
		}
		return false;
	}
}