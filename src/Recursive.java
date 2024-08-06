import java.util.Scanner;
public class Recursive {
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number = input.nextInt();
        long result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}