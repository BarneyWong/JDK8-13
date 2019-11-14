package chapter4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MainConsumer {
    public static void main(String[] args) {
        Consumer<String> consumer = obj -> {
            System.out.println(obj);
        };
        sendMsg("18706701498",consumer);

        List<String> list = Arrays.asList("aaa","bbb");
        list.forEach(obj-> System.out.println(obj));
    }
    public static void sendMsg(String phone,Consumer<String> consumer){
        consumer.accept(phone);
    }
}
