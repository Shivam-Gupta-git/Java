package JAVA_PROGRAMS.Topics.Array_13;

import java.util.Scanner;

public class EvenOdd_Position_17 {
    public static void evenAndOdd(int[] num){
        System.out.print("Element at even position: ");
        for (int i = 0; i < num.length; i++){
            if(i % 2 == 0){
                System.out.print(num [i] + " ");
            }
        }
        System.out.println();
        System.out.print("Element at odd position: ");
        for (int i = 0; i < num.length; i++){
            if(i % 2 != 0){
                System.out.print(num[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int elementNum = sc.nextInt();
        System.out.println("Please Enter " + elementNum + " digits");
        int[] numbers = new int[elementNum];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        evenAndOdd(numbers);
    }
}
