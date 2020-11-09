package DesignPatterns.Factory;

public class OperatingSystemFactory {

    public OS getInstance(String str){
        if (str.equals("Android")){
            return new Android();
        }
        if (str.equals("iOS")){
            return new IOS();
        }
        return new Windows();
    }
}
