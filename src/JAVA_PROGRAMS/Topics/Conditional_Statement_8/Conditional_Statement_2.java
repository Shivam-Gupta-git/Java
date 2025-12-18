package JAVA_PROGRAMS.Topics.Conditional_Statement_8;

import java.util.Scanner;

public class Conditional_Statement_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        int salary = sc.nextInt();

        if(salary >= 24000){
            salary += 2000;
        }else {
            salary += 1000;
        }
        System.out.println(salary);
    }
}
