package de.elia.soulmain.allplugins.configuration;

import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfigurationOptions;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.configuration.file.YamlConfigurationOptions;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.Vector;

import org.jetbrains.annotations.NotNull;

import java.io.Reader;
import java.io.File;
import java.lang.Boolean;
import java.lang.Byte;
import java.lang.Character;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Double;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Short;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author - Elia
 * @since - V. 1.0
 * @version - V. 1.0
 * @implements
 * @extends
 * @description -
 */
public interface Configuration {

    @NotNull
    YamlConfiguration reload();

    void load(File file);

    void load(String file);

    void load(Reader reader);

    @NotNull
    YamlConfiguration loadConfiguration(File file);

    @NotNull
    YamlConfiguration loadConfiguration(Reader reader);

    void loadFromString(String contents);

    @NotNull
    String saveToString();

    void save();

    void save(File file);

    void save(String file);

    void setDefaults();

    void setDefaults(boolean replace);

    void setDefaults(org.bukkit.configuration.Configuration defaults);

    void addDefault(String path , Object value);

    void addDefaults(Map<String , Object> defaults);

    void addDefaults(org.bukkit.configuration.Configuration defaults);

    @NotNull
    org.bukkit.configuration.Configuration getDefaults();

    void copyDefaults(boolean value);

    @NotNull
    Boolean getCopyDefaults();

    @NotNull
    Boolean copyDefaults();

    @NotNull
    @Deprecated
    YamlConfigurationOptions setHeader(String header);

    @NotNull
    YamlConfigurationOptions setHeader(List<String> value);

    @NotNull
    YamlConfigurationOptions setHeader(String... values);

    @NotNull
    @Deprecated
    String getHeader();

    @NotNull
    @Deprecated
    YamlConfigurationOptions header(String value);

    @NotNull
    @Deprecated
    YamlConfigurationOptions copyHeader(boolean value);

    @NotNull
    @Deprecated
    Boolean getCopyHeader();

    @NotNull
    @Deprecated
    Boolean copyHeader();

    @NotNull
    YamlConfigurationOptions setFooter(List<String> value);

    @NotNull
    YamlConfigurationOptions setFooter(String... values);

    @NotNull
    List<String> getFooter();

    void setComments(String path , List<String> comments);

    void setComments(String path , String... comments);

    @NotNull
    List<String> getComments(String path);

    void setInlineComments(String path , List<String> comments);

    void setInlineComments(String path , String... comments);

    @NotNull
    List<String> getInlineComments(String path);

    @NotNull
    YamlConfigurationOptions setParseComments(boolean value);

    @NotNull
    YamlConfigurationOptions parseComments(boolean value);

    @NotNull
    Boolean getParseComments();

    @NotNull
    Boolean parseComments();

    @NotNull
    YamlConfigurationOptions indent(int indent);

    int getIndent();

    @NotNull
    YamlConfigurationOptions setWidth(int width);

    int getWidth();

    @NotNull
    YamlConfigurationOptions setPathSeparator(char separator);

    char getPathSeparator();

    void clear();

    void clear(boolean deep);

    void clearPath(String path);

    @NotNull
    String createPath(ConfigurationSection section , String pathName);

    @NotNull
    String createPath(ConfigurationSection section , String pathName , ConfigurationSection relativeTo);

    @NotNull
    String getCurrentPath();

    @NotNull
    Boolean isSet(String path);

    @NotNull
    Boolean isString(String path);

    @NotNull
    String getPath(String path);

    @NotNull
    String getString(String path);

    @NotNull
    String getString(String path , String string);

    @NotNull
    ConfigurationSection createSection(String path);

    @NotNull
    ConfigurationSection createSection(String path , Map<? , ?> values);

    @NotNull
    Boolean isConfigurationSection(String path);

    @NotNull
    ConfigurationSection getConfigurationSection(String path);

    @NotNull
    ConfigurationSection getDefaultSection();

    @NotNull
    ConfigurationSection getParent();

    void set(String path , Object value);

    @NotNull
    Boolean contains(String path);

    @NotNull
    Object get(String path);

    @NotNull
    Object get(String path , Object value);

    boolean get(String path , boolean value);

    @NotNull
    Object getObject(String path , Class<Object> value);

    @NotNull
    Set<String> getKeys();

    @NotNull
    Set<String> getKeys(boolean deep);

    @NotNull
    Map<String , Object> getValues();

    @NotNull
    Map<String , Object> getValues(boolean deep);

    boolean isBoolean(String path);

    @NotNull
    Boolean getBoolean(String path , boolean value);

    @NotNull
    List<Boolean> getBooleanList(String path);

    @NotNull
    Boolean isInt(String path);

    @NotNull
    Integer getInt(String path);

    @NotNull
    Integer getInt(String path, int value);

    @NotNull
    List<Integer> getIntegerList(String path);

    @NotNull
    Boolean isLong(String path);

    @NotNull
    Long getLong(String path);

    @NotNull
    Long getLong(String path, long value);

    @NotNull
    List<Long> getLongList(String path);

    @NotNull
    Boolean isDouble(String path);

    @NotNull
    Double getDouble(String path);

    @NotNull
    Double getDouble(String path, double value);

    @NotNull
    List<Double> getDoubleList(String path);

    @NotNull
    List<Float> getFloatList(String path);

    @NotNull
    List<Short> getShortList(String path);

    @NotNull
    List<Byte> getByteList(String path);

    @NotNull
    List<Character> getCharacterList(String path);

    @NotNull
    Boolean isList(String path);

    @NotNull
    List<?> getList(String path);

    @NotNull
    List<Map<?, ?>> getMapList(String path);

    @NotNull
    Boolean isOfflinePlayer(String path);

    @NotNull
    OfflinePlayer getOfflinePlayer(String path);

    @NotNull
    Boolean isItemStack(String path);

    @NotNull
    ItemStack getItemStack(String path);

    @NotNull
    ItemStack getItemStack(String path, ItemStack value);

    @NotNull
    Boolean isLocation(String path);

    @NotNull
    Location getLocation(String path);

    @NotNull
    Location getLocation(String path, Location def);

    @NotNull
    Boolean isVector(String path);

    @NotNull
    Vector getVector(String path);

    @NotNull
    Vector getVector(String path, Vector value);

    @NotNull
    Boolean isColor(String path);

    @NotNull
    Color getColor(String path, Color value);

    @NotNull
    String getName();

    @NotNull
    String getConfigurationName();

    @NotNull
    FileConfigurationOptions options();

    @NotNull
    YamlConfigurationOptions getOptions();

    @NotNull
    org.bukkit.configuration.Configuration getRoot();

    @NotNull
    String toString();

    @NotNull
    Plugin getPlugin();

    @NotNull
    File getFile();

    @NotNull
    File getFilepath();

    @NotNull
    String getFileName();

    @NotNull
    String getPathName();

    @NotNull
    YamlConfiguration getConfiguration();

    void setConfiguration(YamlConfiguration config);

}