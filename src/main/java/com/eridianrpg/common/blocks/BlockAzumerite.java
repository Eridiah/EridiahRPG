package com.eridianrpg.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

import com.eridianrpg.Reference;

public class BlockAzumerite extends Block {

	public BlockAzumerite(String unlocalizedName) {
		super(Material.IRON);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
		this.setSoundType(SoundType.STONE);
		this.setResistance(50F);
		this.setHardness(25F);
	}
	
}
