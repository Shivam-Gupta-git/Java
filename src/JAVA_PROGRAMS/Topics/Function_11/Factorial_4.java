package JAVA_PROGRAMS.Topics.Function_11;

import java.util.Scanner;

public class Factorial_4 {
// -> Find factorial of n number.(1st part)
    public static int calculateFactorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        int factNumber = calculateFactorial(num);
        System.out.println("Factorial of " + num + " is: " + factNumber);
    }
}
