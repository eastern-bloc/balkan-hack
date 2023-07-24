package easternbloc.balkanhack.core.utils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TextUtils {
    public static String IDToName (String p_ID) {
        return Arrays.stream(p_ID.split("_")).map(TextUtils::Capitalize).collect(Collectors.joining(" "));
    }

    public static String Capitalize (String p_str) {
        if (p_str.length() > 1) {
            return p_str.substring(0, 1).toUpperCase() + p_str.substring(1);
        }
        return p_str;
    }
}
