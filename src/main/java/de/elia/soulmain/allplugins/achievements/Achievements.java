package de.elia.soulmain.allplugins.achievements;

import de.elia.soulmain.allplugins.achievements.storage.AchievementStorage;
import de.elia.soulmain.allplugins.achievements.storage.AchievementStorageInterface;
import de.elia.soulmain.allplugins.achievements.utils.AchievementUtilsInterface;
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
public interface Achievements extends AchievementStorageInterface , AchievementUtilsInterface {

    boolean hasAchievement(@NotNull Player player , AchievementStorage achievement);

    void giveAchievement(@NotNull Player player , @NotNull AchievementStorage achievementStorage);

    void removeAchievement(@NotNull Player player , @NotNull AchievementStorage achievementStorage);

    String getName();

    String getDataID();

    String getZiel();

    int getXp();

    String getAchievement(AchievementStorage achievement);
}
