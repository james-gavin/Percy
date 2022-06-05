package com.jmsgvn.module;

import com.jmsgvn.Main;
import org.bukkit.plugin.Plugin;

public class PercyModule implements Module{

    protected boolean enabled = false;

    @Override public void setEnabled() {
        this.enabled = true;
    }

    @Override public void setDisabled() {
        this.enabled = false;
    }

    @Override public Plugin getPlugin() {
        return Main.getPlugin();
    }

    @Override public boolean isEnabled() {
        return this.enabled;
    }
}
