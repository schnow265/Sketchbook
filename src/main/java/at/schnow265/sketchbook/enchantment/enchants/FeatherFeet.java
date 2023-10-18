package at.schnow265.sketchbook.enchantment.enchants;

import net.minecraft.enchantment.ProtectionEnchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.DamageTypeTags;

public class FeatherFeet extends ProtectionEnchantment {

    public FeatherFeet(Rarity weight, Type protectionType, EquipmentSlot... slotTypes) {
        super(weight, protectionType, slotTypes);
    }


    @Override
    public int getMaxLevel() {
        return 5;
    }

    @Override
    public int getProtectionAmount(int level, DamageSource source) {
        if (this.protectionType == Type.FALL && source.isIn(DamageTypeTags.IS_FALL)) {
            return level * 30;
        }
        return 0;
    }

    @Override
    public boolean isTreasure() {
        return true;
    }

    @Override
    public boolean isAvailableForRandomSelection() {
        return false;
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        return (stack.isOf(Items.CHAINMAIL_BOOTS) || stack.isOf(Items.DIAMOND_BOOTS) || stack.isOf(Items.GOLDEN_BOOTS) || stack.isOf(Items.IRON_BOOTS) || stack.isOf(Items.LEATHER_BOOTS) || stack.isOf(Items.NETHERITE_BOOTS)) && super.isAcceptableItem(stack);
    }
}
