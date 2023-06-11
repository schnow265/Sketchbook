package net.schnow265.sketchbook.magic;

import net.schnow265.sketchbook.drawbook;
import static net.schnow265.sketchbook.magic.MagicItems.registerMagicItemsToMod;


public class magicLoader {



    public static void registerMagic() {
        drawbook.LOGGER.info("Registering Magic for " + drawbook.MOD_ID);
        registerMagicItemsToMod();

        drawbook.LOGGER.info("Done Registering Magic for " + drawbook.MOD_ID);
    }
}
