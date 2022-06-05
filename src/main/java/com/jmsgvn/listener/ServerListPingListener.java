package com.jmsgvn.listener;

import com.jmsgvn.module.EventModule;
import com.jmsgvn.util.CC;
import org.bukkit.event.EventHandler;
import org.bukkit.event.server.ServerListPingEvent;

public class ServerListPingListener extends EventModule {
    @EventHandler
    public void onPing(ServerListPingEvent event) {
        event.setMaxPlayers(getPlugin().getServer().getOnlinePlayers().size() + 1);
        event.setMotd(CC.translate("&aPlay the &o&nnew&a&l UPDATE &r&aon &2&omc.jmsgvn.com&a!") + "\n"
            + CC.translate("&7&oExperience any lag? Get $10! Made with &c<3 &7&oin Hudson"));
    }
}
