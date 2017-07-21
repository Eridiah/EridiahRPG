package com.eridianrpg.common.blocks;

import com.eridianrpg.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class BlockBasicStone extends Block {

	public BlockBasicStone(String unlocalizedName) {
		super(Material.ROCK);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
		this.setSoundType(SoundType.STONE);
		this.setResistance(30);
		this.setHardness(1.5F);
	}
	
}
