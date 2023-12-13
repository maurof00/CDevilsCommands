package it.mauro.cdevilscommands.commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GamemodeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(!commandSender.hasPermission("devils.commands.gamemode")) {
            commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cNon hai abbastanza permessi!"));
            return true;
        }

        Player player = (Player) commandSender;

        if(strings.length == 0) {
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cGamemode dispobibili: creative, survival"));
        } else if (strings.length == 1 && strings[0].equalsIgnoreCase("creative")) {
            player.setGameMode(GameMode.CREATIVE);
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Gamemode impostata a &5Creative"));
        } else if (strings.length == 1 && strings[0].equalsIgnoreCase("survival")) {
            player.setGameMode(GameMode.SURVIVAL);
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Gamemode impostata a &5Survival"));
        } else if (strings.length == 1 && strings[0].equalsIgnoreCase("c")) {
            player.setGameMode(GameMode.CREATIVE);
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Gamemode impostata a &5Creative"));
        }else if (strings.length == 1 && strings[0].equalsIgnoreCase("s")) {
            player.setGameMode(GameMode.SURVIVAL);
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Gamemode impostata a &5Survival"));
        } else if (strings.length == 1 && strings[0].equalsIgnoreCase("0")) {
            player.setGameMode(GameMode.SURVIVAL);
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Gamemode impostata a &5Survival"));
        }else if (strings.length == 1 && strings[0].equalsIgnoreCase("1")) {
            player.setGameMode(GameMode.CREATIVE);
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Gamemode impostata a &5Creative"));
        } else if (strings.length == 1 && strings[0].equalsIgnoreCase("2")) {
            player.setGameMode(GameMode.SPECTATOR);
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Gamemode impostata a &5Spettatore"));
        }else if (strings.length == 1 && strings[0].equalsIgnoreCase("sp")) {
            player.setGameMode(GameMode.SPECTATOR);
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Gamemode impostata a &5Spettatore"));
        } else if (strings.length == 1 && strings[0].equalsIgnoreCase("spectator")) {
            player.setGameMode(GameMode.SPECTATOR);
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Gamemode impostata a &5Spettatore"));
        }

        return false;
    }
}
