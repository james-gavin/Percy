package com.jmsgvn.lag.removetype;

import com.jmsgvn.module.ClearModule;
import org.bukkit.entity.*;

public class LimitClear extends ClearModule {
    @Override public boolean isRemovable(Entity e) {
        if (e instanceof Item) return true;
        if (e instanceof FallingBlock) return true;
        if (e instanceof Boat) {
            if (e.isEmpty()) return true;
        }
        if (e instanceof ExperienceOrb) return true;
        if (e instanceof Projectile) return true;
        if (e instanceof Minecart) {
            return e.isEmpty();
        }
        return false;
    }
}
