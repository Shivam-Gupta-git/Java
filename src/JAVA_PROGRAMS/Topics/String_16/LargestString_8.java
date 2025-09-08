package JAVA_PROGRAMS.Topics.String_16;

import java.util.Scanner;

public class LargestString_8 {

//    public static void main(String[] args) {
//        String[] words = {"apple", "banana", "orange"};
//
//        String largestWord = words[0];
//        for (int i = 1; i < words.length; i++) {
//            if (largestWord.compareToIgnoreCase(words[i]) < 0) {
//                largestWord = words[i];
//            }
//        }
//        System.out.println(largestWord);
//    }
    public static void largestString(String[] words){
        String largestWord = words[0];
        for (int i = 1; i < words.length; i++){
            if(largestWord.compareToIgnoreCase(words[i]) < 0){
                largestWord = words[i];
            }
        }
        System.out.println("Largest character is: " + largestWord);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of words: ");
        int numbers = sc.nextInt();
        sc.nextLine();

        String[] words = new String[numbers];
        System.out.println("Enter " + numbers + " charaters");
        for (int i = 0; i < numbers; i++){
            words[i] = sc.nextLine();
        }
       largestString(words);
        sc.close();

    }
}
