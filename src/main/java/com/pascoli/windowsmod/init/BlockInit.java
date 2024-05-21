package com.pascoli.windowsmod.init;

import com.pascoli.windowsmod.WindowsMod;
import com.pascoli.windowsmod.block.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit
{
	public static final DeferredRegister<Block>		BLOCKS					= DeferredRegister.create(ForgeRegistries.BLOCKS, WindowsMod.MODID);

	public static final RegistryObject<WindowBlock>	ACACIA_WINDOW_BLOCK		= BLOCKS.register(
			AcaciaWindowBlock.NAME,
			() -> new AcaciaWindowBlock()
	);
	public static final RegistryObject<WindowBlock>	BAMBOO_WINDOW_BLOCK		= BLOCKS.register(
			BambooWindowBlock.NAME,
			() -> new BambooWindowBlock()
	);
	public static final RegistryObject<WindowBlock>	BIRCH_WINDOW_BLOCK		= BLOCKS.register(
			BirchWindowBlock.NAME,
			() -> new BirchWindowBlock()
	);
	public static final RegistryObject<WindowBlock>	CHERRY_WINDOW_BLOCK		= BLOCKS.register(
			CherryWindowBlock.NAME,
			() -> new CherryWindowBlock()
	);
	public static final RegistryObject<WindowBlock>	CRIMSON_WINDOW_BLOCK	= BLOCKS.register(
			CrimsonWindowBlock.NAME,
			() -> new CrimsonWindowBlock()
	);
	public static final RegistryObject<WindowBlock>	DARK_OAK_WINDOW_BLOCK	= BLOCKS.register(
			DarkOakWindowBlock.NAME,
			() -> new DarkOakWindowBlock()
	);
	public static final RegistryObject<WindowBlock>	JUNGLE_WINDOW_BLOCK		= BLOCKS.register(
			JungleWindowBlock.NAME,
			() -> new JungleWindowBlock()
	);
	public static final RegistryObject<WindowBlock>	MANGROVE_WINDOW_BLOCK	= BLOCKS.register(
			MangroveWindowBlock.NAME,
			() -> new MangroveWindowBlock()
	);
	public static final RegistryObject<WindowBlock>	OAK_WINDOW_BLOCK		= BLOCKS.register(
			OakWindowBlock.NAME,
			() -> new OakWindowBlock()
	);
	public static final RegistryObject<WindowBlock>	SPRUCE_WINDOW_BLOCK		= BLOCKS.register(
			SpruceWindowBlock.NAME,
			() -> new SpruceWindowBlock()
	);
	public static final RegistryObject<WindowBlock>	WARPED_WINDOW_BLOCK		= BLOCKS.register(
			WarpedWindowBlock.NAME,
			() -> new WarpedWindowBlock()
	);
}
