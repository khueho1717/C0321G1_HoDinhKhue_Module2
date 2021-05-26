package bai17_string_regex.bai_tap.validate_phone_number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static Pattern pattern;
    private static Matcher matcher;
    private final String NAME_NUMBER="^\\(?[0-9]{2}\\)?([0-9]{10})";

    public PhoneNumber() {
        pattern=Pattern.compile(NAME_NUMBER);
    }
    public boolean validate(String regex){
        matcher=pattern.matcher(regex);
        return matcher.matches();
    }
}
