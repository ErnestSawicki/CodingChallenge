package DesignPatterns.Factory;

public class FactoryMain {

    /*
    Notes about pattern:
        - implementation use an interface which is implemented into classes.
    Then object is created used by factory when called by method to provide proper class.
        - takes out the responsibility of the class from the client program to the factory class
        - usually superclass is interface but can be interface/abstract class/normal class
        - provides approach to code for interface
     */

    public static void main(String[] args){

        OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();

        OS os = operatingSystemFactory.getInstance("iOS");

        os.spec();

    }

}
