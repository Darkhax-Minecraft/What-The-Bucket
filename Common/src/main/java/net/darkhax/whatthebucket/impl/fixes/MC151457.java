package net.darkhax.whatthebucket.impl.fixes;

import net.darkhax.whatthebucket.mixin.item.AccessorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public final class MC151457 {

    public static void applyFix() {

        setCraftingRemainderIfNull(Items.PUFFERFISH_BUCKET);
        setCraftingRemainderIfNull(Items.SALMON_BUCKET);
        setCraftingRemainderIfNull(Items.COD_BUCKET);
        setCraftingRemainderIfNull(Items.TROPICAL_FISH_BUCKET);
        setCraftingRemainderIfNull(Items.AXOLOTL_BUCKET);
        setCraftingRemainderIfNull(Items.POWDER_SNOW_BUCKET);
        setCraftingRemainderIfNull(Items.TADPOLE_BUCKET);
    }

    private static void setCraftingRemainderIfNull(Item target) {

        if (!target.hasCraftingRemainingItem()) {

            ((AccessorItem) target).bookshelf$setCraftingRemainder(Items.BUCKET);
        }
    }
}
