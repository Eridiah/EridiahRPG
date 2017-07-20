package com.eridianrpg.common.blocks;

import java.util.List;

import com.eridianrpg.Reference;
import com.eridianrpg.client.handler.EnumHandler.SugarcaneType;
import com.eridianrpg.common.blocks.item.IMetaBlockName;

import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class BlockSugarCane extends BlockRotatedPillar implements IMetaBlockName {
	
	public static final PropertyEnum<SugarcaneType> TYPE = PropertyEnum.create("type", SugarcaneType.class);
	public static final PropertyEnum<EnumFacing.Axis> AXIS = PropertyEnum.<EnumFacing.Axis>create("axis", EnumFacing.Axis.class);

	public BlockSugarCane(String unlocalizedName) {
		super(Material.PLANTS);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
		this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE, SugarcaneType.BALE));
		this.setSoundType(SoundType.PLANT);
		this.setResistance(2.5F);
		this.setHardness(0.5F);
	}
	
	@Override
	public void getSubBlocks(Item itemIn, CreativeTabs tab, List<ItemStack> list) {
		for(int i = 0; i < SugarcaneType.values().length; i++) {
			list.add(new ItemStack(itemIn, 1, i));
		}
	}
	
	@Override
	public int damageDropped(IBlockState state) {
		return getMetaFromState(state);
	}
	
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
		return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(state));
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] {TYPE, AXIS});
	}
	
	@Override
	public int getMetaFromState(IBlockState state) {
		SugarcaneType type = (SugarcaneType) state.getValue(TYPE);
		return type.getID();
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(TYPE, SugarcaneType.values()[meta]);
	}

	@Override
	public String getSpecialName(ItemStack stack) {
		return SugarcaneType.values()[stack.getItemDamage()].getName();
	}
}
