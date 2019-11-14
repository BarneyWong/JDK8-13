package chapter5;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aaa", "bbb", "ccc", "ddd");
        List<String> results = list.stream().map(obj -> "BarneyWong " + obj).collect(Collectors.toList());
        System.out.println(results.toString());


        List<User> userList = Arrays.asList(new User(1, "a", "123"),
                new User(2, "a", "123"), new User(3, "a", "123"),
                new User(4, "a", "123"), new User(5, "a", "123"),
                new User(6, "a", "123"));
        List<UserDTO> userDTOList = userList.stream().map(obj -> {
            UserDTO userDTO = new UserDTO(obj.getId(), obj.getName());
            return userDTO;
        }).collect(Collectors.toList());
        System.out.println(userDTOList);

        List<String> stringList = Arrays.asList("SpringBoot", "SpringCloud", "Redis", "Git", "Netty", "Java", "Html", "Docker", "git");
        List<String> resultList = stringList.stream().filter(obj -> obj.length() > 5).collect(Collectors.toList());
        List<String> sortedList = stringList.stream().sorted().collect(Collectors.toList());
        List<String> sortedList2 = stringList.stream().sorted(Comparator.comparing(obj -> obj.length())).collect(Collectors.toList());
        List<String> sortedList3 = stringList.stream().sorted(Comparator.comparing(String::length, Comparator.reverseOrder())).collect(Collectors.toList());
        List<String> sortedList4 = stringList.stream().sorted(Comparator.comparing(String::length, Comparator.reverseOrder())).limit(3).collect(Collectors.toList());
        System.out.println(resultList);
        System.out.println(sortedList);
        System.out.println(sortedList2);
        System.out.println(sortedList3);
        System.out.println(sortedList4);

        Boolean result = stringList.stream().allMatch(obj -> obj.length() > 1);
        System.out.println(result);
        Boolean result2 = stringList.stream().anyMatch(obj -> obj.length() > 6);
        System.out.println(result2);

        List<Student> studentList = Arrays.asList(new Student(22), new Student(24), new Student(25), new Student(26));
        Optional<Student> max =studentList.stream().max(Comparator.comparing(Student::getAge));
        Student student = max.get();
        System.out.println(student);

        Optional<Student> min =studentList.stream().min(Comparator.comparing(Student::getAge));
        Student studentMin = min.get();
        System.out.println(studentMin);
    }

}

class Student {
    private int age;

    public Student() {

    }

    public Student(int age) {
        this.age = age;
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