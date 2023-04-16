package net.schnow265.sketchbook.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.schnow265.sketchbook.drawbook;

public class ModItemGroup {
    public static final ItemGroup SKBITEMS = FabricItemGroup.builder(new Identifier(drawbook.MOD_ID, "items")).displayName(Text.translatable("itemgroup.skbitems")).icon(() -> new ItemStack(ModItems.RUBY)).build();
    public static final ItemGroup SKCOMABT = FabricItemGroup.builder(new Identifier(drawbook.MOD_ID, "combat")).displayName(Text.translatable("itemgroup.skcombat")).icon(() -> new ItemStack(ModItems.N_HAMMER)).build();
    public static final ItemGroup SUTILS = FabricItemGroup.builder(new Identifier(drawbook.MOD_ID, "utility")).displayName(Text.translatable("itemgroup.sutils")).icon(() -> new ItemStack(ModItems.CHOPPY)).build();

}
