package de.elia.soulmain.allplugins.messages.builder;

import de.elia.soulmain.SoulMain;
import de.elia.soulmain.allplugins.messages.prefix.PrefixClass;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerKickEvent;
import org.jetbrains.annotations.NotNull;

import java.lang.Deprecated;
import java.lang.String;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author - Elia
 * @since - V. 1.0
 * @version - V. 1.0
 * @implements {@link Messages}
 * @description -This class simplifies the principle of the {@link MiniMessage}. If used correctly,
 *               you can save a lot of space. You don't need color codes of the {@link MiniMessage},
 *               no {@link ChatColor} and no {@link Component}s.
 */
public class MessageBuilder implements Messages {

    private final Logger logger = Bukkit.getLogger();

    private final MiniMessage miniMessage = SoulMain.getMiniMessage();

    private final PrefixClass prefix = new PrefixClass();

    public MessageBuilder(){
    }

    /**
     * @since V. 1.0
     * @description -
     * @param lines
     * @return
     */
    @NotNull
    public Component newLines(@NotNull List<Component> lines){
        Component result = Component.empty();

        for (Component component : lines) {
            result = result.append(component);
        }

        return result;
    }

    /**
     * @since V. 1.0
     * @description -
     * @param lines
     * @return
     */
    @NotNull
    public Component newLines(Component @NotNull ... lines){
        Component result = Component.empty();

        for (Component component : lines) {
            result = result.append(component);
        }

        return result;
    }

    /**
     * @since V. 1.0
     * @description -
     * @param message
     */
    public void broadcast(Component message){
        Bukkit.broadcast(message);
    }

    /**
     * @since V. 1.0
     * @description -
     * @param message
     */
    public void broadcastWithPrefix(Component message){
        Bukkit.broadcast(prefix.prefix().append(message));
    }

    /**
     * @since V. 1.0
     * @description -
     * @param message
     */
    public void broadcast(String message){
        Bukkit.broadcast(miniMessage.deserialize(message));
    }

    /**
     * @since V. 1.0
     * @description -
     * @param message
     */
    public void broadcastWithPrefix(String message){
        Bukkit.broadcast(miniMessage.deserialize(prefix.prefix() + message));
    }

    /**
     * @since V. 1.0
     * @description -
     * @param player
     * @param permission
     * @param message
     */
    public void broadcast(@NotNull Player player , String permission , Component message){
        if (player.hasPermission(permission)) {
            Bukkit.broadcast(message);
        }
    }

    /**
     * @since V. 1.0
     * @description -
     * @param player
     * @param permission
     * @param message
     */
    public void broadcastWithPrefix(@NotNull Player player , String permission , Component message){
        if (player.hasPermission(permission)) {
            Bukkit.broadcast(prefix.prefix().append(message));
        }
    }

    /**
     * @since V. 1.0
     * @description -
     * @param player
     * @param permission
     * @param message
     */
    public void broadcast(@NotNull Player player , String permission , String message){
        if (player.hasPermission(permission)) {
            Bukkit.broadcast(miniMessage.deserialize(message));
        }
    }

    /**
     * @since V. 1.0
     * @description -
     * @param player
     * @param permission
     * @param message
     */
    public void broadcastWithPrefix(@NotNull Player player , String permission , String message){
        if (player.hasPermission(permission)) {
            Bukkit.broadcast(miniMessage.deserialize(prefix.prefix() + message));
        }
    }

    /**
     * @since V. 1.0
     * @description -
     * @param message
     * @param permission
     */
    public void broadcast(Component message , String permission){
        Bukkit.broadcast(message , permission);
    }

    /**
     * @since V. 1.0
     * @description -
     * @param message
     * @param permission
     */
    public void broadcastWithPrefix(Component message , String permission){
        Bukkit.broadcast(prefix.prefix().append(message) , permission);
    }

    /**
     * @since V. 1.0
     * @description -
     * @param message
     * @param permission
     */
    public void broadcast(String message , String permission){
        Bukkit.broadcast(miniMessage.deserialize(message) , permission);
    }

    /**
     * @since V. 1.0
     * @description -
     * @param message
     * @param permission
     */
    public void broadcastWithPrefix(String message , String permission){
        Bukkit.broadcast(miniMessage.deserialize(prefix.prefix() + message) , permission);
    }

