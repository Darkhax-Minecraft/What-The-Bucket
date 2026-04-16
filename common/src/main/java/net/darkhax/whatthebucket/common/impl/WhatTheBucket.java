package net.darkhax.whatthebucket.common.impl;

import net.darkhax.whatthebucket.common.mixin.AccessorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WhatTheBucket {

    public static final String MOD_ID = "whatthebucket";
    public static final String MOD_NAME = "WhatTheBucket";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);

    public static void fixMC151457() {
        setCraftingRemainderIfNull(Items.PUFFERFISH_BUCKET);
        setCraftingRemainderIfNull(Items.SALMON_BUCKET);
        setCraftingRemainderIfNull(Items.COD_BUCKET);
        setCraftingRemainderIfNull(Items.TROPICAL_FISH_BUCKET);
        setCraftingRemainderIfNull(Items.AXOLOTL_BUCKET);
        setCraftingRemainderIfNull(Items.POWDER_SNOW_BUCKET);
        setCraftingRemainderIfNull(Items.TADPOLE_BUCKET);
    }

    private static void setCraftingRemainderIfNull(Item target) {
        if (target.getCraftingRemainder() == null) {
            ((AccessorItem) target).whatthebucket$setCraftingRemainder(new ItemStackTemplate(Items.BUCKET));
        }
    }
}