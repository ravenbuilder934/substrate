package substrate;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public final class CreativeTab
{
    public static final ItemGroup SUBSTRATE = new ItemGroup(Util.MOD_ID)
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(ItemRegistry.copperbeam_item.get());
        }

        @Override
        public boolean hasSearchBar()
        {
            return false;
        }
    };

}