package easternbloc.balkanhack;

import easternbloc.balkanhack.core.Config;
import easternbloc.balkanhack.core.settings.Setting;
import easternbloc.balkanhack.core.settings.SettingManager;
import net.fabricmc.api.ModInitializer;

import net.minecraft.client.MinecraftClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BalkanHack implements ModInitializer {
	public static final String MOD_ID = "balkan-hack";
	public static BalkanHack INSTANCE;
	public static MinecraftClient mc;

	public static final Logger LOGGER = LoggerFactory.getLogger("balkanhack");

	public static final SettingManager setting_manager = new SettingManager();

	@Override
	public void onInitialize () {
		if (INSTANCE == null) {
			INSTANCE = this;
		}

		mc = MinecraftClient.getInstance();

		LOGGER.info("\n\n██████╗  █████╗ ██╗     ██╗  ██╗ █████╗ ███╗   ██╗    ██╗  ██╗ █████╗  ██████╗██╗  ██╗\n██╔══██╗██╔══██╗██║     ██║ ██╔╝██╔══██╗████╗  ██║    ██║  ██║██╔══██╗██╔════╝██║ ██╔╝\n██████╔╝███████║██║     █████╔╝ ███████║██╔██╗ ██║    ███████║███████║██║     █████╔╝ \n██╔══██╗██╔══██║██║     ██╔═██╗ ██╔══██║██║╚██╗██║    ██╔══██║██╔══██║██║     ██╔═██╗ \n██████╔╝██║  ██║███████╗██║  ██╗██║  ██║██║ ╚████║    ██║  ██║██║  ██║╚██████╗██║  ██╗\n╚═════╝ ╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝    ╚═╝  ╚═╝╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝\n\n");

		Config.init();
	}
}