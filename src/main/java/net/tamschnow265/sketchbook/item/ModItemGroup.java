package net.tamschnow265.sketchbook.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.tamschnow265.sketchbook.drawbook;

public class ModItemGroup {
    public static final ItemGroup SKBITEMS = FabricItemGroupBuilder.build(new Identifier(drawbook.MOD_ID, "items"), () -> new ItemStack(ModItems.RUBY));
}
