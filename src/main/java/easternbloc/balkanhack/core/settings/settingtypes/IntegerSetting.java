package easternbloc.balkanhack.core.settings.settingtypes;

import easternbloc.balkanhack.core.settings.Setting;

import java.util.function.Consumer;

public class IntegerSetting extends Setting<Integer> {

    private final int min_value;
    private final int max_value;
    private final int step;
    // constant for now..

    public IntegerSetting (
            String p_ID,
            String p_description,
            int p_default_value,
            Consumer<Integer> p_onUpdate,
            int p_min_value,
            int p_max_value,
            int p_step
    ) {
        super(p_ID, p_description, p_default_value, p_onUpdate);
        min_value = p_min_value;
        max_value = p_max_value;
        step = p_step;
    }

    public void increment () {
        setValue(value + step);
    }

    public void decrement () {
        setValue(value - step);
    }

    @Override
    protected boolean isValueValid (Integer value) {
        return value >= min_value && value <= max_value;
    }
}
