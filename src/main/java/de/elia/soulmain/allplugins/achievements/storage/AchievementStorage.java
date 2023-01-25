package de.elia.soulmain.allplugins.achievements.storage;

import org.jetbrains.annotations.NotNull;

/**
 * @author - Elia
 * @since - V. 1.0
 * @version - V. 1.0
 * @implements {@link AchievementStorageInterface}
 * @description - This class includes all achievements that exist. You can also get all the properties from the achievements.
 */
public enum AchievementStorage implements AchievementStorageInterface {

    DEFENTLYTHESLOWEST("Definitiv der langsamste" , "ddl" , "Trinke eine turtle master Potion"  , 15),
    BORINGDAY("Langweiliger Tag" , "lt" , "Tu nichts für 1 Minecraft-Tag" ,20),
    THEMASTEROFALCHEMY("Der Meister der Alchemie" , "dmda" , "Braue jeden einzelnen Trank im Spiel (nur die im Survival Möglich sind)" ,20),
    LOTSOFGOODSWORDS("Viele gute Schwerter" , "vgs" , "Kriege jedes existierende Schwert in Minecraft" ,15),
    ALLARMORS("Alle Rüstungen" , "ar" , "Der Player hat alle Rüstungen" ,20),
    DJ("DJ" , "d" , "Finde jede Musik-Disc" ,10),
    TRAPTIME("Fallenzeit" , "f" , "Habe 5x Tnt, 10x Redstone und eine Druckplatte aus Stein in deinem Inventar" ,20);

    private final String name;

    private final String dataID;

    private final String ziel;

    private final int xp;

    AchievementStorage(String name , String dataID , String ziel, int xp){
        this.name = name;
        this.dataID = dataID;
        this.ziel = ziel;
        this.xp = xp;
    }

    @NotNull
    public String getName() {
        return name;
    }



    @NotNull
    public String getDataID() {
        return dataID;
    }

    @NotNull
    public String getZiel() {
        return ziel;
    }

    public int getXp() {
        return xp;
    }

    @NotNull
    public String getAchievement(AchievementStorage achievement){
        return this.getName() + this.getDataID() + this.getZiel() + this.getXp();
    }
}
