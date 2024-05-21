package com.pascoli.windowsmod.init;

import com.pascoli.windowsmod.WindowsMod;
import com.pascoli.windowsmod.block.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item>		ITEMS 						= DeferredRegister.create(ForgeRegistries.ITEMS, WindowsMod.MODID);

	public static final RegistryObject<BlockItem>	ACACIA_WINDOW_BLOCK_ITEM	= ITEMS.register(AcaciaWindowBlock.NAME,
			()->new BlockItem(BlockInit.ACACIA_WINDOW_BLOCK.get(),new Item.Properties()));

	public static final RegistryObject<BlockItem>	BAMBOO_WINDOW_BLOCK_ITEM	= ITEMS.register(BambooWindowBlock.NAME,
			()->new BlockItem(BlockInit.BAMBOO_WINDOW_BLOCK.get(),new Item.Properties()));

	public static final RegistryObject<BlockItem>	BIRCH_WINDOW_BLOCK_ITEM	= ITEMS.register(BirchWindowBlock.NAME,
			()->new BlockItem(BlockInit.BIRCH_WINDOW_BLOCK.get(),new Item.Properties()));

	public static final RegistryObject<BlockItem>	CHERRY_WINDOW_BLOCK_ITEM	= ITEMS.register(CherryWindowBlock.NAME,
			()->new BlockItem(BlockInit.CHERRY_WINDOW_BLOCK.get(),new Item.Properties()));

	public static final RegistryObject<BlockItem>	CRIMSON_WINDOW_BLOCK_ITEM	= ITEMS.register(CrimsonWindowBlock.NAME,
			()->new BlockItem(BlockInit.CRIMSON_WINDOW_BLOCK.get(),new Item.Properties()));

	public static final RegistryObject<BlockItem>	DARK_OAK_WINDOW_BLOCK_ITEM	= ITEMS.register(DarkOakWindowBlock.NAME,
			()->new BlockItem(BlockInit.DARK_OAK_WINDOW_BLOCK.get(),new Item.Properties()));

	public static final RegistryObject<BlockItem>	JUNGLE_WINDOW_BLOCK_ITEM	= ITEMS.register(JungleWindowBlock.NAME,
			()->new BlockItem(BlockInit.JUNGLE_WINDOW_BLOCK.get(),new Item.Properties()));

	public static final RegistryObject<BlockItem>	MANGROVE_WINDOW_BLOCK_ITEM	= ITEMS.register(MangroveWindowBlock.NAME,
			()->new BlockItem(BlockInit.MANGROVE_WINDOW_BLOCK.get(),new Item.Properties()));

	public static final RegistryObject<BlockItem>	OAK_WINDOW_BLOCK_ITEM		= ITEMS.register(OakWindowBlock.NAME,
			()->new BlockItem(BlockInit.OAK_WINDOW_BLOCK.get(),new Item.Properties()));

	public static final RegistryObject<BlockItem>	SPRUCE_WINDOW_BLOCK_ITEM	= ITEMS.register(SpruceWindowBlock.NAME,
			()->new BlockItem(BlockInit.SPRUCE_WINDOW_BLOCK.get(),new Item.Properties()));

	public static final RegistryObject<BlockItem>	WARPED_WINDOW_BLOCK_ITEM	= ITEMS.register(WarpedWindowBlock.NAME,
			()->new BlockItem(BlockInit.WARPED_WINDOW_BLOCK.get(),new Item.Properties()));
}
