package com.blockyshoe.megamail.item;

import com.blockyshoe.megamail.MegaMail;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MegaMail.MOD_ID);

    public static final DeferredItem<Item> ENVELOPE= ITEMS.register("envelope",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WAX_ENVELOPE= ITEMS.register("wax_envelope",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ENVELOPE_OPEN= ITEMS.register("envelope_open",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WAX_ENVELOPE_OPEN= ITEMS.register("wax_envelope_open",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
