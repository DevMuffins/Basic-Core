package me.Basic;

import me.Basic.GMA.AdventureCMD;
import me.Basic.GMC.CreativeCMD;
import me.Basic.GMS.SurvivalCMD;
import me.Basic.GMSP.SpectatorCMD;
import me.Basic.Heal.HealCMD;
import me.Basic.Vanish.VanishCMD;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getLogger().info("Basic Core has been enabled!");
        getCommand("GMC").setExecutor(new CreativeCMD());
        getCommand("GMA").setExecutor(new AdventureCMD());
        getCommand("GMSP").setExecutor(new SpectatorCMD());
        getCommand("GMS").setExecutor(new SurvivalCMD());
        getCommand("Vanish").setExecutor(new VanishCMD());
        getCommand("Heal").setExecutor(new HealCMD());

    }

    @Override
    public void onDisable() {
        getLogger().info("Basic Core has been disabled!");
    }
}
