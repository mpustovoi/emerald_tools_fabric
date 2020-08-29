package com.kwpugh.emerald_tools.config;

import com.kwpugh.emerald_tools.EmeraldTools;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;

@Config(name=EmeraldTools.MOD_ID)
public class EmeraldToolsConfig implements ConfigData
{
	public ToolDurabilityAddition TOOL_DURABILITY_ADDITION = new ToolDurabilityAddition();
	public ToolAttackAddition TOOL_ATTACK_ADDITION = new ToolAttackAddition();
	public ArmorDurabilityAddition ARMOR_DURABILITY_ADDITION = new ArmorDurabilityAddition();
		
	public static class ToolDurabilityAddition
	{
		public int toolDurabilityAddition = 0;
	}
	
	public static class ToolAttackAddition
	{
		public float toolAttackAddition = (float) 0.0;
	}
	
	public static class ArmorDurabilityAddition
	{
		public int armorDurabilityAddition = 0;
	}
}