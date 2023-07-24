package easternbloc.balkanhack.core.settings.settingtypes;

import easternbloc.balkanhack.core.settings.Setting;

import java.util.function.Consumer;

public class StringSetting extends Setting<String> {

    public StringSetting (
            String p_ID,
            String p_description,
            String p_default_value,
            Consumer<String> p_onUpdate
    ) {
        super(p_ID, p_description, p_default_value, p_onUpdate);
    }

    @Override
    protected boolean isValueValid(String value) {
        return true;
    }
}
