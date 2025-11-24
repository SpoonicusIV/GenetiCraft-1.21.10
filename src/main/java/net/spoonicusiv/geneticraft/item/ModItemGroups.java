package net.spoonicusiv.geneticraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.spoonicusiv.geneticraft.GenetiCraft;
import net.spoonicusiv.geneticraft.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup GENETICRAFT_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(GenetiCraft.MOD_ID, "geneticraft_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.MICROFUGE_TUBE_EMPTY))
                    .displayName(Text.translatable("itemgroup.geneticraft.geneticraft_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.MICROFUGE_TUBE_EMPTY);
                        entries.add(ModItems.PLASTIC_BRICK);
                        entries.add(ModItems.PLASTIC_PELLET);
                    }).build());

    public static final ItemGroup GENETICRAFT_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(GenetiCraft.MOD_ID, "geneticraft_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.MIXER_BLOCK))
                    .displayName(Text.translatable("itemgroup.geneticraft.geneticraft_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.MIXER_BLOCK);
                    }).build());




    public static void registerItemGroups() {
        GenetiCraft.LOGGER.info("Registering Item Groups for " + GenetiCraft.MOD_ID);
    }
}
