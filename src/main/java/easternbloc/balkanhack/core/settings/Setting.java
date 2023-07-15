package easternbloc.balkanhack.core.settings;

import easternbloc.balkanhack.core.utils.Utils;

import java.util.function.Consumer;

public abstract class Setting <T> {
    public final String ID;
    public final String name;
    public final String description;

    protected final T default_value;
    protected T value;

    private  final Consumer<T> onUpdate;

    public Setting (
            String p_ID,
            String p_description,
            T p_default_value,
            Consumer<T> p_onUpdate
    ) {
        ID = p_ID;
        name = Utils.IDToName(p_ID);
        description = p_description;
        default_value = p_default_value;
        onUpdate = p_onUpdate;
        value = default_value;
    }

    public T getValue () {
        return value;
    }

    public void setValue (T p_value) {
        if (isValueValid(value)) {
            value = p_value;
        }
        update();
        // should i only call this if value is valid.. idk
    }

    public void resetValue () {
        setValue(value);
    }

    private void update() {
        if (onUpdate != null) {
            onUpdate.accept(value);
        }
    }

    protected abstract boolean isValueValid(T value);
}
