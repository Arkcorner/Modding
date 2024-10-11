package lunacy.fuelrods.de.item;

import lunacy.fuelrods.de.FuelRods;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item FUEL_ROD = registerItem("fuel_rod", new Item(new FabricItemSettings()));
    public static final Item ROD = registerItem("rod", new Item(new FabricItemSettings()));
    public static final Item RAW_FUEL = registerItem("raw_fuel", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(FUEL_ROD);
        entries.add(ROD);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(FuelRods.MOD_ID, name), item);
    }
    public static void registerModItems() {
        FuelRods.LOGGER.info("Registering Mod Items for " + FuelRods.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
