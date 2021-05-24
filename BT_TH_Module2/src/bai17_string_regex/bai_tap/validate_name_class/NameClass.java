package bai17_string_regex.bai_tap.validate_name_class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClass {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String NAMECLASS_REGEX = "^[CAP]{1}\\d{4}[GHIKLM]";

    public NameClass() {
        pattern = Pattern.compile(NAMECLASS_REGEX);
    }
    public boolean validate(String regex){
        matcher=pattern.matcher(regex);
        return matcher.matches();
    }
}
