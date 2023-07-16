package easternbloc.balkanhack.core.settings;

import java.util.ArrayList;
import java.util.List;

public class SettingManager {
    List<Setting> config_category = new ArrayList<>();

    public void register_setting (Setting p_setting, SettingCategories p_category) {
        if (p_category == SettingCategories.CONFGI) {
            config_category.add(p_setting);
        }
    }

    public Setting get_setting_in_category (String p_setting_id, SettingCategories p_category) {
        if (p_category == SettingCategories.CONFGI) {
            for (Setting setting : config_category) {
                if (setting.ID.equals(p_setting_id)) {
                    return setting;
                }
            }
            return null;
        }
        return null;
    }

    public enum SettingCategories {
        CONFGI
    }
}
