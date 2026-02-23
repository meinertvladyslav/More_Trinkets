package net.vladyslavmeinert.More_Trinkets.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.vladyslavmeinert.More_Trinkets.More_Trinkets;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(More_Trinkets.MOD_ID);

    public static final DeferredItem<Item> Trinket1 = ITEMS.register("trinket1",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> Trinket2= ITEMS.register("trinket2",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> Trinket3 = ITEMS.register("trinket3",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> Trinket4 = ITEMS.register("trinket4",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> Trinket5 = ITEMS.register("trinket5",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> Trinket6 = ITEMS.register("trinket6",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> Trinket7 = ITEMS.register("trinket7",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> Trinket8 = ITEMS.register("trinket8",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> Trinket9 = ITEMS.register("trinket9",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> Trinket10 = ITEMS.register("trinket10",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> Trinket11 = ITEMS.register("trinket11",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> Trinket12 = ITEMS.register("trinket12",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> Trinket13 = ITEMS.register("trinket13",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> Trinket14 = ITEMS.register("trinket14",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> Trinket15 = ITEMS.register("trinket15",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> Trinket16 = ITEMS.register("trinket16",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> Trinket17 = ITEMS.register("trinket17",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> Trinket18 = ITEMS.register("trinket18",() -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
