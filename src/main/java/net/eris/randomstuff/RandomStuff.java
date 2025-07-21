package net.eris.randomstuff;

import net.eris.randomstuff.block.ModBlocks;
import net.eris.randomstuff.item.custom.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//random comment
public class RandomStuff implements ModInitializer {
	public static final String MOD_ID = "randomstuff";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POISON_MUSHROOM_BLOCK, RenderLayer.getCutout());
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}