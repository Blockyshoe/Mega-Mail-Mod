package com.blockyshoe.megamail.item;

import com.blockyshoe.megamail.MegaMail;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MegaMail.MOD_ID);

    public static final Supplier<CreativeModeTab> MEGA_MAIL_TAB = CREATIVE_MODE_TAB.register("mega_mail_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ENVELOPE.get()))
                    .title(Component.translatable("creativetab.megamail.mega_mail_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ENVELOPE);
                        output.accept(ModItems.WAX_ENVELOPE);
                        output.accept(ModItems.ENVELOPE_OPEN);
                        output.accept(ModItems.WAX_ENVELOPE_OPEN);
                    })

                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
