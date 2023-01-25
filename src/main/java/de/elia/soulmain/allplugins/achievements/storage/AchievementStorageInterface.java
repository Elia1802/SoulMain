package de.elia.soulmain.allplugins.achievements.storage;

/**
 * @author - Elia
 * @since - V. 1.0
 * @version - V. 1.0
 * @implements
 * @extends
 * @description -
 */
public interface AchievementStorageInterface {

    String getName();

    String getDataID();

    String getZiel();

    int getXp();

    String getAchievement(AchievementStorage achievement);

}
