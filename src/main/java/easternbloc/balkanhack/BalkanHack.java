package easternbloc.balkanhack;

import easternbloc.balkanhack.core.settings.SettingTypes.DoubleSetting;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Consumer;

public class BalkanHack implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("balkanhack");

	Consumer<Double> b;

	@Override
	public void onInitialize() {
		LOGGER.info("\n\n██████╗  █████╗ ██╗     ██╗  ██╗ █████╗ ███╗   ██╗    ██╗  ██╗ █████╗  ██████╗██╗  ██╗\n██╔══██╗██╔══██╗██║     ██║ ██╔╝██╔══██╗████╗  ██║    ██║  ██║██╔══██╗██╔════╝██║ ██╔╝\n██████╔╝███████║██║     █████╔╝ ███████║██╔██╗ ██║    ███████║███████║██║     █████╔╝ \n██╔══██╗██╔══██║██║     ██╔═██╗ ██╔══██║██║╚██╗██║    ██╔══██║██╔══██║██║     ██╔═██╗ \n██████╔╝██║  ██║███████╗██║  ██╗██║  ██║██║ ╚████║    ██║  ██║██║  ██║╚██████╗██║  ██╗\n╚═════╝ ╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝    ╚═╝  ╚═╝╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝\n\n");

		b = a -> System.out.println(a);

		DoubleSetting idk = new DoubleSetting(
				"bruh",
				"Does Nothing",
				5.1,
				b,
				1.1,
				10.1,
				.5
		);

		idk.setValue(7.3);
		idk.increment();
	}
}