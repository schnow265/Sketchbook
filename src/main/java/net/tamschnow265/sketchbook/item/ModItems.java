package net.tamschnow265.sketchbook.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.registry.*;
import net.minecraft.util.Identifier;
import net.tamschnow265.sketchbook.drawbook;

public class ModItems {
    //Items
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings().group(ModItemGroup.SKBITEMS)));
    public static final Item A_KNUCKLES = registerItem("amethyst_knuckles", new Item(new FabricItemSettings().group(ModItemGroup.SKCOMABT)));
    public static final Item N_HAMMER = registerItem("netherite_hammer", new Item(new FabricItemSettings().group(ModItemGroup.SKCOMABT)));




    //Registering
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(drawbook.MOD_ID, name), item);
    }

    public static void registerModItems() {
        drawbook.LOGGER.info("Registering Items for " + drawbook.MOD_ID);
    }
}
