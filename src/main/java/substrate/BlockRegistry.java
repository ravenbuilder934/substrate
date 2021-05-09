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

    public static final RegistryObject<StairsBlock> aluminiumgratingstairs = BLOCKS.register("aluminiumgratingstairs", () -> new StairsBlock(Blocks.IRON_BLOCK::defaultBlockState, AbstractBlock.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<StairsBlock> castirongratingstairs = BLOCKS.register("castirongratingstairs", () -> new StairsBlock(Blocks.IRON_BLOCK::defaultBlockState, AbstractBlock.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<StairsBlock> coppergratingstairs = BLOCKS.register("coppergratingstairs", () -> new StairsBlock(Blocks.IRON_BLOCK::defaultBlockState, AbstractBlock.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<StairsBlock> irongratingstairs = BLOCKS.register("irongratingstairs", () -> new StairsBlock(Blocks.IRON_BLOCK::defaultBlockState, AbstractBlock.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<StairsBlock> rustygratingstairs = BLOCKS.register("rustygratingstairs", () -> new StairsBlock(Blocks.IRON_BLOCK::defaultBlockState, AbstractBlock.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<StairsBlock> steelgratingstairs = BLOCKS.register("steelgratingstairs", () -> new StairsBlock(Blocks.IRON_BLOCK::defaultBlockState, AbstractBlock.Properties.copy(Blocks.IRON_BLOCK)));

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

    public static final RegistryObject<Block> aluminiumtile = BLOCKS.register("aluminiumtile", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> castirontile = BLOCKS.register("castirontile", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> coppertile = BLOCKS.register("coppertile", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> irontile = BLOCKS.register("irontile", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> rustytile = BLOCKS.register("rustytile", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> steeltile = BLOCKS.register("steeltile", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<SlabBlock> aluminiumtileslab = BLOCKS.register("aluminiumtileslab", () -> new SlabBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<SlabBlock> castirontileslab = BLOCKS.register("castirontileslab", () -> new SlabBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<SlabBlock> coppertileslab = BLOCKS.register("coppertileslab", () -> new SlabBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<SlabBlock> irontileslab = BLOCKS.register("irontileslab", () -> new SlabBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<SlabBlock> rustytileslab = BLOCKS.register("rustytileslab", () -> new SlabBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<SlabBlock> steeltileslab = BLOCKS.register("steeltileslab", () -> new SlabBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<StairsBlock> aluminiumtilestairs = BLOCKS.register("aluminiumtilestairs", () -> new StairsBlock(Blocks.IRON_BLOCK::defaultBlockState, AbstractBlock.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<StairsBlock> castirontilestairs = BLOCKS.register("castirontilestairs", () -> new StairsBlock(Blocks.IRON_BLOCK::defaultBlockState, AbstractBlock.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<StairsBlock> coppertilestairs = BLOCKS.register("coppertilestairs", () -> new StairsBlock(Blocks.IRON_BLOCK::defaultBlockState, AbstractBlock.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<StairsBlock> irontilestairs = BLOCKS.register("irontilestairs", () -> new StairsBlock(Blocks.IRON_BLOCK::defaultBlockState, AbstractBlock.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<StairsBlock> rustytilestairs = BLOCKS.register("rustytilestairs", () -> new StairsBlock(Blocks.IRON_BLOCK::defaultBlockState, AbstractBlock.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<StairsBlock> steeltilestairs = BLOCKS.register("steeltilestairs", () -> new StairsBlock(Blocks.IRON_BLOCK::defaultBlockState, AbstractBlock.Properties.copy(Blocks.IRON_BLOCK)));
}
