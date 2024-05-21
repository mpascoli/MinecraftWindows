package com.pascoli.windowsmod.block;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;

public class CherryWindowBlock extends WindowBlock
{
	public static final String			NAME	= "cherry_window_block";

	public CherryWindowBlock() {
		super(BlockBehaviour.Properties.copy(Blocks.CHERRY_FENCE_GATE), WoodType.CHERRY);
	}
}
