package me.redstoneguy129.ironmanreborn.objects;

import me.redstoneguy129.ironmanreborn.IronManReborn;
import me.redstoneguy129.ironmanreborn.objects.items.IMRItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class IMRItems {
    public static final DeferredRegister<Item> ITEM_DEFERRED_REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, IronManReborn.MOD_ID);

    public static final RegistryObject<IMRItem> TITANIUM = ITEM_DEFERRED_REGISTER.register("titanium", IMRItem::new);
    public static final RegistryObject<IMRItem> COPPER = ITEM_DEFERRED_REGISTER.register("copper", IMRItem::new);
    public static final RegistryObject<IMRItem> MAGNESIUM = ITEM_DEFERRED_REGISTER.register("magnesium", IMRItem::new);
    public static final RegistryObject<IMRItem> GOLD_TITANIUM_ALLOY = ITEM_DEFERRED_REGISTER.register("gold_titanium_alloy", IMRItem::new);
    public static final RegistryObject<IMRItem> IRON_COPPER_MAGNESIUM_ALLOY = ITEM_DEFERRED_REGISTER.register("iron_copper_magnesium_alloy", IMRItem::new);
}
