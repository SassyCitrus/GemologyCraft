package sassycitrus.gemologycraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BlockStorageMetal extends Block
{
    public BlockStorageMetal()
    {
        super(
            Block.Properties.create(Material.IRON)
            .hardnessAndResistance(3.0F, 5.0F)
            .harvestTool(ToolType.PICKAXE)
            .harvestLevel(0)
            .sound(SoundType.METAL)
        );
    }
}