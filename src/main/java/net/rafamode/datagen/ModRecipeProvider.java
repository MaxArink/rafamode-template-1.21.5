package net.rafamode.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import net.rafamode.RafaMode;
import net.rafamode.block.ModBlocks;
import net.rafamode.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {

            @Override
            public void generate() {
                List<ItemConvertible> RAFA_SMELTABLES = List.of(ModItems.RAW_RAFA, ModBlocks.RAFA_ORE,
                        ModBlocks.RAFA_DEEPSLATE_ORE);

                offerSmelting(RAFA_SMELTABLES, RecipeCategory.MISC, ModItems.RAFA, 0.25f, 200, "rafa");
                offerBlasting(RAFA_SMELTABLES, RecipeCategory.MISC, ModItems.RAFA, 0.25f, 100, "rafa");

                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.RAFA, RecipeCategory.DECORATIONS, ModBlocks.RAFA_BLOCK);

                createShaped(RecipeCategory.MISC, ModBlocks.RAW_RAFA_BLOCK)
                        .pattern("RRR")
                        .pattern("RRR")
                        .pattern("RRR")
                        .input('R', ModItems.RAW_RAFA)
                        .criterion(hasItem(ModItems.RAW_RAFA), conditionsFromItem(ModItems.RAW_RAFA))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.RAFA_BLOCK)
                        .pattern("RRR")
                        .pattern("RRR")
                        .pattern("RRR")
                        .input('R', ModItems.RAFA)
                        .criterion(hasItem(ModItems.RAFA), conditionsFromItem(ModItems.RAFA))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModItems.RAW_RAFA, 9)
                        .input(ModBlocks.RAW_RAFA_BLOCK)
                        .criterion(hasItem(ModBlocks.RAW_RAFA_BLOCK), conditionsFromItem(ModBlocks.RAW_RAFA_BLOCK))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModItems.RAFA, 9)
                        .input(ModBlocks.RAFA_BLOCK)
                        .criterion(hasItem(ModBlocks.RAFA_BLOCK), conditionsFromItem(ModBlocks.RAFA_BLOCK))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModItems.RAW_RAFA, 32)
                        .input(ModBlocks.MAGIC_BLOCK)
                        .criterion(hasItem(ModBlocks.MAGIC_BLOCK), conditionsFromItem(ModBlocks.MAGIC_BLOCK))
                        .offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(RafaMode.MOD_ID, "ERRRRMmm")));

//                offerSmithingTrimRecipe(ModItems.KAUPEN_SMITHING_TEMPLATE, ModTrimPatterns.KAUPEN,
//                        RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(TutorialMod.MOD_ID, "kaupen")));
            }
        };
    }

    @Override
    public String getName() {
        return "RafaMode Recipe";
    }
}
