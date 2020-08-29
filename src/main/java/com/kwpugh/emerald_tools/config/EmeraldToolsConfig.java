package com.kwpugh.emerald_tools.config;

import com.kwpugh.emerald_tools.EmeraldTools;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;

@Config(name=EmeraldTools.MOD_ID)
public class EmeraldToolsConfig implements ConfigData
{
	public DurabilityMultiplier DURABILITYMULTIPLIER = new DurabilityMultiplier();

	public static class DurabilityMultiplier
	{
		public int durabilityMultiplier = 1;
	}
}