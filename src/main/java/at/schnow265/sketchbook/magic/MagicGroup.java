package at.schnow265.sketchbook.magic;

import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class MagicGroup {
    public static void magicItemGroup() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
            content.addAfter(Items.LAPIS_LAZULI , MagicItems.PHYSICAL_MANA);
        });
    }
}
