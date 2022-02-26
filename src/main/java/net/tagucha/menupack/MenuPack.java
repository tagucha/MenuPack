package main.java.net.tagucha.menupack;

import org.bukkit.plugin.java.JavaPlugin;

public class MenuPack extends JavaPlugin {
    @Override
    public void onDisable() {
        this.getLogger().info("<= The Menu Pack disabled.");
    }

    @Override
    public void onEnable() {
        this.getLogger().info("=> The Menu Pack enabled.");
    }
}
