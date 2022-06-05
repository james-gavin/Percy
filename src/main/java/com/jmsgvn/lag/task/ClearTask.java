package com.jmsgvn.lag.task;

import com.jmsgvn.lag.removetype.AutoClear;
import com.jmsgvn.module.TaskModule;
import com.jmsgvn.util.CC;
import org.bukkit.entity.Entity;

import java.util.List;

public class ClearTask extends TaskModule {

    // 10 seconds *debugging* because interval is already 20 ticks or 1 second
    private AutoClear autoClear = new AutoClear();
    private int removeInterval = 300;
    private int interval = 0;

    @Override public void run() {
        interval++;
        if (this.interval >= this.removeInterval) {
            List<Entity> entities = this.autoClear.getAllRemovables();
            if (entities.size() == 0) {
                interval = 0;
                return;
            }
            entities.forEach(Entity::remove);
            getPlugin().getServer().broadcastMessage(CC.translate("&dPercy has removed &5" + entities.size() + " &ditems to reduce lag."));
            interval = 0;
        }
    }
}
