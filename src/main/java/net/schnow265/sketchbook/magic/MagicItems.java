package net.schnow265.sketchbook.magic;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.schnow265.sketchbook.drawbook;

public class MagicItems {


    private static void ItemGroupAdder(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerMagicItems() {
        drawbook.LOGGER.info("Registering Items for " + drawbook.MOD_ID);
        ItemGroupAdder();
    }
}
