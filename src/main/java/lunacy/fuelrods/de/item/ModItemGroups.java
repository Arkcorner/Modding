package lunacy.fuelrods.de.item;

import lunacy.fuelrods.de.FuelRods;
import lunacy.fuelrods.de.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup FUEL_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(FuelRods.MOD_ID, "fuel"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.fuel"))
                    .icon(() -> new ItemStack(ModItems.FUEL_ROD)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ROD);
                        entries.add(ModBlocks.FUEL_ORE);
                        entries.add(ModItems.RAW_FUEL);
                        entries.add(ModItems.FUEL_ROD);
                        entries.add(ModBlocks.FUEL_BLOCK);
                        entries.add(Items.COAL);
                    }).build());

    public static void registerItemGroups() {
        FuelRods.LOGGER.info("Registering ItemGroup for " + FuelRods.MOD_ID);
    }
}
