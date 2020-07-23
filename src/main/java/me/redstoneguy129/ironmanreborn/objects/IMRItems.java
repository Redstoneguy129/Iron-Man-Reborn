package me.redstoneguy129.ironmanreborn.objects;

import me.redstoneguy129.ironmanreborn.IronManReborn;
import me.redstoneguy129.ironmanreborn.objects.items.IMRArmorItem;
import me.redstoneguy129.ironmanreborn.objects.items.IMRItem;
import me.redstoneguy129.ironmanreborn.objects.items.SuitMark1;
import me.redstoneguy129.ironmanreborn.objects.material.SuitArmorMaterial;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
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

    public static final RegistryObject<SuitMark1> MARK_1_HELMET = ITEM_DEFERRED_REGISTER.register("mark1_helmet", () -> new SuitMark1(EquipmentSlotType.HEAD));
    public static final RegistryObject<SuitMark1> MARK_1_CHESTPLATE = ITEM_DEFERRED_REGISTER.register("mark1_chestplate", () -> new SuitMark1(EquipmentSlotType.CHEST));
    public static final RegistryObject<SuitMark1> MARK_1_LEGGINGS = ITEM_DEFERRED_REGISTER.register("mark1_leggings", () -> new SuitMark1(EquipmentSlotType.LEGS));
    public static final RegistryObject<SuitMark1> MARK_1_BOOTS = ITEM_DEFERRED_REGISTER.register("mark1_boots", () -> new SuitMark1(EquipmentSlotType.FEET));
}
