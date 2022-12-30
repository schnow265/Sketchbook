package net.tamschnow265.sketchbook.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

public class pistoning extends Enchantment {
    public pistoning(Rarity weight, EnchantmentTarget weapon, EquipmentSlot... slot) {
        super(weight, EnchantmentTarget.WEAPON, slot);
    }

    public int getMinPower(int level) {
        return 30 + 200 * (level + 500);
    }

    public int getMaxPower(int level) {
        return super.getMinPower(level) + 1000;
    }

    public int getMaxLevel() {
        return 5;
    }


    public boolean isTreasure() {
        return true;
    }

    public boolean isAvailableForEnchantedBookOffer() {
        return false;
    }

    public boolean isAvailableForRandomSelection() {
        return false;
    }

}