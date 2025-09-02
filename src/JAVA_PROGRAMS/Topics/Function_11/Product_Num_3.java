package JAVA_PROGRAMS.Topics.Function_11;

import java.util.Scanner;

public class Product_Num_3 {
//  -> Find Product of a and b.(1st part)
    public static int calculateProduct (int num1, int num2){
        int product = num1 * num2;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Please Enter second number: ");
        int num2 = sc.nextInt();
        int result = calculateProduct(num1 , num2);
        System.out.println("Sum of " + num1 + " * " + num2 + " = " + result);
    }
}
