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

public class ModItems {

    public static  final Item RAFA = registerItem("rafa", new Item.Settings());
    public static  final Item RAW_RAFA = registerItem("raw_rafa", new Item.Settings());

    private static Item registerItem(String name, Item.Settings itemSettings){
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RafaMode.MOD_ID, name));
        Item item = new Item(itemSettings.registryKey(key));
        return Registry.register(Registries.ITEM, key, item);
    }

    public static void registerModItems(){
        RafaMode.LOGGER.info("Registering Mod Items for " + RafaMode.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(RAFA);
            entries.add(RAW_RAFA);
        });

    }
}
