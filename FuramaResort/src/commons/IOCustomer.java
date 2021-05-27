package commons;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IOCustomer {
    public static void main(String[] args) throws UserException {

        System.out.println(inputUserGender());
    }
    public static Scanner scanner=new Scanner(System.in);
    public static String inputUserName()throws UserException {
        while (true){
            try {
                System.out.println("moi ban nhap ten khach hang");
                final String USERNAME="(\\b[A-Z]{1}[a-z]+)+(( )([A-Z]{1}[a-z]+\\b))*?";
                String userName=scanner.nextLine();
                Pattern pattern=Pattern.compile(USERNAME);
                Matcher matcher=pattern.matcher(userName);
                if (matcher.matches()){
                    return userName;
                }else {
                    throw new UserException();
                }
            }catch (UserException user){
                user.NameException();
            }
        }
    }
    public static String inputUserEmail()throws UserException {
        while (true){
            try {
                System.out.println("moi ban nhap ten Email khach hang");
                final String USERNAME="^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
                String userEmail=scanner.nextLine();
                Pattern pattern=Pattern.compile(USERNAME);
                Matcher matcher=pattern.matcher(userEmail);
                if (matcher.matches()){
                    return userEmail;
                }else {
                    throw new UserException();
                }
            }catch (UserException user){
                user.EmailException();
            }
        }
    }
    public static String inputUserGender()throws UserException {
        while (true){
            try {
                System.out.println("moi ban nhap gioi tinh cua khach hang");
                final String USERGENDER="^[Mm]{1}+[Aa]{1}+[Ll]{1}+[Ee]{1}|[Ff]{1}+[Ee]{1}+[Mm]{1}+[Aa]{1}+[Ll]{1}+[Ee]{1}|[Uu]{1}+[Nn]{1}+[Kk]{1}+[Nn]{1}+[Oo]{1}+[Ww]{1}";
                String userGender=scanner.nextLine();
                Pattern pattern=Pattern.compile(USERGENDER);
                Matcher matcher=pattern.matcher(userGender);
                if (matcher.matches()){
                    return userGender.toLowerCase();
                }else {
                    throw new UserException();
                }
            }catch (UserException user){
                user.GenderException();
            }
        }
    }
}
