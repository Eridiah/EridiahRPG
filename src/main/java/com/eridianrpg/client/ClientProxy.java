package com.eridianrpg.client;

import com.eridianrpg.common.CommonProxy;
import com.eridianrpg.common.blocks.ModBlocks;
import com.eridianrpg.common.items.ModItems;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void init() {
		
	}
	
	@Override
	public void registerRenders() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}
	
}
