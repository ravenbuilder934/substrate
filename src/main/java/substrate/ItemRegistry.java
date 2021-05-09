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

    public static final RegistryObject<BlockItem> aluminiumgratingstairs_item = ITEMS.register("aluminiumgratingstairs", () -> new BlockItem(aluminiumgratingstairs.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> castirongratingstairs_item = ITEMS.register("castirongratingstairs", () -> new BlockItem(castirongratingstairs.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> coppergratingstairs_item = ITEMS.register("coppergratingstairs", () -> new BlockItem(coppergratingstairs.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> irongratingstairs_item = ITEMS.register("irongratingstairs", () -> new BlockItem(irongratingstairs.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> rustygratingstairs_item = ITEMS.register("rustygratingstairs", () -> new BlockItem(rustygratingstairs.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> steelgratingstairs_item = ITEMS.register("steelgratingstairs", () -> new BlockItem(steelgratingstairs.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));

    public static final RegistryObject<BlockItem> blackhull_item = ITEMS.register("blackhull", () -> new BlockItem(blackhull.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> bluehull_item = ITEMS.register("bluehull", () -> new BlockItem(bluehull.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> brownhull_item = ITEMS.register("brownhull", () -> new BlockItem(brownhull.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> cyanhull_item = ITEMS.register("cyanhull", () -> new BlockItem(cyanhull.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> grayhull_item = ITEMS.register("grayhull", () -> new BlockItem(grayhull.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> greenhull_item = ITEMS.register("greenhull", () -> new BlockItem(greenhull.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> lightbluehull_item = ITEMS.register("lightbluehull", () -> new BlockItem(lightbluehull.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> limehull_item = ITEMS.register("limehull", () -> new BlockItem(limehull.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> magentahull_item = ITEMS.register("magentahull", () -> new BlockItem(magentahull.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> orangehull_item = ITEMS.register("orangehull", () -> new BlockItem(orangehull.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> pinkhull_item = ITEMS.register("pinkhull", () -> new BlockItem(pinkhull.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> purplehull_item = ITEMS.register("purplehull", () -> new BlockItem(purplehull.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> redhull_item = ITEMS.register("redhull", () -> new BlockItem(redhull.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> silverhull_item = ITEMS.register("silverhull", () -> new BlockItem(silverhull.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> whitehull_item = ITEMS.register("whitehull", () -> new BlockItem(whitehull.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> yellowhull_item = ITEMS.register("yellowhull", () -> new BlockItem(yellowhull.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));

    public static final RegistryObject<BlockItem> aluminiumpipe_item = ITEMS.register("aluminiumpipe", () -> new BlockItem(aluminiumpipe.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> castironpipe_item = ITEMS.register("castironpipe", () -> new BlockItem(castironpipe.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> copperpipe_item = ITEMS.register("copperpipe", () -> new BlockItem(copperpipe.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> ironpipe_item = ITEMS.register("ironpipe", () -> new BlockItem(ironpipe.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> rustypipe_item = ITEMS.register("rustypipe", () -> new BlockItem(rustypipe.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> steelpipe_item = ITEMS.register("steelpipe", () -> new BlockItem(steelpipe.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));

    public static final RegistryObject<BlockItem> aluminiumplate_item = ITEMS.register("aluminiumplate", () -> new BlockItem(aluminiumplate.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> castironplate_item = ITEMS.register("castironplate", () -> new BlockItem(castironplate.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> copperplate_item = ITEMS.register("copperplate", () -> new BlockItem(copperplate.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> ironplate_item = ITEMS.register("ironplate", () -> new BlockItem(ironplate.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> rustyplate_item = ITEMS.register("rustyplate", () -> new BlockItem(rustyplate.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> steelplate_item = ITEMS.register("steelplate", () -> new BlockItem(steelplate.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));

    //scrap goes here

    public static final RegistryObject<BlockItem> aluminiumtile_item = ITEMS.register("aluminiumtile", () -> new BlockItem(aluminiumtile.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> castirontile_item = ITEMS.register("castirontile", () -> new BlockItem(castirontile.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> coppertile_item = ITEMS.register("coppertile", () -> new BlockItem(coppertile.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> irontile_item = ITEMS.register("irontile", () -> new BlockItem(irontile.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> rustytile_item = ITEMS.register("rustytile", () -> new BlockItem(rustytile.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> steeltile_item = ITEMS.register("steeltile", () -> new BlockItem(steeltile.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));

    public static final RegistryObject<BlockItem> aluminiumtileslab_item = ITEMS.register("aluminiumtileslab", () -> new BlockItem(aluminiumtileslab.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> castirontileslab_item = ITEMS.register("castirontileslab", () -> new BlockItem(castirontileslab.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> coppertileslab_item = ITEMS.register("coppertileslab", () -> new BlockItem(coppertileslab.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> irontileslab_item = ITEMS.register("irontileslab", () -> new BlockItem(irontileslab.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> rustytileslab_item = ITEMS.register("rustytileslab", () -> new BlockItem(rustytileslab.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> steeltileslab_item = ITEMS.register("steeltileslab", () -> new BlockItem(steeltileslab.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));

    public static final RegistryObject<BlockItem> aluminiumtilestairs_item = ITEMS.register("aluminiumtilestairs", () -> new BlockItem(aluminiumtilestairs.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> castirontilestairs_item = ITEMS.register("castirontilestairs", () -> new BlockItem(castirontilestairs.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> coppertilestairs_item = ITEMS.register("coppertilestairs", () -> new BlockItem(coppertilestairs.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> irontilestairs_item = ITEMS.register("irontilestairs", () -> new BlockItem(irontilestairs.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> rustytilestairs_item = ITEMS.register("rustytilestairs", () -> new BlockItem(rustytilestairs.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
    public static final RegistryObject<BlockItem> steeltilestairs_item = ITEMS.register("steeltilestairs", () -> new BlockItem(steeltilestairs.get(), new Item.Properties().tab(CreativeTab.SUBSTRATE)));
}
