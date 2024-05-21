package com.pascoli.windowsmod.block;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;

public class BambooWindowBlock extends WindowBlock
{
	public static final String			NAME	= "bamboo_window_block";

	public BambooWindowBlock() {
		super(BlockBehaviour.Properties.copy(Blocks.BAMBOO_FENCE_GATE), WoodType.BAMBOO);
	}
}
