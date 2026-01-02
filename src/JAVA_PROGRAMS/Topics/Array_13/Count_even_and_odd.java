package JAVA_PROGRAMS.Topics.Array_13;

import java.util.Arrays;

public class Count_even_and_odd {
    public static void evenORodd(int[] num){
        int[] evenArray = new int[num.length];
        int[] oddArray = new int[num.length];

        int even = 0, odd = 0;

        for (int i = 0; i < num.length; i++){
            if(num[i] % 2 == 0){
                evenArray[even ++] = num[i];
            }else {
                oddArray[odd ++] = num[i];
            }
        }
        System.out.println("Array is: " +Arrays.toString(Arrays.copyOf(evenArray, even)) + " total even is: " + even);
        System.out.println("Array is:  "+Arrays.toString(Arrays.copyOf(oddArray, odd)) + " total odd is: " + odd);
    }

    public static void main(String[] args) {
        int[] number = {1, 3, 5, 2, 6, 8, 7};
        evenORodd(number);
    }
}
