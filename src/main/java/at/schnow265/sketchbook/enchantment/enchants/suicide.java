package at.schnow265.sketchbook.enchantment.enchants;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

public class suicide extends Enchantment {
    public suicide(Rarity weight, EnchantmentTarget type, EquipmentSlot slotTypes) {
        super(weight, type, new EquipmentSlot[]{slotTypes});
    }

    @Override
    public int getMaxLevel() {
        return 10;
    }

    @Override
    public boolean isAvailableForRandomSelection() {
        return false;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (!user.getWorld().isClient()) {
            ServerWorld world = (ServerWorld) user.getWorld();
            BlockPos position = target.getBlockPos();

            for (int i = 0; i < level; i++) {
                EntityType.TNT.spawn(world, position, null);
                EntityType.TNT.spawn(world, position, null);
                EntityType.TNT.spawn(world, position, null);

                ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 10, level - 20));
                ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 90 * 2 * level, level - 1));

                ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 20 * 2 * level, level - 1));
                ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 20 * 2 * level, level - 1));
                ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 20 * 2 * level, level - 1));
                ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 20 * 2 * level, level - 1));

                ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 50, level - 255));
            }

        }

        super.onTargetDamaged(user, target, level);
    }
}
