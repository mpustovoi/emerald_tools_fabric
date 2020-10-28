package com.kwpugh.emerald_tools.init;

import com.kwpugh.emerald_tools.EmeraldTools;
import com.kwpugh.emerald_tools.items.ModArmor;
import com.kwpugh.emerald_tools.items.ModAxe;
import com.kwpugh.emerald_tools.items.ModBow;
import com.kwpugh.emerald_tools.items.ModHoe;
import com.kwpugh.emerald_tools.items.ModPickaxe;
import com.kwpugh.emerald_tools.items.ModShovel;
import com.kwpugh.emerald_tools.items.ModSword;
import com.kwpugh.emerald_tools.materials.ModArmorMaterials;
import com.kwpugh.emerald_tools.materials.ModToolMaterials;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemInit
{
	public static final Item RUBY = new Item((new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP));
	public static final Item STEEL_INGOT = new Item((new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP));
	
	public static final Item EMERALD_SWORD = new ModSword(ModToolMaterials.EMERALD, 3, -2.4F, new Item.Settings().group(EmeraldTools.EMERALD_TOOLS_GROUP));
	public static final Item EMERALD_BOW = new ModBow((new Item.Settings()).maxDamage(725).group(EmeraldTools.EMERALD_TOOLS_GROUP));
	public static final Item EMERALD_PICKAXE = new ModPickaxe(ModToolMaterials.EMERALD, 1, -2.8F, new Item.Settings().group(EmeraldTools.EMERALD_TOOLS_GROUP));
	public static final Item EMERALD_AXE = new ModAxe(ModToolMaterials.EMERALD, 5.0F, -3.0F, new Item.Settings().group(EmeraldTools.EMERALD_TOOLS_GROUP));
	public static final Item EMERALD_SHOVEL = new ModShovel(ModToolMaterials.EMERALD, 1.5F, -3.0F, new Item.Settings().group(EmeraldTools.EMERALD_TOOLS_GROUP));
	public static final Item EMERALD_HOE = new ModHoe(ModToolMaterials.EMERALD, -3, 0.0F, new Item.Settings().group(EmeraldTools.EMERALD_TOOLS_GROUP));
	 
	public static final Item EMERALD_HELMET = new ModArmor(ModArmorMaterials.EMERALD, EquipmentSlot.HEAD, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP));
	public static final Item EMERALD_CHESTPLATE = new ModArmor(ModArmorMaterials.EMERALD, EquipmentSlot.CHEST, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP));
	public static final Item EMERALD_LEGGINGS = new ModArmor(ModArmorMaterials.EMERALD, EquipmentSlot.LEGS, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP));
	public static final Item EMERALD_BOOTS = new ModArmor(ModArmorMaterials.EMERALD, EquipmentSlot.FEET, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP));
	 	 
	public static final Item RUBY_SWORD = new ModSword(ModToolMaterials.RUBY, 3, -2.4F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP));
	public static final Item RUBY_BOW = new ModBow((new Item.Settings()).maxDamage(960).group(EmeraldTools.EMERALD_TOOLS_GROUP));
	public static final Item RUBY_STEEL_SWORD = new ModSword(ModToolMaterials.RUBY, 3, -2.4F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP));
	public static final Item RUBY_PICKAXE = new ModPickaxe(ModToolMaterials.RUBY, 1, -2.8F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP));
	public static final Item RUBY_AXE = new ModAxe(ModToolMaterials.RUBY, 5.0F, -3.0F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP));
	public static final Item RUBY_SHOVEL = new ModShovel(ModToolMaterials.RUBY, 1.5F, -3.0F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP));
	public static final Item RUBY_HOE = new ModHoe(ModToolMaterials.RUBY, -3, 0.0F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP));
		
	public static final Item RUBY_HELMET = new ModArmor(ModArmorMaterials.RUBY, EquipmentSlot.HEAD, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP));
	public static final Item RUBY_CHESTPLATE  = new ModArmor(ModArmorMaterials.RUBY, EquipmentSlot.CHEST, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP));
	public static final Item RUBY_LEGGINGS = new ModArmor(ModArmorMaterials.RUBY, EquipmentSlot.LEGS, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP));
	public static final Item RUBY_BOOTS = new ModArmor(ModArmorMaterials.RUBY, EquipmentSlot.FEET, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP));
			 
	public static final Item STEEL_SWORD = new ModSword(ModToolMaterials.STEEL, 3, -2.4F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP));
	public static final Item STEEL_BOW = new ModBow((new Item.Settings()).maxDamage(512).group(EmeraldTools.EMERALD_TOOLS_GROUP));
	public static final Item STEEL_PICKAXE = new ModPickaxe(ModToolMaterials.STEEL, 1, -2.8F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP));
	public static final Item STEEL_AXE = new ModAxe(ModToolMaterials.STEEL, 6.0F, -3.1F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP));
	public static final Item STEEL_SHOVEL = new ModShovel(ModToolMaterials.STEEL, 1.5F, -3.0F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP));
	public static final Item STEEL_HOE = new ModHoe(ModToolMaterials.STEEL, -2, -1.0F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP));
		
	public static final Item STEEL_HELMET = new ModArmor(ModArmorMaterials.STEEL, EquipmentSlot.HEAD, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP));
	public static final Item STEEL_CHESTPLATE = new ModArmor(ModArmorMaterials.STEEL, EquipmentSlot.CHEST, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP));
	public static final Item STEEL_LEGGINGS = new ModArmor(ModArmorMaterials.STEEL, EquipmentSlot.LEGS, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP));
	public static final Item STEEL_BOOTS = new ModArmor(ModArmorMaterials.STEEL, EquipmentSlot.FEET, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP));	
	
	public static final Item OBSIDIAN_SWORD = new ModSword(ModToolMaterials.OBSIDIAN, 3, -2.4F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP));
	public static final Item OBSIDIAN_BOW = new ModBow((new Item.Settings()).maxDamage(650).group(EmeraldTools.EMERALD_TOOLS_GROUP));
	public static final Item OBSIDIAN_PICKAXE = new ModPickaxe(ModToolMaterials.OBSIDIAN, 1, -2.8F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP));
	public static final Item OBSIDIAN_AXE = new ModAxe(ModToolMaterials.OBSIDIAN, 6.0F, -3.1F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP));
	public static final Item OBSIDIAN_SHOVEL = new ModShovel(ModToolMaterials.OBSIDIAN, 1.5F, -3.0F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP));
	public static final Item OBSIDIAN_HOE = new ModHoe(ModToolMaterials.OBSIDIAN, -2, -1.0F, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP));
		
	public static final Item OBSIDIAN_HELMET = new ModArmor(ModArmorMaterials.OBSIDIAN, EquipmentSlot.HEAD, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP));
	public static final Item OBSIDIAN_CHESTPLATE = new ModArmor(ModArmorMaterials.OBSIDIAN, EquipmentSlot.CHEST, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP));
	public static final Item OBSIDIAN_LEGGINGS = new ModArmor(ModArmorMaterials.OBSIDIAN, EquipmentSlot.LEGS, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP));
	public static final Item OBSIDIAN_BOOTS = new ModArmor(ModArmorMaterials.OBSIDIAN, EquipmentSlot.FEET, (new Item.Settings()).group(EmeraldTools.EMERALD_TOOLS_GROUP));	

	public static void registerItems()
	{		
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "ruby"), RUBY);
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "steel_ingot"), STEEL_INGOT);
		 
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "emerald_sword"), EMERALD_SWORD);
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "emerald_bow"), EMERALD_BOW);
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "emerald_pickaxe"), EMERALD_PICKAXE);
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "emerald_axe"), EMERALD_AXE);
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "emerald_shovel"), EMERALD_SHOVEL);
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "emerald_hoe"), EMERALD_HOE);
		 
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "emerald_helmet"), EMERALD_HELMET);
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "emerald_chestplate"), EMERALD_CHESTPLATE);
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "emerald_leggings"), EMERALD_LEGGINGS);
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "emerald_boots"), EMERALD_BOOTS);

		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "ruby_sword"), RUBY_SWORD);
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "ruby_bow"), RUBY_BOW);
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "ruby_steel_sword"), RUBY_STEEL_SWORD);
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "ruby_pickaxe"), RUBY_PICKAXE);
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "ruby_axe"), RUBY_AXE);
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "ruby_shovel"), RUBY_SHOVEL);
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "ruby_hoe"), RUBY_HOE);
		 
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "ruby_helmet"), RUBY_HELMET);
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "ruby_chestplate"), RUBY_CHESTPLATE);
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "ruby_leggings"), RUBY_LEGGINGS);
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "ruby_boots"), RUBY_BOOTS);
		 
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "steel_sword"), STEEL_SWORD);
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "steel_bow"), STEEL_BOW);
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "steel_pickaxe"), STEEL_PICKAXE);
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "steel_axe"), STEEL_AXE);
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "steel_shovel"), STEEL_SHOVEL);
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "steel_hoe"), STEEL_HOE);
		 
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "steel_helmet"), STEEL_HELMET);
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "steel_chestplate"), STEEL_CHESTPLATE);
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "steel_leggings"), STEEL_LEGGINGS);
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "steel_boots"), STEEL_BOOTS);
		 
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "obsidian_sword"), OBSIDIAN_SWORD);
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "obsidian_bow"), OBSIDIAN_BOW);
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "obsidian_pickaxe"), OBSIDIAN_PICKAXE);
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "obsidian_axe"), OBSIDIAN_AXE);
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "obsidian_shovel"), OBSIDIAN_SHOVEL);
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "obsidian_hoe"), OBSIDIAN_HOE);
		 
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "obsidian_helmet"), OBSIDIAN_HELMET);
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "obsidian_chestplate"), OBSIDIAN_CHESTPLATE);
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "obsidian_leggings"), OBSIDIAN_LEGGINGS);
		 Registry.register(Registry.ITEM, new Identifier("emerald_tools", "obsidian_boots"), OBSIDIAN_BOOTS);
	 }	 
}

