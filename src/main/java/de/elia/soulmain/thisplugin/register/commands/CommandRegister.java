package de.elia.soulmain.thisplugin.register.commands;

import de.elia.soulmain.allplugins.messages.builder.MessageBuilder;
import de.elia.soulmain.thisplugin.commands.discord.DiscordCommand;
import de.elia.soulmain.thisplugin.commands.plugin.PluginCommand;
import org.bukkit.Bukkit;

/**
 * @author - Elia
 * @since - V. 1.0
 * @version - V. 1.0
 * @description - This class creates and load all commaads.
 */
public class CommandRegister {

    private static final MessageBuilder messageBuilder =  new MessageBuilder();

    /**
     * @since - V. 1.0
     * @description This Methode register all Commands.
     */
    public static void register(){
        Bukkit.getPluginCommand("soulmain").setExecutor(new PluginCommand());//Register Command /soulmain
        Bukkit.getPluginCommand("soulmain").setPermission("soulmain.admin");//Set permission
        messageBuilder.permissionMessage("soulmain" , "Du hast nicht die Permissions für den Command!");//Set permisssion message

        Bukkit.getPluginCommand("discord").setExecutor(new DiscordCommand());//Register Command /discord
    }

}
