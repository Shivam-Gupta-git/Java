package JAVA_PROGRAMS.Questions;

import java.util.Scanner;

public class Mathematical_Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//  Q. take two numbers from the user and find the largest number.
//        System.out.println("Enter the first number: ");
//        int num1 = sc.nextInt();
//        System.out.println("Enter the second number: ");
//        int num2 = sc.nextInt();
//
//        if(num1 > num2){
//            System.out.println(num1 + " is a largest number");
//        }else {
//            System.out.println(num2 + " is a largest number");
//        }

//  Q. take a number from the user and print if a number is  even or odd.
//        System.out.println("Enter a number");
//        int num = sc.nextInt();
//        if(num % 2 == 0){
//            System.out.println(num + " is a even number");
//        }else {
//            System.out.println(num + " is a odd number");
//        }

//  Q. take an income from the user and calculate the income tax.
//        System.out.println("Please Enter your yearly income: ");
//        int income = sc.nextInt();
//        int tax;
//
//        if(income < 500000){
//            tax = 0;
//            System.out.println("Your tax is " + tax + " of your income: " + income);
//        } else if (income > 500000 && income <= 1000000) {
//            tax = (int)(income * 0.2);
//            System.out.println("Your tax is " + tax + " of your income: " + income);
//        }else {
//            tax = (int)(income * 0.3);
//            System.out.println("Your tax amount is " + tax + " of your income: " + income);
//        }

//  Q. print the largest number of given three number
//       int a = 1;
//       int b = 7;
//       int c = 6;
//
//       if(a >= b && a >= c){
//           System.out.println(a + " is a largest number");
//       } else if (b >= c) {
//           System.out.println(b + " is a largest number");
//       }else {
//           System.out.println(c + " is a largest number");
//       }

//  Q. take a marks from the user and print the result
//       System.out.println("Enter yor marks: ");
//       int marks = sc.nextInt();
//       String result = (marks >= 33) ? "Pass" : "Fail";
//       System.out.println(result);

//  Q. Print numbers from 1 to 10 using while loop.
//       int i = 1;
//       while (i <= 10){
//           System.out.println(i);
//           i++;
//       }
//  Q. Sum of first 5 natural numbers using while loop
//       int i = 1;
//       int sum = 0;
//       while (i <= 5){
//           sum += i;
//           i++;
//       }
//        System.out.println(sum);

//  Q. Reverse digits of a number
//        int number = 12, reverse = 0;
//        while (number != 0) {
//            int digit = number % 10;
//            reverse = reverse * 10 + digit;
//            number /= 10;
//        }
//        System.out.println("Reversed Number: " + reverse);

//  Q. Print multiplication table of 5
//        System.out.println("Please enter your number to want to print a table: ");
//        int num = sc.nextInt();
//        int i = 1;
//        int multi;
//        while (i <= 10) {
//            multi = i * num;
//            System.out.println(num + " * " + i + " = " + multi);
//            i++;
//        }

//  Q. Sum of first n natural numbers using while loop
//        System.out.println("Please enter your number: ");
//        int num = sc.nextInt();
//        int i = 1;
//        int sum = 0;
//        while (i <= num){
//            sum += i;
//            i++;
//        }
//        System.out.println("Sum of your number " + num + " is: " +sum);

//  Q. take a number from the user and check if a number is Prime or not.
//        System.out.println("Please enter your number: ");
//        int num = sc.nextInt();
//        if(num == 2){
//            System.out.println(num + " is a Prime number");
//        }else {
//            boolean isPrime = true;
//            for (int i = 2; i <= Math.sqrt(num); i++){
//                if(num % i == 0){
//                    isPrime = false;
//                }
//            }
//            if(isPrime == true){
//                System.out.println(num + " is a Prime number");
//            }else {
//                System.out.println(num + " is not a Prime number");
//            }
//        }

//  Q.  How many times 'Hello' is printed?

//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hello");
//            i += 2;
//        }
//  Q. Write a program that reads a set of integers, and then prints the sum of the
//     even and odd integers.
        System.out.println("Please enter your number: ");
        int number = sc.nextInt();
        int sumOfEven = 0;
        int sumOfOdd = 0;
        for (int i = 1; i <= number; i++){
            System.out.print("Enter integer " + i + ": ");
            int num = sc.nextInt();
            if(num % 2 == 0){
               sumOfEven += num;
            }else {
                sumOfOdd += num;
            }
        }
        System.out.println("even: "+sumOfEven);
        System.out.println("odd: "+sumOfOdd);

    }
}
