package at.schnow265.sketchbook.item.custom.choppers;

import at.schnow265.sketchbook.drawbook;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TreeStroyer extends AxeItem {
    public TreeStroyer(ToolMaterial material, float attackDamage, float attackSpeed, Item.Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        PlayerEntity player = context.getPlayer();
        if (player != null && !player.isSneaking()) {
            Block block = context.getWorld().getBlockState(context.getBlockPos()).getBlock();
            if (block.equals(Blocks.OAK_LOG) || block.equals(Blocks.SPRUCE_LOG) || block.equals(Blocks.BIRCH_LOG) || block.equals(Blocks.JUNGLE_LOG) || block.equals(Blocks.ACACIA_LOG) || block.equals(Blocks.DARK_OAK_LOG) || block.equals(Blocks.MANGROVE_LOG) || block.equals(Blocks.CHERRY_LOG)) {
                // The block is a log block
                context.getWorld().breakBlock(context.getBlockPos(), true, player);
                int radius = 350; // the radius of the tree
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
                drawbook.LOGGER.warn("If you are reading this, you did this to yourself!");
                return ActionResult.SUCCESS;
            }
        }
        return super.useOnBlock(context);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltips.ts.warning").formatted(Formatting.RED, Formatting.BOLD));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
