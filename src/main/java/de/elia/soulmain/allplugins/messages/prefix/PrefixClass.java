package de.elia.soulmain.allplugins.messages.prefix;

import de.elia.soulmain.SoulMain;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.jetbrains.annotations.NotNull;

import java.lang.String;

/**
 * @author - Elia
 * @since - V. 1.0
 * @version - V. 1.0
 * @description - Creates all the prefixes you need.
 */
public class PrefixClass {

    public PrefixClass(){

    }

    private final MiniMessage miniMessage = SoulMain.getMiniMessage();

    /**
     * @since V. 1.0
     * @description - Create a prefix for the ingame messages.
     * @return miniMessage.deserialize("<dark_gray>[</dark_gray><dark_purple>SoulSMP</dark_purple><dark_gray>]</dark_gray> ")
     * @todoList TODO: 11.12.2022 MESSAGE ANPASSBAR MACHEN
     */
    @NotNull
    public Component prefix(){
        return miniMessage.deserialize("<dark_gray>[</dark_gray><dark_purple>SoulSMP</dark_purple><dark_gray>]</dark_gray> ");
    }

    /**
     * @since V. 1.0
     * @description - Creates a prefix for a error message.
     * @return "[SoulError] "
     * @todoList TODO: 11.12.2022 MESSAGE ANPASSBAR MACHEN
     */
    @NotNull
    public String errorPrefix(){
        return "[SoulError] ";
    }

    /**
     * @since V. 1.0
     * @description - Creates a prefix for a warning message.
     * @return "[SoulWarning] "
     * @todoList TODO: 11.12.2022 MESSAGE ANPASSBAR MACHEN
     */
    @NotNull
    public String warningPrefix(){
        return "[SoulWarning] ";
    }

    /**
     * @since V. 1.0
     * @description - Creates a prefix for a console message.
     * @return "[SoulSMP] "
     * @todoList TODO: 11.12.2022 MESSAGE ANPASSBAR MACHEN
     */
    @NotNull
    public String consolePrefix(){
        return "[SoulSMP] ";
    }
}
