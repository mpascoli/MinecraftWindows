package com.pascoli.windowsmod.block;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;

public class OakWindowBlock extends WindowBlock {
	public static final String			NAME	= "oak_window_block";

	public OakWindowBlock() {
		super(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), WoodType.OAK);
	}
}
