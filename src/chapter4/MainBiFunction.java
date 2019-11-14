package chapter4;

import java.util.function.BiFunction;

public class MainBiFunction {
    public static void main(String[] args) {
        System.out.println(operator(10, 1, new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        }));
        System.out.println(operator(10, 1, (a, b) -> a - b));
        System.out.println(operator(10, 2, (a, b) -> a * b));
        System.out.println(operator(10, 2, (a, b) -> a / b));
    }

    public static Integer operator(Integer a, Integer b, BiFunction<Integer, Integer, Integer> bf) {
        return bf.apply(a, b);
    }
}

