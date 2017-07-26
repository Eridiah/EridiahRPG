package com.eridianrpg.common.blocks;

import com.eridianrpg.Reference;
import com.eridianrpg.client.handler.EnumHandler;
import com.eridianrpg.common.blocks.item.ItemBlockMeta;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block CORNERSTONE;
	
	// Ores
	public static Block AZUMERITE_ORE;
	
	// Stone Types
	public static Block LIMESTONE;
	public static Block ROUGH_LIMESTONE;
	public static Block FISHSCALE_COBBLE;
	
	// Decoration
	public static Block SUGAR_CANE;
	public static Block THATCH;

	public static void init() {
		CORNERSTONE = new BlockConnectedTextures("cornerstone", SoundType.STONE).setResistance(30).setHardness(1.5F);
		
		// Ores
		AZUMERITE_ORE = new BlockAzumeriteOre("azumerite_ore", false);
		
		// Stone Types
		LIMESTONE = new BlockBasicStone("limestone");
		ROUGH_LIMESTONE = new BlockBasicStone("rough_limestone").setHardness(2.0F);
		FISHSCALE_COBBLE = new BlockFishscaleCobble("fishscale_cobble");
		
		// Decoration
		SUGAR_CANE = new BlockSugarCane("sugar_cane");
		THATCH = new BlockThatch("thatch");
		
	}
	
	public static void register() {
		//Regular Blocks
		registerBlock(CORNERSTONE);
		registerBlock(LIMESTONE);
		registerBlock(ROUGH_LIMESTONE);
		registerBlock(THATCH);
		registerBlock(FISHSCALE_COBBLE);
		registerBlock(AZUMERITE_ORE);
		
		// Metadata Blocks
		registerBlock(SUGAR_CANE, new ItemBlockMeta(SUGAR_CANE));
	}
	
	public static void registerRenders() {
		// Regular Blocks
		registerRender(CORNERSTONE);
		registerRender(LIMESTONE);
		registerRender(ROUGH_LIMESTONE);
		registerRender(THATCH);
		registerRender(FISHSCALE_COBBLE);
		registerRender(AZUMERITE_ORE);
		
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
