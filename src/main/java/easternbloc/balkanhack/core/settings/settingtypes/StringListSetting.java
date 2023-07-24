package easternbloc.balkanhack.core.settings.settingtypes;

import easternbloc.balkanhack.core.settings.Setting;

import java.util.List;
import java.util.function.Consumer;

public class StringListSetting extends Setting<List<String>> {

    public StringListSetting (
            String p_ID,
            String p_description,
            List<String> p_default_value,
            Consumer<List<String>> p_onUpdate
    ) {
        super(p_ID, p_description, p_default_value, p_onUpdate);
    }

    public void appendString (String p_value) {
        value.add(p_value);
        update();
    }

    public void removeString (int p_index) {
        if (p_index >= 0 && p_index < value.size()) {
            value.remove(p_index);
            update();
        }
        // TODO: add out of bounds error
    }

    public String getValueAt (int p_index) {
        if (p_index >= 0 && p_index < value.size()) {
            return value.get(p_index);
        }
        return null;
        // TODO: add out of bounds error
    }

    @Override
    protected boolean isValueValid (List<String> value) {
        return true;
    }
}
