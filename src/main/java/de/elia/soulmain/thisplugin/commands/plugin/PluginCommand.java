package de.elia.soulmain.thisplugin.commands.plugin;

import de.elia.soulmain.Functions;
import de.elia.soulmain.SoulMain;
import de.elia.soulmain.allplugins.messages.builder.MessageBuilder;
import de.elia.soulmain.allplugins.messages.builder.Messages;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.List;

/**
 * @author - Elia
 * @since - V. 1.0
 * @version - V. 1.0
 * @implements {@link CommandExecutor}, {@link TabCompleter}
 * @description - The /soulmain command was created in this class. Its functions are to reload the plugin,
 *                reload the config or deactivate the plugin.
 */
public class PluginCommand implements CommandExecutor , TabCompleter {

    /**
     * @since V. 1.0
     * @description - Create the Command /soulmain
     * @param sender Source of the command
     * @param command Command which was executed
     * @param label Alias of the command which was used
     * @param args Passed command arguments
     * @return false
     */
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        Messages messageBuilder = new MessageBuilder();
        Functions functions = SoulMain.getInstance();


        //Requests the command length.
        //Example: /soulmain reload
        //              0       1
        //The Command has a length of 1.
        if (args.length == 1) {
            if (args[0].equalsIgnoreCase("reload")) {
                //Send Message to the command executer.
                messageBuilder.message(sender , "Soul Main wird neu geladen...");
                //Reload the Plugin.
                functions.reload();
                //Send Message to the command executer.
                messageBuilder.message(sender , "Soul Main wurde neu geladen!");
            }else if (args[0].equalsIgnoreCase("reloadconfig")) {
                //Send Message to the command executer.
                messageBuilder.message(sender , "Alle Configurations werden neu geladen...");
                //Reload the configurations
                functions.configurationReload();
                //Send Message to the command executer.
                messageBuilder.message(sender , "Alle Configurations wurden neu geladen!");
            }else if (args[0].equalsIgnoreCase("disable")) {
                //Send Message to the command executer.
                messageBuilder.message(sender , "Soul Main wird beendet!");
                //Disable the Plugin.
                Bukkit.getPluginManager().disablePlugin(SoulMain.getInstance());
            }
        }
        return false;
    }

    /**
     * @since V. 1.0
     * @description - Create a tab completer for the Command /soulmain.
     * @param sender Source of the command.  For players tab-completing a
     *     command inside a command block, this will be the player, not
     *     the command block.
     * @param command Command which was executed
     * @param label Alias of the command which was used
     * @param args The arguments passed to the command, including final
     *     partial argument to be completed
     * @return Arrays.asList("disable" , "reload" , "reloadconfig")
     */
    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        return Arrays.asList("disable" , "reload" , "reloadconfig");
    }
}
