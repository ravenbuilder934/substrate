package substrate;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class Util
{
    /**
     * Used when registering the trapdoor blocks. Makes sure mobs don't spawn on them
     */
    public static Boolean never(BlockState p_235427_0_, IBlockReader p_235427_1_, BlockPos p_235427_2_, EntityType<?> p_235427_3_)
    {
        return false;
    }

    public static final String MOD_ID = "substrate";
}
