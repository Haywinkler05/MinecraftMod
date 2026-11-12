package net.placeholder.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;
import net.placeholder.tutorialmod.block.Modblocks;
import net.placeholder.tutorialmod.creativemodetab.ModCreativeModeTabs;
import net.placeholder.tutorialmod.item.ModItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorial-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItem.registerModItems();
		ModCreativeModeTabs.registerModCreativeModeTabs();
		Modblocks.registerModBlocks();
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
