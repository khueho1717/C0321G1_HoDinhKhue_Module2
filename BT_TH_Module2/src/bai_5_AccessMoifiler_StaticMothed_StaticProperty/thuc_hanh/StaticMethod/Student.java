package bai_5_AccessMoifiler_StaticMothed_StaticProperty.thuc_hanh.StaticMethod;

public class Student {
    private int rollno;
    private String name;
    private static String college="BBDIT";

    Student(int r,String n){
        rollno=r;
        name=n;
    }
    static void change(){
        college="CODEGYM";
    }
    void disPlay(){
        System.out.println(rollno+" "+name+" "+college);
    }
}
