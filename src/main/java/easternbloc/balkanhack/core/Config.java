package easternbloc.balkanhack.core;

import easternbloc.balkanhack.BalkanHack;
import easternbloc.balkanhack.core.settings.SettingManager;
import easternbloc.balkanhack.core.settings.SettingTypes.StringListSetting;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Config {

    public static void init () {
        // title_screen_spashes
        BalkanHack.setting_manager.register_setting(new StringListSetting(
                "title_screen_splashes",
                "List of shpashes to be displayed in the titlescreen",
                Arrays.asList(
                        "makima is listening",
                        "burenyuu!!~~"
                ),
                null
        ), SettingManager.SettingCategories.CONFGI);
    }
}
