package com.eridianrpg.common.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.eridianrpg.Reference;

public class ModItems {
	
	// Fish
	public static Item FISH_TUNA_RAW;
	public static Item FISH_TUNA_COOKED;

	public static void init() {
		FISH_TUNA_RAW = new ItemFish(2, 0.4F, false, "fish_tuna_raw");
		FISH_TUNA_COOKED = new ItemFish(5, 6.0F, false, "fish_tuna_cooked");
	}
	
	public static void register() {
		registerItem(FISH_TUNA_RAW);
		registerItem(FISH_TUNA_COOKED);
	}
	
	public static void registerRenders() {
		registerRender(FISH_TUNA_RAW);
		registerRender(FISH_TUNA_COOKED);
	}
	
	public static void registerItem(Item item) {
		item.setCreativeTab(Reference.FOOD_TAB);
		GameRegistry.register(item);
	}
	
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
	}
	
}
