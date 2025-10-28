package com.biel.mod;

import com.mojang.logging.LogUtils;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;

public class imfast implements ModInitializer {
    public static final Logger LOGGER = LogUtils.getLogger();


    @Override
    public void onInitialize() {
        LOGGER.info("imfast mod initialized");
    }
}
