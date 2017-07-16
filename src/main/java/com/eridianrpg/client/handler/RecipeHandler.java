package com.eridianrpg.client.handler;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.eridianrpg.common.items.ModItems;

public class RecipeHandler {

	public static void registerFurnaceRecipes() {
		GameRegistry.addSmelting(ModItems.FISH_TUNA_RAW, new ItemStack(ModItems.FISH_TUNA_COOKED), 10);
	}
	
}
