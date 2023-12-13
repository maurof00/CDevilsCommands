package it.mauro.cdevilscommands.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BroadcastCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!sender.hasPermission("devils.commands.broadcast")) {
            sender.sendMessage(ChatColor.RED + "Non hai abbastanza permessi!");
            return true;
        }

        if (args.length < 1) {
            sender.sendMessage(ChatColor.RED + "Usa: /broadcast <message>");
            return true;
        }

        String message = ChatColor.translateAlternateColorCodes('&', String.join(" ", args));

        for (Player player : Bukkit.getOnlinePlayers()) {
            player.sendMessage(ChatColor.DARK_RED + "[ANNUNCIO] " +ChatColor.YELLOW + message);
        }

        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.YELLOW + "[Broadcast] " + message);

        return true;
    }
}
