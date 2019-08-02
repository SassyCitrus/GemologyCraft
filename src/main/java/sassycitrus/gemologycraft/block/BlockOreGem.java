package sassycitrus.gemologycraft.block;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class BlockOreGem extends Block
{
    public BlockOreGem()
    {
        super(
            FabricBlockSettings.of(Material.STONE)
            .strength(3.0F, 5.0F)
            .sounds(BlockSoundGroup.STONE)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .build()
        );
    }

    // @Override
    // public int getExpDrop(BlockState state, IWorldReader world, BlockPos pos, int fortune, int silktouch)
    // {
    //     Random random = world instanceof World ? ((World) world).rand : new Random();
    //     return silktouch == 0 ? MathHelper.nextInt(random, 3, 7) : 0;
    // }
}