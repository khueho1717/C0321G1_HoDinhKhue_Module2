package bai17_string_regex.bai_tap.validate_phone_number;

public class PhoneNumberTest {
    private static PhoneNumber phoneNumber;
    public static String[] phoneNumberTrue = new String[]{"(84)0934159980", "(11)0235467345"};
    public static String[] phoneNumberFalse = new String[]{"0934159980", "(115)0235467345"};

    public static void main(String[] args) {
        phoneNumber = new PhoneNumber();
        for (String number : phoneNumberTrue
        ) {
            boolean isNumber = phoneNumber.validate(number);
            System.out.println("so dien thoai: " + number + " la: " + isNumber);
        }
        for (String number : phoneNumberFalse
        ) {
            boolean isNumber = phoneNumber.validate(number);
            System.out.println("so dien thoai: " + number + " la: " + isNumber);
        }
    }
}
