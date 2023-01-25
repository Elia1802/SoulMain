package de.elia.soulmain.allplugins.messages;

import de.elia.soulmain.allplugins.achievements.Achievements;
import de.elia.soulmain.allplugins.messages.builder.Messages;
import de.elia.soulmain.allplugins.messages.prefix.Prefix;
import de.elia.soulmain.allplugins.messages.prefix.PrefixClass;
import net.kyori.adventure.text.Component;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerKickEvent;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author - Elia
 * @since - V. 1.0
 * @version - V. 1.0
 * @extends {@link Messages}, {@link Achievements}, {@link Prefix}
 * @description - Here all methods are collected that can be used to send a message to the game or to the console.
 */
public interface MessageSystem extends Messages , Achievements , Prefix {

    @NotNull
    Component newLines(@NotNull List<Component> lines);

    @NotNull
    Component newLines(Component @NotNull ... lines);

    void broadcast(Component message);

    void broadcastWithPrefix(Component message);

    void broadcast(@NotNull Player player , String permission , Component message);

    void broadcastWithPrefix(@NotNull Player player , String permission , Component message);

    void broadcast(@NotNull Player player , String permission , String message);

    void broadcastWithPrefix(@NotNull Player player , String permission , String message);

    void broadcast(Component message , String permission);

    void broadcastWithPrefix(Component message , String permission);

    void broadcast(String message , String permission);

    void broadcastWithPrefix(String message , String permission);

    @Deprecated
    void sendBroadcast(String message);

    @Deprecated
    void sendBroadcastWithPrefix(String message);

    @Deprecated
    void sendBroadcast(@NotNull Player player , String permission , String message);

    @Deprecated
    void sendBroadcastWithPrefix(@NotNull Player player , String permission , String message);

    void kickMessage(@NotNull Player player , Component message);

    void kickMessage(@NotNull Player player , Component message , PlayerKickEvent.Cause cause);

    void kickMessage(@NotNull Player player , Component message , Component cause);

    void kickMessage(@NotNull Player player , String message);

    void kickMessage(@NotNull Player player , String permission , Component message);

    void kickMessage(@NotNull Player player , String permission , Component message , PlayerKickEvent.Cause cause);

    void kickMessage(@NotNull Player player , String permission , Component message , Component cause);

    void kickMessage(@NotNull Player player , String permission , String message);

    void kickMessage(@NotNull Player player , String permission , String message , PlayerKickEvent.Cause cause);

    void kickMessage(@NotNull Player player , String permission , String message , String cause);

    @Deprecated
    void sendKickMessage(@NotNull Player player , String message);

    @Deprecated
    void sendKickMessage(@NotNull Player player , String message , String cause);

    @Deprecated
    void sendKickMessage(String permission , @NotNull Player player  , String message);

    @Deprecated
    void sendKickMessage(@NotNull Player player , String permission , String message , String cause);

    void infoLog(String message);

    void warningLog(String message);

    void errorLog(String message);

    void log(Level level , String message);

    @NotNull
    Logger log();

    void permissionMessage(String command , String message);

    void message(@NotNull Player player , Component message);

    void messageWithPrefix(@NotNull Player player , Component message);

    void message(@NotNull Player player , String permission , Component message);

    void messageWithPrefix(@NotNull Player player , String permission , Component message);

    void message(@NotNull Player player , String message);

    void messageWithPrefix(@NotNull Player player , String message);

    void message(@NotNull Player player , String permission , String message);

    void messageWithPrefix(@NotNull Player player , String permission , String message);

    void message(@NotNull CommandSender sender , Component message);

    void messageWithPrefix(@NotNull CommandSender sender , Component message);

    void message(@NotNull CommandSender sender , String permission , Component message);

    void messageWithPrefix(@NotNull CommandSender sender , String permission , Component message);

    void message(@NotNull CommandSender sender , String message);

    void messageWithPrefix(@NotNull CommandSender sender , String message);

    void message(@NotNull CommandSender sender , String permission , String message);

