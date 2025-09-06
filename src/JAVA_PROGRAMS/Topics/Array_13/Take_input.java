package JAVA_PROGRAMS.Topics.Array_13;

import java.util.Scanner;

public class Take_input {
    public static void printNumber(int[] num){
        for (int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the digit numbers: ");
        int digit = sc.nextInt();
        int[] numbers = new int[digit];
        System.out.println("Please enter " + digit + " digit number");
        for (int i =0; i < digit; i++){
            numbers[i] = sc.nextInt();
        }
        printNumber(numbers);
    }
}
