package com.pascoli.windowsmod.block;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;

public class DarkOakWindowBlock extends WindowBlock
{
	public static final String			NAME	= "dark_oak_window_block";

	public DarkOakWindowBlock() {
		super(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_FENCE_GATE), WoodType.DARK_OAK);
	}
}
