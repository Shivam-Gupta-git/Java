package JAVA_PROGRAMS.Questions;

import java.util.Scanner;

public class Practice_Set_5 {

// Q. Write a Java method to compute the average of three numbers.
//      public static double averageOfNum (double num1, double num2, double num3){
//          double sumOfNum = num1 + num2 + num3;
//          return sumOfNum / 3;
//      }

// Q. Write a method named isEven that accepts an int argument. The method
//    should return true if the argument is even, or false otherwise. Also write a program to test your
//    method.
//      public  static boolean isEven(int num){
//          if(num % 2 == 0){
//             return true;
//          }else {
//            return  false;
//          }
//      }
//      public static void evenNumber(int num){
//          if(isEven(num)){
//              System.out.println(num + " is a Even number");
//          }else {
//              System.out.println(num + " is not a even number");
//          }
//      }

// Q. Write a Java program to check if a number is a palindrome in Java? ( 121 is a
//    palindrome, 321 is not)
//    public static void Palindrome(int num ){
//        int myNum = num;
//        int reverseNum = 0;
//        while (num != 0){
//            int lastNum = num % 10;
//            reverseNum = reverseNum * 10 + lastNum;
//            num /= 10;
//        }
//        if(reverseNum == myNum){
//            System.out.println(myNum + " Is a Palindrome");
//        }else {
//            System.out.println(myNum + " Is not a Palindrome");
//        }
//    }

//  Q. Write a Java method to compute the sum of the digits in an integer.
//       public static int sumIntegers(int num){
//           int sum = 0;
//           while (num != 0){
//               int lastDigit = num % 10;
//               sum += lastDigit;
//               num /= 10;
//           }
//           return sum;
//       }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//  Q. (Part 2)
//        System.out.println("Please Enter your first number: ");
//        double num1 = sc.nextDouble();
//        System.out.println("Please Enter your second number: ");
//        double num2 = sc.nextDouble();
//        System.out.println("Please Enter your third number: ");
//        double num3 = sc.nextDouble();
//        double average = averageOfNum(num1, num2, num3);
//        System.out.println("Average of your number is: " + Math.round(average));

//  Q. (Part 2)
//        System.out.println("Please Enter your number: ");
//        int num = sc.nextInt();
//        evenNumber(num);

//  Q. (Part 2)
//        System.out.println("Enter your number: ");
//        int numbers = sc.nextInt();
//        Palindrome(numbers);

//  Q. (Part 2)
//        System.out.println("Please Enter your number: ");
//        int numbers = sc.nextInt();
//        int sumOfAllIntegers = sumIntegers(numbers);
//        System.out.println("Sum of all Integers " + numbers + " is: " + sumOfAllIntegers);

    }
}
