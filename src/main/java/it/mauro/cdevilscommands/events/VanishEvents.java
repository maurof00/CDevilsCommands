package it.mauro.cdevilscommands.events;

import it.mauro.cdevilscommands.commands.VanishCommand;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerDropItemEvent;

public class VanishEvents implements Listener {
    private final VanishCommand vanishCommand;

    public VanishEvents(VanishCommand vanishCommand) {
        this.vanishCommand = vanishCommand;
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {
        if(vanishCommand.vanished.contains(e.getPlayer())) {
            e.setCancelled(true);
        } else {
            e.setCancelled(false);
        }
    }
    @EventHandler
    public void onBlockPlace(BlockPlaceEvent e) {
        if(vanishCommand.vanished.contains(e.getPlayer())) {
            e.setCancelled(true);
        } else {
            e.setCancelled(false);
        }
    }
    @EventHandler
    public void onDropItem(PlayerDropItemEvent e) {
        if(vanishCommand.vanished.contains(e.getPlayer())) {
            e.setCancelled(true);
        } else {
            e.setCancelled(false);
        }
    }
}
