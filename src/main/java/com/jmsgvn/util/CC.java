package com.jmsgvn.util;

import org.bukkit.ChatColor;

/**
 * Translate text fast with a static util class
 */
public class CC {

    /**
     * Translate text to Minecraft color codes by using the '&' character in the text
     * @param text the text to be translated
     * @return a translated colored string
     */
    public static String translate(String text){
        return ChatColor.translateAlternateColorCodes('&', text);
    }
}
