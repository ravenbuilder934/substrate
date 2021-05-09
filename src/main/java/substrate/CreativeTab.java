package substrate;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import substrate.registry.ItemRegistry;

public final class CreativeTab
{
    public static final ItemGroup SUBSTRATE = new ItemGroup(Substrate.MOD_ID)
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(ItemRegistry.copperpipe_item.get());
        }

        @Override
        public boolean hasSearchBar()
        {
            return false;
        }
    };

}