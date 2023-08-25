package at.schnow265.sketchbook.item.custom.choppers;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

import java.util.List;

public class TreeChopper extends AxeItem {

    public TreeChopper(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        PlayerEntity player = context.getPlayer();
        if (player != null) {
            boolean isShiftHeld = InputUtil.isKeyPressed(MinecraftClient.getInstance().getWindow().getHandle(), GLFW.GLFW_KEY_LEFT_SHIFT) || InputUtil.isKeyPressed(MinecraftClient.getInstance().getWindow().getHandle(), GLFW.GLFW_KEY_RIGHT_SHIFT);

            Block block = context.getWorld().getBlockState(context.getBlockPos()).getBlock();
            if (block.equals(Blocks.OAK_LOG) || block.equals(Blocks.SPRUCE_LOG) || block.equals(Blocks.BIRCH_LOG) ||
                    block.equals(Blocks.JUNGLE_LOG) || block.equals(Blocks.ACACIA_LOG) || block.equals(Blocks.DARK_OAK_LOG) ||
                    block.equals(Blocks.MANGROVE_LOG) || block.equals(Blocks.CHERRY_LOG)) {
                // The block is a log block
                context.getWorld().breakBlock(context.getBlockPos(), true, player);
                int radius = isShiftHeld ? 50 : 10; // Change the radius based on whether Shift is held or not

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
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltips.choppy.shift").formatted(Formatting.RED));
        } else {
            tooltip.add(Text.translatable("tooltips.choppy.nshift").formatted(Formatting.WHITE));
        }

        super.appendTooltip(stack, world, tooltip, context);
    }
}
