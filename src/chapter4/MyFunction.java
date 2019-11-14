package chapter4;

import java.util.function.Function;

public class MyFunction implements Function {
    @Override
    public Object apply(Object o) {
       return o+" test";
    }
}
