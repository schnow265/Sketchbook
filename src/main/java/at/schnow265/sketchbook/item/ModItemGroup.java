package at.schnow265.sketchbook.item;

import at.schnow265.sketchbook.block.ModBlocks;
import at.schnow265.sketchbook.drawbook;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup SKETCHYS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(drawbook.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.sketchbook.sketchys"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.A_KNUCKLES);
                        entries.add(ModItems.METAL_DETECTOR);
                        entries.add(ModItems.RAW_RUBY);
                        entries.add(ModItems.CHOPPY);
                        entries.add(ModItems.TREESTROYER);
                        entries.add(ModItems.N_HAMMER);
                        entries.add(ModItems.RUBY_KATANA);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.NETHER_RUBY_ORE);
                        entries.add(ModBlocks.END_STONE_RUBY_ORE);
                    }).build());

    public static void registerItemGroups() {
        drawbook.LOGGER.info("Registering Item Groups for " + drawbook.MOD_ID);
    }
}
