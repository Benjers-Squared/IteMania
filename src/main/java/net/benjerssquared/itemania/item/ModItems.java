package net.benjerssquared.itemania.item;

import net.benjerssquared.itemania.IteMania;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RED_CONCRETE_SWORD = registerItem("red_concrete_sword",
            new SwordItem(ModToolMaterial.RED_CONCRETE, 3, -2.4f, new FabricItemSettings().maxCount(1)));
    public static final Item RED_CONCRETE_PICKAXE = registerItem("red_concrete_pickaxe",
            new PickaxeItem(ModToolMaterial.RED_CONCRETE, 1, -2.8f, new FabricItemSettings().maxCount(1)));
    public static final Item RED_CONCRETE_AXE = registerItem("red_concrete_axe",
            new AxeItem(ModToolMaterial.RED_CONCRETE, 8.0f, -3.2f, new FabricItemSettings().maxCount(1)));
    public static final Item RED_CONCRETE_SHOVEL = registerItem("red_concrete_shovel",
            new ShovelItem(ModToolMaterial.RED_CONCRETE, 1.5f, -3.0f, new FabricItemSettings().maxCount(1)));
    public static final Item RED_CONCRETE_HOE = registerItem("red_concrete_hoe",
            new HoeItem(ModToolMaterial.RED_CONCRETE, 0, -2.0f, new FabricItemSettings().maxCount(1)));

    public static final Item ORANGE_CONCRETE_SWORD = registerItem("orange_concrete_sword",
            new SwordItem(ModToolMaterial.ORANGE_CONCRETE, 3, -2.4f, new FabricItemSettings().maxCount(1)));
    public static final Item ORANGE_CONCRETE_PICKAXE = registerItem("orange_concrete_pickaxe",
            new PickaxeItem(ModToolMaterial.ORANGE_CONCRETE, 1, -2.8f, new FabricItemSettings().maxCount(1)));
    public static final Item ORANGE_CONCRETE_AXE = registerItem("orange_concrete_axe",
            new AxeItem(ModToolMaterial.ORANGE_CONCRETE, 8.0f, -3.2f, new FabricItemSettings().maxCount(1)));
    public static final Item ORANGE_CONCRETE_SHOVEL = registerItem("orange_concrete_shovel",
            new ShovelItem(ModToolMaterial.ORANGE_CONCRETE, 1.5f, -3.0f, new FabricItemSettings().maxCount(1)));
    public static final Item ORANGE_CONCRETE_HOE = registerItem("orange_concrete_hoe",
            new HoeItem(ModToolMaterial.ORANGE_CONCRETE, 0, -2.0f, new FabricItemSettings().maxCount(1)));

    public static final Item YELLOW_CONCRETE_SWORD = registerItem("yellow_concrete_sword",
            new SwordItem(ModToolMaterial.YELLOW_CONCRETE, 3, -2.4f, new FabricItemSettings().maxCount(1)));
    public static final Item YELLOW_CONCRETE_PICKAXE = registerItem("yellow_concrete_pickaxe",
            new PickaxeItem(ModToolMaterial.YELLOW_CONCRETE, 1, -2.8f, new FabricItemSettings().maxCount(1)));
    public static final Item YELLOW_CONCRETE_AXE = registerItem("yellow_concrete_axe",
            new AxeItem(ModToolMaterial.YELLOW_CONCRETE, 8.0f, -3.2f, new FabricItemSettings().maxCount(1)));
    public static final Item YELLOW_CONCRETE_SHOVEL = registerItem("yellow_concrete_shovel",
            new ShovelItem(ModToolMaterial.YELLOW_CONCRETE, 1.5f, -3.0f, new FabricItemSettings().maxCount(1)));
    public static final Item YELLOW_CONCRETE_HOE = registerItem("yellow_concrete_hoe",
            new HoeItem(ModToolMaterial.YELLOW_CONCRETE, 0, -2.0f, new FabricItemSettings().maxCount(1)));
    private static void addItemsToItemGroup(FabricItemGroupEntries entries)
    {
        entries.add(RED_CONCRETE_SWORD);
        entries.add(RED_CONCRETE_PICKAXE);
        entries.add(RED_CONCRETE_AXE);
        entries.add(RED_CONCRETE_SHOVEL);
        entries.add(RED_CONCRETE_HOE);

        entries.add(ORANGE_CONCRETE_SWORD);
        entries.add(ORANGE_CONCRETE_PICKAXE);
        entries.add(ORANGE_CONCRETE_AXE);
        entries.add(ORANGE_CONCRETE_SHOVEL);
        entries.add(ORANGE_CONCRETE_HOE);

        entries.add(YELLOW_CONCRETE_SWORD);
        entries.add(YELLOW_CONCRETE_PICKAXE);
        entries.add(YELLOW_CONCRETE_AXE);
        entries.add(YELLOW_CONCRETE_SHOVEL);
        entries.add(YELLOW_CONCRETE_HOE);
    }
    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(IteMania.MOD_ID, name), item);
    }
    public static void registerModItems()
    {
        IteMania.LOGGER.info("Registering Items for" + IteMania.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToItemGroup);
    }
}
