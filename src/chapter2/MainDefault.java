package chapter2;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class MainDefault {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.breath();
        dog.run();
        dog.eat();
        //接口实现类无法调用接口的静态方法
        Animal.test();

    }
}
