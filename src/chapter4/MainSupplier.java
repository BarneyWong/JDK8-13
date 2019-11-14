package chapter4;


import java.util.function.Supplier;

public class MainSupplier {
    public static void main(String[] args) {
        System.out.println(newStudent());
    }

    public static Student newStudent() {
        Supplier<Student> supplier = () ->
                new Student("BarneyWong");
        return supplier.get();
    }

}

class Student {
    private String name;

    public Student() {

    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}