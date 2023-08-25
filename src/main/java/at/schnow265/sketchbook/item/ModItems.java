package at.schnow265.sketchbook.item;


import at.schnow265.sketchbook.drawbook;
import at.schnow265.sketchbook.item.custom.MetalDetectorItem;
import at.schnow265.sketchbook.item.custom.choppers.TreeStroyer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import at.schnow265.sketchbook.item.custom.choppers.TreeChopper;

public class ModItems {
    //Weapons
    public static final Item A_KNUCKLES = registerItem("amethyst_knuckles", new SwordItem(ToolMaterials.DIAMOND, 2, 5, new FabricItemSettings()));
    public static final Item N_HAMMER = registerItem("netherite_hammer", new SwordItem(ToolMaterials.NETHERITE, 10, 15f, new FabricItemSettings()));
    public static final Item RUBY_KATANA = registerItem("ruby_katana", new SwordItem(ToolMaterials.GOLD, (int) 1.5, 5f, new FabricItemSettings()));

    public static final Item OP_HAMMER = registerItem("op_hammer", new SwordItem(ToolMaterials.NETHERITE, 999999999,1f, new FabricItemSettings()));
    
    //Axes
    public static final Item COPPER_C_AXE = registerItem("copper_c_axe", new AxeItem(ToolMaterials.IRON, 3, 1f, new FabricItemSettings()));
    public static final Item CHOPPY = registerItem("choppy", new TreeChopper(ToolMaterials.NETHERITE, 0, 1f, new FabricItemSettings()));
    public static final Item TREESTROYER = registerItem("treestroyer", new TreeStroyer(ToolMaterials.NETHERITE,500,50f, new FabricItemSettings()));
    public static final Item IA_SHOVEL = registerItem("ia_shovel", new ShovelItem(ToolMaterials.IRON, 0, (int) 1.15f, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(drawbook.MOD_ID, name), item);
    }

    //And it's made by Kaupen-Eye-Joe
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));

    public static final Item METAL_DETECTOR = registerItem("metal_detector",
            new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));

    public static void ItemAdder() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
            content.add(ModItems.A_KNUCKLES);
            content.add(ModItems.N_HAMMER);
            content.add(ModItems.RUBY_KATANA);
            content.add(ModItems.COPPER_C_AXE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
            content.addAfter(Items.GOLD_NUGGET ,ModItems.RUBY);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content ->{
            content.addAfter(Items.NETHERITE_HOE, ModItems.CHOPPY);
            content.addBefore(Items.WOODEN_SHOVEL, ModItems.IA_SHOVEL);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.OPERATOR).register(content -> {
            content.add(ModItems.OP_HAMMER);
            content.add(ModItems.TREESTROYER);
        });
    }

    //Registering
    public static void registerModItems() {
        ItemAdder();
        ModItemGroup.registerItemGroups();
        drawbook.LOGGER.info("Registering Items for " + drawbook.MOD_ID);
    }
}
