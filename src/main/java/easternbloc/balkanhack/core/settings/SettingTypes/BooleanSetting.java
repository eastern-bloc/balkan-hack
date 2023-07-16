package easternbloc.balkanhack.core.settings.SettingTypes;

import easternbloc.balkanhack.core.settings.Setting;

import java.util.function.Consumer;

public class BooleanSetting extends Setting<Boolean> {

    public BooleanSetting (
            String p_ID,
            String p_description,
            boolean p_default_value,
            Consumer<Boolean> p_onUpdate
    ) {
        super(p_ID, p_description, p_default_value, p_onUpdate);
    }

    public void toggle () {
        setValue(!value);
    }

    @Override
    protected boolean isValueValid (Boolean value) { return true; }
}
