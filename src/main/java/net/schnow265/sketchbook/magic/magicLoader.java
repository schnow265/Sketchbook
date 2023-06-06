package net.schnow265.sketchbook.magic;

import net.schnow265.sketchbook.drawbook;
import static net.schnow265.sketchbook.magic.MagicItems.registerMagicItems;


public class magicLoader {



    public static void registerMagic() {
        drawbook.LOGGER.info("Registering Items for " + drawbook.MOD_ID);
        registerMagicItems();
    }
}
