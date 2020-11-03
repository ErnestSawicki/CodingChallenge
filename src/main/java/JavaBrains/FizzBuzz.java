package JavaBrains;

public class FizzBuzz {

    /*
    Problem:

    Write a short program that prints each number from 1 to 100 on a new line.

    For each multiple of 3, print "Fizz" instead of the number.

    For each multiple of 5, print "Buzz" instead of the number.

    For numbers which are multiplies of both 3 and 5 print "FizzBuzz" instead of a number.
    */
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            int fizz = i%3;
            int buzz = i%5;

            if (fizz == 0 && buzz ==0){
                System.out.println("FizzBuzz");
            } else if(fizz==0){
                System.out.println("Fizz");
            } else if(buzz==0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
