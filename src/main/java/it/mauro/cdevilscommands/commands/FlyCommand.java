package it.mauro.cdevilscommands.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(!commandSender.hasPermission("devils.commands.fly")) {
            commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cNon hai abbastaza permessi!"));
            return true;
        }
        Player player = (Player) commandSender;

        if(player.getAllowFlight()) {
            player.setAllowFlight(false);
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Volo &5Disabilitato&7."));
        } else if(!player.getAllowFlight()) {
            player.setAllowFlight(true);
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Volo &5Abilitato&7."));
        }
        return false;
    }
}
