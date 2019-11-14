package chapter2;

/**
 * 使用场景：接口里面定义公用的业务逻辑，抽取出来，每个子类都必须具备
 */
public interface Animal {
    //默认public方法
    //default修饰的方法，可以在接口里面定义具体的方法实现。
    void run();
    void eat();
    default void breath(){
        System.out.println("正在呼吸");
    }
    //静态方法
    //接口实现类无法调用接口的静态方法
    static void test(){
        System.out.println("静态方法test");
    }
}
