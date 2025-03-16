package de.jonas.template;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public static Main INSTANCE;
    public static FileConfiguration CONFIG;

    @Override
    public void onLoad() {
        INSTANCE = this;

        CONFIG = this.getConfig();

        // CommandAPI
        /*
         * if (!CommandAPI.isLoaded())
         * CommandAPI.onLoad(new CommandAPIBukkitConfig(this));
         * new COMMAND();
         */

    }

    @Override
    public void onEnable() {
        // this.listener();

        // CommandAPI
        /*
         * CommandAPI.onEnable();
         */
    }

    @Override
    public void onDisable() {
        // CommandAPI
        /*
         * CommandAPI.onDisable();
         */
    }

    public void listener() {
        PluginManager pm = getServer().getPluginManager();

        // pm.registerEvents(new InvClickEvent(), this);
    }
}
