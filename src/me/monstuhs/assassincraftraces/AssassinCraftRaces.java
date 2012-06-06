/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.monstuhs.assassincraftraces;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author James
 */
public class AssassinCraftRaces extends JavaPlugin {

    @Override
    public void onDisable() {
        Bukkit.getScheduler().cancelAllTasks();
    }

    @Override
    public void onEnable() {
    }
}
