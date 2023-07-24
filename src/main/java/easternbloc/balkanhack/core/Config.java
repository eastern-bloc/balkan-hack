package easternbloc.balkanhack.core;

import easternbloc.balkanhack.BalkanHack;
import easternbloc.balkanhack.core.settings.SettingManager;
import easternbloc.balkanhack.core.settings.settingtypes.StringListSetting;

import java.util.Arrays;

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
