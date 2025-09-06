package JAVA_PROGRAMS.Topics.String_16;

import java.util.Scanner;

public class Print_All_String_Char_3 {
    public static void PrintChar(String str){
        for (int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Please enter your name: ");
        name = sc.nextLine();
        PrintChar(name);
    }
}
