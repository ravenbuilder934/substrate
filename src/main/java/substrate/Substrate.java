package substrate;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import substrate.datagen.GatherData;
import substrate.registry.BlockRegistry;
import substrate.registry.ItemRegistry;

@Mod("substrate")
public class Substrate
{
    public static final String MOD_ID = "substrate";

    public Substrate()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(GatherData::init);
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public void doClientStuff(final FMLClientSetupEvent event)
    {
        RenderTypeLookup.setRenderLayer(BlockRegistry.aluminiumtrapdoor.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.castirontrapdoor.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.coppertrapdoor.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.irontrapdoor.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.rustytrapdoor.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.steeltrapdoor.get(), RenderType.translucent());
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        MinecraftForge.EVENT_BUS.register(this);
    }

}