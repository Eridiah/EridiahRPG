package com.eridianrpg.common.blocks;

import com.eridianrpg.Reference;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	// Decoration
	public static Block SUGAR_CANE_BLOCK;

	public static void init() {
		SUGAR_CANE_BLOCK = new BlockSugarcaneBlock("sugar_cane_block");
	}
	
	public static void register() {
		registerBlock(SUGAR_CANE_BLOCK);
	}
	
	public static void registerRenders() {
		registerRender(SUGAR_CANE_BLOCK);
	}
	
	public static void registerBlock(Block block) {
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}
	
	private static void registerRender(Block block) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
	}
	
}
