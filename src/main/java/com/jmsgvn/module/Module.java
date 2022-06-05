package com.jmsgvn.module;

import org.bukkit.plugin.Plugin;

public interface Module {
    void setEnabled();
    void setDisabled();

    Plugin getPlugin();
    boolean isEnabled();
}
