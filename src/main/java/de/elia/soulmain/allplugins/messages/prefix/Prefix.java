package de.elia.soulmain.allplugins.messages.prefix;

import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.NotNull;

/**
 * @author - Elia
 * @since - V. 1.0
 * @version - V. 1.0
 * @description - This class collects all methods that create a prefix.
 */
public interface Prefix {

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

}
