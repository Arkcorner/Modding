package lunacy.fuelrods.de.datagen;

import lunacy.fuelrods.de.block.ModBlocks;
import lunacy.fuelrods.de.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FUEL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FUEL_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.FUEL_ROD, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROD, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_FUEL, Models.GENERATED);
    }
}
