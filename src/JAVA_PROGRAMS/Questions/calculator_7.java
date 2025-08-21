package JAVA_PROGRAMS.Questions;

import java.util.Scanner;

public class calculator_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter first value:");
        int a = sc.nextInt();
        System.out.println("Please Enter second value:");
        int b = sc.nextInt();

        System.out.println("Please Enter any one operator:");
        char operators = sc.next().charAt(0);
        switch (operators){
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
            case '*':
                System.out.println(a * b);
            case '/':
                System.out.println(a / b);
            case '%':
                System.out.println(a % b);
            default:
                System.out.println("you can choose wrong operator");
        }
    }
}
