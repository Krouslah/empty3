import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int number = src.nextInt();
        int result = number/3;
        int result2 = number/5;
        if(number == result*3 & number!=result2*5){
            System.out.println("Fizz");
        }
        if(number == result2*5 & number!=result*3){
            System.out.println("Buzz");
        }
        if(number == result*3 & number == result2*5){
            System.out.println("FizzBuzz");
        }
    }
}
