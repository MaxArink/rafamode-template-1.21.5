package net.rafamode.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.rafamode.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.MAGIC_BLOCK)
                .add(ModBlocks.RAFA_BLOCK)
                .add(ModBlocks.RAW_RAFA_BLOCK)
                .add(ModBlocks.RAFA_ORE)
                .add(ModBlocks.RAFA_DEEPSLATE_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.RAFA_BLOCK)
                .add(ModBlocks.RAW_RAFA_BLOCK)
                .add(ModBlocks.RAFA_ORE)
                .add(ModBlocks.RAFA_DEEPSLATE_ORE)
                .add(ModBlocks.MAGIC_BLOCK);

    }
}
