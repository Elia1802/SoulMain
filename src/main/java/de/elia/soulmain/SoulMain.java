package de.elia.soulmain;

import de.elia.soulmain.allplugins.messages.builder.MessageBuilder;
import de.elia.soulmain.allplugins.messages.prefix.PrefixClass;
import de.elia.soulmain.thisplugin.register.commands.CommandRegister;
import de.elia.soulmain.thisplugin.register.configuration.ConfigurationRegister;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.logging.Level;

/**
 * @author - Elia
 * @since - V. 1.0
 * @version - V. 1.0
 * @description - This class is the main of the plugin. All important methods are stored here and all commands,
 *                events, configurations and databases are loaded here.
 */
public final class SoulMain extends JavaPlugin {
    private static MiniMessage miniMessage;

    private static SoulMain instance;

    private final ConfigurationRegister configurationRegister = new ConfigurationRegister(this);

    private final MessageBuilder messageBuilder = new MessageBuilder();

    private final PrefixClass prefix = new PrefixClass();

    /**
     * @description  This method loads the plugin and registers all commands, events and listeners.
     */
    @Override
    public void onEnable() {
        //Set the Instance
        instance = this;
        //Create a MiniMessage
        miniMessage = MiniMessage.miniMessage();
        //print 2 messages
        messageBuilder.log(Level.INFO , prefix.consolePrefix() + "Start Soul Main...");
        messageBuilder.log(Level.INFO , prefix.consolePrefix() + "load Configurations...");
        //Load all Configurations
        configurationRegister.load();
        //print 2 Messages
        messageBuilder.log(Level.INFO , prefix.consolePrefix() + "Configurations loaded!");
        messageBuilder.log(Level.INFO , prefix.consolePrefix() + "Load Commands...");
        //Load all Commands
        CommandRegister.register();
        //print 2 Messages
        messageBuilder.log(Level.INFO , prefix.consolePrefix() + "Commands loaded!");
        messageBuilder.log(Level.INFO , prefix.consolePrefix() + "Soul Main started!");
    }

    /**
     * @description - This method terminates all processes from the plugin and saves all files.
     */
    @Override
    public void onDisable() {
        messageBuilder.log(Level.WARNING, prefix.warningPrefix() + "Stop Soul Main...");
        messageBuilder.log(Level.INFO, prefix.consolePrefix() + "Save Configurations...");
        configurationRegister.save();
        messageBuilder.log(Level.INFO, prefix.consolePrefix() + "Configurations saved!");
        messageBuilder.log(Level.WARNING, prefix.warningPrefix() + "Soul Main stopped!.");
    }

    /**
     * @description - This method reloads the plugin.
     */
    public void reload() {
        messageBuilder.log(Level.INFO , prefix.consolePrefix() + "Start Soul Main...");
        messageBuilder.log(Level.INFO , prefix.consolePrefix() + "load Configurations...");
        configurationRegister.load();
        messageBuilder.log(Level.INFO , prefix.consolePrefix() + "Configurations loaded!");
        messageBuilder.log(Level.INFO , prefix.consolePrefix() + "Load Commands...");
        CommandRegister.register();
        messageBuilder.log(Level.INFO , prefix.consolePrefix() + "Commands loaded!");
        messageBuilder.log(Level.INFO , prefix.consolePrefix() + "Soul Main started!");
    }

    /**
     * @description - This method reloads the configurations.
     */
    public void configurationReload() {
        messageBuilder.log(Level.INFO, prefix.consolePrefix() + "load Configurations...");
        configurationRegister.load();
        messageBuilder.log(Level.INFO, prefix.consolePrefix() + "Configurations loaded!");
    }

    /**
     * @description - Creates an instance to access other classes or main class methods.
     * @return instance
     */
    @NotNull
    public static SoulMain getInstance() {
        return instance;
    }

    /**
     * @description - Is the method for the {@link MiniMessage} to use it.
     * @return miniMessage
     */
    @NotNull
    public static MiniMessage getMiniMessage() {
        return miniMessage;
    }

}

