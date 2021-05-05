package bai_5_AccessMoifiler_StaticMothed_StaticProperty.thuc_hanh.StaticMethod;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student student1=new Student(123,"Khuê");
        Student student2=new Student(234,"Alan");
        Student student3=new Student(345,"Anny");

        student1.disPlay();
        student2.disPlay();
        student3.disPlay();
    }
}
