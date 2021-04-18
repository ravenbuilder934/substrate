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

    public static final RegistryObject<BlockItem> coppertrapdoor_item = ITEMS.register("coppertrapdoor", () -> new BlockItem(coppertrapdoor.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
    public static final RegistryObject<BlockItem> aluminiumtrapdoor_item = ITEMS.register("aluminiumtrapdoor", () -> new BlockItem(aluminiumtrapdoor.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
    public static final RegistryObject<BlockItem> steeltrapdoor_item = ITEMS.register("steeltrapdoor", () -> new BlockItem(steeltrapdoor.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
    public static final RegistryObject<BlockItem> castirontrapdoor_item = ITEMS.register("castirontrapdoor", () -> new BlockItem(castirontrapdoor.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
    public static final RegistryObject<BlockItem> rustytrapdoor_item = ITEMS.register("rustytrapdoor", () -> new BlockItem(rustytrapdoor.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));

    public static final RegistryObject<BlockItem> copperbeam_item = ITEMS.register("copperbeam", () -> new BlockItem(copperbeam.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
    public static final RegistryObject<BlockItem> aluminiumbeam_item = ITEMS.register("aluminiumbeam", () -> new BlockItem(aluminiumbeam.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
    public static final RegistryObject<BlockItem> steelbeam_item = ITEMS.register("steelbeam", () -> new BlockItem(steelbeam.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
    public static final RegistryObject<BlockItem> castironbeam_item = ITEMS.register("castironbeam", () -> new BlockItem(castironbeam.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
    public static final RegistryObject<BlockItem> rustybeam_item = ITEMS.register("rustybeam", () -> new BlockItem(rustybeam.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
    public static final RegistryObject<BlockItem> ironbeam_item = ITEMS.register("ironbeam", () -> new BlockItem(ironbeam.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
}
