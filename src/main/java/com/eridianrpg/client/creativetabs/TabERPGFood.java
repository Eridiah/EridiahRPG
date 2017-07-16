package com.eridianrpg.client.creativetabs;

import com.eridianrpg.common.items.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabERPGFood extends CreativeTabs {

	public TabERPGFood() {
		super("erpgfood");
	}
	
	@Override
	public Item getTabIconItem() {
		return ModItems.FISH_TUNA_COOKED;
	}
	
}
