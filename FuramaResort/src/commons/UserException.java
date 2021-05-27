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
}
