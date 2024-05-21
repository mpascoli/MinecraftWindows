package com.pascoli.windowsmod.block;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;

public class BirchWindowBlock extends WindowBlock
{
	public static final String			NAME	= "birch_window_block";

	public BirchWindowBlock() {
		super(BlockBehaviour.Properties.copy(Blocks.BIRCH_FENCE_GATE), WoodType.BIRCH);
	}
}
