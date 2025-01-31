package me.ShermansWorld.HardcoreFarming;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.TabCompleter;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import me.ShermansWorld.HardcoreFarming.commands.HardcoreFarmingCommands;
import me.ShermansWorld.HardcoreFarming.commands.HardcoreFarmingTabCompletion;
import me.ShermansWorld.HardcoreFarming.listeners.DurabilityListener;
import me.ShermansWorld.HardcoreFarming.listeners.GrowListener;
import me.ShermansWorld.HardcoreFarming.listeners.ItemUseOnBlockListener;
import me.ShermansWorld.HardcoreFarming.listeners.ItemUseOnEntityListener;
import me.ShermansWorld.HardcoreFarming.listeners.SpreadListener;
import me.ShermansWorld.HardcoreFarming.listeners.StructureGrowListener;

public class HardcoreFarming extends JavaPlugin {

	public static HardcoreFarming instance;
	public static boolean usingStackMob;

	public static HardcoreFarming getInstance() {
		return HardcoreFarming.instance;
	}

	@Override
	public void onEnable() {
		HardcoreFarming.instance = this;
		this.saveDefaultConfig();
		Config.getConfigVals();
		if (Config.enableGrowNerf) {
			this.getServer().getPluginManager().registerEvents((Listener) new GrowListener(), (Plugin) this);
			this.getServer().getPluginManager().registerEvents((Listener) new SpreadListener(), (Plugin) this);
			this.getServer().getPluginManager().registerEvents((Listener) new StructureGrowListener(), (Plugin) this);
			this.getServer().getPluginManager().registerEvents((Listener) new ItemUseOnBlockListener(), (Plugin) this);
			this.getServer().getPluginManager().registerEvents((Listener) new ItemUseOnEntityListener(), (Plugin) this);
			this.getServer().getPluginManager().registerEvents((Listener) new DurabilityListener(), (Plugin) this);
			this.getCommand("HardcoreFarming").setExecutor((CommandExecutor) new HardcoreFarmingCommands(this));
			this.getCommand("HardcoreFarming").setTabCompleter((TabCompleter) new HardcoreFarmingTabCompletion());
		}
	}

	@Override
	public void onDisable() {
	}
}
