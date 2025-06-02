package net.rafamode;

import net.fabricmc.api.ModInitializer;

import net.rafamode.block.ModBlocks;
import net.rafamode.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RafaMode implements ModInitializer {
	public static final String MOD_ID = "rafamode";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlock();
	}
}