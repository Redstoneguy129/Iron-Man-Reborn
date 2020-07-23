package me.redstoneguy129.ironmanreborn.objects.items;

import me.redstoneguy129.ironmanreborn.IronManReborn;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;

public class IMRArmorItem extends ArmorItem {

    public IMRArmorItem(IArmorMaterial iArmorMaterial, EquipmentSlotType equipmentSlotType) {
        super(iArmorMaterial, equipmentSlotType, new Item.Properties().group(IronManReborn.TAB));
    }
}