    /**
     * @since V. 1.0
     * @deprecated
     * @description -
     * @param message
     */
    @Deprecated
    public void sendBroadcast(String message){
        Bukkit.broadcastMessage(message);
    }

    /**
     * @since V. 1.0
     * @deprecated
     * @description -
     * @param message
     */
    @Deprecated
    public void sendBroadcastWithPrefix(String message){
        Bukkit.broadcastMessage(prefix.prefix() + message);
    }

    /**
     * @since V. 1.0
     * @deprecated
     * @description -
     * @param player
     * @param permission
     * @param message
     */
    @Deprecated
    public void sendBroadcast(@NotNull Player player , String permission , String message){
        if (player.hasPermission(permission)) {
            Bukkit.broadcastMessage(message);
        }
    }

    /**
     * @since V. 1.0
     * @deprecated
     * @description -
     * @param player
     * @param permission
     * @param message
     */
    @Deprecated
    public void sendBroadcastWithPrefix(@NotNull Player player , String permission , String message){
        if (player.hasPermission(permission)) {
            Bukkit.broadcastMessage(prefix.prefix() + message);
        }
    }

    /**
     * @since V. 1.0
     * @description -
     * @param player
     * @param message
     */
    public void kickMessage(@NotNull Player player , Component message){
        player.kick(message);
    }

    /**
     * @since V. 1.0
     * @description -
     * @param player
     * @param message
     * @param cause
     */
    public void kickMessage(@NotNull Player player , Component message , PlayerKickEvent.Cause cause) {
        player.kick(message , cause);
    }

    /**
     * @since V. 1.0
     * @description -
     * @param player
     * @param message
     * @param cause
     */
    public void kickMessage(@NotNull Player player , Component message , Component cause){
        player.kick(this.newLines(message , cause));
    }

    /**
     * @since V. 1.0
     * @description -
     * @param player
     * @param message
     */
    public void kickMessage(@NotNull Player player , String message){
        player.kick(miniMessage.deserialize(message));
    }

    /**
     * @since V. 1.0
     * @description -
     * @param player
     * @param permission
     * @param message
     */
    public void kickMessage(@NotNull Player player , String permission , Component message){
        if (player.hasPermission(permission)) {
            player.kick(message);
        }
    }

    /**
     * @since V. 1.0
     * @description -
     * @param player
     * @param permission
     * @param message
     * @param cause
     */
    public void kickMessage(@NotNull Player player , String permission , Component message , PlayerKickEvent.Cause cause){
        if (player.hasPermission(permission)) {
            player.kick(message , cause);
        }
    }

    /**
     * @since V. 1.0
     * @description -
     * @param player
     * @param permission
     * @param message
     * @param cause
     */
    public void kickMessage(@NotNull Player player , String permission , Component message , Component cause){
        if (player.hasPermission(permission)) {
            player.kick(this.newLines(message , cause));
        }
    }

    /**
     * @since V. 1.0
     * @description -
     * @param player
     * @param permission
     * @param message
     */
    public void kickMessage(@NotNull Player player , String permission , String message){
        if (player.hasPermission(permission)) {
            player.kick(miniMessage.deserialize(message));
        }
    }

    /**
     * @since V. 1.0
     * @description -
     * @param player
     * @param permission
     * @param message
     * @param cause
     */
    public void kickMessage(@NotNull Player player , String permission , String message , PlayerKickEvent.Cause cause){
        if (player.hasPermission(permission)) {
            player.kick(miniMessage.deserialize(message) , cause);
        }
    }

    /**
     * @since V. 1.0
     * @description -
     * @param player
     * @param permission
     * @param message
     * @param cause
     */
    public void kickMessage(@NotNull Player player , String permission , String message , String cause){
        if (player.hasPermission(permission)) {
            player.kick(this.newLines(miniMessage.deserialize(message) , miniMessage.deserialize(cause)));
        }
    }

    /**
     * @since V. 1.0
     * @deprecated
     * @description -
     * @param player
     * @param message
     */
    @Deprecated
    public void sendKickMessage(@NotNull Player player , String message){
        player.kickPlayer(message);
    }

