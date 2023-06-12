package net.schnow265.sketchbook.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec3d;

public class PullEnchantment extends Enchantment {

    /**
     This Class provides the Enchantment "Pull", which pulls the Target back to you.

     @author schnow265
     @version 1.0
     @since 2023-05-27
     */
    public PullEnchantment(Rarity rarityIn, EnchantmentTarget targetIn, EquipmentSlot slots) {
        super(rarityIn, targetIn, new EquipmentSlot[]{slots});
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    public boolean canApply(ItemStack stack) {
        return stack.getItem() instanceof net.minecraft.item.SwordItem;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, net.minecraft.entity.Entity target, int level) {
        if (user.world.isClient) {
            return;
        }

        if (!(target instanceof LivingEntity)) {
            return;
        }

        Vec3d direction = user.getPos().subtract(target.getPos()).normalize();
        target.setVelocity(direction.multiply(level * 0.5, level * 0.5, level * 0.5));
    }
}
