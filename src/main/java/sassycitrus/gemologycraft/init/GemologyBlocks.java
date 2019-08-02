package sassycitrus.gemologycraft.init;

import java.util.HashMap;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
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
        BLOCKS.put(name, block);
        return block;
    }

    public static void register()
    {
        for (String name : BLOCKS.keySet())
        {
            Registry.register(Registry.BLOCK, new Identifier(GemologyCraft.MODID, name), BLOCKS.get(name));
        }
    }

    public static void registerItemBlocks()
    {
        for (String name : BLOCKS.keySet())
        {
            BlockItem item = new BlockItem(BLOCKS.get(name), new Item.Settings().group(GemologyCraft.ITEM_GROUP));
            Registry.register(Registry.ITEM, new Identifier(GemologyCraft.MODID, name), item);
        }
    }
}