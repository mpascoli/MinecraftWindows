package com.pascoli.windowsmod.block;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;

public class WarpedWindowBlock extends WindowBlock
{
	public static final String			NAME	= "warped_window_block";

	public WarpedWindowBlock() {
		super(BlockBehaviour.Properties.copy(Blocks.WARPED_FENCE_GATE), WoodType.WARPED);
	}
}
