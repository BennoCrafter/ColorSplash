package org.bennocrafter.cs.listener;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ConnectionListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();

        event.setJoinMessage(ChatColor.ITALIC + player.getName() + "" + ChatColor.BLUE + " joined Spark!");
        clearInventory(player);
        player.getInventory().addItem(new ItemStack(Material.COMPASS));
    }

    @EventHandler
    public void onLeft(PlayerQuitEvent event){
        Player player = event.getPlayer();

        event.setQuitMessage(ChatColor.RED + player.getName() + "" + ChatColor.BLUE + " left!");
    }

    public void clearInventory(Player player) {
        Inventory playerInventory = player.getInventory();

        // Loop through each slot in the inventory and set the item to null.
        for (int i = 0; i < playerInventory.getSize(); i++) {
            playerInventory.setItem(i, null);
        }

        // Optional: You can also clear armor slots if needed.
        player.getInventory().setArmorContents(new ItemStack[4]);
    }
}
