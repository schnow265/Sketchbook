package net.schnow265.sketchbook;

import net.fabricmc.api.ModInitializer;
import net.schnow265.sketchbook.enchantment.enchanter;
import net.schnow265.sketchbook.item.ModItems;
import net.schnow265.sketchbook.magic.magicLoader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class drawbook implements ModInitializer {

	/**
	 * This code is responsible for activating the mod and adding Items and enchants.
	 *
	 * @author schnow265
	 */


	public static final String MOD_ID ="sketchbook";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Opening Sketchbook..."); // Starting the loading of my mod.
		
		ModItems.registerModItems();
		enchanter.registerEchanter();
		magicLoader.registerMagic();

		LOGGER.info("Blueprints loaded!"); // If this message appears in your Logs, my mod is not the crash cause.
	}
}
