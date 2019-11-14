package chapter2;

public class Dog implements Animal {
    @Override
    public void run() {
        System.out.println("dog running");
    }

    @Override
    public void eat() {
        System.out.println("dog eating");
    }
}
