package at.schnow265.sketchbook.magic;

import at.schnow265.sketchbook.drawbook;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MagicItems {

    // Items
    public static final Item PHYSICAL_MANA = registerMagicItems("physical_mana", new Item(new FabricItemSettings()));

    //Adding to Groups



    // Registering
    private static Item registerMagicItems(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(drawbook.MOD_ID, name), item);
    }

    public static void registerMagicItemsToMod() {
        drawbook.LOGGER.info("Registering Magic Items for " + drawbook.MOD_ID);
    }
}
