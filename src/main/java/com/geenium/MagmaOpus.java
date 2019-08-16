package com.geenium;

import com.geenium.items.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class MagmaOpus implements ModInitializer {

    public static final String MODID = "magma_opus";

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MODID, "item_group"), () -> new ItemStack(ModItems.OBSIDIAN_ORB));

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
