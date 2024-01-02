package net.darkhax.whatthebucket;

import net.darkhax.whatthebucket.impl.fixes.MC151457;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class WhatTheBucketNeoForge {

    public WhatTheBucketNeoForge() {

        MC151457.applyFix();
    }
}