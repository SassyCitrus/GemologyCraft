package sassycitrus.gemologycraft;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import sassycitrus.gemologycraft.init.GemologyBlocks;
import sassycitrus.gemologycraft.init.GemologyItems;

public class GemologyCraft implements ModInitializer
{
    public static final String MODID = "gemologycraft";
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MODID, "creativetab"), () -> new ItemStack(GemologyItems.GEM_RUBY));

    @Override
    public void onInitialize()
    {
        GemologyItems.register();
        GemologyBlocks.register();
        GemologyBlocks.registerItemBlocks();
    }
}
