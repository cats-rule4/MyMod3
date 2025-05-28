package net.kin10310.mymod3;

import net.fabricmc.api.ModInitializer;
import net.kin10310.mymod3.init.InitItem;
import net.minecraft.util.Identifier;

public class Mymod3 implements ModInitializer {
    public static final String MOD_ID = "mymod3";
    @Override
    public void onInitialize() {
        InitItem.load();
    }
    public static Identifier id(String path){
        return Identifier.of(MOD_ID, path);
    }
}
