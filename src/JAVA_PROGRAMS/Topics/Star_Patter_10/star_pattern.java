package JAVA_PROGRAMS.Topics.Star_Patter_10;

public class star_pattern {
    public static void main(String[] args) {
        //  Star Pattern......
//  1. lines -> outer loop
//  2. number of times -> inner loop
//  3. what to print -> *

//    int num = 5;
//    for (int i = 1; i <= num; i++){
//        for (int j = 1; j <= i; j++){
//            System.out.print(" * ");
//        }
//        System.out.println();
//    }

//  Print Inverted Star Pattern
//  (1st way)
//        int num = 5;
//        for (int i = 1; i <= num; i++) {
//            for (int j = 1; j <= (num - i + 1); j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

//  (2nd way)
//        int num = 5;
//        for (int i = num; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

//  Print Half-Pyramid Pattern
//        int num = 5;
//        for (int i = 1; i <= num; i++){
//            for (int j = 1; j <= i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//  Print Character
        int num = 5;
        char ch = 'A';
        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
}
