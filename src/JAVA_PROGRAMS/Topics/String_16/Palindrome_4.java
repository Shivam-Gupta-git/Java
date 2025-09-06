package JAVA_PROGRAMS.Topics.String_16;

import java.util.Scanner;

public class Palindrome_4 {
    public static boolean palindrome(String str){
        for (int i = 0; i < str.length()/2; i++){
            int n = str.length();
           if(str.charAt(i) == str.charAt(n - i - 1)){
               return true;
           }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String character;
        System.out.print("Enter your character name: ");
        character = sc.nextLine();
        boolean result = palindrome(character);
        if(result == true){
            System.out.println(character + "Is a Palindrome");
        }else {
            System.out.println(character + "Is not Palindrome");
        }
    }
}
