package de.elia.soulmain.allplugins.builders.item;

import de.elia.soulmain.SoulMain;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author - Elia
 * @since - V. 1.0
 * @version - V. 1.0
 * @implements
 * @extends
 * @description -
 */
public class ItemBuilder implements Item{

    private final ItemStack itemStack;

    private final ItemMeta itemMeta;

    private final MiniMessage miniMessage = SoulMain.getMiniMessage();

    public ItemBuilder(Material material){
        itemStack = new ItemStack(material);
        itemMeta = itemStack.getItemMeta();
    }

    @NotNull
    public ItemBuilder displayName(Component name){
        itemMeta.displayName(name);
        return this;
    }

    @NotNull
    @Deprecated
    public ItemBuilder getDisplayName(String name){
        itemMeta.setDisplayName(name);
        return this;
    }

    @NotNull
    public ItemBuilder lore(List<Component> lore){
        itemMeta.lore(lore);
        return this;
    }

    @NotNull
    public ItemBuilder lore(Component... lore){
        itemMeta.lore(Arrays.asList(lore));
        return this;
    }

    @NotNull
    @Deprecated
    public ItemBuilder setLore(List<String> lore){
        itemMeta.setLore(lore);
        return this;
    }

    @NotNull
    @Deprecated
    public ItemBuilder setLore(String... lore){
        itemMeta.setLore(Arrays.asList(lore));
        return this;
    }

    @NotNull
    public ItemBuilder amount(int amount){
        itemStack.setAmount(amount);
        return this;
    }

    public void enchant(Enchantment enchantment , int level){
        itemStack.addEnchantment(enchantment , level);
    }

    public void enchant(Map<Enchantment , Integer> enchantmentIntegerMap){
        itemStack.addEnchantments(enchantmentIntegerMap);
    }

    @NotNull
    public ItemBuilder unbreakable(boolean value){
        itemMeta.setUnbreakable(value);
        return this;
    }

    @NotNull
    public ItemBuilder itemFlag(ItemFlag... itemFlags){
        itemMeta.addItemFlags(itemFlags);
        return this;
    }

    @NotNull
    public ItemStack build(){
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    @NotNull
    public ItemStack getItemStack() {
        return itemStack;
    }

    @NotNull
    public MiniMessage getMiniMessage() {
        return miniMessage;
    }

    @Deprecated
    //Use the Instance of the Main Class
    public ItemMeta getItemMeta() {
        return itemMeta;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
