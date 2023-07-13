package at.schnow265.sketchbook.magic;

import at.schnow265.sketchbook.drawbook;
import at.schnow265.sketchbook.check.*;


public class magicLoader {



    public static void registerMagic() {
        checkloader.checkcrash();
        drawbook.LOGGER.info("Registering Magic for " + drawbook.MOD_ID);

        MagicItems.registerMagicItemsToMod();

        drawbook.LOGGER.info("Done Registering Magic for " + drawbook.MOD_ID);
    }
}
