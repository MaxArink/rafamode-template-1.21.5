package net.rafamode.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.rafamode.RafaMode;
import net.rafamode.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup RAFA_MODE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RafaMode.MOD_ID, "rafa_mode_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RAFA))
                    .displayName(Text.translatable("itemgroup.rafamode.rafa_mode_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RAFA);
                        entries.add(ModItems.RAW_RAFA);
                        entries.add(ModItems.CHISEL);
                    }).build());

    public static final ItemGroup RAFA_MODE_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RafaMode.MOD_ID, "rafa_mode_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.RAFA_BLOCK))
                    .displayName(Text.translatable("itemgroup.rafamode.rafa_mode_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.RAFA_BLOCK);
                        entries.add(ModBlocks.RAW_RAFA_BLOCK);

                        entries.add(ModBlocks.RAFA_ORE);
                        entries.add(ModBlocks.RAFA_DEEPSLATE_ORE);

                        entries.add(ModBlocks.MAGIC_BLOCK);
                    }).build());

    public static void registerItemGroups(){
        RafaMode.LOGGER.info("Registering Item Groups for " + RafaMode.MOD_ID);

    }
}
