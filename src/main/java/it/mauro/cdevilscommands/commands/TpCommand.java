package it.mauro.cdevilscommands.commands;

import it.mauro.cdevilscommands.Format;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TpCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use this command.");
            return true;
        }

        Player player = (Player) sender;

        if (args.length == 0) {
            player.sendMessage(Format.c("&eUsa: /tp <player> [targetPlayer]"));
            return true;
        }

        if (args.length == 1) {
            Player targetPlayer = player.getServer().getPlayer(args[0]);

            if (targetPlayer != null) {
                player.teleport(targetPlayer);
                player.sendMessage(Format.c("&7Teletrasportato da &5" + targetPlayer.getName()));
            } else {
                player.sendMessage(Format.c("&cGiocatore offline."));
            }

            return true;
        }

        if (args.length == 2) {
            Player player1 = player.getServer().getPlayer(args[0]);
            Player player2 = player.getServer().getPlayer(args[1]);

            if (player1 != null && player2 != null) {
                player1.teleport(player2);
                player.sendMessage(Format.c("&5"+player1.getName() + "&7 e' stato teletrasportato da &5" + player2.getName() + "&7."));
            } else {
                player.sendMessage(Format.c("&cUno o piu' giocatori sono offline."));
            }

            return true;
        }

        return false;
    }
}
