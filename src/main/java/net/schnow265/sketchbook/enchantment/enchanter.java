package net.schnow265.sketchbook.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import net.schnow265.sketchbook.drawbook;

public class enchanter {

    // Beginn of custom Enchants Section

    public static Enchantment LIGHTNING_STRIKER = register("lightning_striker", new LightningStrikerEnchantment(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));
    public static Enchantment PISTONING = register("pistoning", new pistoning(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));
    public static Enchantment BOOM = register("boom", new boom(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));


    // End of custom Enchant Section


    // Registering Enchantments
    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registry.ENCHANTMENT, new Identifier(drawbook.MOD_ID, name), enchantment);
    }
    public static void registerEchanter() {
        drawbook.LOGGER.info("Registering Enchants for " + drawbook.MOD_ID);
    }
}
