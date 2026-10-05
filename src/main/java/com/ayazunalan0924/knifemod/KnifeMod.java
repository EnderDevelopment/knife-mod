package com.ayazunalan0924.knifemod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public
class KnifeMod implements ModInitializer {
    public static final String MOD_ID = "knifemod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final Item TWIXXELS_KNIFE = new SwordItem(ToolMaterials.IRON, 9, -2.4f, new Item.Settings().maxDamage(3689));
    public static final Item IRON_KNIFE = new SwordItem(ToolMaterials.IRON, 9, -2.4f, new Item.Settings().maxDamage(250));
    public static final Item DIAMOND_KNIFE = new SwordItem(ToolMaterials.DIAMOND, 9, -2.4f, new Item.Settings().maxDamage(1561));
    public static final Item NETHERITE_KNIFE = new SwordItem(ToolMaterials.NETHERITE, 9, -2.4f, new Item.Settings().maxDamage(2031));
    public static final Item WOODEN_KNIFE = new SwordItem(ToolMaterials.WOOD, 9, -2.4f, new Item.Settings().maxDamage(59));
    public static final Item STONE_KNIFE = new SwordItem(ToolMaterials.STONE, 9, -2.4f, new Item.Settings().maxDamage(131));
    public static final Item COPPER_KNIFE = new SwordItem(ToolMaterials.IRON, 9, -2.4f, new Item.Settings().maxDamage(176));

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing KnifeMod");

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "twixxels_knife"), TWIXXELS_KNIFE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "iron_knife"), IRON_KNIFE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "diamond_knife"), DIAMOND_KNIFE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "netherite_knife"), NETHERITE_KNIFE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "wooden_knife"), WOODEN_KNIFE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_knife"), STONE_KNIFE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "copper_knife"), COPPER_KNIFE);
    }
}
