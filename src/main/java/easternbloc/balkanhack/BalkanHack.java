package easternbloc.balkanhack;

import easternbloc.balkanhack.core.settings.SettingTypes.StringSetting;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Consumer;

public class BalkanHack implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("balkanhack");

	Consumer<String> b;

	@Override
	public void onInitialize() {
		LOGGER.info("\n\n██████╗  █████╗ ██╗     ██╗  ██╗ █████╗ ███╗   ██╗    ██╗  ██╗ █████╗  ██████╗██╗  ██╗\n██╔══██╗██╔══██╗██║     ██║ ██╔╝██╔══██╗████╗  ██║    ██║  ██║██╔══██╗██╔════╝██║ ██╔╝\n██████╔╝███████║██║     █████╔╝ ███████║██╔██╗ ██║    ███████║███████║██║     █████╔╝ \n██╔══██╗██╔══██║██║     ██╔═██╗ ██╔══██║██║╚██╗██║    ██╔══██║██╔══██║██║     ██╔═██╗ \n██████╔╝██║  ██║███████╗██║  ██╗██║  ██║██║ ╚████║    ██║  ██║██║  ██║╚██████╗██║  ██╗\n╚═════╝ ╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝    ╚═╝  ╚═╝╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝\n\n");

		b = a -> System.out.println(a);

		StringSetting idk = new StringSetting(
				"bruh",
				"Does Nothing",
				"idk bro",
				b
		);

		idk.setValue("EHHHH?");
	}
}