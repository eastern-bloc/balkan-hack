package easternbloc.balkanhack;

import easternbloc.balkanhack.core.settings.SettingTypes.BooleanSetting;
import easternbloc.balkanhack.core.settings.SettingTypes.DoubleSetting;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Consumer;

public class BalkanHack implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("balkanhack");

	Consumer<Boolean> b;

	@Override
	public void onInitialize() {
		LOGGER.info("\n\n██████╗  █████╗ ██╗     ██╗  ██╗ █████╗ ███╗   ██╗    ██╗  ██╗ █████╗  ██████╗██╗  ██╗\n██╔══██╗██╔══██╗██║     ██║ ██╔╝██╔══██╗████╗  ██║    ██║  ██║██╔══██╗██╔════╝██║ ██╔╝\n██████╔╝███████║██║     █████╔╝ ███████║██╔██╗ ██║    ███████║███████║██║     █████╔╝ \n██╔══██╗██╔══██║██║     ██╔═██╗ ██╔══██║██║╚██╗██║    ██╔══██║██╔══██║██║     ██╔═██╗ \n██████╔╝██║  ██║███████╗██║  ██╗██║  ██║██║ ╚████║    ██║  ██║██║  ██║╚██████╗██║  ██╗\n╚═════╝ ╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝    ╚═╝  ╚═╝╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝\n\n");

		b = a -> System.out.println(a);

		BooleanSetting idk = new BooleanSetting(
				"bruh",
				"Does Nothing",
				false,
				b
		);

		idk.toggle();
		idk.resetValue();
	}
}