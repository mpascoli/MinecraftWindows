package com.pascoli.windowsmod;

import com.pascoli.windowsmod.init.BlockInit;
import com.pascoli.windowsmod.init.CreativeTabInit;
import com.pascoli.windowsmod.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(WindowsMod.MODID)
public class WindowsMod {
	public static final String	MODID	= "windowsmod";

	public WindowsMod() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		BlockInit.BLOCKS.register(bus);
		ItemInit.ITEMS.register(bus);
		CreativeTabInit.TABS.register(bus);
	}
}
