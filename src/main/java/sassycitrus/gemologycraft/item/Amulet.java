package sassycitrus.gemologycraft.item;

import net.minecraft.item.Item;
import sassycitrus.gemologycraft.GemologyCraft;

public class Amulet extends Item
{
    public Amulet()
    {
        super(
            new Item.Settings().group(GemologyCraft.ITEM_GROUP)
        );
    }
}