package com.geenium.items;

import com.geenium.mixin.ItemAccessor;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ObsidianOrb extends Item {

    public ObsidianOrb(Settings settings) {
        super(settings);
        //Sets this item as it own recipe remainder via a mixin
        ((ItemAccessor) this).returnOrb(this);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        if (!world.isClient()) {
            Block block = world.getBlockState(context.getBlockPos()).getBlock();
            BlockPos pos = context.getBlockPos();

            if (block == Blocks.COBBLESTONE) {
                world.setBlockState(pos, Blocks.NETHERRACK.getDefaultState());
                return ActionResult.SUCCESS;
            } else if (block == Blocks.SAND || block == Blocks.RED_SAND) {
                world.setBlockState(pos, Blocks.SOUL_SAND.getDefaultState());
                return ActionResult.SUCCESS;
            } else if (block == Blocks.STONE_BRICKS) {
                world.setBlockState(pos, Blocks.NETHER_BRICKS.getDefaultState());
                return ActionResult.SUCCESS;
            } else if (block == Blocks.RED_MUSHROOM || block == Blocks.BROWN_MUSHROOM) {
                world.setBlockState(pos, Blocks.AIR.getDefaultState());
                world.spawnEntity(new ItemEntity(world, pos.getX() + 0.5D, pos.getY(), pos.getZ() + 0.5D, new ItemStack(Items.NETHER_WART)));
                return ActionResult.SUCCESS;
            }
        }
        return ActionResult.PASS;
    }
}
