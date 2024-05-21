package com.pascoli.windowsmod.block;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;

public class SpruceWindowBlock extends WindowBlock
{
	public static final String			NAME	= "spruce_window_block";

	public SpruceWindowBlock() {
		super(BlockBehaviour.Properties.copy(Blocks.SPRUCE_FENCE_GATE), WoodType.SPRUCE);
	}
}
