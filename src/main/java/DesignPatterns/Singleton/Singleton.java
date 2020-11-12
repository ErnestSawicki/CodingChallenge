package DesignPatterns.Singleton;

public class Singleton {

    /*
    Notes:
        - only one instance
     */

    private static Singleton singleton = new Singleton();

    private String singletonDescription;

    private Singleton(){}

    public static Singleton getInstance(){
        return singleton;
    }

    public String getSingletonDescription(){
        return "Singleton details: \n-is created only once within program;" +
                "\n-created by getInstance() method" +
                "\n-usually used as configuration/objects that appear once" +
                "\n-example: Spring bean (by default)" +
                "\n\nYOU CAN NOT CREATE MORE OF THIS OBJECT !";
    }
}
