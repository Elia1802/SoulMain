package de.elia.soulmain.thisplugin.register.configuration;

import de.elia.soulmain.thisplugin.configuration.SoulConfiguration;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

/**
 * @author - Elia
 * @since - V. 1.0
 * @version - V. 1.0
 * @description - This class creates and loads configuration files.
 */
public class ConfigurationRegister {

    private final Plugin plugin;

    public ConfigurationRegister(Plugin plugin){
        this.plugin = plugin;
    }

    private SoulConfiguration discordConfiguration;

    private SoulConfiguration achievement;

    /**
     * @description - This method creates all configuration files and saves any default values.
     *                All settings and properties can be found in this method.
     */
    public void load(){
        //Create discord configuration with the Name Discord.yml
        discordConfiguration = new SoulConfiguration(plugin , "Discord.yml");
        //Create achievement configuration with the Name Achievement.yml
        achievement = new SoulConfiguration(plugin , "Achievement.yml");

        //Set copyDefaults
        discordConfiguration.options().copyDefaults(true);
        //Set all Defaults
        discordConfiguration.addDefault("discord text 1" , "<gray>Drücke auf </gray>");
        discordConfiguration.addDefault("discord link" , "https://discord.gg/8BReCdpKSt");
        discordConfiguration.addDefault("discord text 2" , "<hover:show_text:'" + discordConfiguration.getString("discord link") + "'><blue>Discord</blue></click><gray> um unserem Discord zu joinen!</gray>");
        //Speichert die Configuration
        discordConfiguration.save();

        //Set copyDefaults
        achievement.options().copyDefaults(true);
        //Speichert die Configuration
        achievement.save();
    }

    /**
     * @description - This method saves all files.
     */
    public void save(){
        discordConfiguration = new SoulConfiguration(plugin , "Discord.yml");
        achievement = new SoulConfiguration(plugin , "Achievement.yml");
        //Save all Files
        discordConfiguration.save();
        achievement.save();
    }

    /**
     * @description - This method is required to edit the Discord Configuration in other classes.
     * @return discordConfiguration
     */
    @NotNull
    public SoulConfiguration getDiscordConfiguration() {
        discordConfiguration = new SoulConfiguration(plugin , "Discord.yml");
        return discordConfiguration;
    }

    /**
     * @description - This method is required to edit the Achievement Configuration in other classes.
     * @return achievement
     */
    public SoulConfiguration getAchievement() {
        achievement = new SoulConfiguration(plugin , "Achievement.yml");
        return achievement;
    }
}
