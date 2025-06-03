package net.rafamode.item;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.rafamode.RafaMode;
import net.rafamode.item.custom.ChiselItem;

import java.util.function.Function;

public class ModItems {

    public static final Item RAFA = registerItem("rafa", Item::new);
    public static final Item RAW_RAFA = registerItem("raw_rafa", Item::new);

    public static final Item CHISEL = registerItem("chisel", setting -> new ChiselItem(setting.maxDamage(64)));

    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(RafaMode.MOD_ID, name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RafaMode.MOD_ID, name)))));
    }

    public static void registerModItems(){
        RafaMode.LOGGER.info("Registering Mod Items for " + RafaMode.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(RAFA);
            entries.add(RAW_RAFA);
        });

    }
}
