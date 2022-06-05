package com.jmsgvn.module;

import org.bukkit.Bukkit;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;

public class EventModule extends PercyModule implements Listener {
    @Override public void setEnabled() {
        super.setEnabled();
        Bukkit.getPluginManager().registerEvents(this, getPlugin());
    }

    @Override public void setDisabled() {
        super.setDisabled();
        HandlerList.unregisterAll(this);
    }
}