    /**
     * @since V. 1.0
     * @deprecated
     * @description -
     * @param player
     * @param message
     * @param cause
     */
    @Deprecated
    public void sendKickMessage(@NotNull Player player , String message , String cause){
        player.kickPlayer(message + "\n" + cause);
    }

    /**
     * @since V. 1.0
     * @deprecated
     * @description -
     * @param permission
     * @param player
     * @param message
     */
    @Deprecated
    public void sendKickMessage(String permission , @NotNull Player player  , String message){
        if (player.hasPermission(permission)) {
            player.kickPlayer(message);
        }
    }

    /**
     * @since V. 1.0
     * @deprecated
     * @description -
     * @param player
     * @param permission
     * @param message
     * @param cause
     */
    @Deprecated
    public void sendKickMessage(@NotNull Player player , String permission , String message , String cause){
        if (player.hasPermission(permission)) {
            player.kickPlayer(message + "\n" + cause);
        }
    }

    /**
     * @since V. 1.0
     * @description -
     * @param message
     */
    public void infoLog(String message){
        logger.info(prefix.consolePrefix() + message);
    }

    /**
     * @since V. 1.0
     * @description -
     * @param message
     */
    public void warningLog(String message){
        logger.warning(prefix.warningPrefix() + message);
    }

    /**
     * @since V. 1.0
     * @description -
     * @param message
     */
    public void errorLog(String message){
        logger.severe(prefix.errorPrefix() + message);
    }

    /**
     * @since V. 1.0
     * @description -
     * @param level
     * @param message
     */
    public void log(Level level , String message){
        logger.log(level , message);
    }

    /**
     * @since V. 1.0
     * @description -
     * @return
     */
    @NotNull
    public Logger log(){
        return logger;
    }

    /**
     * @since V. 1.0
     * @description -
     * @param command
     * @param message
     */
    public void permissionMessage(String command , String message){
        Component component = miniMessage.deserialize(prefix.errorPrefix() + message);
        Bukkit.getPluginCommand(command).permissionMessage(component);
    }

    /**
     * @since V. 1.0
     * @description -
     * @param player
     * @param message
     */
    public void message(@NotNull Player player , Component message){
        player.sendMessage(message);
    }

    /**
     * @since V. 1.0
     * @description -
     * @param player
     * @param message
     */
    public void messageWithPrefix(@NotNull Player player , Component message){
        player.sendMessage(prefix.prefix().append(message));
    }

    /**
     * @since V. 1.0
     * @description -
     * @param player
     * @param permission
     * @param message
     */
    public void message(@NotNull Player player , String permission , Component message){
        if (player.hasPermission(permission)) {
            player.sendMessage(message);
        }
    }

    /**
     * @since V. 1.0
     * @description -
     * @param player
     * @param permission
     * @param message
     */
    public void messageWithPrefix(@NotNull Player player , String permission , Component message){
        if (player.hasPermission(permission)) {
            player.sendMessage(prefix.prefix().append(message));
        }
    }

    /**
     * @since V. 1.0
     * @description -
     * @param player
     * @param message
     */
    public void message(@NotNull Player player , String message){
        player.sendMessage(miniMessage.deserialize(message));
    }

    /**
     * @since V. 1.0
     * @description -
     * @param player
     * @param message
     */
    public void messageWithPrefix(@NotNull Player player , String message){
        player.sendMessage(miniMessage.deserialize(prefix.prefix() + message));
    }

    /**
     * @since V. 1.0
     * @description -
     * @param player
     * @param permission
     * @param message
     */
    public void message(@NotNull Player player , String permission , String message){
        if (player.hasPermission(permission)) {
            player.sendMessage(miniMessage.deserialize(message));
        }
    }

    /**
     * @since V. 1.0
     * @description -
     * @param player
     * @param permission
     * @param message
     */
    public void messageWithPrefix(@NotNull Player player , String permission , String message){
        if (player.hasPermission(permission)) {
            player.sendMessage(miniMessage.deserialize(prefix.prefix() + message));
        }
    }

    /**
     * @since V. 1.0
     * @description -
     * @param sender
     * @param message
     */
    public void message(@NotNull CommandSender sender , Component message){
        sender.sendMessage(message);
    }

