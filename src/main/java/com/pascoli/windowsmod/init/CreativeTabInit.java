package com.pascoli.windowsmod.init;

import com.pascoli.windowsmod.WindowsMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(
		modid= WindowsMod.MODID,
		bus=Mod.EventBusSubscriber.Bus.MOD,
		value= Dist.CLIENT)
public class CreativeTabInit
{
	public static final DeferredRegister<CreativeModeTab> TABS	= DeferredRegister
			.create(Registries.CREATIVE_MODE_TAB, WindowsMod.MODID);

	private static void putAfter(BuildCreativeModeTabContentsEvent event, Item theItem, RegistryObject<BlockItem> myItem) {
		event.getEntries().putAfter(
				theItem.getDefaultInstance(),
				myItem.get().getDefaultInstance(),
				CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
	}

	@SubscribeEvent
	public static void buildContents(BuildCreativeModeTabContentsEvent event)
	{
		// Put our items in another tab
		if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS)
		{
//			event.getEntries().putAfter(
//					Items.ACACIA_DOOR.getDefaultInstance(),
//					ItemInit.ACACIA_WINDOW_BLOCK_ITEM.get().getDefaultInstance(),
//					CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
			putAfter(event, Items.ACACIA_DOOR, ItemInit.ACACIA_WINDOW_BLOCK_ITEM);
			putAfter(event, Items.BAMBOO_DOOR, ItemInit.BAMBOO_WINDOW_BLOCK_ITEM);
			putAfter(event, Items.BIRCH_DOOR, ItemInit.BIRCH_WINDOW_BLOCK_ITEM);
			putAfter(event, Items.CHERRY_DOOR, ItemInit.CHERRY_WINDOW_BLOCK_ITEM);
			putAfter(event, Items.CRIMSON_DOOR, ItemInit.CRIMSON_WINDOW_BLOCK_ITEM);
			putAfter(event, Items.DARK_OAK_DOOR, ItemInit.DARK_OAK_WINDOW_BLOCK_ITEM);
			putAfter(event, Items.JUNGLE_DOOR, ItemInit.JUNGLE_WINDOW_BLOCK_ITEM);
			putAfter(event, Items.MANGROVE_DOOR, ItemInit.MANGROVE_WINDOW_BLOCK_ITEM);
			putAfter(event, Items.OAK_DOOR, ItemInit.OAK_WINDOW_BLOCK_ITEM);
			putAfter(event, Items.SPRUCE_DOOR, ItemInit.SPRUCE_WINDOW_BLOCK_ITEM);
			putAfter(event, Items.WARPED_DOOR, ItemInit.WARPED_WINDOW_BLOCK_ITEM);
		}
	}
}
