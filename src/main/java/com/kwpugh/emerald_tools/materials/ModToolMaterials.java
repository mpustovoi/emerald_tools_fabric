package com.kwpugh.emerald_tools.materials;

import java.util.function.Supplier;

import com.kwpugh.emerald_tools.init.ItemInit;
import com.kwpugh.emerald_tools.EmeraldTools;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

public enum ModToolMaterials implements ToolMaterial
{
	STEEL(3, 512, 7.0F, 2.0F, 25, () -> {
		return Ingredient.ofItems(ItemInit.STEEL_INGOT);
		}),

	OBSIDIAN(3, 650, 5.5F, 1.5F, 18, () -> {
		return Ingredient.ofItems(Items.OBSIDIAN);
		}),

	EMERALD(3, 725, 8.0F, 3.0F, 25, () -> {
		return Ingredient.ofItems(Items.EMERALD);
		}),

	RUBY(3, 960, 8.0F, 3.0F, 25, () -> {
		return Ingredient.ofItems(ItemInit.RUBY);
		}),
	
	RUBY_STEEL(3, 1102, 8.0F, 3.0F, 25, () -> {
		return Ingredient.ofItems(ItemInit.RUBY);
		});

   private final int miningLevel;
   private final int itemDurability;
   private final float miningSpeed;
   private final float attackDamage;
   private final int enchantability;
   private final Lazy<Ingredient> repairIngredient;

   private int toolDurabilityAdditionFromConfig = EmeraldTools.getConfig().TOOL_DURABILITY_ADDITION.toolDurabilityAddition;
   private float toolAttackAdditionFromConfig = EmeraldTools.getConfig().TOOL_ATTACK_ADDITION.toolAttackAddition;
	
   private ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantibility, Supplier<Ingredient> repairIngredient)
   {
      this.miningLevel = miningLevel;
      this.itemDurability = itemDurability + toolDurabilityAdditionFromConfig;
      this.miningSpeed = miningSpeed;
      this.attackDamage = attackDamage + toolAttackAdditionFromConfig;
      this.enchantability = enchantibility;
      this.repairIngredient = new Lazy(repairIngredient);
   }

   public int getDurability()
   {
      return this.itemDurability;
   }

   public float getMiningSpeedMultiplier()
   {
      return this.miningSpeed;
   }

   public float getAttackDamage()
   {
      return this.attackDamage;
   }

   public int getMiningLevel()
   {
      return this.miningLevel;
   }

   public int getEnchantability()
   {
      return this.enchantability;
   }

   public Ingredient getRepairIngredient()
   {
      return (Ingredient)this.repairIngredient.get();
   }
}
