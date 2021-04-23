package substrate;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.TallBlockItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static substrate.BlockRegistry.*;

public class ItemRegistry
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Util.MOD_ID);

    public static final RegistryObject<TallBlockItem> aluminiumdoor_item = ITEMS.register("aluminiumdoor", () -> new TallBlockItem(aluminiumdoor.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<TallBlockItem> castirondoor_item = ITEMS.register("castirondoor", () -> new TallBlockItem(castirondoor.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<TallBlockItem> copperdoor_item = ITEMS.register("copperdoor", () -> new TallBlockItem(copperdoor.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<TallBlockItem> irondoor_item = ITEMS.register("irondoor", () -> new TallBlockItem(irondoor.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<TallBlockItem> rustydoor_item = ITEMS.register("rustydoor", () -> new TallBlockItem(rustydoor.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<TallBlockItem> steeldoor_item = ITEMS.register("steeldoor", () -> new TallBlockItem(steeldoor.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));

    public static final RegistryObject<BlockItem> aluminiumtrapdoor_item = ITEMS.register("aluminiumtrapdoor", () -> new BlockItem(aluminiumtrapdoor.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> castirontrapdoor_item = ITEMS.register("castirontrapdoor", () -> new BlockItem(castirontrapdoor.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> coppertrapdoor_item = ITEMS.register("coppertrapdoor", () -> new BlockItem(coppertrapdoor.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> irontrapdoor_item = ITEMS.register("irontrapdoor", () -> new BlockItem(irontrapdoor.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> rustytrapdoor_item = ITEMS.register("rustytrapdoor", () -> new BlockItem(rustytrapdoor.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> steeltrapdoor_item = ITEMS.register("steeltrapdoor", () -> new BlockItem(steeltrapdoor.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));

    public static final RegistryObject<BlockItem> aluminiumbeam_item = ITEMS.register("aluminiumbeam", () -> new BlockItem(aluminiumbeam.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> castironbeam_item = ITEMS.register("castironbeam", () -> new BlockItem(castironbeam.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> copperbeam_item = ITEMS.register("copperbeam", () -> new BlockItem(copperbeam.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> ironbeam_item = ITEMS.register("ironbeam", () -> new BlockItem(ironbeam.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> rustybeam_item = ITEMS.register("rustybeam", () -> new BlockItem(rustybeam.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> steelbeam_item = ITEMS.register("steelbeam", () -> new BlockItem(steelbeam.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));

    public static final RegistryObject<BlockItem> aluminiumgrating_item = ITEMS.register("aluminiumgrating", () -> new BlockItem(aluminiumgrating.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> castirongrating_item = ITEMS.register("castirongrating", () -> new BlockItem(castirongrating.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> coppergrating_item = ITEMS.register("coppergrating", () -> new BlockItem(coppergrating.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> irongrating_item = ITEMS.register("irongrating", () -> new BlockItem(irongrating.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> rustygrating_item = ITEMS.register("rustygrating", () -> new BlockItem(rustygrating.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> steelgrating_item = ITEMS.register("steelgrating", () -> new BlockItem(steelgrating.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));

    public static final RegistryObject<BlockItem> aluminiumgratingslab_item = ITEMS.register("aluminiumgratingslab", () -> new BlockItem(aluminiumgratingslab.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> castirongratingslab_item = ITEMS.register("castirongratingslab", () -> new BlockItem(castirongratingslab.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> coppergratingslab_item = ITEMS.register("coppergratingslab", () -> new BlockItem(coppergratingslab.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> irongratingslab_item = ITEMS.register("irongratingslab", () -> new BlockItem(irongratingslab.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> rustygratingslab_item = ITEMS.register("rustygratingslab", () -> new BlockItem(rustygratingslab.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> steelgratingslab_item = ITEMS.register("steelgratingslab", () -> new BlockItem(steelgratingslab.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
}
