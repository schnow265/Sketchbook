package at.schnow265.sketchbook.check.shenanigins;

import net.fabricmc.loader.api.FabricLoader;

public class hehe {
    public static void optipunish() {
        boolean optifabricPresent = FabricLoader.getInstance().isModLoaded("optifabric");
        boolean optifinePresent = FabricLoader.getInstance().isModLoaded("optifine");

        if (optifabricPresent ^ optifinePresent) {
            throw new RuntimeException("That Peace of OptiFabric is instelled, maybe OptiFine too. Crash you!");
        }
    }
}
