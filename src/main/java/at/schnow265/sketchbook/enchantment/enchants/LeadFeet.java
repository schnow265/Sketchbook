package at.schnow265.sketchbook.enchantment.enchants;

import net.minecraft.enchantment.ProtectionEnchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.DamageTypeTags;

public class LeadFeet extends ProtectionEnchantment {

    public LeadFeet(Rarity weight, Type protectionType, EquipmentSlot... slotTypes) {
        super(weight, protectionType, slotTypes);
    }


    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public void onUserDamaged(LivingEntity user, Entity attacker, int level) {
        user.kill();
        super.onUserDamaged(user, attacker, level);
    }
    @Override
    public int getProtectionAmount(int level, DamageSource source) {
        if (source.isIn(DamageTypeTags.BYPASSES_INVULNERABILITY)) {
            return 0;
        }
        if (this.protectionType == Type.ALL) {
            return level * -1;
        }
        if (this.protectionType == Type.FIRE && source.isIn(DamageTypeTags.IS_FIRE)) {
            return level * -2;
        }
        if (this.protectionType == Type.FALL && source.isIn(DamageTypeTags.IS_FALL)) {
            return level * -3;
        }
        if (this.protectionType == Type.EXPLOSION && source.isIn(DamageTypeTags.IS_EXPLOSION)) {
            return level * -2;
        }
        if (this.protectionType == Type.PROJECTILE && source.isIn(DamageTypeTags.IS_PROJECTILE)) {
            return level * -2;
        }
        return 0;
    }

    @Override
    public boolean isTreasure() {
        return true;
    }

    @Override
    public boolean isCursed() {
        return true;
    }


    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        return (stack.isOf(Items.CHAINMAIL_BOOTS) || stack.isOf(Items.DIAMOND_BOOTS) || stack.isOf(Items.GOLDEN_BOOTS) || stack.isOf(Items.IRON_BOOTS) || stack.isOf(Items.LEATHER_BOOTS) || stack.isOf(Items.NETHERITE_BOOTS)) && super.isAcceptableItem(stack);
    }
}
