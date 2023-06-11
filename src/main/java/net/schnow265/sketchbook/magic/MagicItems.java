package net.schnow265.sketchbook.magic;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import net.schnow265.sketchbook.drawbook;
import net.schnow265.sketchbook.item.ModItemGroup;

public class MagicItems {

    // Items
    public static final Item PHYSICAL_MANA = registerMagicItems("physical_mana", new Item(new FabricItemSettings()));

    //Adding to Groups

    public static void ItemGroupAdder() {
        addToMagicGroup(ModItemGroup.MAGIC, PHYSICAL_MANA);
    }


    // Registering
    private static Item registerMagicItems(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(drawbook.MOD_ID, name), item);
    }
    private static void addToMagicGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerMagicItemsToMod() {
        drawbook.LOGGER.info("Registering Items for " + drawbook.MOD_ID);
        ItemGroupAdder();
    }
}
