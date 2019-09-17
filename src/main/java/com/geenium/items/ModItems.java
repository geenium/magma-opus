package com.geenium.items;

import com.geenium.MagmaOpus;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    private static Item.Settings base_settings = new Item.Settings().group(MagmaOpus.ITEM_GROUP);

    public static final Item OBSIDIAN_ORB = new ObsidianOrb(base_settings.maxCount(1));
    public static final Item FIRE_POWDER = new Item(base_settings);

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(MagmaOpus.MODID, "obsidian_orb"), OBSIDIAN_ORB);
        Registry.register(Registry.ITEM, new Identifier(MagmaOpus.MODID, "fire_powder"), FIRE_POWDER);
    }
}
