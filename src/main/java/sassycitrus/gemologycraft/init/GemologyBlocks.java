package sassycitrus.gemologycraft.init;

import java.util.HashMap;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import sassycitrus.gemologycraft.GemologyCraft;

public class GemologyBlocks
{
    public static HashMap<String, Block> BLOCKS = new HashMap<String, Block>();

    public static Block ORE_RUBY = registerBlock("ore_ruby", new Block(Block.Properties.create(Material.ROCK)));

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