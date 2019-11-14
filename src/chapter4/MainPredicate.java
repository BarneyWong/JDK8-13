package chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @FunctionalInterface
 * public interface Predicate<T>{
 *     boolean test(T t)
 * }
 * 用途：接收一个参数，用于判断是否满足一定的条件，过滤数据。
 */
public class MainPredicate {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("adfjijeo","adfig","edfgi","assws","awdkol");
        System.out.println(list);
        List<String> results = fileter(list,string->string.startsWith("a"));
        System.out.println(results);
    }

    public static  List<String> fileter(List<String> list, Predicate<String> predicate){
        List<String> resultList = new ArrayList<>();
        for(String string :list){
            if(predicate.test(string)){
                resultList.add(string);
            }
        }
        return resultList;
    }
}
