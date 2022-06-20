package me.michh.tntprevent;

import me.michh.tntprevent.Listeners.TNTPlacementListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Tntprevent extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new TNTPlacementListener(), this);
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
