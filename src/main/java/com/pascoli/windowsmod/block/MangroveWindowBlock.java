package com.pascoli.windowsmod.block;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;

public class MangroveWindowBlock extends WindowBlock
{
	public static final String			NAME	= "mangrove_window_block";

	public MangroveWindowBlock() {
		super(BlockBehaviour.Properties.copy(Blocks.MANGROVE_FENCE_GATE), WoodType.MANGROVE);
	}
}
