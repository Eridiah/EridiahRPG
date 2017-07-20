package com.eridianrpg.client.creativetabs;

import com.eridianrpg.common.blocks.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TabERPGBlocks extends CreativeTabs {

	public TabERPGBlocks() {
		super("erpgblocks");
	}
	
	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(ModBlocks.SUGAR_CANE);
	}

}
