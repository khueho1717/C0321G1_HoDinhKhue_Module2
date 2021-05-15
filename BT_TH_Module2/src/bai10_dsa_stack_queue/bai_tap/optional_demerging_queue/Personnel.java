package bai10_dsa_stack_queue.bai_tap.optional_demerging_queue;

public class Personnel {
    protected String name;
    protected int age;
    protected String birthDay;
    protected String gender;
//    public Personnel() {
//    }

    public Personnel(String name, int age, String birthDay, String gender) {
        this.name = name;
        this.age = age;
        this.birthDay = birthDay;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "name: "+name+" age: "+age+" birthday: "+birthDay+" gerder: "+gender;
    }
}
