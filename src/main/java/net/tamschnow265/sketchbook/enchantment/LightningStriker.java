package net.tamschnow265.sketchbook.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

public class LightningStriker extends Enchantment {

    public LightningStriker(Rarity weight, EnchantmentTarget weapon, EquipmentSlot... slot) {
        super(weight, EnchantmentTarget.WEAPON, slot);
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(!user.world.isClient()) {
            ServerWorld world = (ServerWorld)user.world;
            BlockPos position = target.getBlockPos();

            if(level == 1) {
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, null, position,
                        SpawnReason.TRIGGERED, true, true);
            }

            if(level == 2) {
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, null, position,
                        SpawnReason.TRIGGERED, true, true);
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, null, position,
                        SpawnReason.TRIGGERED, true, true);
            }

            if(level == 3) {
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, null, position,
                        SpawnReason.TRIGGERED, true, true);
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, null, position,
                        SpawnReason.TRIGGERED, true, true);
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, null, position,
                        SpawnReason.TRIGGERED, true, true);
            }
        }

        super.onTargetDamaged(user, target, level);
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }
}
