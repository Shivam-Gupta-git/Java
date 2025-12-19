package JAVA_PROGRAMS.Topics.Star_Patter_10;

public class star_pattern {
    public static void main(String[] args) {

//  Star Pattern......

//  1. lines -> outer loop
//  2. number of times -> inner loop
//  3. what to print -> *

// Q. Print Reverse star pattern.............................
//        int num = 5;
//      for(int i = 0; i <= num; i++){
//          for (int j = 1; j <= num - i ; j++){
//              System.out.print(" * ");
//          }
//          System.out.println();
//      }

// Q. Number Triangle.............................
//        int num = 5;
//        for (int i = 1; i <= num; i++){
//            for (int j = 1; j<= i; j++){
//                System.out.print( j);
//            }
//            System.out.println();
//        }

// Q. Increasing and decreasing pattern.............................
//        int num = 5;
//        for (int i = 0; i < (2 * num); i++){
//            int total = i > num ? (2 * num - i) : i;
//            for (int j = 0; j <  total; j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

// Q. Left-Aligned Triangle..............................
//        int num = 5;
//        for (int i = 1; i <= num; i++){
//            for (int j = 1; j <= num - i; j++){
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= i; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

// Q. Inverted Left-Angle Triangle...........................
//        int num = 5;
//        for (int i = num; i >= 1; i--){
//            for (int j = 1; j <= (num - i); j++){
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= i; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }







//    int num = 5;
//    for (int i = 1; i <= num; i++){
//        for (int j = 1; j <= i; j++){
//            System.out.print(" * ");
//        }
//        System.out.println();
//    }

// Q. Print Inverted Star Pattern...........................
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
//        int num = 5;
//        char ch = 'A';
//        for (int i = 1; i <= num; i++){
//            for (int j = 1; j <= i; j++){
//                System.out.print(ch);
//                ch++;
//            }
//            System.out.println();
//        }

    }
}
