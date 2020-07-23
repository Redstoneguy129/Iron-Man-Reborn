package me.redstoneguy129.ironmanreborn;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(IronManReborn.MOD_ID)
public class IronManReborn {
    public static final String MOD_ID = "ironmanreborn";
    public IronManReborn() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
