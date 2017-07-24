package com.eridianrpg.common.blocks;

import com.eridianrpg.Reference;

import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class BlockThatch extends BlockRotatedPillar {

	public BlockThatch(String unlocalizedName) {
		super(Material.GRASS);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
		this.setSoundType(SoundType.PLANT);
		this.setResistance(2.5F);
		this.setHardness(0.5F);
	}
	
}
