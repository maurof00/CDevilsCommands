package it.mauro.cdevilscommands.commands;

import it.mauro.cdevilscommands.Format;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CarotaCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(!commandSender.hasPermission("devils.commands.carota")) {
            commandSender.sendMessage(Format.c("&cNon hai abbastanza permessi!"));
            return true;
        }

        Player player = (Player) commandSender;

        player.getInventory().addItem(new ItemStack(Material.GOLDEN_CARROT, 64));
        player.sendMessage(Format.c("&5Carota&7 aggiunta all'inventario!"));
        Bukkit.getConsoleSender().sendMessage(" " +
                " " +
                " " +
                " " +
                " " +
                " " +
                " " +
                " " +
                " " +
                " " +
                " " +
                " " +
                " " +
                " " +
                " " +
                " " +
                " " +
                " " +
                " " +
                " " +
                " " +
                " " );
        return false;
    }
}
