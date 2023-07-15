package net.darkhax.whatthebucket;

import net.darkhax.whatthebucket.impl.fixes.MC151457;
import net.minecraftforge.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class WhatTheBucketForge {

    public WhatTheBucketForge() {

        MC151457.applyFix();
    }
}