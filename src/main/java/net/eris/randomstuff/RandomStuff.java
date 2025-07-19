package net.eris.randomstuff;

import net.eris.randomstuff.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//random comment
public class RandomStuff implements ModInitializer {
	public static final String MOD_ID = "randomstuff";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}