package sassycitrus.gemologycraft.init;

import java.util.HashMap;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import sassycitrus.gemologycraft.GemologyCraft;
import sassycitrus.gemologycraft.block.BlockOreGem;
import sassycitrus.gemologycraft.block.BlockStorageMetal;

public class GemologyBlocks
{
    public static HashMap<String, Block> BLOCKS = new HashMap<String, Block>();

    public static Block ORE_AMETHYST = registerBlock("ore_amethyst", new BlockOreGem());
    public static Block ORE_SAPPHIRE = registerBlock("ore_sapphire", new BlockOreGem());
    public static Block ORE_RUBY = registerBlock("ore_ruby", new BlockOreGem());

    public static Block AMETHYST_BLOCK = registerBlock("amethyst_block", new BlockStorageMetal());
    public static Block SAPPHIRE_BLOCK = registerBlock("sapphire_block", new BlockStorageMetal());
    public static Block RUBY_BLOCK = registerBlock("ruby_block", new BlockStorageMetal());

    private static Block registerBlock(String name, Block block)
    {
        BLOCKS.put(name, block.setRegistryName(GemologyCraft.MODID + ":" + name));
        return BLOCKS.get(name);
    }

    public static void register(IForgeRegistry<Block> registry)
    {
        registry.registerAll(
            BLOCKS.values().toArray(new Block[BLOCKS.size()])
        );
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry)
    {
        for (Block block : BLOCKS.values())
        {
            registry.register(
                new BlockItem(block, new Item.Properties().group(GemologyCraft.ItemGroupGemology)).setRegistryName(block.getRegistryName())
            );
        }
    }
}