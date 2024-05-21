package com.pascoli.windowsmod.block;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;

public class JungleWindowBlock extends WindowBlock
{
	public static final String			NAME	= "jungle_window_block";

	public JungleWindowBlock() {
		super(BlockBehaviour.Properties.copy(Blocks.JUNGLE_FENCE_GATE), WoodType.JUNGLE);
	}
}
