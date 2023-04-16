package net.schnow265.sketchbook.item;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registry;
import net.minecraft.util.registry.*;
import net.minecraft.util.Identifier;

import net.schnow265.sketchbook.drawbook;
import net.schnow265.sketchbook.item.custom.ModAxeItem;
import net.schnow265.sketchbook.item.custom.TreeChopper;

public class ModItems {
    //Items
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings().group(ModItemGroup.SKBITEMS)));

    //Weapons
    public static final Item A_KNUCKLES = registerItem("amethyst_knuckles", new SwordItem(ToolMaterials.DIAMOND, 2, 5, new FabricItemSettings().group(ModItemGroup.SKCOMABT)));
    public static final Item N_HAMMER = registerItem("netherite_hammer", new SwordItem(ToolMaterials.NETHERITE, 10, 15f, new FabricItemSettings().group(ModItemGroup.SKCOMABT)));
    public static final Item RUBY_KATANA = registerItem("ruby_katana", new SwordItem(ToolMaterials.GOLD, (int) 1.5, 5f, new FabricItemSettings().group(ModItemGroup.SKCOMABT)));
    
    //Axes
    public static final Item COPPER_C_AXE = registerItem("copper_c_axe", new ModAxeItem(ToolMaterials.IRON, 3, 1f, new FabricItemSettings().group(ModItemGroup.SKCOMABT)));
    public static final Item TCHOPPING = registerItem("choppy", new TreeChopper(ToolMaterials.NETHERITE, 0, 1f, new FabricItemSettings().group(ModItemGroup.SUTILS)));


    //Registering
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(drawbook.MOD_ID, name), item);
    }

    public static void registerModItems() {
        drawbook.LOGGER.info("Registering Items for " + drawbook.MOD_ID);
    }
}