    void messageWithPrefix(@NotNull CommandSender sender , String permission , String message);

    @Deprecated
    void sendMessage(@NotNull CommandSender sender , String message);

    @Deprecated
    void sendMessage(@NotNull CommandSender sender , String permission , String message);

    @NotNull
    Component color(String color , String message);

    @NotNull
    Component color(String color , Component message);

    @NotNull
    Component gradient(String ofColor , String toColor , String message);

    @NotNull
    Component hover(String textToShow , String message);

    @NotNull
    String color(ChatColor chatColor , String message);

    @NotNull
    Component black(String message);

    @NotNull
    @Deprecated
    String getBlack(String message);

    @NotNull
    Component darkBlue(String message);

    @NotNull
    @Deprecated
    String getDarBlue(String message);

    @NotNull
    Component darkGreen(String message);

    @NotNull
    @Deprecated
    String getDarkGreen(String message);

    @NotNull
    Component darkAqua(String message);

    @NotNull
    @Deprecated
    String getDarkAqua(String message);

    @NotNull
    Component darkRed(String message);

    @NotNull
    @Deprecated
    String getDarkRed(String message);

    @NotNull
    Component darkPurple(String message);

    @NotNull
    @Deprecated
    String getDarkPurple(String message);

    @NotNull
    Component darkGray(String message);

    @NotNull
    @Deprecated
    String getDarkGray(String message);

    @NotNull
    Component gold(String message);

    @NotNull
    @Deprecated
    String getGold(String message);

    @NotNull
    Component gray(String message);

    @NotNull
    @Deprecated
    String getGray(String message);

    @NotNull
    Component blue(String message);

    @NotNull
    @Deprecated
    String getBlue(String message);

    @NotNull
    Component green(String message);

    @NotNull
    @Deprecated
    String getGreen(String message);

    @NotNull
    Component aqua(String message);

    @NotNull
    @Deprecated
    String getAqua(String message);

    @NotNull
    Component red(String message);

    @NotNull
    @Deprecated
    String getRed(String message);

    @NotNull
    Component lightPurple(String message);

    @NotNull
    @Deprecated
    String getLightPurple(String message);

    @NotNull
    Component yellow(String message);

    @NotNull
    @Deprecated
    String getYellow(String message);

    @NotNull
    Component white(String message);

    @NotNull
    @Deprecated
    String getWhite(String message);

    @NotNull
    Component bold(String message);

    @NotNull
    @Deprecated
    String getBold(String message);

    @NotNull
    Component italic(String message);

    @NotNull
    @Deprecated
    String getItalic(String message);

    @NotNull
    Component underlined(String message);

    @NotNull
    @Deprecated
    String getUnderlined(String message);

    @NotNull
    Component strikethrough(String message);

    @NotNull
    @Deprecated
    String getStrikethrough(String message);

    @NotNull
    Component obfuscated(String message);

    @NotNull
    @Deprecated
    String getObfuscated(String message);

    /**
     * @since V. 1.0
     * @description - Create a prefix for the ingame messages.
     * @implements {@link PrefixClass}
     * @return miniMessage.deserialize("<dark_gray>[</dark_gray><dark_purple>SoulSMP</dark_purple><dark_gray>]</dark_gray> ")
     */
    @NotNull
    Component prefix();

    /**
     * @since V. 1.0
     * @description - Creates a prefix for a error message.
     * @implements {@link PrefixClass}
     * @return "[SoulError] "
     */
    @NotNull
    String errorPrefix();

    /**
     * @since V. 1.0
     * @description - Creates a prefix for a warning message.
     * @implements {@link PrefixClass}
     * @return "[SoulWarning] "
     */
    @NotNull
    String warningPrefix();

    /**
     * @since V. 1.0
     * @description - Creates a prefix for a console message.
     * @implements {@link PrefixClass}
     * @return "[SoulSMP] "
     */
    @NotNull
    String consolePrefix();

    String getName();

    String getDataID();

    String getZiel();

}
