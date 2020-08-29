package com.kwpugh.emerald_tools;

import com.kwpugh.emerald_tools.config.EmeraldToolsConfig;
import com.kwpugh.emerald_tools.init.BlockInit;
import com.kwpugh.emerald_tools.init.ItemInit;

import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.serializer.GsonConfigSerializer;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class EmeraldTools implements ModInitializer
{	
    public static final String MOD_ID = "emerald_tools";

    public static final ItemGroup EMERALD_TOOLS_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "emerald_tools_group"), () -> new ItemStack(ItemInit.EMERALD_SWORD));
    
    @Override
    public void onInitialize()
    {
    	AutoConfig.register(EmeraldToolsConfig.class, GsonConfigSerializer::new);
    	
    	BlockInit.registerBlocks();
    	BlockInit.registerBlockItems();
    	
    	ItemInit.registerItems();
    }
    
    public static EmeraldToolsConfig getConfig()
    {
        return AutoConfig.getConfigHolder(EmeraldToolsConfig.class).getConfig();
    }
}
