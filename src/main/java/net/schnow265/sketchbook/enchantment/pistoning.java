package net.schnow265.sketchbook.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

public class pistoning extends Enchantment {

    /**
        This Class provides the Enchantment "Pistoning", which adds more knockback.

        @author schnow265
        @version 1.0
        @since 2023-05-27
     */

    public pistoning(Rarity weight, EnchantmentTarget weapon, EquipmentSlot... slot) {
        super(weight, EnchantmentTarget.WEAPON, slot);
    }

    @Override
    public int getMinPower(int level) {
        return 30 + 200 * (level + 500);
    }

    @Override
    public int getMaxPower(int level) {
        return super.getMinPower(level) + 1000;
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    @Override
    public boolean isTreasure() {
        return true;
    }

    @Override
    public boolean isAvailableForEnchantedBookOffer() {
        return true;
    }

    @Override
    public boolean isAvailableForRandomSelection() {
        return false;
    }

}
