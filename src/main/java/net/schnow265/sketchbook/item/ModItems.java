package net.schnow265.sketchbook.item;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.item.ShovelItem;

import net.schnow265.sketchbook.drawbook;
import net.schnow265.sketchbook.item.custom.frameworks.ModAxeItem;
import net.schnow265.sketchbook.item.custom.TreeChopper;

public class ModItems {
    /**
        Here you can find Items added by the mod.
        Items are added using this scheme: {@code public static final Item [ItemName] = registerItem("[itemname]", new Item(new FabricItemSettings()));}
        They are added to the Inventory using the {@code addToItemGroup()} Function.

        @author schnow265
        @since 2023-05-28
        @see ModItemGroup
    */
    //Items
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));

    //Weapons
    public static final Item A_KNUCKLES = registerItem("amethyst_knuckles", new SwordItem(ToolMaterials.DIAMOND, 2, 5, new FabricItemSettings()));
    public static final Item N_HAMMER = registerItem("netherite_hammer", new SwordItem(ToolMaterials.NETHERITE, 10, 15f, new FabricItemSettings()));
    public static final Item RUBY_KATANA = registerItem("ruby_katana", new SwordItem(ToolMaterials.GOLD, (int) 1.5, 5f, new FabricItemSettings()));
    public static final Item OP_HAMMER = registerItem("op_hammer", new SwordItem(ToolMaterials.NETHERITE, 999999999,1f, new FabricItemSettings()));
    
    //Axes
    public static final Item COPPER_C_AXE = registerItem("copper_c_axe", new ModAxeItem(ToolMaterials.IRON, 3, 1f, new FabricItemSettings()));
    public static final Item CHOPPY = registerItem("choppy", new TreeChopper(ToolMaterials.NETHERITE, 0, 1f, new FabricItemSettings()));
    public static final Item IA_SHOVEL = registerItem("ia_shovel", new ShovelItem(ToolMaterials.IRON, 0, (int) 1.15f, new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(drawbook.MOD_ID, name), item);
    }
    // Into the Inventory
    public static void addItemsToItemGroup() {

        addToItemGroup(ItemGroups.TOOLS, CHOPPY);
        addToItemGroup(ModItemGroup.SUTILS, CHOPPY);

        addToItemGroup(ModItemGroup.SKBITEMS, RUBY);
        addToItemGroup(ItemGroups.INGREDIENTS, RUBY);

        addToItemGroup(ModItemGroup.SKCOMABT, A_KNUCKLES);
        addToItemGroup(ItemGroups.COMBAT, A_KNUCKLES);

        addToItemGroup(ItemGroups.COMBAT, N_HAMMER);
        addToItemGroup(ModItemGroup.SKCOMABT, N_HAMMER);

        addToItemGroup(ItemGroups.COMBAT, RUBY_KATANA);
        addToItemGroup(ModItemGroup.SKCOMABT, RUBY_KATANA);

        addToItemGroup(ItemGroups.COMBAT, COPPER_C_AXE);
        addToItemGroup(ModItemGroup.SKCOMABT, COPPER_C_AXE);

        addToItemGroup(ModItemGroup.SFUN, IA_SHOVEL);
        addToItemGroup(ItemGroups.TOOLS, IA_SHOVEL);
        
        addToItemGroup(ItemGroups.OPERATOR, OP_HAMMER);
    }

    //Registering
    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerModItems() {
        drawbook.LOGGER.info("Registering Items for " + drawbook.MOD_ID);
        addItemsToItemGroup();
    }
}
