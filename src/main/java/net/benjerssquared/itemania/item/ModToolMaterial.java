package net.benjerssquared.itemania.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {

    WHITE_CONCRETE(MiningLevels.STONE, 211, 3.5f, 1.0f, 5, () -> Ingredient.ofItems(Items.WHITE_CONCRETE)),
    LIGHT_GRAY_CONCRETE(MiningLevels.STONE, 211, 3.5f, 1.0f, 5, () -> Ingredient.ofItems(Items.LIGHT_GRAY_CONCRETE)),
    GRAY_CONCRETE(MiningLevels.STONE, 211, 3.5f, 1.0f, 5, () -> Ingredient.ofItems(Items.GRAY_CONCRETE)),
    BLACK_CONCRETE(MiningLevels.STONE, 211, 3.5f, 1.0f, 5, () -> Ingredient.ofItems(Items.BLACK_CONCRETE)),
    BROWN_CONCRETE(MiningLevels.STONE, 211, 3.5f, 1.0f, 5, () -> Ingredient.ofItems(Items.BROWN_CONCRETE)),
    RED_CONCRETE(MiningLevels.STONE, 211, 3.5f, 1.0f, 5, () -> Ingredient.ofItems(Items.RED_CONCRETE)),
    ORANGE_CONCRETE(MiningLevels.STONE, 211, 3.5f, 1.0f, 5, () -> Ingredient.ofItems(Items.ORANGE_CONCRETE)),
    YELLOW_CONCRETE(MiningLevels.STONE, 211, 3.5f, 1.0f, 5, () -> Ingredient.ofItems(Items.YELLOW_CONCRETE)),
    LIME_CONCRETE(MiningLevels.STONE, 211, 3.5f, 1.0f, 5, () -> Ingredient.ofItems(Items.LIME_CONCRETE)),
    GREEN_CONCRETE(MiningLevels.STONE, 211, 3.5f, 1.0f, 5, () -> Ingredient.ofItems(Items.GREEN_CONCRETE)),
    CYAN_CONCRETE(MiningLevels.STONE, 211, 3.5f, 1.0f, 5, () -> Ingredient.ofItems(Items.CYAN_CONCRETE)),
    LIGHT_BLUE_CONCRETE(MiningLevels.STONE, 211, 3.5f, 1.0f, 5, () -> Ingredient.ofItems(Items.LIGHT_BLUE_CONCRETE)),
    BLUE_CONCRETE(MiningLevels.STONE, 211, 3.5f, 1.0f, 5, () -> Ingredient.ofItems(Items.BLUE_CONCRETE)),
    PURPLE_CONCRETE(MiningLevels.STONE, 211, 3.5f, 1.0f, 5, () -> Ingredient.ofItems(Items.PURPLE_CONCRETE)),
    MAGENTA_CONCRETE(MiningLevels.STONE, 211, 3.5f, 1.0f, 5, () -> Ingredient.ofItems(Items.MAGENTA_CONCRETE)),
    PINK_CONCRETE(MiningLevels.STONE, 211, 3.5f, 1.0f, 5, () -> Ingredient.ofItems(Items.PINK_CONCRETE));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }
    @Override
    public int getDurability()
    {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier()
    {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage()
    {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel()
    {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability()
    {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return this.repairIngredient.get();
    }
}
