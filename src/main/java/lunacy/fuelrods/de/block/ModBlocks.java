package lunacy.fuelrods.de.block;

import lunacy.fuelrods.de.FuelRods;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block FUEL_ORE = registerBlock("fuel_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.create().mapColor(MapColor.PALE_YELLOW).instrument(Instrument.BASS).requiresTool().strength(1f, 2f)));
    public static final Block FUEL_BLOCK = registerBlock("fuel_block",
            new Block(FabricBlockSettings.copyOf(Blocks.BIRCH_WOOD).strength(1f, 2f).requiresTool()));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return  Registry.register(Registries.BLOCK, new Identifier(FuelRods.MOD_ID, name), block);
    }

    private static Item registerBlockItem (String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(FuelRods.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        FuelRods.LOGGER.info("Registering ModBlocks for " + FuelRods.MOD_ID);
    }
}