package net.darkhax.whatthebucket.mixin.item;

import net.minecraft.world.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(Item.class)
public interface AccessorItem {

    @Mutable
    @Accessor("craftingRemainingItem")
    void whatthebucket$setCraftingRemainder(Item item);
}
