package net.sofiazeda.sunsethats.item;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.sofiazeda.sunsethats.SunsetsHats;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;
public class ModArmorMaterials {

    public static final RegistryEntry<ArmorMaterial> TRANS_HAT_ARMOR_MATERIAL = registerArmorMaterial("trans_hat",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 5);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 0);
                map.put(ArmorItem.Type.BODY, 5);
            }), 0, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, () -> Ingredient.ofItems(Items.PINK_WOOL),
                    List.of(new ArmorMaterial.Layer(Identifier.of(SunsetsHats.MOD_ID, "trans_hat"))), 0, 0));


    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material){
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(SunsetsHats.MOD_ID, name), material.get() );
    }
}
