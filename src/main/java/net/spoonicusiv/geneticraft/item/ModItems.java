package net.spoonicusiv.geneticraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.spoonicusiv.geneticraft.GenetiCraft;

public class ModItems {

    public static final Item PLASTIC_BRICK = registerItem("plastic_brick", new Item(new Item.Settings().
            registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GenetiCraft.MOD_ID,"plastic_brick")))));

    public static final  Item PLASTIC_PELLET = registerItem("plastic_pellet", new Item(new Item.Settings().
            registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GenetiCraft.MOD_ID,"plastic_pellet")))));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(GenetiCraft.MOD_ID, name), item);
    }


    public static void registerModItems() {
        GenetiCraft.LOGGER.info("Registering Mod Items for " + GenetiCraft.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PLASTIC_BRICK);
            entries.add(PLASTIC_PELLET);
        });
    }
}
