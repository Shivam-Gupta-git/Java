package JAVA_PROGRAMS.Topics.String_16;

import java.util.Scanner;

public class SubString_7 {
    public static String subString(String words, int start, int end){
      String newWord = " ";
      for (int i = start; i < end; i++){
          newWord += words.charAt(i);
      }
      return newWord;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter your character: ");
        String words = sc.nextLine();
        System.out.print("Enter start index of character: ");
        int start = sc.nextInt();
        System.out.print("Enter End index of character: ");
        int end = sc.nextInt();

        System.out.println(subString(words, start, end));
    }
}
