package me.michh.tntprevent.Listeners;

import jdk.javadoc.internal.doclint.HtmlTag;
import org.bukkit.Material;
import org.bukkit.block.Block;
//import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class TNTPlacementListener implements Listener {

    @EventHandler
    public void onBlockPlacement(BlockPlaceEvent e){
        Player player = e.getPlayer();
        Block block = e.getBlock();

        if(block.getType() == Material.TNT){
            player.sendMessage("For grief reasons we have disabled TNT placement.");
            e.setCancelled(true);
        }

    }
}
