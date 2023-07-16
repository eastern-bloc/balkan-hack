package easternbloc.balkanhack.core.settings.SettingTypes;

import easternbloc.balkanhack.core.settings.Setting;

import java.util.function.Consumer;

public class DoubleSetting extends Setting<Double> {

    private final double min_value;
    private final double max_value;
    private final double step;

    public DoubleSetting(
            String p_ID,
            String p_description,
            double p_default_value,
            Consumer<Double> p_onUpdate,
            double p_min_value,
            double p_max_value,
            double p_step
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
    protected boolean isValueValid(Double value) { return value >= min_value && value <= max_value; }
}
