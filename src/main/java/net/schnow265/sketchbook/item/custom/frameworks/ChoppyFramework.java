package net.schnow265.sketchbook.item.custom.frameworks;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.ActionResult;

public class ChoppyFramework extends AxeItem {
    public ChoppyFramework(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        PlayerEntity player = context.getPlayer();
        if (player != null && !player.isSneaking()) {
            Block block = context.getWorld().getBlockState(context.getBlockPos()).getBlock();
            if (block.equals(Blocks.OAK_LOG) || block.equals(Blocks.SPRUCE_LOG) || block.equals(Blocks.BIRCH_LOG) ||
                    block.equals(Blocks.JUNGLE_LOG) || block.equals(Blocks.ACACIA_LOG) || block.equals(Blocks.DARK_OAK_LOG) || block.equals(Blocks.MANGROVE_LOG)) {
                // The block is a log block
                context.getWorld().breakBlock(context.getBlockPos(), true, player);
                int radius = 5; // the radius of the tree
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
                return ActionResult.SUCCESS;
            }
        }
        return super.useOnBlock(context);
    }
}