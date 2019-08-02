package sassycitrus.gemologycraft.init;

import java.util.HashMap;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import sassycitrus.gemologycraft.GemologyCraft;

public class GemologyItems
{
    private static HashMap<String, Item> ITEMS = new HashMap<String, Item>();
    
    public static final Item GEM_AMETHYST = registerItem("gem_amethyst");
    public static final Item GEM_SAPPHIRE = registerItem("gem_sapphire");
    public static final Item GEM_RUBY = registerItem("gem_ruby");
    public static final Item RING_GOLD = registerItem("ring_gold");
    public static final Item RING_IRON = registerItem("ring_iron");
    public static final Item AMULET_GOLD = registerItem("amulet_gold");
    public static final Item AMULET_IRON = registerItem("amulet_iron");

    public static Item registerItem(String name, Item item)
    {
        ITEMS.put(name, item);
        return item;
    }

    public static Item registerItem(String name)
    {
        return registerItem(name, new Item(new Item.Settings().group(GemologyCraft.ITEM_GROUP)));
    }

    public static void register()
    {
        for (String name : ITEMS.keySet())
        {
            Registry.register(Registry.ITEM, new Identifier(GemologyCraft.MODID, name), ITEMS.get(name));
        }
    }
}