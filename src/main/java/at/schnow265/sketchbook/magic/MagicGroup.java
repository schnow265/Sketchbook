package at.schnow265.sketchbook.magic;

import at.schnow265.sketchbook.drawbook;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class MagicGroup {
    public static ItemGroup MAGGROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(drawbook.MOD_ID, "maggroup"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.maggroup"))
                    .icon(() -> new ItemStack(MagicItems.PHYSICAL_MANA)).entries((displayContext, entries) -> {
                        //entries.add(ModItems.);
                        entries.add(MagicItems.PHYSICAL_MANA);
                    }).build());

    public static void registerItemGroups() {
        drawbook.LOGGER.info("Registering Item Groups for " + drawbook.MOD_ID);
    }
}
