package com.eridianrpg.client.creativetabs;

import com.eridianrpg.common.items.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabERPGItems extends CreativeTabs {

	public TabERPGItems() {
		super("erpgitems");
	}
	
	@Override
	public Item getTabIconItem() {
		return ModItems.AZUMERITE;
	}
	
}
