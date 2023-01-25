package de.elia.soulmain.thisplugin.commands.discord;

import de.elia.soulmain.SoulMain;
import de.elia.soulmain.allplugins.messages.builder.MessageBuilder;
import de.elia.soulmain.allplugins.messages.prefix.PrefixClass;
import de.elia.soulmain.thisplugin.register.configuration.ConfigurationRegister;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

/**
 * @author - Elia
 * @since - V. 1.0
 * @version - V. 1.0
 * @implements {@link CommandExecutor}
 * @description - The /discord command was created in this class. Its function is sent the {@link Player} a message
 *                with a discord link
 */
public class DiscordCommand implements CommandExecutor {

    /**
     * @since V.1.0
     * @description - Create the Command /discord
     * @param sender Source of the command
     * @param command Command which was executed
     * @param label Alias of the command which was used
     * @param args Passed command arguments
     * @return false
     */
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        MessageBuilder messageBuilder = new MessageBuilder();
        PrefixClass prefix = new PrefixClass();

        //If sender a Player
        if (!(sender instanceof Player)) {
            //If the sender is not a player send the message
            messageBuilder.message(sender , "Du musst ein Spieler sein!");
            return false;
        }

        Player player = (Player) sender;
        MiniMessage miniMessage = SoulMain.getMiniMessage();
        ConfigurationRegister discord = new ConfigurationRegister(SoulMain.getInstance());

        //Build a Message
        @NotNull Component text = miniMessage.deserialize(discord.getDiscordConfiguration().getString("discord text 1") + "<click:open_url:" + discord.getDiscordConfiguration().getString("discord link") + ">" + discord.getDiscordConfiguration().getString("discord text 2"));
        //Send the Player the Message
        messageBuilder.message(player , prefix.prefix().append(text));

        return false;
    }
}
