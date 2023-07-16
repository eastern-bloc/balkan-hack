package easternbloc.balkanhack;

import easternbloc.balkanhack.core.settings.SettingTypes.BooleanSetting;
import easternbloc.balkanhack.core.settings.SettingTypes.DoubleSetting;
import easternbloc.balkanhack.core.settings.SettingTypes.StringListSetting;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class BalkanHack implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("balkanhack");

	Consumer<List<String>> b;

	@Override
	public void onInitialize() {
		LOGGER.info("\n\n██████╗  █████╗ ██╗     ██╗  ██╗ █████╗ ███╗   ██╗    ██╗  ██╗ █████╗  ██████╗██╗  ██╗\n██╔══██╗██╔══██╗██║     ██║ ██╔╝██╔══██╗████╗  ██║    ██║  ██║██╔══██╗██╔════╝██║ ██╔╝\n██████╔╝███████║██║     █████╔╝ ███████║██╔██╗ ██║    ███████║███████║██║     █████╔╝ \n██╔══██╗██╔══██║██║     ██╔═██╗ ██╔══██║██║╚██╗██║    ██╔══██║██╔══██║██║     ██╔═██╗ \n██████╔╝██║  ██║███████╗██║  ██╗██║  ██║██║ ╚████║    ██║  ██║██║  ██║╚██████╗██║  ██╗\n╚═════╝ ╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝    ╚═╝  ╚═╝╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝\n\n");

		b = a -> System.out.println(a);

		StringListSetting idk = new StringListSetting(
				"bruh",
				"Does Nothing",
				new ArrayList<String>(),
				b
		);

		idk.appendString("IDK");
		idk.appendString("BRUH");
		idk.appendString("EH");
		idk.removeString(0);
		System.out.println(idk.getValueAt(3));
		idk.resetValue();
	}
}