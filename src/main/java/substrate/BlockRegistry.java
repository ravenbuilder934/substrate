package substrate;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Util.MOD_ID);

    public static final RegistryObject<DoorBlock> aluminiumdoor = BLOCKS.register("aluminiumdoor", () -> new DoorBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F).sound(SoundType.METAL).noOcclusion()));
    public static final RegistryObject<DoorBlock> castirondoor = BLOCKS.register("castirondoor", () -> new DoorBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F).sound(SoundType.METAL).noOcclusion()));
    public static final RegistryObject<DoorBlock> copperdoor = BLOCKS.register("copperdoor", () -> new DoorBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F).sound(SoundType.METAL).noOcclusion()));
    public static final RegistryObject<DoorBlock> irondoor = BLOCKS.register("irondoor", () -> new DoorBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F).sound(SoundType.METAL).noOcclusion()));
    public static final RegistryObject<DoorBlock> rustydoor = BLOCKS.register("rustydoor", () -> new DoorBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F).sound(SoundType.METAL).noOcclusion()));
    public static final RegistryObject<DoorBlock> steeldoor = BLOCKS.register("steeldoor", () -> new DoorBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F).sound(SoundType.METAL).noOcclusion()));

    public static final RegistryObject<TrapDoorBlock> aluminiumtrapdoor = BLOCKS.register("aluminiumtrapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F).sound(SoundType.METAL).noOcclusion().isValidSpawn(Util::never)));
    public static final RegistryObject<TrapDoorBlock> castirontrapdoor = BLOCKS.register("castirontrapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F).sound(SoundType.METAL).noOcclusion().isValidSpawn(Util::never)));
    public static final RegistryObject<TrapDoorBlock> coppertrapdoor = BLOCKS.register("coppertrapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F).sound(SoundType.METAL).noOcclusion().isValidSpawn(Util::never)));
    public static final RegistryObject<TrapDoorBlock> irontrapdoor = BLOCKS.register("irontrapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F).sound(SoundType.METAL).noOcclusion().isValidSpawn(Util::never)));
    public static final RegistryObject<TrapDoorBlock> rustytrapdoor = BLOCKS.register("rustytrapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F).sound(SoundType.METAL).noOcclusion().isValidSpawn(Util::never)));
    public static final RegistryObject<TrapDoorBlock> steeltrapdoor = BLOCKS.register("steeltrapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F).sound(SoundType.METAL).noOcclusion().isValidSpawn(Util::never)));

    public static final RegistryObject<RotatedPillarBlock> aluminiumbeam = BLOCKS.register("aluminiumbeam", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<RotatedPillarBlock> castironbeam = BLOCKS.register("castironbeam", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<RotatedPillarBlock> copperbeam = BLOCKS.register("copperbeam", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<RotatedPillarBlock> ironbeam = BLOCKS.register("ironbeam", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<RotatedPillarBlock> rustybeam = BLOCKS.register("rustybeam", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<RotatedPillarBlock> steelbeam = BLOCKS.register("steelbeam", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<RotatedPillarBlock> aluminiumgrating = BLOCKS.register("aluminiumgrating", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<RotatedPillarBlock> castirongrating = BLOCKS.register("castirongrating", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<RotatedPillarBlock> coppergrating = BLOCKS.register("coppergrating", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<RotatedPillarBlock> irongrating = BLOCKS.register("irongrating", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<RotatedPillarBlock> rustygrating = BLOCKS.register("rustygrating", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<RotatedPillarBlock> steelgrating = BLOCKS.register("steelgrating", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<SlabBlock> aluminiumgratingslab = BLOCKS.register("aluminiumgratingslab", () -> new SlabBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<SlabBlock> castirongratingslab = BLOCKS.register("castirongratingslab", () -> new SlabBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<SlabBlock> coppergratingslab = BLOCKS.register("coppergratingslab", () -> new SlabBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<SlabBlock> irongratingslab = BLOCKS.register("irongratingslab", () -> new SlabBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<SlabBlock> rustygratingslab = BLOCKS.register("rustygratingslab", () -> new SlabBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<SlabBlock> steelgratingslab = BLOCKS.register("steelgratingslab", () -> new SlabBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL)));

    /* TODO: fix this crap
    public static final RegistryObject<StairsBlock> aluminiumgratingstairs = BLOCKS.register("aluminiumgratingstairs", () -> new StairsBlock(aluminiumgrating.defaultBlockState(), AbstractBlock.Properties.copy(aluminiumgrating.get())));
    public static final RegistryObject<StairsBlock> castirongratingstairs = BLOCKS.register("castirongratingstairs", () -> new StairsBlock(castirongrating.defaultBlockState(), AbstractBlock.Properties.copy(castirongrating.get())));
    public static final RegistryObject<StairsBlock> coppergratingstairs = BLOCKS.register("coppergratingstairs", () -> new StairsBlock(coppergrating.defaultBlockState(), AbstractBlock.Properties.copy(coppergrating.get())));
    public static final RegistryObject<StairsBlock> irongratingstairs = BLOCKS.register("irongratingstairs", () -> new StairsBlock(irongrating.defaultBlockState(), AbstractBlock.Properties.copy(irongrating.get())));
    public static final RegistryObject<StairsBlock> rustygratingstairs = BLOCKS.register("rustygratingstairs", () -> new StairsBlock(rustygrating.defaultBlockState(), AbstractBlock.Properties.copy(rustygrating.get())));
    public static final RegistryObject<StairsBlock> steelgratingstairs = BLOCKS.register("steelgratingstairs", () -> new StairsBlock(steelgrating.defaultBlockState(), AbstractBlock.Properties.copy(steelgrating.get())));
     */

    public static final RegistryObject<Block> blackhull = BLOCKS.register("blackhull", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> bluehull = BLOCKS.register("bluehull", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> brownhull = BLOCKS.register("brownhull", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> cyanhull = BLOCKS.register("cyanhull", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> grayhull = BLOCKS.register("grayhull", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> greenhull = BLOCKS.register("greenhull", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> lightbluehull = BLOCKS.register("lightbluehull", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> limehull = BLOCKS.register("limehull", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> magentahull = BLOCKS.register("magentahull", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> orangehull = BLOCKS.register("orangehull", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> pinkhull = BLOCKS.register("pinkhull", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> purplehull = BLOCKS.register("purplehull", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> redhull = BLOCKS.register("redhull", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> silverhull = BLOCKS.register("silverhull", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> whitehull = BLOCKS.register("whitehull", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> yellowhull = BLOCKS.register("yellowhull", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<RotatedPillarBlock> aluminiumpipe = BLOCKS.register("aluminiumpipe", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<RotatedPillarBlock> castironpipe = BLOCKS.register("castironpipe", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<RotatedPillarBlock> copperpipe = BLOCKS.register("copperpipe", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<RotatedPillarBlock> ironpipe = BLOCKS.register("ironpipe", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<RotatedPillarBlock> rustypipe = BLOCKS.register("rustypipe", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<RotatedPillarBlock> steelpipe = BLOCKS.register("steelpipe", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<RotatedPillarBlock> aluminiumplate = BLOCKS.register("aluminiumplate", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<RotatedPillarBlock> castironplate = BLOCKS.register("castironplate", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<RotatedPillarBlock> copperplate = BLOCKS.register("copperplate", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<RotatedPillarBlock> ironplate = BLOCKS.register("ironplate", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<RotatedPillarBlock> rustyplate = BLOCKS.register("rustyplate", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<RotatedPillarBlock> steelplate = BLOCKS.register("steelplate", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));

    //scrap goes here

    public static final RegistryObject<RotatedPillarBlock> aluminiumtile = BLOCKS.register("aluminiumtile", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<RotatedPillarBlock> castirontile = BLOCKS.register("castirontile", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<RotatedPillarBlock> coppertile = BLOCKS.register("coppertile", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<RotatedPillarBlock> irontile = BLOCKS.register("irontile", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<RotatedPillarBlock> rustytile = BLOCKS.register("rustytile", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<RotatedPillarBlock> steeltile = BLOCKS.register("steeltile", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<SlabBlock> aluminiumtileslab = BLOCKS.register("aluminiumtileslab", () -> new SlabBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<SlabBlock> castirontileslab = BLOCKS.register("castirontileslab", () -> new SlabBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<SlabBlock> coppertileslab = BLOCKS.register("coppertileslab", () -> new SlabBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<SlabBlock> irontileslab = BLOCKS.register("irontileslab", () -> new SlabBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<SlabBlock> rustytileslab = BLOCKS.register("rustytileslab", () -> new SlabBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<SlabBlock> steeltileslab = BLOCKS.register("steeltileslab", () -> new SlabBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL)));

    /*
    public static final RegistryObject<StairsBlock> aluminiumtilestairs = BLOCKS.register("aluminiumtilestairs", () -> new StairsBlock(aluminiumtile.defaultBlockState(), AbstractBlock.Properties.copy(aluminiumtile.get())));
    public static final RegistryObject<StairsBlock> castirontilestairs = BLOCKS.register("castirontilestairs", () -> new StairsBlock(castirontile.defaultBlockState(), AbstractBlock.Properties.copy(castirontile.get())));
    public static final RegistryObject<StairsBlock> coppertilestairs = BLOCKS.register("coppertilestairs", () -> new StairsBlock(coppertile.defaultBlockState(), AbstractBlock.Properties.copy(coppertile.get())));
    public static final RegistryObject<StairsBlock> irontilestairs = BLOCKS.register("irontilestairs", () -> new StairsBlock(irontile.defaultBlockState(), AbstractBlock.Properties.copy(irontile.get())));
    public static final RegistryObject<StairsBlock> rustytilestairs = BLOCKS.register("rustytilestairs", () -> new StairsBlock(rustytile.defaultBlockState(), AbstractBlock.Properties.copy(rustytile.get())));
    public static final RegistryObject<StairsBlock> steeltilestairs = BLOCKS.register("steeltilestairs", () -> new StairsBlock(steeltile.defaultBlockState(), AbstractBlock.Properties.copy(steeltile.get())));
     */
}
