package org.bennocrafter.cs;

import org.bennocrafter.cs.commands.*;
import org.bennocrafter.cs.listener.*;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;


public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
    
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new  ConnectionListener(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}