    /**
     * @since V. 1.0
     * @description -
     * @param sender
     * @param message
     */
    public void messageWithPrefix(@NotNull CommandSender sender , Component message){
        sender.sendMessage(prefix.prefix().append(message));
    }

    /**
     * @since V. 1.0
     * @description -
     * @param sender
     * @param permission
     * @param message
     */
    public void message(@NotNull CommandSender sender , String permission , Component message){
        if (sender.hasPermission(permission)) {
            sender.sendMessage(message);
        }
    }

    /**
     * @since V. 1.0
     * @description -
     * @param sender
     * @param permission
     * @param message
     */
    public void messageWithPrefix(@NotNull CommandSender sender , String permission , Component message){
        if (sender.hasPermission(permission)) {
            sender.sendMessage(prefix.prefix().append(prefix.prefix().append(message)));
        }
    }

    /**
     * @since V. 1.0
     * @description -
     * @param sender
     * @param message
     */
    public void message(@NotNull CommandSender sender , String message){
        sender.sendMessage(miniMessage.deserialize(message));
    }

    /**
     * @since V. 1.0
     * @description -
     * @param sender
     * @param message
     */
    public void messageWithPrefix(@NotNull CommandSender sender , String message){
        sender.sendMessage(miniMessage.deserialize(prefix.prefix() + message));
    }

    /**
     * @since V. 1.0
     * @description -
     * @param sender
     * @param permission
     * @param message
     */
    public void message(@NotNull CommandSender sender , String permission , String message){
        if (sender.hasPermission(permission)) {
            sender.sendMessage(miniMessage.deserialize(message));
        }
    }

    /**
     * @since V. 1.0
     * @description -
     * @param sender
     * @param permission
     * @param message
     */
    public void messageWithPrefix(@NotNull CommandSender sender , String permission , String message){
        if (sender.hasPermission(permission)) {
            sender.sendMessage(miniMessage.deserialize(prefix.prefix() + message));
        }
    }

    /**
     * @since V. 1.0
     * @deprecated
     * @description -
     * @param sender
     * @param message
     */
    @Deprecated
    public void sendMessage(@NotNull CommandSender sender , String message){
        sender.sendMessage(message);
    }

    /**
     * @since V. 1.0
     * @deprecated
     * @description -
     * @param sender
     * @param permission
     * @param message
     */
    @Deprecated
    public void sendMessage(@NotNull CommandSender sender , String permission , String message){
        if (sender.hasPermission(permission)) {
            sender.sendMessage(message);
        }
    }

    /**
     * @since V. 1.0
     * @description -
     * @param color
     * @param message
     * @return
     */
    @NotNull
    public Component color(String color , String message){
        return miniMessage.deserialize("<" + color + ">" + message + "</" + color + ">");
    }

    /**
     * @since V. 1.0
     * @description -
     * @param color
     * @param message
     * @return
     */
    @NotNull
    public Component color(String color , Component message){
        return miniMessage.deserialize("<" + color + ">" + message + "</" + color + ">");
    }

    /**
     * @since V. 1.0
     * @description -
     * @param ofColor
     * @param toColor
     * @param message
     * @return
     */
    @NotNull
    public Component gradient(String ofColor , String toColor , String message){
        return miniMessage.deserialize("<gradient:" + ofColor + ":" + toColor + ">" + message);
    }

    /**
     * @since V. 1.0
     * @description -
     * @param textToShow
     * @param message
     * @return
     */
    @NotNull
    public Component hover(String textToShow , String message){
        return miniMessage.deserialize("<hover:show_text'" + textToShow + "'>" + message);
    }

    /**
     * @since V. 1.0
     * @deprecated
     * @description -
     * @param chatColor
     * @param message
     * @return
     */
    @NotNull
    @Deprecated
    public String color(ChatColor chatColor , String message){
        return chatColor + message;
    }

    /**
     * @since V. 1.0
     * @description -
     * @param message
     * @return
     */
    @NotNull
    public Component black(String message){
        return this.color("black" , message);
    }

    /**
     * @since V. 1.0
     * @deprecated
     * @description -
     * @param message
     * @return
     */
    @NotNull
    @Deprecated
    public String getBlack(String message){
        return this.color(ChatColor.BLACK , message);
    }

