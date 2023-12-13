package it.mauro.cdevilscommands;

import org.bukkit.ChatColor;

public class Format {
    public static String c(String msg) {
        return ChatColor.translateAlternateColorCodes('&', msg);
    }
}
