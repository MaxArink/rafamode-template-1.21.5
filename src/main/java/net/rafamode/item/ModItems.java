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

    public static  final Item RAFA = registerItem("rafa", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RafaMode.MOD_ID,"rafa")))));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(RafaMode.MOD_ID, name), item);
    }

    public static void registerModItems(){
        RafaMode.LOGGER.info("Registering Mod Items for " + RafaMode.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(RAFA);
        });
    }
}
