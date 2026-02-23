package net.vladyslavmeinert.More_Trinkets.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.vladyslavmeinert.More_Trinkets.More_Trinkets;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(More_Trinkets.MOD_ID);

    public static final DeferredItem<Item> Trinket1 = ITEMS.register("trinket1",() -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
