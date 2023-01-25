package de.elia.soulmain.allplugins.achievements.utils;

import de.elia.soulmain.SoulMain;
import de.elia.soulmain.allplugins.achievements.storage.AchievementStorage;
import de.elia.soulmain.allplugins.messages.builder.MessageBuilder;
import de.elia.soulmain.thisplugin.register.configuration.ConfigurationRegister;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

/**
 * @author - Elia
 * @since - V. 1.0
 * @version - V. 1.0
 * @implements
 * @extends
 * @description -
 */
public class AchievementUtils {

    private final MiniMessage miniMessage = SoulMain.getMiniMessage();

    private final ConfigurationRegister configurationRegister = new ConfigurationRegister(SoulMain.getInstance());

    private final Plugin plugin;

    public AchievementUtils(Plugin plugin){
        this.plugin = plugin;
    }

    public boolean hasAchievement(@NotNull Player player , @NotNull AchievementStorage achievementStorage){
        return configurationRegister.getAchievement().get(player.getUniqueId() + ".Achievements." + achievementStorage.getDataID()) != null ? true : false;
    }

    //gibt dem Spieler das Achievement
    public void giveAchievement(@NotNull Player player , @NotNull AchievementStorage achievementStorage){
        if (!this.hasAchievement(player , achievementStorage)) {
            configurationRegister.getAchievement().set(player.getUniqueId() + ".Achievements." + achievementStorage.getDataID() , true);
            MessageBuilder messageBuilder = new MessageBuilder();
            messageBuilder.broadcast(messageBuilder.darkPurple(player.getName()).append(messageBuilder.white(" has made the advancement ")).append(messageBuilder.green(achievementStorage.getName())));

            player.giveExp(achievementStorage.getXp());
            player.playSound(player.getLocation() , Sound.ENTITY_PLAYER_LEVELUP , 1 , 1);
        }
    }

    //Löscht das Achievement
    public void removeAchievement(@NotNull Player player , @NotNull AchievementStorage achievementStorage){
        MessageBuilder messageBuilder = new MessageBuilder();

        if (this.hasAchievement(player , achievementStorage)) {
            configurationRegister.getAchievement().set(player.getUniqueId() + ".Achievements." + achievementStorage.getDataID() , null);
            messageBuilder.message(player , messageBuilder.aqua("Du hast dem Spieler das Achievement " + achievementStorage.getName() + "abgenommen!"));
        }else {
            messageBuilder.message(player , messageBuilder.red("Dieser Spieler hat dieses Achievement nicht!"));
        }
    }
}
