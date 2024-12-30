package mc.miniMCC;


import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class MiniMCC extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("getmeltdownmap").setExecutor(new GetMeltdownMap());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
