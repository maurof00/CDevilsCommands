package it.mauro.cdevilscommands;

import it.mauro.cdevilscommands.commands.*;
import it.mauro.cdevilscommands.events.KillEvent;
import it.mauro.cdevilscommands.events.VanishEvents;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    @Override
    public void onEnable() {

        System.out.println(ChatColor.GRAY+"Plugin abilitato!");



        getCommand("gamemode").setExecutor(new GamemodeCommand());
        getCommand("fly").setExecutor(new FlyCommand());
        getCommand("broadcast").setExecutor(new BroadcastCommand());
        getCommand("invsee").setExecutor(new InvseeCommand());
        getCommand("heal").setExecutor(new HealCommand());
        getCommand("tp").setExecutor(new TpCommand());
        getCommand("vanish").setExecutor(new VanishCommand(this));
        getCommand("sas").setExecutor(new CarotaCommand());
        getCommand("gmc").setExecutor(new ShortGamemodeCommands());
        getCommand("gmsp").setExecutor(new ShortGamemodeCommands());
        getCommand("gms").setExecutor(new ShortGamemodeCommands());
        getCommand("healall").setExecutor(new HealCommand());
        getServer().getPluginManager().registerEvents(new KillEvent(), this);
    }

    @Override
    public void onDisable() {

    }
}
