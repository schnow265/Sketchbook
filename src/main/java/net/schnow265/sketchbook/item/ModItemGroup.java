package net.schnow265.sketchbook.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.schnow265.sketchbook.drawbook;

public class ModItemGroup {
    public static final ItemGroup SKBITEMS = FabricItemGroupBuilder.build(new Identifier(drawbook.MOD_ID, "items"), () -> new ItemStack(ModItems.RUBY));
    public static final ItemGroup SKCOMABT = FabricItemGroupBuilder.build(new Identifier(drawbook.MOD_ID, "combat"), () -> new ItemStack(ModItems.N_HAMMER));
    public static final ItemGroup SUTILS = FabricItemGroupBuilder.build(new Identifier(drawbook.MOD_ID, "utility"), () -> new ItemStack(ModItems.TCHOPPING));
}