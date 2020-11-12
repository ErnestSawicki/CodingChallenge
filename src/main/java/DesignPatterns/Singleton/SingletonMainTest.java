package DesignPatterns.Singleton;

public class SingletonMainTest {
    public static void main(String[] args) {
        Singleton someObject = Singleton.getInstance();
        System.out.println(someObject.getSingletonDescription());
    }
}
