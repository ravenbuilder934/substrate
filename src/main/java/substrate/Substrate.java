package substrate;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
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

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void doClientStuff(final FMLClientSetupEvent event)
    {
        RenderTypeLookup.setRenderLayer(BlockRegistry.aluminiumtrapdoor.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.castirontrapdoor.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.coppertrapdoor.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.irontrapdoor.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.rustytrapdoor.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.steeltrapdoor.get(), RenderType.translucent());
    }

}