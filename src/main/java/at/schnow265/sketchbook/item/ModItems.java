package at.schnow265.sketchbook.item;


import at.schnow265.sketchbook.drawbook;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import at.schnow265.sketchbook.item.custom.TreeChopper;

public class ModItems {
    /**
        Here you can find Items added by the mod.
        Items are added using this scheme: {@code public static final Item [ItemName] = registerItem("[itemname]", new Item(new FabricItemSettings()));}
        They are added to the Inventory using the {@code addToItemGroup()} Function.

        @author schnow265
        @since 2023-05-28
    */
    //Items
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));

    //Weapons
    public static final Item A_KNUCKLES = registerItem("amethyst_knuckles", new SwordItem(ToolMaterials.DIAMOND, 2, 5, new FabricItemSettings()));
    public static final Item N_HAMMER = registerItem("netherite_hammer", new SwordItem(ToolMaterials.NETHERITE, 10, 15f, new FabricItemSettings()));
    public static final Item RUBY_KATANA = registerItem("ruby_katana", new SwordItem(ToolMaterials.GOLD, (int) 1.5, 5f, new FabricItemSettings()));
    public static final Item OP_HAMMER = registerItem("op_hammer", new SwordItem(ToolMaterials.NETHERITE, 999999999,1f, new FabricItemSettings()));
    
    //Axes
    public static final Item COPPER_C_AXE = registerItem("copper_c_axe", new AxeItem(ToolMaterials.IRON, 3, 1f, new FabricItemSettings()));
    public static final Item CHOPPY = registerItem("choppy", new TreeChopper(ToolMaterials.NETHERITE, 0, 1f, new FabricItemSettings()));
    public static final Item IA_SHOVEL = registerItem("ia_shovel", new ShovelItem(ToolMaterials.IRON, 0, (int) 1.15f, new FabricItemSettings()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(drawbook.MOD_ID, name), item);
    }

    //Registering
    public static void registerModItems() {
        drawbook.LOGGER.info("Registering Items for " + drawbook.MOD_ID);
    }
}
