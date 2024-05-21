package com.pascoli.windowsmod.block;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;

public class AcaciaWindowBlock extends WindowBlock
{
	public static final String			NAME	= "acacia_window_block";

	public AcaciaWindowBlock() {
		super(BlockBehaviour.Properties.copy(Blocks.ACACIA_FENCE_GATE), WoodType.ACACIA);
	}
}
