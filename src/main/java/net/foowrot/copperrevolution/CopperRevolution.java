package net.foowrot.copperrevolution;

import net.fabricmc.api.ModInitializer;
import net.foowrot.copperrevolution.block.ModBlocks;
import net.foowrot.copperrevolution.block.entity.ModBlockEnitites;
import net.foowrot.copperrevolution.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CopperRevolution implements ModInitializer {

	public static final String MOD_ID = "copperrevolution";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModBlockEnitites.registerBlockEnities();
	}
}
