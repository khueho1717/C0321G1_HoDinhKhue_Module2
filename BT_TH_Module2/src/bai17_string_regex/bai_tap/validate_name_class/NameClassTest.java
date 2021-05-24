package bai17_string_regex.bai_tap.validate_name_class;

import bai17_string_regex.thuc_hanh.regular_expression.EmailExample;

public class NameClassTest {
    private static NameClass nameClass;
    public static final String[] validName = new String[] { "C2345H", "A3476M", "P7668G" };
    public static final String[] invalidName = new String[] { "J3456A", "DF334T", "GFHDXG" };

    public static void main(String args[]) {
        nameClass = new NameClass();
        for (String name : validName) {
            boolean isvalid = nameClass.validate(name);
            System.out.println("Name class is " + name + " is valid: " + isvalid);
        }
        for (String name : invalidName) {
            boolean isvalid = nameClass.validate(name);
            System.out.println("Name class is " + name + " is valid: " + isvalid);
        }
    }
}
