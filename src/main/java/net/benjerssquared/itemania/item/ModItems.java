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

    public static final Item WHITE_CONCRETE_SWORD = registerItem("white_concrete_sword",
            new SwordItem(ModToolMaterial.WHITE_CONCRETE, 3, -2.4f, new FabricItemSettings().maxCount(1)));
    public static final Item WHITE_CONCRETE_PICKAXE = registerItem("white_concrete_pickaxe",
            new PickaxeItem(ModToolMaterial.WHITE_CONCRETE, 1, -2.8f, new FabricItemSettings().maxCount(1)));
    public static final Item WHITE_CONCRETE_AXE = registerItem("white_concrete_axe",
            new AxeItem(ModToolMaterial.WHITE_CONCRETE, 8.0f, -3.2f, new FabricItemSettings().maxCount(1)));
    public static final Item WHITE_CONCRETE_SHOVEL = registerItem("white_concrete_shovel",
            new ShovelItem(ModToolMaterial.WHITE_CONCRETE, 1.5f, -3.0f, new FabricItemSettings().maxCount(1)));
    public static final Item WHITE_CONCRETE_HOE = registerItem("white_concrete_hoe",
            new HoeItem(ModToolMaterial.WHITE_CONCRETE, 0, -2.0f, new FabricItemSettings().maxCount(1)));

    public static final Item LIGHT_GRAY_CONCRETE_SWORD = registerItem("light_gray_concrete_sword",
            new SwordItem(ModToolMaterial.LIGHT_GRAY_CONCRETE, 3, -2.4f, new FabricItemSettings().maxCount(1)));
    public static final Item LIGHT_GRAY_CONCRETE_PICKAXE = registerItem("light_gray_concrete_pickaxe",
            new PickaxeItem(ModToolMaterial.LIGHT_GRAY_CONCRETE, 1, -2.8f, new FabricItemSettings().maxCount(1)));
    public static final Item LIGHT_GRAY_CONCRETE_AXE = registerItem("light_gray_concrete_axe",
            new AxeItem(ModToolMaterial.LIGHT_GRAY_CONCRETE, 8.0f, -3.2f, new FabricItemSettings().maxCount(1)));
    public static final Item LIGHT_GRAY_CONCRETE_SHOVEL = registerItem("light_gray_concrete_shovel",
            new ShovelItem(ModToolMaterial.LIGHT_GRAY_CONCRETE, 1.5f, -3.0f, new FabricItemSettings().maxCount(1)));
    public static final Item LIGHT_GRAY_CONCRETE_HOE = registerItem("light_gray_concrete_hoe",
            new HoeItem(ModToolMaterial.LIGHT_GRAY_CONCRETE, 0, -2.0f, new FabricItemSettings().maxCount(1)));

    public static final Item GRAY_CONCRETE_SWORD = registerItem("gray_concrete_sword",
            new SwordItem(ModToolMaterial.GRAY_CONCRETE, 3, -2.4f, new FabricItemSettings().maxCount(1)));
    public static final Item GRAY_CONCRETE_PICKAXE = registerItem("gray_concrete_pickaxe",
            new PickaxeItem(ModToolMaterial.GRAY_CONCRETE, 1, -2.8f, new FabricItemSettings().maxCount(1)));
    public static final Item GRAY_CONCRETE_AXE = registerItem("gray_concrete_axe",
            new AxeItem(ModToolMaterial.GRAY_CONCRETE, 8.0f, -3.2f, new FabricItemSettings().maxCount(1)));
    public static final Item GRAY_CONCRETE_SHOVEL = registerItem("gray_concrete_shovel",
            new ShovelItem(ModToolMaterial.GRAY_CONCRETE, 1.5f, -3.0f, new FabricItemSettings().maxCount(1)));
    public static final Item GRAY_CONCRETE_HOE = registerItem("gray_concrete_hoe",
            new HoeItem(ModToolMaterial.GRAY_CONCRETE, 0, -2.0f, new FabricItemSettings().maxCount(1)));

    public static final Item BLACK_CONCRETE_SWORD = registerItem("black_concrete_sword",
            new SwordItem(ModToolMaterial.BLACK_CONCRETE, 3, -2.4f, new FabricItemSettings().maxCount(1)));
    public static final Item BLACK_CONCRETE_PICKAXE = registerItem("black_concrete_pickaxe",
            new PickaxeItem(ModToolMaterial.BLACK_CONCRETE, 1, -2.8f, new FabricItemSettings().maxCount(1)));
    public static final Item BLACK_CONCRETE_AXE = registerItem("black_concrete_axe",
            new AxeItem(ModToolMaterial.BLACK_CONCRETE, 8.0f, -3.2f, new FabricItemSettings().maxCount(1)));
    public static final Item BLACK_CONCRETE_SHOVEL = registerItem("black_concrete_shovel",
            new ShovelItem(ModToolMaterial.BLACK_CONCRETE, 1.5f, -3.0f, new FabricItemSettings().maxCount(1)));
    public static final Item BLACK_CONCRETE_HOE = registerItem("black_concrete_hoe",
            new HoeItem(ModToolMaterial.BLACK_CONCRETE, 0, -2.0f, new FabricItemSettings().maxCount(1)));

    public static final Item BROWN_CONCRETE_SWORD = registerItem("brown_concrete_sword",
            new SwordItem(ModToolMaterial.BROWN_CONCRETE, 3, -2.4f, new FabricItemSettings().maxCount(1)));
    public static final Item BROWN_CONCRETE_PICKAXE = registerItem("brown_concrete_pickaxe",
            new PickaxeItem(ModToolMaterial.BROWN_CONCRETE, 1, -2.8f, new FabricItemSettings().maxCount(1)));
    public static final Item BROWN_CONCRETE_AXE = registerItem("brown_concrete_axe",
            new AxeItem(ModToolMaterial.BROWN_CONCRETE, 8.0f, -3.2f, new FabricItemSettings().maxCount(1)));
    public static final Item BROWN_CONCRETE_SHOVEL = registerItem("brown_concrete_shovel",
            new ShovelItem(ModToolMaterial.BROWN_CONCRETE, 1.5f, -3.0f, new FabricItemSettings().maxCount(1)));
    public static final Item BROWN_CONCRETE_HOE = registerItem("brown_concrete_hoe",
            new HoeItem(ModToolMaterial.BROWN_CONCRETE, 0, -2.0f, new FabricItemSettings().maxCount(1)));

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

    public static final Item LIME_CONCRETE_SWORD = registerItem("lime_concrete_sword",
            new SwordItem(ModToolMaterial.LIME_CONCRETE, 3, -2.4f, new FabricItemSettings().maxCount(1)));
    public static final Item LIME_CONCRETE_PICKAXE = registerItem("lime_concrete_pickaxe",
            new PickaxeItem(ModToolMaterial.LIME_CONCRETE, 1, -2.8f, new FabricItemSettings().maxCount(1)));
    public static final Item LIME_CONCRETE_AXE = registerItem("lime_concrete_axe",
            new AxeItem(ModToolMaterial.LIME_CONCRETE, 8.0f, -3.2f, new FabricItemSettings().maxCount(1)));
    public static final Item LIME_CONCRETE_SHOVEL = registerItem("lime_concrete_shovel",
            new ShovelItem(ModToolMaterial.LIME_CONCRETE, 1.5f, -3.0f, new FabricItemSettings().maxCount(1)));
    public static final Item LIME_CONCRETE_HOE = registerItem("lime_concrete_hoe",
            new HoeItem(ModToolMaterial.LIME_CONCRETE, 0, -2.0f, new FabricItemSettings().maxCount(1)));

    public static final Item GREEN_CONCRETE_SWORD = registerItem("green_concrete_sword",
            new SwordItem(ModToolMaterial.GREEN_CONCRETE, 3, -2.4f, new FabricItemSettings().maxCount(1)));
    public static final Item GREEN_CONCRETE_PICKAXE = registerItem("green_concrete_pickaxe",
            new PickaxeItem(ModToolMaterial.GREEN_CONCRETE, 1, -2.8f, new FabricItemSettings().maxCount(1)));
    public static final Item GREEN_CONCRETE_AXE = registerItem("green_concrete_axe",
            new AxeItem(ModToolMaterial.GREEN_CONCRETE, 8.0f, -3.2f, new FabricItemSettings().maxCount(1)));
    public static final Item GREEN_CONCRETE_SHOVEL = registerItem("green_concrete_shovel",
            new ShovelItem(ModToolMaterial.GREEN_CONCRETE, 1.5f, -3.0f, new FabricItemSettings().maxCount(1)));
    public static final Item GREEN_CONCRETE_HOE = registerItem("green_concrete_hoe",
            new HoeItem(ModToolMaterial.GREEN_CONCRETE, 0, -2.0f, new FabricItemSettings().maxCount(1)));

    public static final Item CYAN_CONCRETE_SWORD = registerItem("cyan_concrete_sword",
            new SwordItem(ModToolMaterial.CYAN_CONCRETE, 3, -2.4f, new FabricItemSettings().maxCount(1)));
    public static final Item CYAN_CONCRETE_PICKAXE = registerItem("cyan_concrete_pickaxe",
            new PickaxeItem(ModToolMaterial.CYAN_CONCRETE, 1, -2.8f, new FabricItemSettings().maxCount(1)));
    public static final Item CYAN_CONCRETE_AXE = registerItem("cyan_concrete_axe",
            new AxeItem(ModToolMaterial.CYAN_CONCRETE, 8.0f, -3.2f, new FabricItemSettings().maxCount(1)));
    public static final Item CYAN_CONCRETE_SHOVEL = registerItem("cyan_concrete_shovel",
            new ShovelItem(ModToolMaterial.CYAN_CONCRETE, 1.5f, -3.0f, new FabricItemSettings().maxCount(1)));
    public static final Item CYAN_CONCRETE_HOE = registerItem("cyan_concrete_hoe",
            new HoeItem(ModToolMaterial.CYAN_CONCRETE, 0, -2.0f, new FabricItemSettings().maxCount(1)));

    public static final Item LIGHT_BLUE_CONCRETE_SWORD = registerItem("light_blue_concrete_sword",
            new SwordItem(ModToolMaterial.LIGHT_BLUE_CONCRETE, 3, -2.4f, new FabricItemSettings().maxCount(1)));
    public static final Item LIGHT_BLUE_CONCRETE_PICKAXE = registerItem("light_blue_concrete_pickaxe",
            new PickaxeItem(ModToolMaterial.LIGHT_BLUE_CONCRETE, 1, -2.8f, new FabricItemSettings().maxCount(1)));
    public static final Item LIGHT_BLUE_CONCRETE_AXE = registerItem("light_blue_concrete_axe",
            new AxeItem(ModToolMaterial.LIGHT_BLUE_CONCRETE, 8.0f, -3.2f, new FabricItemSettings().maxCount(1)));
    public static final Item LIGHT_BLUE_CONCRETE_SHOVEL = registerItem("light_blue_concrete_shovel",
            new ShovelItem(ModToolMaterial.LIGHT_BLUE_CONCRETE, 1.5f, -3.0f, new FabricItemSettings().maxCount(1)));
    public static final Item LIGHT_BLUE_CONCRETE_HOE = registerItem("light_blue_concrete_hoe",
            new HoeItem(ModToolMaterial.LIGHT_BLUE_CONCRETE, 0, -2.0f, new FabricItemSettings().maxCount(1)));

    public static final Item BLUE_CONCRETE_SWORD = registerItem("blue_concrete_sword",
            new SwordItem(ModToolMaterial.BLUE_CONCRETE, 3, -2.4f, new FabricItemSettings().maxCount(1)));
    public static final Item BLUE_CONCRETE_PICKAXE = registerItem("blue_concrete_pickaxe",
            new PickaxeItem(ModToolMaterial.BLUE_CONCRETE, 1, -2.8f, new FabricItemSettings().maxCount(1)));
    public static final Item BLUE_CONCRETE_AXE = registerItem("blue_concrete_axe",
            new AxeItem(ModToolMaterial.BLUE_CONCRETE, 8.0f, -3.2f, new FabricItemSettings().maxCount(1)));
    public static final Item BLUE_CONCRETE_SHOVEL = registerItem("blue_concrete_shovel",
            new ShovelItem(ModToolMaterial.BLUE_CONCRETE, 1.5f, -3.0f, new FabricItemSettings().maxCount(1)));
    public static final Item BLUE_CONCRETE_HOE = registerItem("blue_concrete_hoe",
            new HoeItem(ModToolMaterial.BLUE_CONCRETE, 0, -2.0f, new FabricItemSettings().maxCount(1)));

    public static final Item PURPLE_CONCRETE_SWORD = registerItem("purple_concrete_sword",
            new SwordItem(ModToolMaterial.PURPLE_CONCRETE, 3, -2.4f, new FabricItemSettings().maxCount(1)));
    public static final Item PURPLE_CONCRETE_PICKAXE = registerItem("purple_concrete_pickaxe",
            new PickaxeItem(ModToolMaterial.PURPLE_CONCRETE, 1, -2.8f, new FabricItemSettings().maxCount(1)));
    public static final Item PURPLE_CONCRETE_AXE = registerItem("purple_concrete_axe",
            new AxeItem(ModToolMaterial.PURPLE_CONCRETE, 8.0f, -3.2f, new FabricItemSettings().maxCount(1)));
    public static final Item PURPLE_CONCRETE_SHOVEL = registerItem("purple_concrete_shovel",
            new ShovelItem(ModToolMaterial.PURPLE_CONCRETE, 1.5f, -3.0f, new FabricItemSettings().maxCount(1)));
    public static final Item PURPLE_CONCRETE_HOE = registerItem("purple_concrete_hoe",
            new HoeItem(ModToolMaterial.PURPLE_CONCRETE, 0, -2.0f, new FabricItemSettings().maxCount(1)));

    public static final Item MAGENTA_CONCRETE_SWORD = registerItem("magenta_concrete_sword",
            new SwordItem(ModToolMaterial.MAGENTA_CONCRETE, 3, -2.4f, new FabricItemSettings().maxCount(1)));
    public static final Item MAGENTA_CONCRETE_PICKAXE = registerItem("magenta_concrete_pickaxe",
            new PickaxeItem(ModToolMaterial.MAGENTA_CONCRETE, 1, -2.8f, new FabricItemSettings().maxCount(1)));
    public static final Item MAGENTA_CONCRETE_AXE = registerItem("magenta_concrete_axe",
            new AxeItem(ModToolMaterial.MAGENTA_CONCRETE, 8.0f, -3.2f, new FabricItemSettings().maxCount(1)));
    public static final Item MAGENTA_CONCRETE_SHOVEL = registerItem("magenta_concrete_shovel",
            new ShovelItem(ModToolMaterial.MAGENTA_CONCRETE, 1.5f, -3.0f, new FabricItemSettings().maxCount(1)));
    public static final Item MAGENTA_CONCRETE_HOE = registerItem("magenta_concrete_hoe",
            new HoeItem(ModToolMaterial.MAGENTA_CONCRETE, 0, -2.0f, new FabricItemSettings().maxCount(1)));

    public static final Item PINK_CONCRETE_SWORD = registerItem("pink_concrete_sword",
            new SwordItem(ModToolMaterial.PINK_CONCRETE, 3, -2.4f, new FabricItemSettings().maxCount(1)));
    public static final Item PINK_CONCRETE_PICKAXE = registerItem("pink_concrete_pickaxe",
            new PickaxeItem(ModToolMaterial.PINK_CONCRETE, 1, -2.8f, new FabricItemSettings().maxCount(1)));
    public static final Item PINK_CONCRETE_AXE = registerItem("pink_concrete_axe",
            new AxeItem(ModToolMaterial.PINK_CONCRETE, 8.0f, -3.2f, new FabricItemSettings().maxCount(1)));
    public static final Item PINK_CONCRETE_SHOVEL = registerItem("pink_concrete_shovel",
            new ShovelItem(ModToolMaterial.PINK_CONCRETE, 1.5f, -3.0f, new FabricItemSettings().maxCount(1)));
    public static final Item PINK_CONCRETE_HOE = registerItem("pink_concrete_hoe",
            new HoeItem(ModToolMaterial.PINK_CONCRETE, 0, -2.0f, new FabricItemSettings().maxCount(1)));
    private static void addItemsToItemGroup(FabricItemGroupEntries entries)
    {
        entries.add(WHITE_CONCRETE_SWORD);
        entries.add(WHITE_CONCRETE_PICKAXE);
        entries.add(WHITE_CONCRETE_AXE);
        entries.add(WHITE_CONCRETE_SHOVEL);
        entries.add(WHITE_CONCRETE_HOE);

        entries.add(LIGHT_GRAY_CONCRETE_SWORD);
        entries.add(LIGHT_GRAY_CONCRETE_PICKAXE);
        entries.add(LIGHT_GRAY_CONCRETE_AXE);
        entries.add(LIGHT_GRAY_CONCRETE_SHOVEL);
        entries.add(LIGHT_GRAY_CONCRETE_HOE);

        entries.add(GRAY_CONCRETE_SWORD);
        entries.add(GRAY_CONCRETE_PICKAXE);
        entries.add(GRAY_CONCRETE_AXE);
        entries.add(GRAY_CONCRETE_SHOVEL);
        entries.add(GRAY_CONCRETE_HOE);

        entries.add(BLACK_CONCRETE_SWORD);
        entries.add(BLACK_CONCRETE_PICKAXE);
        entries.add(BLACK_CONCRETE_AXE);
        entries.add(BLACK_CONCRETE_SHOVEL);
        entries.add(BLACK_CONCRETE_HOE);

        entries.add(BROWN_CONCRETE_SWORD);
        entries.add(BROWN_CONCRETE_PICKAXE);
        entries.add(BROWN_CONCRETE_AXE);
        entries.add(BROWN_CONCRETE_SHOVEL);
        entries.add(BROWN_CONCRETE_HOE);

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

        entries.add(LIME_CONCRETE_SWORD);
        entries.add(LIME_CONCRETE_PICKAXE);
        entries.add(LIME_CONCRETE_AXE);
        entries.add(LIME_CONCRETE_SHOVEL);
        entries.add(LIME_CONCRETE_HOE);

        entries.add(GREEN_CONCRETE_SWORD);
        entries.add(GREEN_CONCRETE_PICKAXE);
        entries.add(GREEN_CONCRETE_AXE);
        entries.add(GREEN_CONCRETE_SHOVEL);
        entries.add(GREEN_CONCRETE_HOE);

        entries.add(CYAN_CONCRETE_SWORD);
        entries.add(CYAN_CONCRETE_PICKAXE);
        entries.add(CYAN_CONCRETE_AXE);
        entries.add(CYAN_CONCRETE_SHOVEL);
        entries.add(CYAN_CONCRETE_HOE);

        entries.add(LIGHT_BLUE_CONCRETE_SWORD);
        entries.add(LIGHT_BLUE_CONCRETE_PICKAXE);
        entries.add(LIGHT_BLUE_CONCRETE_AXE);
        entries.add(LIGHT_BLUE_CONCRETE_SHOVEL);
        entries.add(LIGHT_BLUE_CONCRETE_HOE);

        entries.add(BLUE_CONCRETE_SWORD);
        entries.add(BLUE_CONCRETE_PICKAXE);
        entries.add(BLUE_CONCRETE_AXE);
        entries.add(BLUE_CONCRETE_SHOVEL);
        entries.add(BLUE_CONCRETE_HOE);

        entries.add(PURPLE_CONCRETE_SWORD);
        entries.add(PURPLE_CONCRETE_PICKAXE);
        entries.add(PURPLE_CONCRETE_AXE);
        entries.add(PURPLE_CONCRETE_SHOVEL);
        entries.add(PURPLE_CONCRETE_HOE);

        entries.add(MAGENTA_CONCRETE_SWORD);
        entries.add(MAGENTA_CONCRETE_PICKAXE);
        entries.add(MAGENTA_CONCRETE_AXE);
        entries.add(MAGENTA_CONCRETE_SHOVEL);
        entries.add(MAGENTA_CONCRETE_HOE);

        entries.add(PINK_CONCRETE_SWORD);
        entries.add(PINK_CONCRETE_PICKAXE);
        entries.add(PINK_CONCRETE_AXE);
        entries.add(PINK_CONCRETE_SHOVEL);
        entries.add(PINK_CONCRETE_HOE);
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
