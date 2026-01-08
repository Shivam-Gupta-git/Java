package JAVA_PROGRAMS.Topics.Array_13;

import java.util.Arrays;

public class Move_All_Zeroes_27 {
    public static void MoveAllZeroes(int[] num) {
        int index = 0;
        for (int i = 0; i < num.length; i++){
            if(num[i] != 0){
                num[index] = num[i];
                index ++;
            }
        }
//        System.out.println(Arrays.toString(num));
        while (index < num.length){
            num[index] = 0;
            index ++;
        }
        System.out.println(Arrays.toString(num));
    }
    public static void main(String[] args) {
        int[] number = {1, 0, 3, 0, 5, 2};
        MoveAllZeroes(number);
    }
}
