package org.aurorus.furryrp.inventories.setsona;

import org.aurorus.furryrp.Main;
import org.aurorus.furryrp.objects.Sona;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.ArrayList;

public class SetSonaAgeInv {
    private final Main plugin;

    public SetSonaAgeInv(Main plugin){
        this.plugin = plugin;
    }

    ItemStack createItem(String name, Material material){
        ItemStack item = new ItemStack(material);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.WHITE + name);
        item.setItemMeta(meta);

        return item;
    }

    public void openInv(Player p, int value){
        Inventory inv = Bukkit.createInventory(null, 9, ChatColor.GREEN + "Set Sona Age");

        inv.setItem(0, createItem("-100", Material.RED_STAINED_GLASS_PANE));
        inv.setItem(1, createItem("-10", Material.RED_STAINED_GLASS_PANE));
        inv.setItem(2, createItem("-1", Material.RED_STAINED_GLASS_PANE));
        inv.setItem(4, createItem(value + " years", Material.PAPER));
        inv.setItem(6, createItem("+1", Material.GREEN_STAINED_GLASS_PANE));
        inv.setItem(7, createItem("+10", Material.GREEN_STAINED_GLASS_PANE));
        inv.setItem(8, createItem("+100", Material.GREEN_STAINED_GLASS_PANE));

        p.openInventory(inv);
    }
}
