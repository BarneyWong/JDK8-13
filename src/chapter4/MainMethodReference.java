package chapter4;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MainMethodReference {
    public static void main(String[] args) {
        Function<String,Integer> function = Integer::parseInt;
        Integer value = function.apply("1024");
        System.out.println(value);

        String content = "Welcome BarneyWong";
        Function<Integer,String>  func = content::substring;
        String sub = func.apply(8);
        System.out.println(sub);

        BiFunction<String,Integer,User> biFunction = User::new;
        User user = biFunction.apply("BarneyWong",29);
        System.out.println(user.toString());

        System.out.println(sayHello(String::toUpperCase,"BarneyWong"));
    }

    private static String sayHello(Function<String,String> function,String parameter){
        return function.apply(parameter);
    }
}
class User{
    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}