package com.eridianrpg.common.items;

import com.eridianrpg.Reference;

import net.minecraft.item.ItemFood;
import net.minecraft.util.ResourceLocation;

public class ItemFish extends ItemFood {

	public ItemFish(int amount, float saturation, boolean isWolfFood, String unlocalizedName) {
		super(amount, saturation, isWolfFood);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
	}
	
}
