package com.jmsgvn.lag;

import com.jmsgvn.Main;
import com.jmsgvn.lag.task.ClearTask;
import com.jmsgvn.module.Module;


public class LagManager {

    private Main main;

    public LagManager(Main main) {
        this.main = main;

        //TODO we have to implement clear lag and stacking mobs. clear lag will be first to implement
        // should we implement clear lag in a thread? that just repeats every 5 minutes
        // need a warning
        main.getLogger().info("LagManager has activated.");
    }
}
