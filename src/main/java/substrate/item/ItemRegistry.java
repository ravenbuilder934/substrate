package substrate.item;

import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import substrate.Substrate;

import static substrate.block.BlockRegistry.*;

public class ItemRegistry
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Substrate.MOD_ID);

    public static final RegistryObject<TallBlockItem> copperdoor_item = ITEMS.register("copperdoor", () -> new TallBlockItem(copperdoor.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

    public static final RegistryObject<TallBlockItem> aluminiumdoor_item = ITEMS.register("aluminiumdoor", () -> new TallBlockItem(aluminiumdoor.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

    public static final RegistryObject<TallBlockItem> steeldoor_item = ITEMS.register("steeldoor", () -> new TallBlockItem(steeldoor.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

    public static final RegistryObject<TallBlockItem> castirondoor_item = ITEMS.register("castirondoor", () -> new TallBlockItem(castirondoor.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

    public static final RegistryObject<TallBlockItem> rustydoor_item = ITEMS.register("rustydoor", () -> new TallBlockItem(rustydoor.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
}
