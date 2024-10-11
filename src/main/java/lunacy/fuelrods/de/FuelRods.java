package lunacy.fuelrods.de;

import lunacy.fuelrods.de.block.ModBlocks;
import lunacy.fuelrods.de.item.ModItemGroups;
import lunacy.fuelrods.de.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FuelRods implements ModInitializer {
	public static final String MOD_ID = "fuelrods";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		LOGGER.info("Hello Fabric world!");
	}
}