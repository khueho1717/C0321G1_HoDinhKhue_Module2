package commons;

import model.Customer;
import model.Employee;

import java.io.*;
import java.util.*;

public class IOEmployee {
    private static final String COMMA_DELIMITER1 = "@";
    private static final String NEW_LINE_SEPARATOR1 = "\n";
     static String fileEmployee = "FuramaResort/src/data/Employee.csv";
    static List<Employee> employeeList = new ArrayList<>();
    static Map<Integer, Employee> map = new HashMap<Integer, Employee>();


    public  void showEmployee(){
        Set<Integer> set = realFileEmployee().keySet();
        for (Integer key : set) {
            System.out.println(key + " " + realFileEmployee().get(key).toString());
        }
    }
    public  void addEmployee() {
        Employee employee1 = new Employee("Nguyễn Văn An", 23, "Hà Nội");
        employeeList.add(employee1);
        Employee employee2 = new Employee("Trần Văn Linh ", 33, "Đà Nẵng");
        employeeList.add(employee2);
        Employee employee3 = new Employee("Nguyễn Văn Anh", 18, "Hồ Chí Minh");
        employeeList.add(employee3);
        Employee employee4 = new Employee("Lê Quốc Tiến", 22, "Hà Nội");
        employeeList.add(employee4);
        Employee employee5 = new Employee("Qhuỳnh Tân", 27, "Vũng tàu");
        employeeList.add(employee5);
        Employee employee6 = new Employee("Nguyễn Văn ", 24, "Quảng Bình");
        employeeList.add(employee6);
        Employee employee7 = new Employee("Trần Văn Ấn", 35, "Quảng Nam");
        employeeList.add(employee7);
        Employee employee8 = new Employee("Trương Quốc", 23, "Hà Nội");
        employeeList.add(employee8);
        Employee employee9 = new Employee("Nguyễn Quỳnh", 23, "Hải Phòng");
        employeeList.add(employee9);
        Employee employee10 = new Employee("Nguyễn Thị Hoa", 33, "Hà Nội");
        employeeList.add(employee10);
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileEmployee, false);

            for (Employee employee : employeeList) {
                fileWriter.append(employee.getName());
                fileWriter.append(COMMA_DELIMITER1);
                fileWriter.append(String.valueOf(employee.getAge()));
                fileWriter.append(COMMA_DELIMITER1);
                fileWriter.append(employee.getAddress());
                fileWriter.append(NEW_LINE_SEPARATOR1);
            }

            System.out.println("CSV file was created successfully !!!");

        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
    }

    public static Map<Integer, Employee> realFileEmployee() {
        try {
            List<Employee> employee2 = new ArrayList<>();
            FileReader fileReader = new FileReader(fileEmployee);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] string = line.split("@");
                Employee employee = new Employee(string[0], Integer.parseInt(string[1]), string[2]);
                employee2.add(employee);
                int id = 101;
                for (Employee element : employee2
                ) {
                    map.put(id++, element);
                }
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }


}
