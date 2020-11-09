package JavaBrains;

public class StringReverse {

    public String reverseString(String givenString){
        return new StringBuilder(givenString).reverse().toString();
    }

    public String reverseStringManual(String givenString){
        int stringPosition = givenString.length() - 1;
        StringBuilder reverseString = new StringBuilder();


        for (int i=0; i<givenString.length(); i++){
            reverseString.append(givenString.charAt(stringPosition - i));
        }

        return reverseString.toString();
    }
}
