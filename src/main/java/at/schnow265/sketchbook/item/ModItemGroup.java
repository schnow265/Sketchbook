package at.schnow265.sketchbook.item;

import at.schnow265.sketchbook.drawbook;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup SKBITEMS = Registry.register(Registries.ITEM_GROUP, new Identifier(drawbook.MOD_ID, "skbitems"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.skbitems"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        //entries.add(ModItems.);
                        entries.add(ModItems.RUBY);
                    }).build());
    public static final ItemGroup SKCOMABT = Registry.register(Registries.ITEM_GROUP, new Identifier(drawbook.MOD_ID, "skcombat"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.skcombat"))
                    .icon(() -> new ItemStack(ModItems.N_HAMMER)).entries((displayContext, entries) -> {
                        //entries.add(ModItems.);
                        entries.add(ModItems.N_HAMMER);
                        entries.add(ModItems.A_KNUCKLES);
                        entries.add(ModItems.A_KNUCKLES);
                        entries.add(ModItems.COPPER_C_AXE);
                        entries.add(ModItems.RUBY_KATANA);
                    }).build());
    public static final ItemGroup SFUN = Registry.register(Registries.ITEM_GROUP, new Identifier(drawbook.MOD_ID, "sfun"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.sfun"))
                    .icon(() -> new ItemStack(ModItems.OP_HAMMER)).entries((displayContext, entries) -> {
                        //entries.add(ModItems.);
                        entries.add(ModItems.OP_HAMMER);
                        entries.add(ModItems.IA_SHOVEL);
                    }).build());
    public static final ItemGroup SUTILS = Registry.register(Registries.ITEM_GROUP, new Identifier(drawbook.MOD_ID, "sutils"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.sutils"))
                    .icon(() -> new ItemStack(ModItems.CHOPPY)).entries((displayContext, entries) -> {
                        //entries.add(ModItems.);
                        entries.add(ModItems.CHOPPY);
                    }).build());

    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, new Identifier("items","skbitems"), SKBITEMS);
        Registry.register(Registries.ITEM_GROUP, new Identifier("combat","scombat"), SKCOMABT);
        Registry.register(Registries.ITEM_GROUP, new Identifier("fun","sfun"), SFUN);
        Registry.register(Registries.ITEM_GROUP, new Identifier("utils","sutils"), SUTILS);
    }
}
