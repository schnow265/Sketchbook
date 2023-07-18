package at.schnow265.sketchbook.item;

import at.schnow265.sketchbook.drawbook;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
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
        });
    }
}
