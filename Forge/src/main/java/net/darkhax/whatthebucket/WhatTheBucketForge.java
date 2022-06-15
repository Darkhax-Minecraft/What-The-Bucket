package net.darkhax.whatthebucket;

import net.darkhax.whatthebucket.impl.fixes.MC151457;
import net.minecraftforge.fml.IExtensionPoint;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.network.NetworkConstants;

@Mod(Constants.MOD_ID)
public class WhatTheBucketForge {

    public WhatTheBucketForge() {

        ModLoadingContext.get().registerExtensionPoint(IExtensionPoint.DisplayTest.class, () -> new IExtensionPoint.DisplayTest(() -> NetworkConstants.IGNORESERVERONLY, (a, b) -> true));
        MC151457.applyFix();
    }
}