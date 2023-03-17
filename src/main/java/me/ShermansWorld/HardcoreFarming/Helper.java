package me.ShermansWorld.HardcoreFarming;

import org.bukkit.ChatColor;

public class Helper {


	public static String color(String input) {
		return ChatColor.translateAlternateColorCodes('&', input);
	}

	public static String Chatlabel() {
		return color("&4[&cHardcoreFarming&4]&r ");
	}

}
