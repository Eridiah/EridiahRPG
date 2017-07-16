package com.eridianrpg.common.items;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

import com.eridianrpg.Reference;

public class ItemFish extends Item {
	
	public ItemFish(String unlocalizedName) {
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
	}

}
