package chapter3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Lambda表达式的实现的本质是匿名内部类
        new Thread(()-> System.out.println("just for test")).start();

        List<String> list = Arrays.asList("aa","gg","ff","cc");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });
        for(String string :list){
            System.out.println(string);
        }
        List<String> list2 = Arrays.asList("aa","gg","ff","cc");
        Collections.sort(list2,(a,b)->a.compareTo(b));
        for(String string :list2){
            System.out.println(string);
        }

        System.out.println(operator(20,5,(x,y)->x*y));

    }
    public static Integer operator(Integer x,Integer y,OperFunction<Integer,Integer> of){
        return of.operator(x,y);
    }
}
