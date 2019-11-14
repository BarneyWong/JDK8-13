package chapter4;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.function.Function;

public class MainFunction {
    public static void main(String[] args) {
        test("BarneyWong", new MyFunction());
        test("BarneyWong", a -> a);
        Function<Integer, Integer> function = p -> p * 100;
        System.out.println(function.apply(10));
    }

    public static void test(String input, Function myFunction) {
        System.out.println(myFunction.apply(input));
    }
}
