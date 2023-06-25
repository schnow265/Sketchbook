package at.schnow265.sketchbook.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

public class NullGun extends BowItem {
    public NullGun() {
        super(new Settings().maxCount(1));
    }


    @Override
    public TypedActionResult<ItemStack> use(World world, net.minecraft.entity.player.PlayerEntity player, Hand hand) {
        player.setCurrentHand(hand);
        return TypedActionResult.consume(player.getStackInHand(hand));
    }

    @Override
    public void onStoppedUsing(ItemStack stack, World world, LivingEntity user, int remainingUseTicks) {
        if (!world.isClient) {
            int duration = this.getMaxUseTime(stack) - remainingUseTicks;
            float progress = BowItem.getPullProgress(duration); // Calculate the pull progress from duration

            PersistentProjectileEntity projectile = createArrow(world, stack, user, progress * 3.0F); // Adjust the velocity multiplier as per your preference
            projectile.setVelocity(projectile.getVelocity().multiply(progress * 3.0F)); // Adjust the velocity multiplier as per your preference

            projectile.setDamage(-1);

            world.spawnEntity(projectile);
        }
    }

    private ArrowEntity createArrow(World world, ItemStack stack, LivingEntity shooter, float velocityMultiplier) {
        ArrowEntity arrow = new ArrowEntity(world, shooter);
        arrow.initFromStack(stack);
        arrow.setVelocity(arrow.getVelocity().multiply(velocityMultiplier));

        return arrow;
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return -1;
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.NONE; // Set the use action to NONE for instant shooting
    }


    @Override
    public boolean isDamageable() {
        return false; // Make the item indestructible
    }

}
