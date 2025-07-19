package net.eris.randomstuff.item;

import net.eris.randomstuff.RandomStuff;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item POISON_MUSHROOM = registerItem("poison_mushroom", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(RandomStuff.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RandomStuff.LOGGER.info("Registering mod items for " + RandomStuff.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(POISON_MUSHROOM);
        });
    }
}
