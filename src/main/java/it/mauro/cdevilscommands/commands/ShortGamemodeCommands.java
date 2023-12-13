package it.mauro.cdevilscommands.commands;

import it.mauro.cdevilscommands.Format;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ShortGamemodeCommands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(!commandSender.hasPermission("devils.commands.gamemode")) {
            commandSender.sendMessage(Format.c("&cNon hai abbastanza permessi!"));
            return true;
        }

        Player player = (Player) commandSender;

        switch (command.getName()) {
            case "gmc":
                player.setGameMode(GameMode.CREATIVE);
                player.sendMessage(Format.c("&7Gamemode impostata a &5Creativa&7."));
                break;
            case "gms":
                player.setGameMode(GameMode.SURVIVAL);
                player.sendMessage(Format.c("&7Gamemode impostata a &5Sopravvivenza&7."));
                break;
            case "gmsp":
                player.setGameMode(GameMode.SPECTATOR);
                player.sendMessage(Format.c("&7Gamemode impostata a &5Spettatore&7."));
                break;
        }
        return false;
    }
}
