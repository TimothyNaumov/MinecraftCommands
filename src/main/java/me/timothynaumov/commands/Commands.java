package me.timothynaumov.commands;


import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class Commands extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        return true;
    }
}
