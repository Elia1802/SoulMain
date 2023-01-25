package de.elia.soulmain;

/**
 * @author - Elia
 * @since - V. 1.0
 * @version - V. 1.0
 * @implementations -  {@link SoulMain}
 * @description - This class implements all methods from the main class. ({@link SoulMain})
 */
public interface Functions {

    /**
     * @description  This method loads the plugin and registers all commands, events and listeners.
     */
    void onEnable();

    /**
     * @description - This method terminates all processes from the plugin and saves all files.
     */
    void onDisable();

    /**
     * @description - This method reloads the plugin.
     */
    void reload();

    /**
     * @description - This method reloads the configurations.
     */
    void configurationReload();



}
