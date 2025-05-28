package net.kin10310.mymod3.init;

import net.kin10310.mymod3.Mymod3;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class InitItem {

    public static final Item TEST_ITEM = register("test_item", new Item(new Item.Settings()));

    public static <T extends Item> T register(String name, T item){
        return Registry.register(Registries.ITEM, Mymod3.id(name), item);
    }

    public static void load() {}
}
