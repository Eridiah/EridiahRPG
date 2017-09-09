package com.eridianrpg.common.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import com.eridianrpg.Reference;

public class ItemAzumerite extends Item {

	public ItemAzumerite(String unlocalizedName) {
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
	}
	
	@Override
	public boolean hasEffect(ItemStack stack) {
		return true;
	}
	
}
