package substrate.block;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import substrate.Substrate;

public class BlockRegistry
{
    //TODO: move to own util class; it shouldn't be with the registries
    private static Boolean never(BlockState p_235427_0_, IBlockReader p_235427_1_, BlockPos p_235427_2_, EntityType<?> p_235427_3_)
    {
        return false;
    }

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Substrate.MOD_ID);

    public static final RegistryObject<DoorBlock> copperdoor = BLOCKS.register("copperdoor", () -> new DoorBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F).sound(SoundType.METAL).noOcclusion()));
    public static final RegistryObject<DoorBlock> aluminiumdoor = BLOCKS.register("aluminiumdoor", () -> new DoorBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F).sound(SoundType.METAL).noOcclusion()));
    public static final RegistryObject<DoorBlock> steeldoor = BLOCKS.register("steeldoor", () -> new DoorBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F).sound(SoundType.METAL).noOcclusion()));
    public static final RegistryObject<DoorBlock> castirondoor = BLOCKS.register("castirondoor", () -> new DoorBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F).sound(SoundType.METAL).noOcclusion()));
    public static final RegistryObject<DoorBlock> rustydoor = BLOCKS.register("rustydoor", () -> new DoorBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F).sound(SoundType.METAL).noOcclusion()));

    public static final RegistryObject<TrapDoorBlock> coppertrapdoor = BLOCKS.register("coppertrapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F).sound(SoundType.METAL).noOcclusion().isValidSpawn(BlockRegistry::never)));
    public static final RegistryObject<TrapDoorBlock> aluminiumtrapdoor = BLOCKS.register("aluminiumtrapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F).sound(SoundType.METAL).noOcclusion().isValidSpawn(BlockRegistry::never)));
    public static final RegistryObject<TrapDoorBlock> steeltrapdoor = BLOCKS.register("steeltrapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F).sound(SoundType.METAL).noOcclusion().isValidSpawn(BlockRegistry::never)));
    public static final RegistryObject<TrapDoorBlock> castirontrapdoor = BLOCKS.register("castirontrapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F).sound(SoundType.METAL).noOcclusion().isValidSpawn(BlockRegistry::never)));
    public static final RegistryObject<TrapDoorBlock> rustytrapdoor = BLOCKS.register("rustytrapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F).sound(SoundType.METAL).noOcclusion().isValidSpawn(BlockRegistry::never)));

    public static final RegistryObject<RotatedPillarBlock> copperbeam = BLOCKS.register("copperbeam", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<RotatedPillarBlock> aluminiumbeam = BLOCKS.register("aluminiumbeam", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<RotatedPillarBlock> steelbeam = BLOCKS.register("steelbeam", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<RotatedPillarBlock> castironbeam = BLOCKS.register("castironbeam", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<RotatedPillarBlock> rustybeam = BLOCKS.register("rustybeam", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<RotatedPillarBlock> ironbeam = BLOCKS.register("ironbeam", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<RotatedPillarBlock> coppergrating = BLOCKS.register("coppergrating", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<RotatedPillarBlock> aluminiumgrating = BLOCKS.register("aluminiumgrating", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<RotatedPillarBlock> steelgrating = BLOCKS.register("steelgrating", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<RotatedPillarBlock> castirongrating = BLOCKS.register("castirongrating", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<RotatedPillarBlock> rustygrating = BLOCKS.register("rustygrating", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<RotatedPillarBlock> irongrating = BLOCKS.register("irongrating", () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL).strength(6.0F).sound(SoundType.METAL)));
}
