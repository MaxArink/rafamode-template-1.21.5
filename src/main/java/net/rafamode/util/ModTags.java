package net.rafamode.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.rafamode.RafaMode;

public class ModTags {

    public static class Blocks {
        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(RafaMode.MOD_ID, name));
        }
    }

    public static class Items {

        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transform_items");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(RafaMode.MOD_ID, name));
        }
    }
}