    /**
     * @since V. 1.0
     * @description -
     * @param message
     * @return
     */
    @NotNull
    public Component darkBlue(String message){
        return this.color("dark_blue" , message);
    }

    /**
     * @since V. 1.0
     * @deprecated
     * @description -
     * @param message
     * @return
     */
    @NotNull
    @Deprecated
    public String getDarBlue(String message){
        return this.color(ChatColor.DARK_BLUE , message);
    }

    /**
     * @since V. 1.0
     * @description -
     * @param message
     * @return
     */
    @NotNull
    public Component darkGreen(String message){
        return this.color("dark_green" , message);
    }

    /**
     * @since V. 1.0
     * @deprecated
     * @description -
     * @param message
     * @return
     */
    @NotNull
    @Deprecated
    public String getDarkGreen(String message){
        return this.color(ChatColor.DARK_GREEN , message);
    }

    /**
     * @since V. 1.0
     * @description -
     * @param message
     * @return
     */
    @NotNull
    public Component darkAqua(String message){
        return this.color("dark_aqua" , message);
    }

    /**
     * @since V. 1.0
     * @deprecated
     * @description -
     * @param message
     * @return
     */
    @NotNull
    @Deprecated
    public String getDarkAqua(String message){
        return this.color(ChatColor.DARK_AQUA , message);
    }

    /**
     * @since V. 1.0
     * @description -
     * @param message
     * @return
     */
    @NotNull
    public Component darkRed(String message){
        return this.color("dark_red" , message);
    }

    /**
     * @since V. 1.0
     * @deprecated
     * @description -
     * @param message
     * @return
     */
    @NotNull
    @Deprecated
    public String getDarkRed(String message){
        return this.color(ChatColor.RED , message);
    }

    /**
     * @since V. 1.0
     * @description -
     * @param message
     * @return
     */
    @NotNull
    public Component darkPurple(String message){
        return this.color("dark_purple" , message);
    }

    /**
     * @since V. 1.0
     * @deprecated
     * @description -
     * @param message
     * @return
     */
    @NotNull
    @Deprecated
    public String getDarkPurple(String message){
        return this.color(ChatColor.DARK_PURPLE , message);
    }

    /**
     * @since V. 1.0
     * @description -
     * @param message
     * @return
     */
    @NotNull
    public Component darkGray(String message){
        return this.color("dark_gray" , message);
    }

    /**
     * @since V. 1.0
     * @deprecated
     * @description -
     * @param message
     * @return
     */
    @NotNull
    @Deprecated
    public String getDarkGray(String message){
        return this.color(ChatColor.DARK_GRAY , message);
    }

    /**
     * @since V. 1.0
     * @description -
     * @param message
     * @return
     */
    @NotNull
    public Component gold(String message){
        return this.color("gold" , message);
    }

    /**
     * @since V. 1.0
     * @deprecated
     * @description -
     * @param message
     * @return
     */
    @NotNull
    @Deprecated
    public String getGold(String message){
        return this.color(ChatColor.GOLD , message);
    }

    /**
     * @since V. 1.0
     * @description -
     * @param message
     * @return
     */
    @NotNull
    public Component gray(String message){
        return this.color("gray" , message);
    }

    /**
     * @since V. 1.0
     * @deprecated
     * @description -
     * @param message
     * @return
     */
    @NotNull
    @Deprecated
    public String getGray(String message){
        return this.color(ChatColor.GRAY , message);
    }

    /**
     * @since V. 1.0
     * @description -
     * @param message
     * @return
     */
    @NotNull
    public Component blue(String message){
        return this.color("blue" , message);
    }

    /**
     * @since V. 1.0
     * @deprecated
     * @description -
     * @param message
     * @return
     */
    @NotNull
    @Deprecated
    public String getBlue(String message){
        return this.color(ChatColor.BLUE , message);
    }

    /**
     * @since V. 1.0
     * @description -
     * @param message
     * @return
     */
    @NotNull
    public Component green(String message){
        return this.color("green" , message);
    }

    /**
     * @since V. 1.0
     * @deprecated
     * @description -
     * @param message
     * @return
     */
    @NotNull
    @Deprecated
    public String getGreen(String message){
        return this.color(ChatColor.GREEN , message);
    }

