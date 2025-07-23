package net.eris.randomstuff.block;

import net.eris.randomstuff.RandomStuff;
import net.eris.randomstuff.block.custom.PoisonMushroomBlock;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block POISON_MUSHROOM_FULL_BLOCK = registerBlock("poison_mushroom_full_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(0.2f)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));

    public static final Block POISON_MUSHROOM_BLOCK = registerBlock( "poison_mushroom_block",
            new PoisonMushroomBlock(AbstractBlock.Settings.create()
                    .nonOpaque()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .noCollision()
                    .pistonBehavior(PistonBehavior.DESTROY)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(RandomStuff.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(RandomStuff.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        RandomStuff.LOGGER.info("Registering mod blocks for " + RandomStuff.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.POISON_MUSHROOM_BLOCK);
            fabricItemGroupEntries.add(ModBlocks.POISON_MUSHROOM_FULL_BLOCK);
        });
    }

}
