package sassycitrus.gemologycraft.item;

import net.minecraft.item.Item;
import sassycitrus.gemologycraft.GemologyCraft;

public class Ring extends Item
{
    public Ring()
    {
        super(
            new Item.Settings().group(GemologyCraft.ITEM_GROUP)
        );
    }
}