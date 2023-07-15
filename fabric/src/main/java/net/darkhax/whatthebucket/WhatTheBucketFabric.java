package net.darkhax.whatthebucket;

import net.darkhax.whatthebucket.impl.fixes.MC151457;
import net.fabricmc.api.ModInitializer;

public class WhatTheBucketFabric implements ModInitializer {

    @Override
    public void onInitialize() {

        MC151457.applyFix();
    }
}