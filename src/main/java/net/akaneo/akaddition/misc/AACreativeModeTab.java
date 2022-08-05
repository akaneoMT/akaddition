package net.akaneo.akaddition.misc;

import net.akaneo.akaddition.block.AABlocks;
import net.akaneo.akaddition.item.AAItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class AACreativeModeTab {
    public static final CreativeModeTab AA_ITEM_TAB = new CreativeModeTab("aaitemtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(AAItems.TOPAZ.get());
        }
    };
    public static final CreativeModeTab AA_BLOCK_TAB = new CreativeModeTab("aablocktab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(AABlocks.TOPAZ_BLOCK.get());
        }
    };
}
