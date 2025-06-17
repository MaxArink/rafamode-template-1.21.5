package net.rafamode.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.rafamode.RafaMode;
import net.rafamode.block.custom.MagicBlock;

import java.util.function.Function;

public class ModBlocks {

    public static final Block RAFA_BLOCK = registerBlock("rafa_block",
            properties -> new Block(properties.strength(100f)
                    .requiresTool().sounds(BlockSoundGroup.FROGLIGHT)));

    public static final Block RAW_RAFA_BLOCK = registerBlock("raw_rafa_block",
            properties -> new Block(properties.strength(0f)
                    .requiresTool()));

    public static final Block RAFA_ORE = registerBlock("rafa_ore",
            properties -> new ExperienceDroppingBlock(UniformIntProvider.create(100, 1000),
                    properties.strength(10f, 1000f).requiresTool()));

    public static final Block RAFA_DEEPSLATE_ORE = registerBlock("rafa_deepslate_ore",
            properties -> new ExperienceDroppingBlock(UniformIntProvider.create(200, 2000),
                    properties.strength(20f, 1000f).requiresTool()));

    public static final Block MAGIC_BLOCK = registerBlock("magic_block",
            properties -> new MagicBlock(properties.strength(10000f, 1000f).requiresTool()));

    public static final Block RAFA_STAIRS = registerBlock("rafa_stairs",
            properties -> new StairsBlock(ModBlocks.RAFA_BLOCK.getDefaultState(),
                    properties.strength(100f).requiresTool()));

    public static final Block RAFA_SLAB = registerBlock("rafa_slab",
            properties -> new SlabBlock(properties.strength(100f).requiresTool()));

    public static final Block RAFA_BUTTON = registerBlock("rafa_button",
            properties -> new ButtonBlock(BlockSetType.IRON, 2,properties.strength(100f).requiresTool().noCollision()));

    public static final Block RAFA_PRESSURE_PLATE = registerBlock("rafa_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.IRON,properties.strength(100f).requiresTool()));


    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> function) {
        Block toRegister = function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RafaMode.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(Registries.BLOCK, Identifier.of(RafaMode.MOD_ID, name), toRegister);
    }

    private static Block registerBlockWithoutBlockItem(String name, Function<AbstractBlock.Settings, Block> function) {
        return Registry.register(Registries.BLOCK, Identifier.of(RafaMode.MOD_ID, name),
                function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RafaMode.MOD_ID, name)))));
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(RafaMode.MOD_ID, name),
                new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RafaMode.MOD_ID, name)))));
    }

    public static void registerModBlock(){
        RafaMode.LOGGER.info("Regestering Mod Blocks for " + RafaMode.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries ->{
            entries.add(ModBlocks.RAFA_BLOCK);
            entries.add(ModBlocks.RAW_RAFA_BLOCK);
            entries.add(ModBlocks.RAFA_ORE);
            entries.add(ModBlocks.RAFA_DEEPSLATE_ORE);
            entries.add(ModBlocks.RAFA_STAIRS);
            entries.add(ModBlocks.RAFA_SLAB);
            entries.add(ModBlocks.RAFA_PRESSURE_PLATE);
            entries.add(ModBlocks.RAFA_BUTTON);
        });
    }


}
