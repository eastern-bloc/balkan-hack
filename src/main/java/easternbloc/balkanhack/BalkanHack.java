package easternbloc.balkanhack;

import easternbloc.balkanhack.core.settings.SettingTypes.IntegerSetting;
import easternbloc.balkanhack.core.settings.SettingTypes.StringSetting;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Consumer;

public class BalkanHack implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("balkanhack");

	Consumer<Integer> b;

	@Override
	public void onInitialize() {
		LOGGER.info("\n\n██████╗  █████╗ ██╗     ██╗  ██╗ █████╗ ███╗   ██╗    ██╗  ██╗ █████╗  ██████╗██╗  ██╗\n██╔══██╗██╔══██╗██║     ██║ ██╔╝██╔══██╗████╗  ██║    ██║  ██║██╔══██╗██╔════╝██║ ██╔╝\n██████╔╝███████║██║     █████╔╝ ███████║██╔██╗ ██║    ███████║███████║██║     █████╔╝ \n██╔══██╗██╔══██║██║     ██╔═██╗ ██╔══██║██║╚██╗██║    ██╔══██║██╔══██║██║     ██╔═██╗ \n██████╔╝██║  ██║███████╗██║  ██╗██║  ██║██║ ╚████║    ██║  ██║██║  ██║╚██████╗██║  ██╗\n╚═════╝ ╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝    ╚═╝  ╚═╝╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝\n\n");

		b = a -> System.out.println(a);

		IntegerSetting idk = new IntegerSetting(
				"bruh",
				"Does Nothing",
				5,
				b,
				1,
				10
		);

		idk.setValue(7);
		idk.increment();
	}
}