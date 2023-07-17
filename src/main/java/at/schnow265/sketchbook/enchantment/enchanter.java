package at.schnow265.sketchbook.enchantment;
import at.schnow265.sketchbook.drawbook;
import at.schnow265.sketchbook.enchantment.enchants.PullEnchantment;
import at.schnow265.sketchbook.enchantment.enchants.pistoning;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class enchanter {

	
    // Beginn of custom Enchants Section
    // All commented out lines are "incompatible"

    //public static Enchantment LIGHTNING_STRIKER = register("lightning_striker", new LightningStrikerEnchantment(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));
    public static Enchantment PISTONING = register("pistoning", new pistoning(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));
    public static Enchantment PULL = register("pull", new PullEnchantment(Enchantment.Rarity.COMMON, EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));



    // End of custom Enchant Section


    // Registering Enchantments
    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registries.ENCHANTMENT, new Identifier(drawbook.MOD_ID, name), enchantment);
    }
    public static void registerEchanter() {
        drawbook.LOGGER.info("Registering Enchants for " + drawbook.MOD_ID);
    }
}