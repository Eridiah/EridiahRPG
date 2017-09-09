package com.eridianrpg;

import net.minecraft.creativetab.CreativeTabs;

import com.eridianrpg.client.creativetabs.TabERPGBlocks;
import com.eridianrpg.client.creativetabs.TabERPGFood;
import com.eridianrpg.client.creativetabs.TabERPGItems;

public class Reference {

	public static final String MODID = "erpg";
	public static final String VERSION = "Pre-Alpha v0.1";
	public static final String NAME = "Eridian RPG";
	public static final String ACCEPTED_VERSIONS = "1.10.2";
	
	public static final String COMMON_PROXY_CLASS = "com.eridianrpg.common.CommonProxy";
	public static final String CLIENT_PROXY_CLASS = "com.eridianrpg.client.ClientProxy";
	
	// Creative Tabs
	public static final CreativeTabs FOOD_TAB = new TabERPGFood();
	public static final CreativeTabs BLOCKS_TAB = new TabERPGBlocks();
	public static final CreativeTabs ITEMS_TAB = new TabERPGItems();
	
}
