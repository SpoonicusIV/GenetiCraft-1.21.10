package net.spoonicusiv.geneticraft;

import net.fabricmc.api.ModInitializer;

import net.spoonicusiv.geneticraft.block.ModBlocks;
import net.spoonicusiv.geneticraft.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//test commit
public class GenetiCraft implements ModInitializer {
	public static final String MOD_ID = "geneticraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}