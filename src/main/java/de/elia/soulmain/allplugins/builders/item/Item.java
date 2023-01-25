package de.elia.soulmain.allplugins.builders.item;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

/**
 * @author - Elia
 * @since - V. 1.0
 * @version - V. 1.0
 * @implements
 * @extends
 * @description -
 */
public interface Item {

    ItemBuilder displayName(Component name);

    @Deprecated
    ItemBuilder getDisplayName(String name);

    ItemBuilder lore(List<Component> lore);

    ItemBuilder lore(Component... lore);

    @Deprecated
    ItemBuilder setLore(String... lore);

    ItemBuilder amount(int amount);

    void enchant(Enchantment enchantment , int level);

    ItemBuilder unbreakable(boolean value);

    ItemStack build();

    ItemStack getItemStack();

    MiniMessage getMiniMessage();

    ItemMeta getItemMeta();

    String toString();
}
