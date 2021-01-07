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
    			+"\n"
    			+"******************************"
    			+"\nEXTRA TOOLS"
    			+"\nAffects Paxels, Hammers,"
      			+"\nExcavators, & TreeAxes"
    			+"\n******************************")
    	public boolean enableHammers = true;
    	public boolean enableExcavators = true;
    	public boolean enablePaxels = true;
    	public boolean enableTreeAxes = true;
    	
    	@Comment("\n"
    			+"\n" 			
				+"\n"
    			+"******************************"
    			+"\nSETS"
    			+"\nArmors, Tools, & Weapons"
    			+"\n******************************")
    	public boolean enableEmeraldSet = true;
    	public boolean enableRubySet = true;
    	public boolean enableSteelSet = true;
    	public boolean enableObsidianSet = true;
    	
       	@Comment("\n"
    			+"\n"
    			+"\n"
    			+"******************************"
    			+"\nEMERALD TOOL MATERIAL"
    			+"\n******************************")
    	public int emeraldDurability = 725;
       	public float emeraldtMiningSpeed = 8.0F;
       	public float emeraldAttackDamage = 3.0F;
       	public int emeraldMiningLevel = 3;
       	public int emeraldEnchantability = 10;

      	@Comment("\n"
    			+"\n"
    			+"\n"
    			+"******************************"
    			+"\nEMERALD ARMOR MATERIAL"
    			+"\n******************************")
    	public int emeraldDurabilityMultiplier = 26;
      	public int emeraldArmorEnchantability = 12;
      	public float emeraldToughness = 2.0F;
      	public float emeraldKnockbackResistance = 0.0F;
      	
       	@Comment("\n"
    			+"\n"
    			+"\n"
    			+"******************************"
    			+"\nRUBY TOOL MATERIAL"
    			+"\n******************************")
    	public int rubyDurability = 960;
       	public float rubyMiningSpeed = 8.0F;
       	public float rubyAttackDamage = 3.0F;
       	public int rubyMiningLevel = 3;
       	public int rubyEnchantability = 10;
       	
       	@Comment("\n"
    			+"\n"
    			+"\n"
    			+"******************************"
    			+"\nRUBY ARMOR MATERIAL"
    			+"\n******************************")
    	public int rubyDurabilityMultiplier = 29;
      	public int rubyArmorEnchantability = 12;
      	public float rubyToughness = 2.0F;
      	public float rubyKnockbackResistance = 0.0F;
      	
       	@Comment("\n"
    			+"\n"
    			+"\n"
    			+"******************************"
    			+"\nSTEEL TOOL MATERIAL"
    			+"\n******************************")
    	public int steelDurability = 512;
       	public float steelMiningSpeed = 7.0F;
       	public float steelAttackDamage = 2.0F;
       	public int steelMiningLevel = 3;
       	public int steelEnchantability = 9;
       	
       	@Comment("\n"
    			+"\n"
    			+"\n"
    			+"******************************"
    			+"\nSTEEL ARMOR MATERIAL"
    			+"\n******************************")
    	public int steelDurabilityMultiplier = 21;
      	public int steelArmorEnchantability = 9;
      	public float steelToughness = 1.0F;
      	public float steelKnockbackResistance = 0.5F;
      	
       	@Comment("\n"
    			+"\n"
    			+"\n"
    			+"******************************"
    			+"\nOBSIDIAN TOOL MATERIAL"
    			+"\n******************************")
    	public int obsidianDurability = 650;
       	public float obsidianMiningSpeed = 5.5F;
       	public float obsidianAttackDamage = 1.5F;
       	public int obsidianMiningLevel = 3;
       	public int obsidianEnchantability = 4;
       	
       	@Comment("\n"
    			+"\n"
    			+"\n"
    			+"******************************"
    			+"\nOBSIDIAN ARMOR MATERIAL"
    			+"\n******************************")
    	public int obsidianDurabilityMultiplier = 24;
      	public int obsidianArmorEnchantability = 4;
      	public float obsidianToughness = 1.0F;
      	public float obsidianKnockbackResistance = 0.5F;
      	
       	@Comment("\n"
    			+"\n"
    			+"\n"
    			+"******************************"
    			+"\nRUBY STEEL SWORD MATERIAL"
    			+"\n******************************")
    	public int rubySteelDurability = 1102;
       	public float rubySteelMiningSpeed = 8.0F;
       	public float rubySteelAttackDamage = 3.0F;
       	public int rubySteelMiningLevel = 3;
       	public int rubySteelEnchantability = 12;     	
	}
}