package JAVA_PROGRAMS.Topics;

import java.util.Scanner;

public class conditionalStatement_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//  ->  if-else statement.....
//        System.out.println("Please enter your age: ");
//        int age = sc.nextInt();
//        if(age >= 19){
//            System.out.println("Your are eligible for riding a car");
//        }
//        if(age >= 13 && age < 19){
//            System.out.println("Your are eligible for riding a cycle");
//        }
//        else {
//            System.out.println("Your are not eligible for riding a car");
//        }

//  ->  else-if statement.....
//        System.out.println("Enter your age: ");
//        int age = sc.nextInt();
//        if (age >= 19) {
//            System.out.println("Your are eligible for riding a car");
//        } else if (age >= 13 && age < 19) {
//            System.out.println("Your are eligible for riding a cycle");
//        } else {
//            System.out.println("Your are not eligible for riding a car or cycle");
//        }

//  ->  ternary operator.......
//        System.out.println("Please enter your number");
//        int num = sc.nextInt();
//        String result = (num % 2 == 0) ? "Even" : "odd";
//        System.out.println(result);

//  ->  switch case..........
        int num = 2;
        switch (num){
            case 1:
                System.out.println("samosa");
                break;
            case 2:
                System.out.println("burger");
                break;
            case 3:
                System.out.println("mango shake");
                break;
            default:
                System.out.println("we wake up");
        }
    }
}
