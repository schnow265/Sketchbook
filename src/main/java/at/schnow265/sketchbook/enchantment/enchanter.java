package at.schnow265.sketchbook.enchantment;

import at.schnow265.sketchbook.drawbook;
import at.schnow265.sketchbook.enchantment.enchants.*;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class enchanter {

	
    // Beginn of custom Enchants Section
    // All commented out lines are "incompatible"

    public static Enchantment LIGHTNING_STRIKER = register("lightning_striker", new LightningStrikerEnchantment(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));
    public static Enchantment PISTONING = register("pistoning", new pistoning(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));
    public static Enchantment CHOPPER = register("chopper", new chopper(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, EquipmentSlot.OFFHAND));
    public static Enchantment PULL = register("pull", new PullEnchantment(Enchantment.Rarity.COMMON, EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));
    public static Enchantment FROSTY = register("frosty", new FrostEnchantment(Enchantment.Rarity.COMMON, EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));
    public static Enchantment SUICIDE = register("suicide", new suicide(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));


    // Registering Enchantments
    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registries.ENCHANTMENT, new Identifier(drawbook.MOD_ID, name), enchantment);
    }
    public static void registerEchanter() {
        drawbook.LOGGER.info("Registering Enchants for " + drawbook.MOD_ID);
    }
}
