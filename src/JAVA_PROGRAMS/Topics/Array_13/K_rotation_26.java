package JAVA_PROGRAMS.Topics.Array_13;

import java.util.Arrays;
//Q. Rotate an array by k positions.

public class K_rotation_26 {
    public static void kRotation(int[] num) {
        int position = 3;

        int first = num[position];
        for (int i = position; i > 0; i--) {
//            System.out.println(i);
            num[i] = num[i - 1];
//            System.out.println(num[i]);
        }
        num[0] = first;
        System.out.println(Arrays.toString(num));
    }

    public static void main(String[] args) {
        int[] number = {1, 3, 5, 1,2,3, 6};
        kRotation(number);

    }
}
