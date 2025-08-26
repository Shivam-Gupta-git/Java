package JAVA_PROGRAMS.Topics;

import java.util.Scanner;

public class loops_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

// -> while loop...................
//        (Initialization)
//        int i = 1;
//        (condition)
//        while(i <= 5){
//            System.out.println("Hello");
//        (update)
//            i++;
//        }

//        System.out.println("Please enter your number: ");
//        int num = sc.nextInt();
//        int i = 0;
//        while (i < num){
//            System.out.println("Hello world");
//            i++;
//        }

//  Q. Print numbers from 1 to n using while loop
//        System.out.println("Please Enter a number: ");
//        int num = sc.nextInt();
//        int i = 1;
//        while (i <= num){
//            System.out.println(i);
//            i++;
//        }

//  -> For loop..................
//     (initialization; condition; update)
//       for (int i = 1; i <= 10; i++){
//           System.out.println("Hello world");
//       }

//  Print square pattern.
//        for (int i = 1; i <= 4; i++){
//            System.out.println("****");
//        }
//  Print reverse number.
//      for (int i = 10; i >= 1; i--){
//          System.out.println(i);
//      }

//  Print reverse of given number.
//      int num = 13423;
//      while (num > 0){
//          int lastDigit = num % 10;
//          num /= 10;
//          System.out.print(lastDigit);
//      }

//  Reverse the given number
//    int num = 10899;
//    int reverse = 0;
//    while (num > 0){
//        int lastDigit = num % 10;
//        reverse = (reverse * 10) + lastDigit;
//        num /= 10;
//    }
//        System.out.println(reverse);

//  -> Do while loop................
//        int i = 0;
//        do {
//            System.out.println("hello world");
//            i++;
//        }while (i <= 10);

//  -> Break statement.................
//        for (int i = 1; i <= 5; i++){
//            if(i == 3){
//                break;
//            }
//            System.out.println("hello i am Ai");
//        }
//        System.out.println("i am out in this loop");

//  Keep entering number till user enters a multiple of 10.
//      do {
//          System.out.println("Please enter a number: ");
//          int num = sc.nextInt();
//          if(num % 10 == 0){
//              break;
//          }
//          System.out.println(num);
//      }while (true);

//  Continue Statement.................
//     for (int i = 1; i <= 10; i++){
//         if(i == 3 || i == 7){
//             continue;
//         }
//         System.out.println(i);
//     }

//  Display all number entered by user expect multiple of 10.
//    do {
//        System.out.println("Please enter your number: ");
//        int num = sc.nextInt();
//        if(num % 10 == 0){
//            continue;
//        }
//        System.out.println("your output is: "+num);
//    }while (true);

//  Prime or not
//        System.out.println("Please enter your number: ");
//        int num = sc.nextInt();
//        if(num == 2){
//            System.out.println(num + " is a Prime number");
//        }else {
//            boolean isPrime = true;
//            for (int i = 2; i < Math.sqrt(num); i++){
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

    }
}
