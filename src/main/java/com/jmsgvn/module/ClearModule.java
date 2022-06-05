package com.jmsgvn.module;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Entity;

import java.util.LinkedList;
import java.util.List;

public abstract class ClearModule extends PercyModule{
    public List<Entity> getRemovables(List<Entity> entities) {
        List<Entity> en = new LinkedList<>();
        entities.forEach(entity -> {
            if (isRemovable(entity)) en.add(entity);
        });
        return en;
    }

    public List<Entity> getAllRemovables() {
        List<Entity> en = new LinkedList<>();
        Bukkit.getWorlds().forEach(world -> {
            world.getEntities().forEach(entity -> {
                if (isRemovable(entity)) {
                    en.add(entity);
                }
            });
        });
        return en;
    }

    public abstract boolean isRemovable(Entity entity);


}
