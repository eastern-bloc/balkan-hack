package easternbloc.balkanhack.core.settings.SettingTypes;

import easternbloc.balkanhack.core.settings.Setting;

import java.util.function.Consumer;

public class IntegerSetting extends Setting<Integer> {

    private Integer min_value;
    private Integer max_value;
    private Integer step = 1;
    // constant for now..

    public IntegerSetting (
            String p_ID,
            String p_description,
            Integer p_default_value,
            Consumer<Integer> p_onUpdate,
            Integer p_min_value,
            Integer p_max_value
    ) {
        super(p_ID, p_description, p_default_value, p_onUpdate);
        min_value = p_min_value;
        max_value = p_max_value;
    }

    public void increment () {
        setValue(value + step);
    }

    public void decrement () {
        setValue(value - step);
    }

    @Override
    protected boolean isValueValid(Integer value) {
        return value >= min_value && value <= max_value;
    }
}
