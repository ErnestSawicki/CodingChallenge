package DesignPatterns.Factory;

public class IOS implements OS {
    @Override
    public void spec() {
        System.out.println("SecureOS");
    }
}
