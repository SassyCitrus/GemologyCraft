package sassycitrus.gemologycraft.block;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class BlockStorageMetal extends Block
{
    public BlockStorageMetal()
    {
        super(
            FabricBlockSettings.of(Material.METAL)
            .strength(3.0F, 5.0F)
            .sounds(BlockSoundGroup.METAL)
            .breakByTool(FabricToolTags.PICKAXES, 0)
            .build()
        );
    }
}