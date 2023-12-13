package it.mauro.cdevilscommands.commands;

import it.mauro.cdevilscommands.Format;
import it.mauro.cdevilscommands.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.HashSet;
import java.util.Set;

public class VanishCommand implements CommandExecutor {
    public Set<Player> vanished = new HashSet<>();
    private final Main pl;

    public VanishCommand(Main pl) {
        this.pl = pl;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(!commandSender.hasPermission("devils.commands.vanish")) {
            commandSender.sendMessage(Format.c("&cNon hai abbastanza permessi!"));
            return true;
        }
        Player player = (Player) commandSender;

        if(!vanished.contains(player)) {
            vanished.add(player);
            for(Player onlinePlayer : Bukkit.getOnlinePlayers()) {
                if(!onlinePlayer.hasPermission("devils.staff.show")) {
                    onlinePlayer.hidePlayer(pl, player);
                }
            }
            player.sendMessage(Format.c("&7Vanish &5Abilitata&7."));
        } else {
            for(Player onlinePlayer : Bukkit.getOnlinePlayers()) {
                if(!onlinePlayer.hasPermission("devils.staff.show")) {
                    onlinePlayer.showPlayer(pl, player);
                }
            }
            vanished.remove(player);
            player.sendMessage(Format.c("&7Vanish &5Disabilitata&7."));
        }







        return false;
    }
}
