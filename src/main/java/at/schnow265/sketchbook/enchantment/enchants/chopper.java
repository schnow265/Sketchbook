package at.schnow265.sketchbook.enchantment.enchants;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;

public class chopper extends Enchantment {
    public chopper(Rarity weight, EnchantmentTarget weapon, EquipmentSlot... slot) {
        super(weight, EnchantmentTarget.WEAPON, slot);
    }

    @Override
    public boolean isAvailableForRandomSelection() {
        return false;
    }

    public void onBlockBreak(ItemStack stack, int level, net.minecraft.world.World world, BlockPos pos, PlayerEntity player, ItemUsageContext context) {
        Block block = context.getWorld().getBlockState(context.getBlockPos()).getBlock();
        if (block.equals(Blocks.OAK_LOG) || block.equals(Blocks.SPRUCE_LOG) || block.equals(Blocks.BIRCH_LOG) ||
                block.equals(Blocks.JUNGLE_LOG) || block.equals(Blocks.ACACIA_LOG) || block.equals(Blocks.DARK_OAK_LOG) || block.equals(Blocks.MANGROVE_LOG)) {
            // The block is a log block
            context.getWorld().breakBlock(context.getBlockPos(), true, player);
            int radius = 10;

            for (int x = -radius; x <= radius; x++) {
                for (int y = -radius; y <= radius; y++) {
                    for (int z = -radius; z <= radius; z++) {
                        Block currentBlock = context.getWorld().getBlockState(context.getBlockPos().add(x, y, z)).getBlock();
                        if (currentBlock.equals(block)) {
                            context.getWorld().breakBlock(context.getBlockPos().add(x, y, z), true, player);
                        }
                    }
                }
            }
        }
    }
}
