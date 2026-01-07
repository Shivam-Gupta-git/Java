package JAVA_PROGRAMS.Topics.Array_13;

import java.util.Arrays;
import java.util.Scanner;

public class testing {
    public static void test(int[] num) {
        int index = 0;
    for (int i = 0; i < num.length; i++){
        if(num[i] != 0){
            num[index] = num[i];
            index ++;
        }
    }
        System.out.println(index);
    while (index < num.length){
        num[index] = 0;
        index ++;
    }
        System.out.println(Arrays.toString(num));
    }
    public static void main(String[] args) {
        int[] number = {1, 0, 3, 0, 5, 2};
        test(number);
    }
}