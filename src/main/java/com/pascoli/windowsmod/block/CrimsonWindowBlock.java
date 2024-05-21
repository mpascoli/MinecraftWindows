package com.pascoli.windowsmod.block;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;

public class CrimsonWindowBlock extends WindowBlock
{
	public static final String			NAME	= "crimson_window_block";

	public CrimsonWindowBlock() {
		super(BlockBehaviour.Properties.copy(Blocks.CRIMSON_FENCE_GATE), WoodType.CRIMSON);
	}
}
