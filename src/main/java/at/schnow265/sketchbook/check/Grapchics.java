package at.schnow265.sketchbook.check;

import net.fabricmc.loader.api.FabricLoader;
import at.schnow265.sketchbook.check.shenanigins.*;

public class Grapchics {
    public static void optifabric() {
        boolean optifabricPresent = FabricLoader.getInstance().isModLoaded("optifabric");
        boolean optifinePresent = FabricLoader.getInstance().isModLoaded("optifine");

        if (optifabricPresent) {
            crash.opticrasher();
        }
        if (optifinePresent) {
            crash.opticrasher();
        }
    }
}
