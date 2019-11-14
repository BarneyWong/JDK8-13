package chapter6;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numbers.parallelStream().forEach(System.out::println);
        for (int i = 0; i < 10; i++) {
            List list = new CopyOnWriteArrayList();
            IntStream.range(0, 100).parallel().forEach(list::add);
            System.out.println(i + " - " + list.size());
        }
        int value = Stream.of(1, 2, 3, 4, 5).reduce(new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        }).get();
        System.out.println(value);

        Stream.of(1, 2, 3, 4, 5).reduce(10, (sum, item) -> sum + item);
        int max = Stream.of(1645, 234345, 32, 44434, 564534, 435).reduce((item1, item2) -> item1 > item2 ? item1 : item2).get();
        System.out.println(max);

        List<Student> studentList =Arrays.asList(new Student(1),new Student(2),new Student(3));
        studentList.forEach(obj->System.out.println(obj.getAge()));
    }
}
class Student{
    private int age;
    public Student(int age){
        this.age= age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                '}';
    }
}
