package JAVA_PROGRAMS.Topics.Array_13;

import java.util.Arrays;
import java.util.Scanner;

public class testing {

    public static void test(int[] num) {
        for (int i = 0; i < num.length; i++){
            for (int j = 1 + i; j < num.length; j++){
                if(num[i] == num[j]){
                    System.out.print(num[i] + " ");
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] number = {1, 2, 2, 3, 4, 1, 5};
        test(number);
    }
}