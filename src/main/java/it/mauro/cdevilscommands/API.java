package it.mauro.cdevilscommands;

import org.bukkit.entity.Player;

public class API {
    public static boolean NOTPERMITTED(Player player, String perm) {
        if(!player.hasPermission(perm)) {
            player.sendMessage(Format.c("Non hai abbastanza permessi!"));
        }
        return true;
    }
}
