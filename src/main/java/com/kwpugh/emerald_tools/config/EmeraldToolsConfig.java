package com.kwpugh.emerald_tools.config;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;
import me.sargunvohra.mcmods.autoconfig1u.serializer.PartitioningSerializer;
import me.sargunvohra.mcmods.autoconfig1u.shadowed.blue.endless.jankson.Comment;

@Config(name = "emerald_tools")
public class EmeraldToolsConfig extends PartitioningSerializer.GlobalData 
{
    public General GENERAL = new General();
    
    @Config(name = "general")
	public static class General implements ConfigData
	{       
    	@Comment("\n"
    			+"\n"
    			+"******************************"
    			+"\nMATERIAL MODIFIERS"
    			+"\nNOTE: affects all tools or armors"
    			+"\nand adds to bases values for each."
    			+"\n(Only use positive numbers)"
    			+"\n******************************")
		public int toolDurabilityAddition = 0;
		public float toolAttackAddition = (float) 0.0;
		public int armorDurabilityAddition = 0;
		
    	@Comment("\n"
    			+"\n"
    			+"******************************"
    			+"\nEXTRA TOOLS"
    			+"\nAffects Paxels, Hammers, & Excavators"
    			+"\n******************************")
    	public boolean enableHammers = true;
    	public boolean enableExcavators = true;
    	public boolean enablePaxels = true;
    	
    	@Comment("\n"
    			+"\n"
    			+"******************************"
    			+"\nSETS"
    			+"\nArmors, Tools, & Weapons"
    			+"\n******************************")
    	public boolean enableEmeraldSet = true;
    	public boolean enableRubySet = true;
    	public boolean enableSteelSet = true;
    	public boolean enableObsidianSet = true;
	}
}