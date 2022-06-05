package com.jmsgvn;

import com.jmsgvn.lag.LagManager;
import com.jmsgvn.lag.task.ClearTask;
import com.jmsgvn.listener.ServerListPingListener;
import com.jmsgvn.module.Module;
import com.jmsgvn.util.CC;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private static Plugin plugin;
    private LagManager lagManager;
    private Module[] modules;
    @Override public void onEnable() {
        plugin = this;

        modules = new Module[] {(Module) new ClearTask(), (Module) new ServerListPingListener()};

        loadModules();
        loadClasses();
        getLogger().info(CC.translate("Percy has been enabled."));
    }
    @Override public void onDisable() {
        getLogger().info(CC.translate("Percy has been disabled."));
    }

    private void loadClasses() {
        lagManager = new LagManager(this);
    }

    private void loadModules() {
        for (Module module : modules) {
            module.setEnabled();
        }
    }

    public static Plugin getPlugin() {
        return plugin;
    }
}
