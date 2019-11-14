package chapter2;

import java.util.Optional;

/**
 * optional 主要解决的问题是空指针异常（NullPointerException)
 */
public class MainOptional {
    public static void main(String[] args) {
        //创建Optional类
        //方式一
        //of()
        //null值作为参数传递进去，则会报异常；
        Student student = null;
        try {
            Optional<Student> optionalStudent = Optional.of(student);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        /**
         * 方式二
         * OfNullable
         * 不确定是否为null，则使用OfNullable()
         */
        Optional<Student> optionalStudent1 = Optional.ofNullable(student);
        //判断Optional的值是否存在
        if (optionalStudent1.isPresent()) {
            //获取Optional对象的值
            Student student1 = optionalStudent1.get();
        } else {
            System.out.println("null");
        }
        /**
         *  orElse如果有值则返回该值，否则返回传递给给它的参数值；
         */

        Student student1 = new Student(2);
        Student student2 = Optional.ofNullable(student).orElse(student1);
        System.out.println(student2);

        int result = Optional.ofNullable(student).map(obj -> obj.getAge()).orElse(7);
        System.out.println(result);
    }
}
