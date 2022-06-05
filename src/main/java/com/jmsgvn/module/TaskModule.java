package com.jmsgvn.module;

import org.bukkit.Bukkit;

public abstract class TaskModule extends PercyModule implements Runnable {
    protected int taskid = -2;

    @Override public void setEnabled() {
        super.setEnabled();
        this.taskid = startTask();
    }

    protected int startTask() {
        return Bukkit.getScheduler().scheduleSyncRepeatingTask(getPlugin(), this, 20, 20);
    }

    @Override public void setDisabled() {
        super.setDisabled();
        Bukkit.getScheduler().cancelTask(this.taskid);
    }
}
