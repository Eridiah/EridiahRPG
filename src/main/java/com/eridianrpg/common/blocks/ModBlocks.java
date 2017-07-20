package com.eridianrpg.common.blocks;

import com.eridianrpg.Reference;
import com.eridianrpg.client.handler.EnumHandler;
import com.eridianrpg.common.blocks.item.ItemBlockMeta;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	// Decoration
	public static Block SUGAR_CANE;

	public static void init() {
		SUGAR_CANE = new BlockSugarCane("sugar_cane");
	}
	
	public static void register() {
		// Metadata Blocks
		registerBlock(SUGAR_CANE, new ItemBlockMeta(SUGAR_CANE));
	}
	
	public static void registerRenders() {
		// Metadata Blocks
		for(int i = 0; i < EnumHandler.SugarcaneType.values().length; i++) {
			registerRender(SUGAR_CANE, i, "sugar_cane_" + EnumHandler.SugarcaneType.values()[i].getName());
		}
	}
	
	public static void registerBlock(Block block) {
		block.setCreativeTab(Reference.BLOCKS_TAB);
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}
	
	public static void registerBlock(Block block, ItemBlock itemBlock) {
		block.setCreativeTab(Reference.BLOCKS_TAB);
		GameRegistry.register(block);
		GameRegistry.register(itemBlock.setRegistryName(block.getRegistryName()));
	}
	
	private static void registerRender(Block block) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
	}
	
	private static void registerRender(Block block, int meta, String fileName) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(new ResourceLocation(Reference.MODID, fileName), "inventory"));
	}
	
}