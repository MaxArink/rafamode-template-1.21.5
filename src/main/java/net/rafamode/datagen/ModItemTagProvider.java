package net.rafamode.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.rafamode.item.ModItems;
import net.rafamode.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(ModItems.CAULIFLOWER)
                .add(Items.DIAMOND)
                .add(Items.IRON_INGOT)
                .add(Items.COPPER_INGOT)
                .add(Items.NETHERITE_INGOT)
                .add(Items.EMERALD)
                .add(Items.LAPIS_LAZULI)
                .add(Items.COAL)
                .add(Items.AMETHYST_SHARD)
                .add(Items.REDSTONE)
                .add(Items.GOLD_INGOT);
    }
}
