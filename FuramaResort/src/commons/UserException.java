package commons;

public class UserException extends Exception{
    public UserException() {

    }
    public static void NameException(){
        System.err.println("Tên Khách hàng phải in hoa ký tự đầu tiên trong mỗi từ");
    }
    public static void EmailException(){
        System.err.println("Email phải đúng định dạng abc@abc.abc");
    }
    public static void GenderException(){
        System.err.println("người dùng phải nhập vào Male, Female hoặc Unknow");
    }
    public static void IdCardException(){
        System.err.println("Id Card phải có 9 chữ số và theo định dạng XXX XXX XXX");
    }
    public static void BirthdayException(){
        System.err.println("Năm sinh phải >1900 và nhỏ hơn năm hiện tại 18 năm, đúng định dạng dd/mm/yyyy");
    }
}
