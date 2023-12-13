package it.mauro.cdevilscommands.events;

import it.mauro.cdevilscommands.Format;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class KillEvent implements Listener {
    @EventHandler
    public void onPlayerKill(PlayerDeathEvent event) {
        Player victim = event.getEntity();
        Player killer = event.getEntity().getKiller();

        if (killer != null) {
            strikeLightning(victim);
            event.setDeathMessage(Format.c("&5{vittima}&7 e' stato ucciso da &5{killer}&7.")
                    .replace("{killer}", killer.getName())
                    .replace("{vittima}", victim.getName()));
        }
    }

    private void strikeLightning(Player player) {
        player.getWorld().strikeLightningEffect(player.getLocation());
    }
}
