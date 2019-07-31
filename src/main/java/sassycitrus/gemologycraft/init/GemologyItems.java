package sassycitrus.gemologycraft.init;

import java.util.HashMap;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import sassycitrus.gemologycraft.GemologyCraft;

public class GemologyItems
{
    public static HashMap<String, Item> ITEMS = new HashMap<String, Item>();

    public static Item GEM_AMETHYST = registerItem("gem_amethyst");
    public static Item GEM_SAPPHIRE = registerItem("gem_sapphire");
    public static Item GEM_RUBY = registerItem("gem_ruby");
    public static Item RING_GOLD = registerItem("ring_gold");
    public static Item RING_IRON = registerItem("ring_iron");
    public static Item AMULET_GOLD = registerItem("amulet_gold");
    public static Item AMULET_IRON = registerItem("amulet_iron");

    private static Item registerItem(String name, Item item)
    {
        ITEMS.put(name, item.setRegistryName(GemologyCraft.MODID + ":" + name));
        return item;
    }

    private static Item registerItem(String name)
    {
        return registerItem(name, new Item(new Item.Properties().group(GemologyCraft.ItemGroupGemology)));
    }

    public static void register(IForgeRegistry<Item> registry)
    {
        registry.registerAll(
            ITEMS.values().toArray(new Item[ITEMS.size()])
        );
    }
}