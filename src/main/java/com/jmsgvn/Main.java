package com.jmsgvn;

import com.jmsgvn.util.CC;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override public void onEnable() {
        getLogger().info(CC.translate("\n\n\n&dPercy has been &aenabled&d.\n\n\n"));
    }
    @Override public void onDisable() {
        getLogger().info(CC.translate("\n\n\n&dPercy has been &cdisabled&d.\n\n\n"));
    }
}
