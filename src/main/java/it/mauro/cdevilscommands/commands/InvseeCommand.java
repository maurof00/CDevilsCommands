package it.mauro.cdevilscommands.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import javax.swing.plaf.basic.BasicButtonUI;

public class InvseeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(!commandSender.hasPermission("devils.commands.invsee")) {
            commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cNon hai abbastanza permessi!"));
            return true;
        }
        if(strings.length == 0) {
            commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cInserisci un giocatore!"));
        } else if (strings.length == 1) {
            String targetname = strings[0];
            Player target = Bukkit.getPlayer(targetname);
            if(!(target == null)) {
                Inventory targetInv = target.getInventory();
                Player player = (Player) commandSender;
                player.openInventory(targetInv);
            } else {
                commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cGiocatore non trovato!"));
            }
        } else {
            commandSender.sendMessage("Errore");
        }
        return false;
    }
}
