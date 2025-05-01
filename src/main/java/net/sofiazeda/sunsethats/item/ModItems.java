package net.sofiazeda.sunsethats.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sofiazeda.sunsethats.SunsetsHats;

public class ModItems {
    public static final Item TRANS_HAT = registerItem("trans_hat",
            new ArmorItem(ModArmorMaterials.TRANS_HAT_ARMOR_MATERIAL,ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(0))));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(SunsetsHats.MOD_ID, name), item);
    }

    public static void registerModItems(){
        SunsetsHats.LOGGER.info("Registering Mod Items for " + SunsetsHats.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(TRANS_HAT);
        });
    }
}
