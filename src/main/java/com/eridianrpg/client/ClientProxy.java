package com.eridianrpg.client;

import com.eridianrpg.Reference;
import com.eridianrpg.common.CommonProxy;
import com.eridianrpg.common.blocks.ModBlocks;
import com.eridianrpg.common.items.ModItems;

import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void init() {
		
	}
	
	@Override
	public void registerRenders() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}

	@Override
	public void registerModelBakeryVariants() {
		ModelBakery.registerItemVariants(Item.getItemFromBlock(ModBlocks.SUGAR_CANE),
				new ResourceLocation(Reference.MODID, "sugar_cane_bale"),
				new ResourceLocation(Reference.MODID, "sugar_cane_block"));
		
	}
	
}
