package JAVA_PROGRAMS.Topics.Array_13;

import java.util.Arrays;

public class Sorting_in_descending_order_22 {
    public static void SortingInDescending(int[] num){
         for (int i = 0; i < num.length; i++){
             for (int j = 1 + i; j < num.length; j++){
                 if(num[i] < num[j]){
                     int temp = num[i];
                     num[i] = num[j];
                     num[j] = temp;
                 }
             }
         }
        System.out.println(Arrays.toString(num));
    }

    public static void main(String[] args) {
      int[] number = {1, 3, 2, 7};
      SortingInDescending(number);
    }

}