    /**
     * @since V. 1.0
     * @description -
     * @param message
     * @return
     */
    @NotNull
    public Component aqua(String message){
        return this.color("aqua" , message);
    }

    /**
     * @since V. 1.0
     * @deprecated
     * @description -
     * @param message
     * @return
     */
    @NotNull
    @Deprecated
    public String getAqua(String message){
        return this.color(ChatColor.AQUA , message);
    }

    /**
     * @since V. 1.0
     * @description -
     * @param message
     * @return
     */
    @NotNull
    public Component red(String message){
        return this.color("red" , message);
    }

    /**
     * @since V. 1.0
     * @deprecated
     * @description -
     * @param message
     * @return
     */
    @NotNull
    @Deprecated
    public String getRed(String message){
        return this.color(ChatColor.RED , message);
    }

    /**
     * @since V. 1.0
     * @description -
     * @param message
     * @return
     */
    @NotNull
    public Component lightPurple(String message){
        return this.color("light_purple" , message);
    }

    /**
     * @since V. 1.0
     * @deprecated
     * @description -
     * @param message
     * @return
     */
    @NotNull
    @Deprecated
    public String getLightPurple(String message){
        return this.color(ChatColor.LIGHT_PURPLE , message);
    }

    /**
     * @since V. 1.0
     * @description -
     * @param message
     * @return
     */
    @NotNull
    public Component yellow(String message){
        return this.color("yellow" , message);
    }

    /**
     * @since V. 1.0
     * @deprecated
     * @description -
     * @param message
     * @return
     */
    @NotNull
    @Deprecated
    public String getYellow(String message){
        return this.color(ChatColor.YELLOW , message);
    }

    /**
     * @since V. 1.0
     * @description -
     * @param message
     * @return
     */
    @NotNull
    public Component white(String message){
        return this.color("white" , message);
    }

    /**
     * @since V. 1.0
     * @deprecated
     * @description -
     * @param message
     * @return
     */
    @NotNull
    @Deprecated
    public String getWhite(String message){
        return this.color(ChatColor.WHITE , message);
    }

    /**
     * @since V. 1.0
     * @description -
     * @param message
     * @return
     */
    @NotNull
    public Component bold(String message){
        return this.color("bold" , message);
    }

    /**
     * @since V. 1.0
     * @deprecated
     * @description -
     * @param message
     * @return
     */
    @NotNull
    @Deprecated
    public String getBold(String message){
        return this.color(ChatColor.BOLD , message);
    }


    /**
     * @since V. 1.0
     * @description -
     * @param message
     * @return
     */
    @NotNull
    public Component italic(String message){
        return this.color("italic" , message);
    }

    /**
     * @since V. 1.0
     * @deprecated
     * @description -
     * @param message
     * @return
     */
    @NotNull
    @Deprecated
    public String getItalic(String message){
        return this.color(ChatColor.ITALIC , message);
    }

    /**
     * @since V. 1.0
     * @description -
     * @param message
     * @return
     */
    @NotNull
    public Component underlined(String message){
        return this.color("underlined" , message);
    }

    /**
     * @since V. 1.0
     * @deprecated
     * @description -
     * @param message
     * @return
     */
    @NotNull
    @Deprecated
    public String getUnderlined(String message){
        return this.color(ChatColor.UNDERLINE , message);
    }

    /**
     * @since V. 1.0
     * @description -
     * @param message
     * @return
     */
    @NotNull
    public Component strikethrough(String message){
        return this.color("strikethrough" , message);
    }

    /**
     * @since V. 1.0
     * @deprecated
     * @description -
     * @param message
     * @return
     */
    @NotNull
    @Deprecated
    public String getStrikethrough(String message){
        return this.color(ChatColor.STRIKETHROUGH , message);
    }

    /**
     * @since V. 1.0
     * @description -
     * @param message
     * @return
     */
    @NotNull
    public Component obfuscated(String message){
        return this.color("obfuscated" , message);
    }

    /**
     * @since V. 1.0
     * @deprecated
     * @description -
     * @param message
     * @return
     */
    @NotNull
    @Deprecated
    public String getObfuscated(String message){
        return "§k" + message;
    }

}
