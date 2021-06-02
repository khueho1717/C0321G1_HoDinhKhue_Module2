package commons;

import model.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FilingCabinets {
    static List<Employee> employees = new ArrayList<>();

    public static void realFileEmployee() {
        try {
            FileReader fileReader = new FileReader("FuramaResort/src/data/Employee.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] string = line.split("@");
                Employee employee = new Employee(string[0], Integer.parseInt(string[1]), string[2]);
                employees.add(employee);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void inputEmployee() {
        Scanner scanner = new Scanner(System.in);
        Stack<Employee> stack = new Stack<>();
        System.out.println("Danh sách nhân viên:");
        int stt = 1;
        for (Employee element : employees
        ) {
            System.out.println(stt++ + ": " + element.toString());
            stack.add(element);
        }
        System.out.println("nhập tên cần tìm kiếm");
        String inputName = scanner.nextLine();
                boolean check = false;

        while (!stack.isEmpty()) {
            Employee serch = stack.pop();
            if (serch.getName().contains(inputName)) {
                System.out.println("tên này có trong tủ hồ sơ");
                System.out.println(serch.toString());
                check=true;
                break;
            }
        }
        if (!check){
            System.out.println("tên vừa tìm không có trong danh sách");
        }
    }
public static void serchEmployee(){
        realFileEmployee();
        inputEmployee();
}
    public static void main(String[] args) {
        serchEmployee();
    }
}
