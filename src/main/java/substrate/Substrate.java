package substrate;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("substrate")
public class Substrate
{

    public Substrate()
    {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        modBus.addListener(this::setup);
        ItemRegistry.ITEMS.register(modBus);
        BlockRegistry.BLOCKS.register(modBus);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        MinecraftForge.EVENT_BUS.register(this);
    }

}