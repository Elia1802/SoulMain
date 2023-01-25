package de.elia.soulmain.allplugins.achievements.utils;

import de.elia.soulmain.allplugins.achievements.storage.AchievementStorage;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

/**
 * @author - Elia
 * @since - V. 1.0
 * @version - V. 1.0
 * @implements
 * @extends
 * @description -
 */
public interface AchievementUtilsInterface {

    boolean hasAchievement(@NotNull Player player , AchievementStorage achievement);

    void giveAchievement(@NotNull Player player , @NotNull AchievementStorage achievementStorage);

    void removeAchievement(@NotNull Player player , @NotNull AchievementStorage achievementStorage);

}
