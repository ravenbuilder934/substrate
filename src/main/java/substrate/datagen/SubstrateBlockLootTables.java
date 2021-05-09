package substrate.datagen;

import net.minecraft.block.Block;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraftforge.fml.RegistryObject;
import substrate.BlockRegistry;

public class SubstrateBlockLootTables extends BlockLootTables
{
    @Override
    protected void addTables()
    {
        dropSelf(BlockRegistry.aluminiumdoor.get());
        dropSelf(BlockRegistry.castirondoor.get());
        dropSelf(BlockRegistry.copperdoor.get());
        dropSelf(BlockRegistry.irondoor.get());
        dropSelf(BlockRegistry.rustydoor.get());
        dropSelf(BlockRegistry.steeldoor.get());

        dropSelf(BlockRegistry.aluminiumtrapdoor.get());
        dropSelf(BlockRegistry.castirontrapdoor.get());
        dropSelf(BlockRegistry.coppertrapdoor.get());
        dropSelf(BlockRegistry.irontrapdoor.get());
        dropSelf(BlockRegistry.rustytrapdoor.get());
        dropSelf(BlockRegistry.steeltrapdoor.get());

        dropSelf(BlockRegistry.aluminiumbeam.get());
        dropSelf(BlockRegistry.castironbeam.get());
        dropSelf(BlockRegistry.copperbeam.get());
        dropSelf(BlockRegistry.ironbeam.get());
        dropSelf(BlockRegistry.rustybeam.get());
        dropSelf(BlockRegistry.steelbeam.get());

        dropSelf(BlockRegistry.aluminiumgrating.get());
        dropSelf(BlockRegistry.castirongrating.get());
        dropSelf(BlockRegistry.coppergrating.get());
        dropSelf(BlockRegistry.irongrating.get());
        dropSelf(BlockRegistry.rustygrating.get());
        dropSelf(BlockRegistry.steelgrating.get());

        dropSelf(BlockRegistry.aluminiumgratingslab.get());
        dropSelf(BlockRegistry.castirongratingslab.get());
        dropSelf(BlockRegistry.coppergratingslab.get());
        dropSelf(BlockRegistry.irongratingslab.get());
        dropSelf(BlockRegistry.rustygratingslab.get());
        dropSelf(BlockRegistry.steelgratingslab.get());

        dropSelf(BlockRegistry.aluminiumgratingstairs.get());
        dropSelf(BlockRegistry.castirongratingstairs.get());
        dropSelf(BlockRegistry.coppergratingstairs.get());
        dropSelf(BlockRegistry.irongratingstairs.get());
        dropSelf(BlockRegistry.rustygratingstairs.get());
        dropSelf(BlockRegistry.steelgratingstairs.get());

        dropSelf(BlockRegistry.blackhull.get());
        dropSelf(BlockRegistry.bluehull.get());
        dropSelf(BlockRegistry.brownhull.get());
        dropSelf(BlockRegistry.cyanhull.get());
        dropSelf(BlockRegistry.grayhull.get());
        dropSelf(BlockRegistry.greenhull.get());
        dropSelf(BlockRegistry.lightbluehull.get());
        dropSelf(BlockRegistry.limehull.get());
        dropSelf(BlockRegistry.magentahull.get());
        dropSelf(BlockRegistry.orangehull.get());
        dropSelf(BlockRegistry.pinkhull.get());
        dropSelf(BlockRegistry.purplehull.get());
        dropSelf(BlockRegistry.redhull.get());
        dropSelf(BlockRegistry.silverhull.get());
        dropSelf(BlockRegistry.whitehull.get());
        dropSelf(BlockRegistry.yellowhull.get());

        dropSelf(BlockRegistry.aluminiumpipe.get());
        dropSelf(BlockRegistry.castironpipe.get());
        dropSelf(BlockRegistry.copperpipe.get());
        dropSelf(BlockRegistry.ironpipe.get());
        dropSelf(BlockRegistry.rustypipe.get());
        dropSelf(BlockRegistry.steelpipe.get());

        dropSelf(BlockRegistry.aluminiumplate.get());
        dropSelf(BlockRegistry.castironplate.get());
        dropSelf(BlockRegistry.copperplate.get());
        dropSelf(BlockRegistry.ironplate.get());
        dropSelf(BlockRegistry.rustyplate.get());
        dropSelf(BlockRegistry.steelplate.get());

        dropSelf(BlockRegistry.aluminiumtile.get());
        dropSelf(BlockRegistry.castirontile.get());
        dropSelf(BlockRegistry.coppertile.get());
        dropSelf(BlockRegistry.irontile.get());
        dropSelf(BlockRegistry.rustytile.get());
        dropSelf(BlockRegistry.steeltile.get());

        dropSelf(BlockRegistry.aluminiumtileslab.get());
        dropSelf(BlockRegistry.castirontileslab.get());
        dropSelf(BlockRegistry.coppertileslab.get());
        dropSelf(BlockRegistry.irontileslab.get());
        dropSelf(BlockRegistry.rustytileslab.get());
        dropSelf(BlockRegistry.steeltileslab.get());

        dropSelf(BlockRegistry.aluminiumtilestairs.get());
        dropSelf(BlockRegistry.castirontilestairs.get());
        dropSelf(BlockRegistry.coppertilestairs.get());
        dropSelf(BlockRegistry.irontilestairs.get());
        dropSelf(BlockRegistry.rustytilestairs.get());
        dropSelf(BlockRegistry.steeltilestairs.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks()
    {
        return BlockRegistry.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
