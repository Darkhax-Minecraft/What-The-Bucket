package net.darkhax.whatthebucket.common.mixin;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStackTemplate;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(Item.class)
public interface AccessorItem {

    @Mutable
    @Accessor("craftingRemainingItem")
    void whatthebucket$setCraftingRemainder(ItemStackTemplate item);
}
