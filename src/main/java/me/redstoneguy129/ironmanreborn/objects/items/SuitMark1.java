package me.redstoneguy129.ironmanreborn.objects.items;

import me.redstoneguy129.ironmanreborn.objects.material.SuitArmorMaterial;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import org.apache.logging.log4j.core.tools.picocli.CommandLine;

import javax.annotation.Nullable;
import java.util.List;

public class SuitMark1 extends IMRArmorItem {

    public SuitMark1(EquipmentSlotType equipmentSlotType) {
        super(SuitArmorMaterial.MARK1, equipmentSlotType);
    }

    @Override
    public void addInformation(ItemStack itemStack, @Nullable World world, List<ITextComponent> iTextComponentList, ITooltipFlag iTooltipFlag) {
        iTextComponentList.add(new StringTextComponent("Mark I").applyTextStyle(TextFormatting.GRAY));
        super.addInformation(itemStack, world, iTextComponentList, iTooltipFlag);
    }
}
