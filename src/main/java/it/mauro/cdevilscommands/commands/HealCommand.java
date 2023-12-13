package it.mauro.cdevilscommands.commands;

import it.mauro.cdevilscommands.API;
import it.mauro.cdevilscommands.Format;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        Player player = (Player) commandSender;

        if(!commandSender.hasPermission("devils.commands.heal")) {
            commandSender.sendMessage(Format.c("&cNon hai abbastanza permessi!"));
            return true;
        }

        if(strings.length == 0) {
            player.setFoodLevel(20);
            player.setHealth(20);
            player.getActivePotionEffects().clear();
            player.sendMessage(Format.c("&7Sei stato &5Curato&7."));
        } else if(strings.length == 1) {
            String targetname = strings[0];
            Player target = Bukkit.getPlayer(targetname);
            if(!(target == null)) {
                target.setFoodLevel(20);
                target.setHealth(20);
                target.getActivePotionEffects().clear();
                target.sendMessage(Format.c("&7Sei stato &5Curato&7 da &5{sender}&7.")
                        .replace("{sender}", player.getName()));
                player.sendMessage(Format.c("&7Hai curato &5{target}&7.")
                        .replace("{target}", targetname));
            } else {
                player.sendMessage(Format.c("&cGiocatore offline!"));
            }
        } else if(command.getName().equals("healall")) {
            for(Player onplayer : Bukkit.getOnlinePlayers()) {
                onplayer.setHealth(20);
                onplayer.setFoodLevel(20);
                onplayer.getActivePotionEffects().clear();
                onplayer.sendMessage(Format.c("&5{sender}&7 ha curato tutti!")
                        .replace("{player}", player.getName()));
            }
            player.sendMessage(Format.c("&7Hai Curato tutti i giocatori nel server!"));
        }







        return false;
    }
}
