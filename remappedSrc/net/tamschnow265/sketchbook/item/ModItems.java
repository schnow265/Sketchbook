package net.tamschnow265.sketchbook.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tamschnow265.sketchbook.drawbook;

public class ModItems {
    //Items
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings().group(ModItemGroup.SKBITEMS)));





    //Registering
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(drawbook.MOD_ID, name), item);
    }

    public static void registerModItems() {
        drawbook.LOGGER.info("Registering Items for " + drawbook.MOD_ID);
    }
}
