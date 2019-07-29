package sassycitrus.gemologycraft.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class BlockOreGem extends Block
{
    public BlockOreGem()
    {
        super(
            Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(3.0F, 5.0F)
            .sound(SoundType.STONE)
            .harvestTool(ToolType.PICKAXE)
            .harvestLevel(2)
        );
    }

    @Override
    public int getExpDrop(BlockState state, IWorldReader world, BlockPos pos, int fortune, int silktouch)
    {
        Random random = world instanceof World ? ((World) world).rand : new Random();
        return silktouch == 0 ? MathHelper.nextInt(random, 3, 7) : 0;
    }
}